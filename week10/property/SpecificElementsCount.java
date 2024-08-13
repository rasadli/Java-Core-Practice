package week10.property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import week08.account.Account;

public class SpecificElementsCount {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 54, 6, 7));
        System.out.println("Number of even integers in the collection: " + count(nums, new EvenProperty()));

        ArrayList<String> str = new ArrayList<>(Arrays.asList("abba", "bccb", "abba", "abcd"));
        System.out.println("Numbers of palindrome strings in the collection: " + count(str, new PolindromeProperty()));

        ArrayList<Account> accounts = new ArrayList<>(Arrays.asList(
                new Account("Rashad", "Asadli", 1000.0),
                new Account("Javid", "Jabiyev", 2000.0),
                new Account("Rauf", "Asadli", 0)));
        System.out.println("Numbers of accounts with 0 balance in the collection: " + count(accounts, new PolindromeAccount()));
    }

    static <T> int count(Collection<T> col, Property<T> prop) {
        int counter = 0;
        for (T i : col) {
            if (prop.test(i)) {
                counter++;
            }
        }
        return counter;
    }
}
