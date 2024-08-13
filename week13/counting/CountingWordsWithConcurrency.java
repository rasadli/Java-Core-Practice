package counting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;

public class CountingWordsWithConcurrency {

    private static final int CHUNK_SIZE = 300;
    private static final int MIN_WORD_LENGTH = 4;

    public static void main(String[] args) {
        String filePath = "week13\\books\\austen.txt";
        long startTime = System.nanoTime();

        List<String> chunks = readFileInChunks(filePath, CHUNK_SIZE);

        AtomicInteger totalWordCount = new AtomicInteger(0);
        List<Thread> threads = new ArrayList<>();

        for (String chunk : chunks) {
            Thread thread = new Thread(() -> {
                int wordCount = 0;
                StringTokenizer tokenizer = new StringTokenizer(chunk, " \t\n\r\f,.;:!?\"'()[]{}<>");
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    if (token.length() >= MIN_WORD_LENGTH) {
                        wordCount++;
                    }
                }
                totalWordCount.addAndGet(wordCount);
            });

            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Thread execution was interrupted");
            }
        }

        long endTime = System.nanoTime();
        long timeTaken = endTime - startTime;

        System.out.println("Total number of words with more than 3 characters: " + totalWordCount.get());
        System.out.println("Time taken with concurrency: " + timeTaken);
    }

    private static List<String> readFileInChunks(String filePath, int chunkSize) {
        List<String> chunks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder chunkBuilder = new StringBuilder();
            int lineCounter = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                chunkBuilder.append(line).append("\n");
                if (++lineCounter % chunkSize == 0) {
                    chunks.add(chunkBuilder.toString());
                    chunkBuilder.setLength(0);
                }
            }

            if (chunkBuilder.length() > 0) {
                chunks.add(chunkBuilder.toString());
            }
            return chunks;
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return null;
        }

    }
}
