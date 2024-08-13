package week02;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        System.out.println("Please enter postive number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 1;

        if (num < 0) {
            System.out.println("You entered negative number!");
        } else {
            // loop for finding factorial
            for (int i = 1; i <= num; i++) {
                res *= i;
            }
        }

        System.out.println(res);
        sc.close();
    }
}
