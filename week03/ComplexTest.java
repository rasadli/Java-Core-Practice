package week03;

import week03.math.ComplexNumber;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber nmb1 = new ComplexNumber(4, 6);
        ComplexNumber nmb2 = new ComplexNumber(5, 3);

        System.out.println("First complex number: " + nmb1);
        System.out.println("Second complex number: " + nmb2);

        System.out.println("Sum of the numbers: " + nmb1.add(nmb2));
        System.out.println("Subtraction of the numbers: " + nmb1.sub(nmb2));
        System.out.println("Multiplication of the numbers: " + nmb1.mult(nmb2));
        System.out.println("Conjugent of the first number: " + nmb1.conjugate());
        System.out.println("Absolute value of the first number: " + nmb1.abs());

    }
}
