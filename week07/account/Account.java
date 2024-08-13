package week07.account;

public class Account {

    @SuppressWarnings("unused") //for preventing the unsued id warning

	private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return getId();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return this.customer.toString() + " balance=$" + String.format("%.2f", this.balance);
    }
    public Account deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            throw new InvalidAmountException("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }

    // custom runtime exception class
    public static class InvalidAmountException extends RuntimeException {
        public InvalidAmountException(String message) {
            super(message);
        }
    }
}
