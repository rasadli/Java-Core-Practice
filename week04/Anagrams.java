package week04;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the first word: ");
        String str1 = sc.nextLine();

        System.out.print("Please enter the second word: ");
        String str2 = sc.nextLine();

        sc.close();

        System.out.println("Result: " + str1 + " and " + str2 + " are " + (ifAnagram(str1, str2) ? "anagrams" : "not anagrams") + ".");
    }

    public static boolean ifAnagram(String str1, String str2) {
        boolean anagram = false;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return anagram;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        for (int i = 0; i < charArray1.length - 1; i++) {
            boolean swapped = false; // Assume no swaps are made initially
            for (int j = 0; j < charArray1.length - i - 1; j++) {
                if (charArray1[j] > charArray1[j + 1]) {
                    // Swap characters
                    char temp = charArray1[j];
                    charArray1[j] = charArray1[j + 1];
                    charArray1[j + 1] = temp;

                    swapped = true; // Set swapped to true if a swap occurs
                }
            }
            // If no swaps were made during this pass, the array is sorted, so break the
            // loop
            if (!swapped) {
                break;
            }
        }

        for (int i = 0; i < charArray2.length - 1; i++) {
            boolean swapped = false; // Assume no swaps are made initiall
            for (int j = 0; j < charArray2.length - i - 1; j++) {
                if (charArray2[j] > charArray2[j + 1]) {
                    // Swap characters
                    char temp = charArray2[j];
                    charArray2[j] = charArray2[j + 1];
                    charArray2[j + 1] = temp;

                    swapped = true; // Set swapped to true if a swap occurs
                }
            }
            // If no swaps were made during this pass, the array is sorted, so break the
            // loop
            if (!swapped) {
                break;
            }
        }

        anagram = Arrays.equals(charArray1, charArray2);

        return anagram;

    }

}
