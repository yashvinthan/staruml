import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {
    private String transId;
    private LocalDate transData;
    private LocalTime transtime;
    private String transtype;
    private float amount;
    private float postBalance;

    public Transaction() {
    }

    public Transaction(String transId, LocalDate transData, LocalTime transtime, String transtype, float amount, float postBalance) {
        this.transId = transId;
        this.transData = transData;
        this.transtime = transtime;
        this.transtype = transtype;
        this.amount = amount;
        this.postBalance = postBalance;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public LocalDate getTransData() {
        return transData;
    }

    public void setTransData(LocalDate transData) {
        this.transData = transData;
    }

    public LocalTime getTranstime() {
        return transtime;
    }

    public void setTranstime(LocalTime transtime) {
        this.transtime = transtime;
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getPostBalance() {
        return postBalance;
    }

    public void setPostBalance(float postBalance) {
        this.postBalance = postBalance;
    }

    public void displayTransaction() {
        System.out.println("TX: " + transId + " | " + transData + " " + transtime + " | Type: " + transtype + " | Amt: $" + amount + " | PostBal: $" + postBalance);
    }
}
