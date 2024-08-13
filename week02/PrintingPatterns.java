package week02;

import java.util.Scanner;

public class PrintingPatterns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please add the pattern number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n; j++) {
            
                if ((i + j) % 2 != 0) {
            
                    System.out.print("# ");
            
                } else {
            
                    System.out.print("* ");
            
                }
            
            }
            
            // new line 
            System.out.print("\n");
        }

        sc.close();

    }
}
