package week02;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        float harmonicNumber = 0.0f;

        for (int i = 1; i <= n; i++) {
            harmonicNumber += 1.0f / i;
        }

        System.out.println(harmonicNumber);

        scanner.close();
    }
}
