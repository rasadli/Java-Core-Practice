package week02;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter values: ");

        if (sc.hasNextDouble()) {
            double firstNum = sc.nextDouble();
            double min = firstNum;
            double max = firstNum;
            
            while (sc.hasNextDouble()) {
                double num = sc.nextDouble();
                min = Math.min(min, num);
                max = Math.max(max, num);
            }

            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
        }
        else {
            System.out.println("Error");
        }

        sc.close();
    }
}