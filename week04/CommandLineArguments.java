package week04;

public class CommandLineArguments {

    public static void main(String[] args) {
        // Part a: Getting and printing arguments passed in
        // System.out.println("Entered arguments:");
        // printArguments(args);

        // Part b: Getting integer array from user and print sum and average
        int numbers[] = parseToInt(args);
        
        // printing the elements of integer array
        printIntArray(numbers);

        // printing sum and average
        printSumAndAverage(numbers);
    }

    public static void printArguments(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static int[] parseToInt(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        return numbers;
    }

    public static void printIntArray(int[] numbers) {
        System.out.println("Elements of integer array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void printSumAndAverage(int[] numbers) {
        int sum = 0;
        double avg;
        for (int number : numbers) {
            sum += number;
        }
        avg = sum / numbers.length;
        System.out.println("Average: " + avg);
        System.out.println("Sum: " + sum);
    }
}