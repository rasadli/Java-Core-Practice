package week05;

import week05.banking.Account;
import week05.banking.Customer;

public class BankingDemo {
    public static void main(String[] args) {
        Customer customer1 = new Customer(101, "Bob", 'm');
        Account account1 = new Account(1001, customer1);

        // Deposit $500 and then withdraw $200
        account1.deposit(500.0).withdraw(200.0);

        // Print updated account details
        System.out.println(account1); // Output: Bob(101) balance=$300.00
    }
}
