package week02;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();

        boolean p = true;

        // If integer less than 2 it can not be prime 
        if (num < 2) {
            p = false;
        }
        else {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    p = false;
                    break;
                }
            }
        }

        if (p) {
            System.out.println(num + " prime");
        }
        else {
            System.out.println(num + " not prime");
        }

        sc.close();
    }
}