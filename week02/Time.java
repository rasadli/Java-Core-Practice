package week02;

import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        // Scanner:
        System.out.println("Please enter the second:");
        Scanner sc = new Scanner(System.in);
        
        // Getting the input
        int entered_seconds = sc.nextInt();

        // Converting the given seconds to Hours
        int hours = entered_seconds / 3600;

        // Converting the given seconds to Minutes
        int minutes = entered_seconds % 3600 / 60;

        // Converting the given seconds to Seconds
        int seconds = entered_seconds % 60;

        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");

        sc.close();
    }

}
