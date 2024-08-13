package week01;

class Task5 {
    public static void main(String[] args) {

        int intValue = 123;

        // value in decimal format
        System.out.println("Integer in decimal format: " + intValue);

        // value in hecadecimal format
        System.out.printf("Integer in hexadecimal format: %x%n", intValue);

        // value in octal format
        System.out.printf("Integer in octal format: %o%n", intValue);

        float floatValue = 123.456f;

        // value in decimal floating format
        System.out.println("\nFloat in decimal floating-point format: " + floatValue);

        // value in scientific notation
        System.out.printf("Float in scientific notation: %e%n", floatValue);

        // value in general floating-point format
        System.out.printf("Float in general floating-point format: %f%n", floatValue);
    }
}
