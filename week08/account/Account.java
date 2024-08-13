package week08.account;

import java.util.Comparator;

public class Account implements Comparable<Account> {
    private String firstName;
    private String lastName;
    private double balance;

    public Account(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{ Name: " +
                getFirstName() + ", Surname: " +
                getLastName() + ", Balance: " +
                getBalance() + "}";
    }

    @Override
    public int compareTo(Account other) {
        String fullName = this.firstName + "," + this.lastName;
        String otherfullName = other.firstName + ", " + other.lastName;
        return fullName.compareTo(otherfullName);
    }

    public static Comparator<Account> getBalanceComparator() {
        return new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return Double.compare(o1.balance, o2.balance);
            }
        };
    }

}
