public class Administrator extends User {
    private String makeChangesInSystem;

    public Administrator() {
        super();
        this.role = "Administrator";
    }

    public Administrator(int id, String name, String makeChangesInSystem) {
        super(id, name, "Administrator");
        this.makeChangesInSystem = makeChangesInSystem;
    }

    public String getMakeChangesInSystem() {
        return makeChangesInSystem;
    }

    public void setMakeChangesInSystem(String makeChangesInSystem) {
        this.makeChangesInSystem = makeChangesInSystem;
    }

    public void configureSystemSettings(String setting, String value) {
        System.out.println("Administrator '" + name + "' updated setting [" + setting + "] to: " + value);
    }
}
