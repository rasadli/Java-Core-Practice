package week02;

import java.util.Scanner;

public class CoinTossing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of coin tosses: ");
        int numberOfTosses = scanner.nextInt();

        int headsCount = 0;
        int tailsCount = 0;

        // Simulate coin tossing
        for (int i = 0; i < numberOfTosses; i++) {

            // Use Math.random() to get a random value between 0 and 1
            double randomValue = Math.random();

            // If the random value is less than 0.5, consider it as heads, otherwise tails
            if (randomValue < 0.5) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        // Calculate probabilities
        System.out.println("Probability of Heads: " + headsCount * 1.0f / numberOfTosses);
        System.out.println("Probability of Tails: " + tailsCount * 1.0f / numberOfTosses);

        scanner.close();
    }
}
