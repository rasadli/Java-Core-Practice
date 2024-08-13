package week10.property;

public class PolindromeProperty implements Property<String> {

    @Override
    public boolean test(String i) {
        String reversed = new StringBuilder(i).reverse().toString();
        return i.equals(reversed);
    }

}
