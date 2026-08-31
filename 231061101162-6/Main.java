public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   EXPERIMENT 6: ATM & BANKING SYSTEM             ");
        System.out.println("==================================================");

        Bank bank = new Bank("National Reserve Bank", "NRB-101");
        bank.executeBankingService();

        AtmMachine atm = new AtmMachine("Central Station, NY", "Active", 50000.0f);

        BankClient client = new BankClient("John", "Smith", "4532-1100-2200-3300", "1234");
        CheckingAccount chk = new CheckingAccount("CHK-9876", 1500.0f, client);
        SavingAccount sav = new SavingAccount("SAV-5432", 5000.0f, client);

        chk.setSavingAccount(sav);
        sav.setCheckingAccount(chk);
        client.setAccount(chk);

        bank.addAccount(chk);
        bank.addAccount(sav);

        System.out.println("\n--- Performing ATM Transactions ---");
        if (atm.verifyPin(client, "1234")) {
            System.out.println("Current Balance in Checking: $" + chk.getBalance());
            if (chk.withdraw(300.0f)) {
                atm.dispenseCash(300.0f);
            }
            chk.deposit(100.0f);
            sav.calculateInterest();
        }

        chk.savingAccount();
        System.out.println("\n--- Transaction History for " + chk.getNumber() + " ---");
        for (Transaction tx : chk.getTransactions()) {
            tx.displayTransaction();
        }

        System.out.println("Experiment 6 completed successfully.");
    }
}
