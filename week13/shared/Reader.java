package shared;

public class Reader extends Thread {

    private final Counter counter;
    private final int times;

    public Reader(Counter counter, int times) {
        this.counter = counter;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            int currentValue = counter.getValue();
            System.out.println("Reader: Counter read as " + currentValue);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
