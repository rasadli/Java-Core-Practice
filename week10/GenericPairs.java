package week10;

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "(" + this.key + ", " + this.value + ")";
    }
}

public class GenericPairs {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(17960, "Rashad Asadli");
        Pair<Integer, Double> pair2 = new Pair<>(456, 456.123);

        System.out.println("Pair 1: " + pair1.getKey() + ", " + pair1.getValue());
        System.out.println("Pair 2: " + pair2.getKey() + ", " + pair2.getValue());

    }
}
