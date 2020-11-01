package classstructure;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;
    private int amount;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public String getInfo() {
        return owner + " (" + accountNumber + "): " + balance + " Ft";
    }

    public void transfer(BankAccount masikra, int amount) {
        this.withdraw(amount);
        masikra.deposit(amount);
    }
}
