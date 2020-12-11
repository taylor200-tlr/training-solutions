package inheritancemethods;

public class DebitAccount {
    private String accountNumber;
    private long balance;
    private final double COST = 3.0;
    private final long MIN_COST = 200;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public final long costOfTransaction(long amount){
        long result = MIN_COST;
        return result = (amount * COST / 100) < MIN_COST ? MIN_COST : (long)(amount * COST / 100);
    }

    public boolean transaction(long amount){
        boolean result = false;
        long debit = amount + costOfTransaction(amount);
        if (debit < balance) {
            balance = balance - debit;
            result = true;
        }
        return result;
    }

    public void balanceToZero(){
        balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }
}
