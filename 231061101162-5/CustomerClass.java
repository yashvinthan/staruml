public class CustomerClass implements Interface2 {
    private int customer_id;
    private String customer_name;
    private String customer_email;
    private String customer_mobile;
    private String customer_address;
    private String customer_username;
    private String customer_password;

    public CustomerClass() {
    }

    public CustomerClass(int customer_id, String customer_name, String customer_email, String customer_mobile, String customer_address, String customer_username, String customer_password) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_mobile = customer_mobile;
        this.customer_address = customer_address;
        this.customer_username = customer_username;
        this.customer_password = customer_password;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_mobile() {
        return customer_mobile;
    }

    public void setCustomer_mobile(String customer_mobile) {
        this.customer_mobile = customer_mobile;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getCustomer_username() {
        return customer_username;
    }

    public void setCustomer_username(String customer_username) {
        this.customer_username = customer_username;
    }

    public String getCustomer_password() {
        return customer_password;
    }

    public void setCustomer_password(String customer_password) {
        this.customer_password = customer_password;
    }

    public void addCustomer() {
        System.out.println("[CustomerClass] Registered new customer: " + customer_name + " (Mobile: " + customer_mobile + ")");
    }

    public void editCustomer() {
        System.out.println("[CustomerClass] Updated customer details for: " + customer_name);
    }

    public void deleteCustomer() {
        System.out.println("[CustomerClass] Deleted customer ID: " + customer_id);
    }

    public void searchCustomer() {
        System.out.println("[CustomerClass] Found customer record: " + customer_name + " (Username: " + customer_username + ")");
    }

    @Override
    public void executeInterface2Operation() {
        System.out.println("[CustomerClass] Interface2 action executed for customer " + customer_name);
    }
}
