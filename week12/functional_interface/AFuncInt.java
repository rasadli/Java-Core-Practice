package week12.functional_interface;

@FunctionalInterface
interface AFuncInt<T> {
    void apply(String input);

    static void print(String input) {
        System.out.println("Static method print(): " + input);
    }

    default void print(String input1, String input2) {
        System.out.println("Default method print(): " + input1 + ", " + input2);
    }
}
