package inheritancemethods;

public class CreditAccount extends DebitAccount{
    private long overdraftLimit = 0;

    public CreditAccount(String accountNumber, long balance, long overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public boolean transaction(long amount){
        long debit = amount + costOfTransaction(amount);
        if (debit > getBalance() + overdraftLimit){
            return false;
        }
        if (debit <= getBalance()){
            super.transaction(amount);
        } else {
            balanceToZero();
            overdraftLimit = amount - debit;
        }
        return true;
    }

    public long getOverdraftLimit() {
        return Math.abs(overdraftLimit);
    }
}
