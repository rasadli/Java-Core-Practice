package week02;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();

        int sum = 0, cnt = 0, prdct = 1;
        float avrg;

        while (num != 0) {
            cnt++;

            sum += num % 10;
            prdct *= num % 10;

            num /= 10;
        }

        avrg = sum / cnt;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + prdct);
        System.out.println("Average: " + avrg);

        scanner.close();
    }
}
