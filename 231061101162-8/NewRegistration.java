import java.time.LocalDate;

public class NewRegistration {
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String attribute5;
    private String fatherName;
    private String motherName;
    private int applicationId;

    public NewRegistration() {
    }

    public NewRegistration(int applicationId, String name, int age, LocalDate dateOfBirth, Gender gender, String attribute5, String fatherName, String motherName) {
        this.applicationId = applicationId;
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.attribute5 = attribute5;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void register() {
        System.out.println("[NewRegistration] Registered Application #" + applicationId + " for applicant: " + name + " (DOB: " + dateOfBirth + ")");
    }

    public void cancel() {
        System.out.println("[NewRegistration] Cancelled application #" + applicationId + " for applicant: " + name);
    }
}
