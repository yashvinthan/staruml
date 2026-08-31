public class CheckingAccount extends Account {
    private SavingAccount linkedSavingAccount;

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(String number, float balance, BankClient bankClient) {
        super(number, balance, bankClient);
    }

    public SavingAccount getSavingAccount() {
        return linkedSavingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.linkedSavingAccount = savingAccount;
    }

    public void savingAccount() {
        System.out.println("[CheckingAccount " + number + "] Linked Saving Account: " +
                (linkedSavingAccount != null ? linkedSavingAccount.getNumber() : "None"));
    }
}
