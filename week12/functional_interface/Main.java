package week12.functional_interface;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Consumer<String> c = new Consumer<>() {
            public void accept(String s) {
                String reverse = new StringBuilder(s).reverse().toString();
                System.out.println(reverse);
            }

        };
        c.accept("Hello");

        AFuncInt<String> fi = new AFuncInt<>() {
            @Override
            public void apply(String input) {
                System.out.println("Anonymous class apply(): " + input);
            }
        };

        fi.apply("Testing apply()");
        AFuncInt.print("Testing static print()");
        fi.print("Testing default print()", "Testing default print()");

        AFuncInt<String> lambdaInstance = (input) -> {
            System.out.println("Lambda apply(): " + input);
        };

        lambdaInstance.apply("Test apply()");
        AFuncInt.print("Test static print()");
        lambdaInstance.print("Test default print()", "Second parameter");
    }
}
