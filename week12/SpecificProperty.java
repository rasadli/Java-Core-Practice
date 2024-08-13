package week12;

import week10.property.Property;
import week11.csv_reader.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import week03.geometry.Point;

public class SpecificProperty {
    public static void main(String[] args) {

        Property<Integer> isOdd = x -> x % 2 != 0;

        System.out.println("Is 7 Odd? " + isOdd.test(5));
        System.out.println("Is 6 Odd? " + isOdd.test(6));

        Property<Point> isInTheFirstQuadrant = (point) -> point.getX() > 0 && point.getY() > 0;

        Point p1 = new Point(3, 2);
        Point p2 = new Point(-1, 5);

        System.out.println("Is p1 in the first quadrant? " + isInTheFirstQuadrant.test(p1));
        System.out.println("Is p2 in the first quadrant? " + isInTheFirstQuadrant.test(p2));

        Property<String> isPanagram = word -> {
            word = word.toLowerCase();
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    uniqueChars.add(c);
                }
            }
            return uniqueChars.size() == 26;
        };

        System.out.println("Is 'The quick brown fox jumps over the lazy dog' a pangram? "
                + isPanagram.test("The quick brown fox jumps over the lazy dog"));
        System.out.println("Is 'Hello World' a pangram? " + isPanagram.test("Hello World"));

        Property<Person> isOlderThan20 = person -> person.getAge() > 20;

        Person person1 = new Person(0001, "Rashad", "Asadli", 19);
        Person person2 = new Person(0002, "Omar", "Quliyev", 23);

        System.out.println("Is Rashad older than 20? " + isOlderThan20.test(person1));
        System.out.println("Is Omar older than 20 years old? " + isOlderThan20.test(person2));

        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(83);
        numbers.add(19);

        List<Integer> oddNumbers = filter(numbers, isOdd);

        System.out.println("Odd numbers: " + oddNumbers);

    }

    public static <T> List<T> filter(Collection<T> c, Property<T> p) {
        List<T> result = new ArrayList<>();
        for (T element : c) {
            if (p.test(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
