package counting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CountingWithoutConcurrency {
    public static void main(String[] args) {

        String filepath = "week13\\books\\austen.txt";

        long startTime = System.nanoTime();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, " \t\n\r\f,.;:!?\"'()[]{}<>");

                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    if (token.length() > 3) {
                        wordCount++;
                    }
                }
            }
            System.out.println("Number of words with more than 3 characters: " + wordCount);
        } catch (IOException e) {
            e.getMessage();
        }

        long endTime = System.nanoTime();

        long timeTaken = endTime - startTime;

        System.out.println("Time taken without concurrency: " + timeTaken);
    }
}
