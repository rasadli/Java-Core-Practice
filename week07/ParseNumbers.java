package week07;

import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine(), word = null;
        sc.close();

        sc = new Scanner(line); 
        int sum = 0, cnt = 0;
        while (sc.hasNext()) { 
            word = sc.next();
            // Check if the current token is a valid integer
            if (word.matches("-?\\d+")) { 
                sum += Integer.parseInt(word); 
                cnt++;
            }
        }

        sc.close();

        if (cnt == 0)
            System.out.println("There are no valid input provided!");
        else
            System.out.printf("Sum = %d\ncnt = %d\nAverage = %.3f\n", sum, cnt, (float) sum / cnt);
    }
}
