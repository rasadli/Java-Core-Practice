package week12;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionPackage {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println("Consumed: " + s);
        consumer.accept("Hello");

        Function<Integer, String> function = num -> "The number is: " + num;
        System.out.println(function.apply(10));

        Predicate<Integer> predicate = num -> num > 0;
        System.out.println(predicate.test(5));

        Supplier<String> supplier = () -> "Hello World";
        System.out.println("Supplied: " + supplier.get());
    }
}
