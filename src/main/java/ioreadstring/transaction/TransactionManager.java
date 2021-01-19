package ioreadstring.transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private Path accounts = Path.of("src", "main", "resources", "accounts.txt");
    private Path transactions = Path.of("src", "main", "resources", "transactions.txt");
    private List<BankAccount> bankAccounts = new ArrayList<>();

    public void readAccounts() {
        try {
            List<String> bankAccount = Files.readAllLines(accounts);
            for (String acc: bankAccount) {
                String[] bankAcc = acc.split(";");
                bankAccounts.add(new BankAccount(bankAcc[0], bankAcc[1], Integer.parseInt(bankAcc[2])));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void runTransactions(){
        try {
            List<String> bankTransactions = Files.readAllLines(transactions);
            for (String bt: bankTransactions){
                String[] tr = bt.split(";");
                for (BankAccount bankAccount: bankAccounts){
                    if (tr[0].equals(bankAccount.getAccountNumber())){
                        bankAccount.setBalance(Integer.parseInt(tr[1]));
                    }
                }
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can not Read the File", ioe);
        }
    }
}
