import java.util.ArrayList;
import java.util.List;

public class AdminPanel {
    private List<NewRegistration> yetToBeProcessedApplication;
    private List<NewRegistration> dispatchedApplication;
    private int applicationId;

    public AdminPanel() {
        this.yetToBeProcessedApplication = new ArrayList<>();
        this.dispatchedApplication = new ArrayList<>();
    }

    public List<NewRegistration> getYetToBeProcessedApplication() {
        return yetToBeProcessedApplication;
    }

    public List<NewRegistration> getDispatchedApplication() {
        return dispatchedApplication;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public void submitApplication(NewRegistration reg) {
        yetToBeProcessedApplication.add(reg);
        System.out.println("[AdminPanel] Received new application #" + reg.getApplicationId() + " into queue.");
    }

    public void procesor() {
        if (!yetToBeProcessedApplication.isEmpty()) {
            NewRegistration reg = yetToBeProcessedApplication.remove(0);
            this.applicationId = reg.getApplicationId();
            System.out.println("[AdminPanel: procesor()] Verified & Processed Application #" + applicationId + " (" + reg.getName() + ")");
            dispatchedApplication.add(reg);
            System.out.println("[AdminPanel] Application #" + applicationId + " moved to Dispatched / Ready for Delivery.");
        } else {
            System.out.println("[AdminPanel] No pending applications to process.");
        }
    }
}
