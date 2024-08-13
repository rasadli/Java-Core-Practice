package week02;

public class Calc {
    public static void main(String[] args) {

        // Checking for two numbers are entered or not
        if (args.length != 2) {
            System.exit(1);
        }

        // Converting to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Operations:
        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;

        int division = 0;
        int remainder = 0;

        // Checking if num2 is different from zero
        if (num2 != 0) {
            division = num1 / num2;
            remainder = num1 % num2;
        }

        // Printing results:
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        if (num2 != 0) {
            System.out.println("Division: " + division);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("error");
        }

    }
}
