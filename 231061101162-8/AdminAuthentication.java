public class AdminAuthentication {
    private String username;
    private String password;

    public AdminAuthentication() {
    }

    public AdminAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login() {
        if ("admin".equalsIgnoreCase(username) && "admin123".equals(password)) {
            System.out.println("[AdminAuthentication] Admin user '" + username + "' authenticated successfully.");
            return true;
        } else {
            System.out.println("[AdminAuthentication] Authentication failed for username: " + username);
            return false;
        }
    }
}
