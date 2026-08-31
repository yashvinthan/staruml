import java.time.LocalDate;

public class PaymentsClass implements Interface4 {
    private int payment_id;
    private int payment_customer_id;
    private String payment_description;
    private String payment_amount;
    private LocalDate payment_date;

    public PaymentsClass() {
    }

    public PaymentsClass(int payment_id, int payment_customer_id, String payment_description, String payment_amount, LocalDate payment_date) {
        this.payment_id = payment_id;
        this.payment_customer_id = payment_customer_id;
        this.payment_description = payment_description;
        this.payment_amount = payment_amount;
        this.payment_date = payment_date;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public int getPayment_customer_id() {
        return payment_customer_id;
    }

    public void setPayment_customer_id(int payment_customer_id) {
        this.payment_customer_id = payment_customer_id;
    }

    public String getPayment_description() {
        return payment_description;
    }

    public void setPayment_description(String payment_description) {
        this.payment_description = payment_description;
    }

    public String getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(String payment_amount) {
        this.payment_amount = payment_amount;
    }

    public LocalDate getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(LocalDate payment_date) {
        this.payment_date = payment_date;
    }

    public void addPayments() {
        System.out.println("[PaymentsClass] Processed Payment ID #" + payment_id + " for $" + payment_amount + " on " + payment_date);
    }

    public void editPayments() {
        System.out.println("[PaymentsClass] Updated Payment record #" + payment_id);
    }

    public void deletePayments() {
        System.out.println("[PaymentsClass] Refunded/Deleted Payment ID #" + payment_id);
    }

    public void searchPayments() {
        System.out.println("[PaymentsClass] Found Payment #" + payment_id + ": $" + payment_amount + " (" + payment_description + ")");
    }

    @Override
    public void executeInterface4Operation() {
        System.out.println("[PaymentsClass] Interface4 operation executed for payment #" + payment_id);
    }
}
