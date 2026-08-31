public class User {
    protected int id;
    protected String name;
    protected String role;

    public User() {
    }

    public User(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean login() {
        System.out.println("User '" + name + "' (ID: " + id + ", Role: " + role + ") logged in successfully.");
        return true;
    }

    public void viewReport() {
        System.out.println("Viewing general report for User: " + name);
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', role='" + role + "'}";
    }
}
