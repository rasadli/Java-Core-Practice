package week04;

import java.util.Scanner;

public class StringReversed {

    public static void main(String[] args) {
    
        System.out.println("Please enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String reversed = reverseString(input);
    
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    
        scanner.close();

    }

    public static String reverseString(String str) {

        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
        
            reversed.append(str.charAt(i));
        
        }
        
        return reversed.toString();
    
    }

}
