package week02;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a year: ");
        int year = sc.nextInt();

        // Checking if month
        if (year % 4 == 0) {
            System.out.println("Leap year.");
        }
        else {
            System.out.println("Not a leap year.");
        }

        sc.close();
    }
}
