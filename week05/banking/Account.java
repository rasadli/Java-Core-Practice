package week05.banking;

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
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("amount witdrawn exceeds the current balance!");
        }
        return this;
    }
}
