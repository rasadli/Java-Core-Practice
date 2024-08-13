package week04;

import java.util.Scanner;

public class ExploadedString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String exploaded = stringExploader(str);

        System.out.println("Normal string: " + str);
        System.out.println("Exploaded string: " + exploaded);

        sc.close();
    }

    public static String stringExploader(String str) {

        StringBuilder exploaded = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j <= i; j++) {

                exploaded.append(str.charAt(j));

            }

        }
        return exploaded.toString();
    }

}
