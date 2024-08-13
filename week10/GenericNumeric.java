package week10;

public class GenericNumeric<T extends Number> {
    private T number;

    public GenericNumeric(T number) {
        this.number = number;
    }

    public double reciprocal() {
        return 1 / number.doubleValue();
    }

    public double fractionalPart() {
        return number.doubleValue() % 1;
    }

    public boolean checkAbsoluteEquality(Number otherNumber) {
        return Math.abs(number.doubleValue()) == Math.abs(otherNumber.doubleValue());
    }

    public static void main(String[] args) {
        GenericNumeric<Double> doubleNumber = new GenericNumeric<>(5.0);
        System.out.println("Reciprocal: " + doubleNumber.reciprocal());
        System.out.println("Fractional part: " + doubleNumber.fractionalPart());
        System.out.println("Absolute equality check with 5.0: " + doubleNumber.checkAbsoluteEquality(5.0));
    }
}
