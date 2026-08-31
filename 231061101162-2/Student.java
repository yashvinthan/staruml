public class Student extends User {
    private String viewReport;
    private int marks;
    private String grade;

    public Student() {
        super();
        this.role = "Student";
    }

    public Student(int id, String name, String viewReport) {
        super(id, name, "Student");
        this.viewReport = viewReport;
    }

    public String getViewReport() {
        return viewReport;
    }

    public void setViewReport(String viewReport) {
        this.viewReport = viewReport;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
        this.grade = (marks >= 90) ? "A+" : (marks >= 80) ? "A" : (marks >= 70) ? "B" : (marks >= 50) ? "C" : "F";
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public void viewReport() {
        System.out.println("[Student Report] Student: " + name + " (ID: " + id + ") | Marks: " + marks + " | Grade: " + grade);
    }
}
