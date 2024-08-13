package shared;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        int increments = 10;
        int reads = 15;

        Incrementor incrementor = new Incrementor(counter, increments);
        Reader reader = new Reader(counter, reads);

        incrementor.start();
        reader.start();

        incrementor.join();
        reader.join();

        System.out.println("Final Counter Value: " + counter.getValue());

    }
}
