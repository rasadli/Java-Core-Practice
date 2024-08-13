package week08.account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountDemo {
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Rashad", "Asadli", 120.00));
        accounts.add(new Account("Omar", "Guliyev", 200.00));
        accounts.add(new Account("Aykhan", "Camalkhanli", 1100.00));

        System.out.println("List of Account: ");
        for (Account account : accounts) {
            System.out.println(account);
        }

        Collections.sort(accounts);
        System.out.println("\nSorted by Fullname: ");
        for (Account account : accounts) {
            System.out.println(account);
        }

        accounts.sort(Account.getBalanceComparator());

        System.out.println("\nSorted by Balance: ");
        for (Account account : accounts) {
            System.out.println(account);
        }

    }
}
