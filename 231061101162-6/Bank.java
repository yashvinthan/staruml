import java.util.HashMap;
import java.util.Map;

public class Bank implements NewInterface {
    private String bankName;
    private String branchCode;
    private Map<String, Account> accounts;

    public Bank() {
        this.bankName = "Global Apex Bank";
        this.branchCode = "GAB001";
        this.accounts = new HashMap<>();
    }

    public Bank(String bankName, String branchCode) {
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.accounts = new HashMap<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public void addAccount(Account account) {
        accounts.put(account.getNumber(), account);
        System.out.println("[Bank] Registered Account: " + account.getNumber());
    }

    public Account getAccount(String number) {
        return accounts.get(number);
    }

    @Override
    public void executeBankingService() {
        System.out.println("[Bank] Core banking services active for " + bankName);
    }
}
