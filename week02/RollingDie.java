package week02;

public class RollingDie {
    public static void main(String[] args) {
        double randomValue = Math.random();

        int result;
        System.out.println(randomValue);
        if (randomValue < 1.0 / 8.0) {
            result = 1;
        } else if (randomValue < 2.0 / 8.0) {
            result = 2;
        } else if (randomValue < 3.0 / 8.0) {
            result = 3;
        } else if (randomValue < 4.0 / 8.0) {
            result = 4;
        } else if (randomValue < 6.0 / 8.0) {
            result = 5;
        } else {
            result = 6;
        }

        System.out.println("Result: " + result);
    }
}

