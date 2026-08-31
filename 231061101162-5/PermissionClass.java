public class PermissionClass {
    private int permission_id;
    private int permission_role_id;
    private String permission_title;
    private String permission_module;
    private String permission_description;

    public PermissionClass() {
    }

    public PermissionClass(int permission_id, int permission_role_id, String permission_title, String permission_module, String permission_description) {
        this.permission_id = permission_id;
        this.permission_role_id = permission_role_id;
        this.permission_title = permission_title;
        this.permission_module = permission_module;
        this.permission_description = permission_description;
    }

    public int getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(int permission_id) {
        this.permission_id = permission_id;
    }

    public int getPermission_role_id() {
        return permission_role_id;
    }

    public void setPermission_role_id(int permission_role_id) {
        this.permission_role_id = permission_role_id;
    }

    public String getPermission_title() {
        return permission_title;
    }

    public void setPermission_title(String permission_title) {
        this.permission_title = permission_title;
    }

    public String getPermission_module() {
        return permission_module;
    }

    public void setPermission_module(String permission_module) {
        this.permission_module = permission_module;
    }

    public String getPermission_description() {
        return permission_description;
    }

    public void setPermission_description(String permission_description) {
        this.permission_description = permission_description;
    }

    public void addPermission() {
        System.out.println("[PermissionClass] Added permission: " + permission_title + " for module: " + permission_module);
    }

    public void editPermission() {
        System.out.println("[PermissionClass] Edited permission ID: " + permission_id);
    }

    public void deletePermission() {
        System.out.println("[PermissionClass] Deleted permission ID: " + permission_id);
    }

    public void searchPermission() {
        System.out.println("[PermissionClass] Found permission: " + permission_title);
    }
}
