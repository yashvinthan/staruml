public class BankClient {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private String pinNumber;
    private Account account;

    public BankClient() {
    }

    public BankClient(String firstName, String lastName, String cardNumber, String pinNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.pinNumber = pinNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void changePin(String oldPin, String newPin) {
        if (this.pinNumber.equals(oldPin)) {
            this.pinNumber = newPin;
            System.out.println("PIN successfully updated for " + firstName + " " + lastName);
        } else {
            System.out.println("Incorrect old PIN. PIN change failed.");
        }
    }
}
