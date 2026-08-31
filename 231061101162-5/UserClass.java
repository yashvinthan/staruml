import java.time.LocalDate;

public class UserClass implements Interface1 {
    private int user_id;
    private int user_role_id;
    private String user_name;
    private String user_email;
    private LocalDate user_dob;
    private String user_address;

    public UserClass() {
    }

    public UserClass(int user_id, int user_role_id, String user_name, String user_email, LocalDate user_dob, String user_address) {
        this.user_id = user_id;
        this.user_role_id = user_role_id;
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_dob = user_dob;
        this.user_address = user_address;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(int user_role_id) {
        this.user_role_id = user_role_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public LocalDate getUser_dob() {
        return user_dob;
    }

    public void setUser_dob(LocalDate user_dob) {
        this.user_dob = user_dob;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public void addUser() {
        System.out.println("[UserClass] Added user: " + user_name + " (Email: " + user_email + ")");
    }

    public void editUser() {
        System.out.println("[UserClass] Edited user: " + user_name);
    }

    public void searchUser() {
        System.out.println("[UserClass] Found user: " + user_name + " (ID: " + user_id + ")");
    }

    public void deleteUser() {
        System.out.println("[UserClass] Deleted user ID: " + user_id);
    }

    @Override
    public void executeInterface1Operation() {
        System.out.println("[UserClass] Interface1 action executed for user " + user_name);
    }
}
