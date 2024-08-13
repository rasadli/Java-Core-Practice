package week05;

public class MathDemo {
    public static void main(String[] args) {
        // Testing min and max methods
        int a = 5, b = 10;
        System.out.println("Minimum of " + a + " and " + b + ": " + min(a, b));
        System.out.println("Maximum of " + a + " and " + b + ": " + max(a, b));

        // Testing sum method
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of numbers: " + sum(numbers));

        // Testing mean method
        System.out.println("Mean of numbers: " + mean(numbers));

        // Testing factorial method
        int n = 5;
        System.out.println("Factorial of " + n + ": " + factorial(n));
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int sum(int[] args) {
        int sum = 0;
        for (int num : args) {
            sum += num;
        }
        return sum;
    }

    public static float mean(int[] args) {
        if (args.length == 0) return 0;
        int sum = sum(args);
        return (float) sum / args.length;
    }

    public static int factorial(int n) {
        if (n == 0) return 1; // Base case: factorial of 0 is 1
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
