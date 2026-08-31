public class SavingAccount extends Account {
    private CheckingAccount linkedCheckingAccount;
    private float interestRate = 0.04f;

    public SavingAccount() {
        super();
    }

    public SavingAccount(String number, float balance, BankClient bankClient) {
        super(number, balance, bankClient);
    }

    public CheckingAccount getCheckingAccount() {
        return linkedCheckingAccount;
    }

    public void setCheckingAccount(CheckingAccount checkingAccount) {
        this.linkedCheckingAccount = checkingAccount;
    }

    public void calculateInterest() {
        float interest = balance * interestRate;
        balance += interest;
        System.out.println("[SavingAccount " + number + "] Earned interest: $" + interest + ". Balance: $" + balance);
    }
}
