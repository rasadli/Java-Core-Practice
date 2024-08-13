package week01;

public class Task4 {
    public static void main(String[] args) {
        // Using double values for division to get the correct result
        double res = (1.0 / 5) * (2.0 / 3) - (3.0 / 10);

        // 1: println adds a newline character after printing
        System.out.println(res);

        // 2: print does not add a newline character, so subsequent output will be on the same line
        System.out.print(res);

        // 3: printf allows for formatted printing, and you can control the format using format specifiers
        System.out.printf("%.4f%n", res);
    }
}
