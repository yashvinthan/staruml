import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
    private int id;
    private String name;
    private Map<Integer, User> usersTable;
    private List<Report> reportsTable;

    public Database() {
        this.id = 1;
        this.name = "StudentMarkAnalysisDB";
        this.usersTable = new HashMap<>();
        this.reportsTable = new ArrayList<>();
    }

    public Database(int id, String name) {
        this.id = id;
        this.name = name;
        this.usersTable = new HashMap<>();
        this.reportsTable = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addition() {
        System.out.println("[Database] Addition operation performed in DB: " + name);
    }

    public void addUser(User user) {
        usersTable.put(user.getId(), user);
        System.out.println("[Database] Added User ID: " + user.getId() + " (" + user.getName() + ")");
    }

    public void addReport(Report report) {
        reportsTable.add(report);
        System.out.println("[Database] Saved Report: " + report.getReportName());
    }

    public void updation() {
        System.out.println("[Database] Updation operation performed in DB: " + name);
    }

    public void updateUser(User user) {
        if (usersTable.containsKey(user.getId())) {
            usersTable.put(user.getId(), user);
            System.out.println("[Database] Updated User ID: " + user.getId());
        } else {
            System.out.println("[Database] User ID " + user.getId() + " not found for update.");
        }
    }

    public void deletion() {
        System.out.println("[Database] Deletion operation performed in DB: " + name);
    }

    public void deleteUser(int userId) {
        User removed = usersTable.remove(userId);
        if (removed != null) {
            System.out.println("[Database] Deleted User: " + removed.getName());
        } else {
            System.out.println("[Database] User ID " + userId + " not found.");
        }
    }

    public List<Report> getReportsTable() {
        return reportsTable;
    }
}
