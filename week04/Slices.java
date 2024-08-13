package week04;

import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = sc.nextLine();

        sc.close();

        printSlices(word);
    }

    public static void printSlices(String word) {

        System.out.println("Slices of: " + word);

        for (int i = 1; i < word.length(); i++) {
            // Print the slices
            System.out.println(word.substring(0, i) + " " + word.substring(i));
        }
        
        // Print the original word as a slice
        System.out.println(word);
    }
}
