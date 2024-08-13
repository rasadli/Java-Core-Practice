package week02;

import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter double-precision floating-point number: ");
        double num = sc.nextDouble();

        // Checking number :
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}
