package itrum.concurrency.bank;

import java.util.HashMap;
import java.util.Map;

public class ConcurrentBank {
    private Map<Integer, BankAccount> accounts;

    public ConcurrentBank() {
        this.accounts = new HashMap<>();
    }

    public BankAccount createAccount(int initialBalance) {
        BankAccount account = new BankAccount(accounts.size() + 1, initialBalance);
        accounts.put(account.getAccountNumber(), account);
        return account;
    }

    public void transfer(BankAccount fromAccount, BankAccount toAccount, int amount) {
        synchronized (fromAccount) {
            synchronized (toAccount) {
                if (fromAccount.getBalance() >= amount) {
                    fromAccount.withdraw(amount);
                    toAccount.deposit(amount);
                }
            }
        }
    }

    public int getTotalBalance() {
        int totalBalance = 0;
        for (BankAccount account : accounts.values()) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }
}
