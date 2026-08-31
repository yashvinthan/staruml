import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   EXPERIMENT 8: PASSPORT AUTOMATION SYSTEM       ");
        System.out.println("==================================================");

        PassportAutomationSystem passportSystem = new PassportAutomationSystem();
        passportSystem.initializeSystem();

        AdminAuthentication auth = new AdminAuthentication("admin", "admin123");
        if (auth.login()) {
            NewRegistration applicant1 = new NewRegistration(
                    10045, "Robert Green", 28, LocalDate.of(1998, 3, 14),
                    Gender.MALE, "PoliceVerificationDone", "Thomas Green", "Martha Green"
            );
            applicant1.register();

            ApplicationStatus status = new ApplicationStatus(10045, "Under Police Verification");
            status.getStatus();

            passportSystem.getAdminPanel().submitApplication(applicant1);
            passportSystem.getAdminPanel().procesor();

            status.setStatusDescription("Passport Dispatched via SpeedPost Tracking #SP998877");
            status.getStatus();
        }

        System.out.println("Experiment 8 completed successfully.");
    }
}
