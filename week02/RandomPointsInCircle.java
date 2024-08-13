package week02;

import java.util.Random;

public class RandomPointsInCircle {
    public static void main(String[] args) {
        int n = 5;

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            // x coordinate:
            double x = -1 + 2 * random.nextDouble();
            // y coordinate:
            double y = -1 + 2 * random.nextDouble();       
            
            // Printing result:
            if (x * x + y * y <= 1) {
                System.out.println("Point: (" + x + ", " + y + ")");
            }
            else {
                i--;
            }
        }
    }
}