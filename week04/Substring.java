package week04;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string: ");
        String string = sc.nextLine();

        System.out.println("Please enter the sub: ");
        String sub = sc.nextLine();

        sc.close();

        System.out.println("Index: " + chechSub(string, sub));

    }

    public static int chechSub(String string, String sub) {

        // Calculate the maximum index where a substring can start
        int maxIndex = string.length() - sub.length();

        int index = -1;
        for (int i = 0; i <= maxIndex; i++) {
            // Extract substring from index i to i + sub.length()

            String substring = string.substring(i, i + sub.length());

            if (substring.equals(sub)) {
                return i;
            }

        }
        return index;

    }
}
