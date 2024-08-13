package shared;

public class Incrementor extends Thread {

    private final Counter counter;
    private final int times;

    public Incrementor(Counter counter, int times) {
        this.counter = counter;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            counter.increment();
            System.out.println("Incrementor: Counter incremented to: " + counter.getValue());
        }
    }

}
