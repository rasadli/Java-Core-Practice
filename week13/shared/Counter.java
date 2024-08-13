package shared;

public class Counter {

    private int value;

    public Counter() {
        this.value = 0;
    }

    public synchronized void increment() {
        value++;
    }

    public synchronized int getValue() {
        return value;
    }
}
