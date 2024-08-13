package week02;

import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        int n = sc.nextInt();

        System.out.print("Please enter the number: ");
        float f = sc.nextFloat();

        double sinx = calculateTaylorSin(f, n);
        double mathSinx = Math.sin(f);

        sc.close();

        System.out.println("The calculated sine with Taylor series: " + sinx);
        System.out.println("The calculated sine with Math.sin: " + mathSinx);

    }

    public static double calculateTaylorSin(double f, int n) {

        // Taylor series using Math library

        double sum = 0.0;

        for (int i = 0; i <= n; i++) {

            sum += Math.pow(-1, i) * Math.pow(f, 2 * i + 1) / factorial(2 * i + 1);

        }

        return sum;
    }

    public static long factorial(int n) {

        //  calculate factorial of a given number

        long res = 1;

        for (int i = 2; i <= n; i++) {
            res *= i;
        }

        return res;
    }

}

