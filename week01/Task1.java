package week01;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // creating scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleasse enter your name:");
        // getting the name from user
        String name = sc.nextLine();
        // printing the greeting message
        System.out.println("Hello, " + name);
        // closing scanner
        sc.close();

    }

}
