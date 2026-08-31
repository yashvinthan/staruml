import java.util.HashMap;
import java.util.Map;

public class Faculty extends User {
    private String markEntry;
    private Map<Integer, Integer> studentMarks;

    public Faculty() {
        super();
        this.role = "Faculty";
        this.studentMarks = new HashMap<>();
    }

    public Faculty(int id, String name, String markEntry) {
        super(id, name, "Faculty");
        this.markEntry = markEntry;
        this.studentMarks = new HashMap<>();
    }

    public String getMarkEntry() {
        return markEntry;
    }

    public void setMarkEntry(String markEntry) {
        this.markEntry = markEntry;
    }

    public void enterMarks(int studentId, int marks) {
        studentMarks.put(studentId, marks);
        System.out.println("Faculty '" + name + "' entered marks: " + marks + " for Student ID: " + studentId);
    }

    public Map<Integer, Integer> getStudentMarks() {
        return studentMarks;
    }
}
