package week12.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.calculate(3, 4));

        Calculator subtaction = (a, b) -> a - b;
        System.out.println("Addition: " + subtaction.calculate(3, 4));

        Calculator multiplication = (a, b) -> a * b;
        System.out.println("Addition: " + multiplication.calculate(3, 4));

        Calculator division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        };
        System.out.println("Division: " + division.calculate(10, 2)); 

        Calculator exponentiation = (a, b) -> Math.pow(a, b);
        System.out.println("Exponentiation: " + exponentiation.calculate(2, 3));
    }
}
