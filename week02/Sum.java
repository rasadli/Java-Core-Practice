package week02;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scnnr = new Scanner(System.in);

        // Getting the first number
        System.out.println("Please enter the first number:");
        int nmbr_1 = scnnr.nextInt();

        // Getting the second number
        System.out.println("Please enter the second number:");
        int nmbr_2 = scnnr.nextInt();

        // Priting the sum
        int sum = nmbr_1 + nmbr_2;
        System.out.println("Reslut: " + sum);

        // Closing scanner:
        scnnr.close();
    }
}