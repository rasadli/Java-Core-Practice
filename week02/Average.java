package week02;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nmbs: ");

        double sum = 0;
        int cnt = 0;

        // Getting inputs until there is no input:
        while (sc.hasNext()) {
            if (sc.hasNextDouble()) {
                double nmb = sc.nextDouble();
                sum += nmb;
                cnt++;                
            }
            else {
                sc.next();
            }
        }

        sc.close();

        // Printing result:
        if (cnt == 0) {
            System.out.println("Error");
        }
        else {
            double avg = sum / cnt;
            System.out.println("Avarege: " + avg);
        }
    }
}