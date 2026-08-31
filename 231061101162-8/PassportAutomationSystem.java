public class PassportAutomationSystem {
    private AdminPanel adminPanel;

    public PassportAutomationSystem() {
        this.adminPanel = new AdminPanel();
    }

    public AdminPanel getAdminPanel() {
        return adminPanel;
    }

    public void initializeSystem() {
        System.out.println("[PassportAutomationSystem] Passport Seva Service Gateway initialized & running.");
    }
}
