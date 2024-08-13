package week02;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Be sure num1 is smaller than num2
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Calculate the sum of odd numbers between num1 and num2
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            // Checking if the number between num1 and num2 is odd
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        scanner.close();
    }
}
