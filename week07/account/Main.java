package week07.account;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(17960, "Asad", 'm');
        Account account = new Account(1, customer, 10.0);

        try {
            account.withdraw(15.0);
        } catch (Account.InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
