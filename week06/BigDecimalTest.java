package week06;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        // Example 1: 2.35 - 1.95
        BigDecimal result1 = new BigDecimal("2.35").subtract(new BigDecimal("1.95"));
        System.out.println("Result of 2.35 - 1.95: " + result1);

        // Example 2: 1000000.0f + 1.2f - 1000000.0f
        BigDecimal result2 = new BigDecimal("1000000.0").add(new BigDecimal("1.2")).subtract(new BigDecimal("1000000.0"));
        System.out.println("Result of 1000000.0 + 1.2 - 1000000.0: " + result2);
    }
}