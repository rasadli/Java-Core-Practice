package week12.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Random;

public class Main {
    public static <T> void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 4, 4, 8, 3, 2));

        boolean allLess10 = al.stream().allMatch(i -> i < 10);
        System.out.println("All less 10 ? " + allLess10);

        boolean noneMore10 = al.stream().noneMatch(i -> i > 10);
        System.out.println("None more 10 ? " + noneMore10);

        boolean anyOdd = al.stream().anyMatch(i -> i % 2 != 0);
        System.out.println("Any odd number ? " + anyOdd);

        System.out.println("Number of elements: " + al.stream().count());

        Stream<Integer> randomStream = Stream.generate(() -> new Random().nextInt(100));

        // limit the where should print
        System.out.println("Elements of random numbers till 10th: ");
        randomStream.limit(10).forEach(i -> System.out.print(i + "|"));

        System.out.println("\nAll elements of ArrayList:");
        al.stream().forEach(i -> System.out.print(i + "|"));
        System.out.println("\n");

        Optional<Integer> first = al.stream().findFirst();
        first.ifPresentOrElse(System.out::println, () -> System.out.println("List is empty"));

        Optional<Integer> any = al.stream().findAny();
        any.ifPresentOrElse(System.out::println, () -> System.out.println("List is empty"));

        System.out.println("Less then 5 as list:");
        System.out.println(al.stream().filter(i -> i < 5).collect(Collectors.toList()));

        System.out.println("Number strings:");
        System.out.println(al.stream().map(n -> "Number " + n).collect(Collectors.toList()));

        System.out.println("Decendin order sorted list:");
        System.out.println(
            al.stream().
            filter(i -> i < 5).
            sorted((o1, o2) -> o2 - o1).
            collect(Collectors.toList())
        );
    }

}
