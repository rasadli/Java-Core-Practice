package week04;

import java.util.Scanner;

public class GreatestAndSmallest {
    public static void main(String[] args) {

        if (args.length > 0) {

            int[] elements = parseArgsToIntArray(args);

            int max = calculateMax(elements);
            int min = calculateMin(elements, max);

            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);

        } else {

            System.out.println("No command line arguments provided.");

        }

        // Example using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");

        int size = scanner.nextInt();
        int[] elements = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {

            elements[i] = scanner.nextInt();

        }

        int max = calculateMax(elements);
        int min = calculateMin(elements, max);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        scanner.close();

    }

    public static int calculateMax(int[] elements) {

        int max = 0;

        for (int element : elements) {

            if (max < element) {

                max = element;

            }

        }

        return max;

    }

    public static int calculateMin(int[] elements, int max) {

        int min = max;

        for (int element : elements) {

            if (min > element) {

                min = element;

            }

        }

        return min;
    }

    public static void calculateMinAndMax(int[] elements) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
    
        for (int element : elements) {

            if (element < min) {

                min = element;

            }
            if (element > max) {

                max = element;
                
            }
        }
    
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

    }

    public static int[] parseArgsToIntArray(String[] args) {

        int n = args.length;

        int[] elements = new int[n];

        for (int i = 0; i < n; i++) {

            elements[i] = Integer.parseInt(args[i]);

        }

        return elements;

    }

}
