public class RoleClass {
    private int role_id;
    private String role_title;
    private String role_description;

    public RoleClass() {
    }

    public RoleClass(int role_id, String role_title, String role_description) {
        this.role_id = role_id;
        this.role_title = role_title;
        this.role_description = role_description;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_title() {
        return role_title;
    }

    public void setRole_title(String role_title) {
        this.role_title = role_title;
    }

    public String getRole_description() {
        return role_description;
    }

    public void setRole_description(String role_description) {
        this.role_description = role_description;
    }

    public void addRole() {
        System.out.println("[RoleClass] Added new role: " + role_title + " (ID: " + role_id + ")");
    }

    public void editRole() {
        System.out.println("[RoleClass] Edited role: " + role_title + " (ID: " + role_id + ")");
    }

    public void deleteRole() {
        System.out.println("[RoleClass] Deleted role ID: " + role_id);
    }

    public void searchRole() {
        System.out.println("[RoleClass] Searching for role ID: " + role_id + " -> Found: " + role_title);
    }

    public void assignRole() {
        System.out.println("[RoleClass] Role '" + role_title + "' assigned to user.");
    }
}
