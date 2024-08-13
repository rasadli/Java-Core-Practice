package week10;

import java.util.Arrays;

import week03.geometry.Point;
import week09.Task;

public class GenericMethod {
    public static void main(String[] args) {
        Integer ints[] = { 1, 2, 3, 4, 5, 6, 4 };

        Double doubles[] = { 4.9, 1.0, 2.2, 3.4, 4.1, 5.7, 6.9 };

        String strings[] = { "Rashad", "Farid", "Rauf", "Javid", "Omar" };

        Task tasks[] = {
                new Task("Calculus 1", 3, 4),
                new Task("Calculus 2", 6, 1),
                new Task("Programing 1", 3, 4),
                new Task("Progrmaing 2",56, 2),
                new Task("Writing 1", 12, 9),
                new Task("Writing 2", 10, 7)

        };

        Point points[] = {
                new Point(3, 4),
                new Point(6, 8),
                new Point(12, 9)
        };

        System.out.println("Print Arrays: ");
        printAll(ints);
        printAll(doubles);
        printAll(strings);
        printAll(points);
        printAll(tasks);

        System.out.print("Printing elements in a range: ");
        printAll(strings, 0, 2);

        System.out.print("Print tasks in pair: ");
        printAll(tasks);

        System.out.print("Print the middle element of an array: ");
        System.out.println(findMiddle(strings));

        System.out.print("Get the maximum element in the array: ");
        System.out.println(findMax(doubles));

        System.out.print("Sorted version of an array: ");
        bubbleSort(ints);
        printAll(ints);

        System.out.print("Swap certain elements: ");
        swap(strings, 0, 2);
        printAll(strings);
    }

    public static <T> void printAll(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static <T> void printAll(T[] array, int start, int end) {
        if (start < 0 || end > array.length || start > end) {
            throw new IndexOutOfBoundsException("Incorrect interval of indexes");
        }
        for (int i = start; i < end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printAll(Task[] tasks) {
        if (tasks.length % 2 != 0) {
            throw new IllegalArgumentException("Length of array must be even number to print them in pairs");
        }
        for (int i = 0; i < tasks.length; i += 2) {
            System.out.println(tasks[i] + " " + tasks[i + 1]);
        }
    }

    static <T extends Comparable<T>> T findMax(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        T max = arr[0];
        for (T i : arr) {
            if (i.compareTo(max) < 0) {
                max = i;
            }
        }
        return max;
    }

    static <T extends Comparable<T>> T findMiddle(T[] arr) {
        int middle_index;
        T mid;
        if (arr.length % 2 == 0) {
            throw new IllegalArgumentException("The number of elements in the array is even.");
        } else {
            middle_index = (arr.length - 1) / 2;
        }
        mid = arr[middle_index];
        return mid;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            T temp;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}