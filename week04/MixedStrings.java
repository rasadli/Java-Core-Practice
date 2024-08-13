package week04;

import java.util.Scanner;

public class MixedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the sentence:");

        String sentence = sc.nextLine();
        sc.close();

        String mixedSentence = splitToWords(sentence);

        System.out.println("Orginal sentence: " + sentence);
        System.out.println("Mixed sentence: " + mixedSentence);

    }

    public static String splitToWords(String sentence) {
        String[] words = sentence.split(" "); // Split by space

        // Iterate through each word and swap the first and last characters
        for (int i = 0; i < words.length; i++) {
            words[i] = swapFirstAndLast(words[i]);
        }

        // Recreate the new sentence
        return String.join(" ", words);
    }

    public static String swapFirstAndLast(String word) {
        if (word.length() <= 1) {
            return word; // If word has only one character, no need to swap
        }
        // Swap the first and last characters
        return word.charAt(word.length() - 1) + word.substring(1, word.length() - 1) + word.charAt(0);
    }
}
