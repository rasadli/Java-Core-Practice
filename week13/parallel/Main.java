package parallel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        String filePath = "week13\\parallel\\Tasks.csv";
        List<Task> tasks = readTasksFromCSV(filePath);

        runWithDifferentWorkers(tasks, 1); // One worker
        runWithDifferentWorkers(tasks, Runtime.getRuntime().availableProcessors()); // One per CPU core
        runWithDifferentWorkers(tasks, tasks.size()); // One per Task

    }

    private static List<Task> readTasksFromCSV(String filePath) throws IOException {

        List<Task> tasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                String name = values[0].trim();
                long duration = Long.parseLong(values[1].trim());
                tasks.add(new Task(name, duration));

            }
        }

        return tasks;
    }

    private static void runWithDifferentWorkers(List<Task> tasks, int numberOfWorkers) throws InterruptedException {
        BlockingQueue<Task> tq = new LinkedBlockingQueue<>(tasks);

        List<ParallelTaskExecutor> workers = new ArrayList<>();
        for (int i = 0; i < numberOfWorkers; i++) {
            workers.add(new ParallelTaskExecutor(tq));
        }

        long startTime = System.currentTimeMillis();

        for (ParallelTaskExecutor worker : workers) {
            worker.start();
        }

        for (ParallelTaskExecutor worker : workers) {
            worker.join();
        }

        long endTime = System.currentTimeMillis();

        System.out
                .println("Total Execution time with " + numberOfWorkers + " workers: " + (endTime - startTime) + " ms");
    }
}
