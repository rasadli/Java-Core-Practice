package week04;

import java.util.Scanner;

public class SortingStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the string that you want to sort: ");
        String str = sc.nextLine();

        System.out.println("Original string: " + str);
        System.out.println("Sorted string: " + stringSorter(str));

        sc.close();
    }

    public static String stringSorter(String str) {

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {

            boolean swapped = false; // Assume no swaps are made initially

            for (int j = 0; j < charArray.length - i - 1; j++) {

                if (charArray[j] > charArray[j + 1]) {

                    // Swap characters
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;

                    swapped = true; // Set swapped to true if a swap occurs

                }

            }

            // If no swaps were made during this pass, the array is sorted, so break the loop
            if (!swapped) {
                break;
            }

        }

        String sorted = charArray.toString();

        return sorted;
    }
}
