public class ApplicationStatus {
    private int applicationId;
    private String statusDescription;

    public ApplicationStatus() {
    }

    public ApplicationStatus(int applicationId, String statusDescription) {
        this.applicationId = applicationId;
        this.statusDescription = statusDescription;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public void getStatus() {
        System.out.println("[ApplicationStatus] Application #" + applicationId + " Status: " + statusDescription);
    }
}
