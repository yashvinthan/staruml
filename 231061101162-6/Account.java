import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Account {
    protected String number;
    protected float balance;
    protected BankClient bankClient;
    protected List<Transaction> transactions;

    public Account() {
        this.transactions = new ArrayList<>();
    }

    public Account(String number, float balance, BankClient bankClient) {
        this.number = number;
        this.balance = balance;
        this.bankClient = bankClient;
        this.transactions = new ArrayList<>();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public BankClient getBankClient() {
        return bankClient;
    }

    public void setBankClient(BankClient bankClient) {
        this.bankClient = bankClient;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void deposit(float amount) {
        balance += amount;
        Transaction tx = new Transaction("TX-" + System.currentTimeMillis(), LocalDate.now(), LocalTime.now(), "DEPOSIT", amount, balance);
        transactions.add(tx);
        System.out.println("[Account " + number + "] Deposited $" + amount + ". New balance: $" + balance);
    }

    public boolean withdraw(float amount) {
        if (balance >= amount) {
            balance -= amount;
            Transaction tx = new Transaction("TX-" + System.currentTimeMillis(), LocalDate.now(), LocalTime.now(), "WITHDRAWAL", amount, balance);
            transactions.add(tx);
            System.out.println("[Account " + number + "] Withdrew $" + amount + ". New balance: $" + balance);
            return true;
        } else {
            System.out.println("[Account " + number + "] Insufficient funds! Current balance: $" + balance);
            return false;
        }
    }
}
