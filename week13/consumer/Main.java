package consumer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int capacity = 5;
        ShoeStore store = new ShoeStore(capacity);

        // with one consumer one producer

        Producer p1 = new Producer(store, 10);
        Consumer c1 = new Consumer(store, 10);

        p1.start();
        c1.start();

        p1.join();
        c1.join();

        System.out.println("Final stock after one consumer and one producer " + store.getStockSize() + "\n");

        // with one producer and multiple consumers

        Producer p2 = new Producer(store, 10);
        Consumer c2 = new Consumer(store, 5);
        Consumer c3 = new Consumer(store, 3);

        p2.start();
        c2.start();
        c3.start();

        p2.join();
        c2.join();
        c3.join();

        System.out.println("Final stock after one producer and multiple consumers " + store.getStockSize() + "\n");

        // with multiple producers and one consumer
        Producer p3 = new Producer(store, 5);
        Producer p4 = new Producer(store, 5);
        Consumer c4 = new Consumer(store, 10);

        p3.start();
        p4.start();
        c4.start();

        p3.join();
        p4.join();
        c4.join();

        System.out.println("Final stock after multiple producers and one consumer: " + store.getStockSize());

    }
}
