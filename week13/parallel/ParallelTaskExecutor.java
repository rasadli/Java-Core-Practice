package parallel;

import java.util.concurrent.BlockingQueue;

public class ParallelTaskExecutor extends Thread {

    private final BlockingQueue<Task> tq;

    public ParallelTaskExecutor(BlockingQueue<Task> tq) {
        this.tq = tq;
    }

    @Override
    public void run() {
        try {
            while (!tq.isEmpty()) {
                Task task = tq.poll();
                if (task != null) {
                    System.out.println("Executing: " + task);
                    Thread.sleep(task.getDuration());
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
