public class AtmMachine {
    private String address;
    private String state;
    private float cashBalance;

    public AtmMachine() {
    }

    public AtmMachine(String address, String state, float cashBalance) {
        this.address = address;
        this.state = state;
        this.cashBalance = cashBalance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public float getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(float cashBalance) {
        this.cashBalance = cashBalance;
    }

    public boolean verifyPin(BankClient client, String pin) {
        if (client.getPinNumber().equals(pin)) {
            System.out.println("[ATM @ " + address + "] PIN verified successfully for " + client.getFirstName());
            return true;
        } else {
            System.out.println("[ATM @ " + address + "] Invalid PIN entered!");
            return false;
        }
    }

    public boolean dispenseCash(float amount) {
        if (cashBalance >= amount) {
            cashBalance -= amount;
            System.out.println("[ATM @ " + address + "] Dispensing $" + amount + ". ATM remaining cash: $" + cashBalance);
            return true;
        } else {
            System.out.println("[ATM @ " + address + "] Insufficient cash in ATM machine.");
            return false;
        }
    }
}
