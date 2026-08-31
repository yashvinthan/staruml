public class PassengerInfo {
    private Integer passId;
    private String passName;
    private Integer age;
    private String sex;
    private String address;
    private Integer phoneNo;
    private String email_id;

    public PassengerInfo() {
    }

    public PassengerInfo(Integer passId, String passName, Integer age, String sex, String address, Integer phoneNo, String email_id) {
        this.passId = passId;
        this.passName = passName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email_id = email_id;
    }

    public Integer getPassId() {
        return passId;
    }

    public void setPassId(Integer passId) {
        this.passId = passId;
    }

    public String getPassName() {
        return passName;
    }

    public void setPassName(String passName) {
        this.passName = passName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public void addPassenger() {
        System.out.println("[PassengerInfo] Added Passenger: " + passName + " (ID: " + passId + ", Age: " + age + ")");
    }

    public void updatePassenger() {
        System.out.println("[PassengerInfo] Updated Passenger ID: " + passId);
    }

    public void delPassenger() {
        System.out.println("[PassengerInfo] Deleted Passenger ID: " + passId);
    }
}
