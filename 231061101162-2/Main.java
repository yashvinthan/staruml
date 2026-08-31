public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   EXPERIMENT 2: STUDENT MARK ANALYSIS SYSTEM   ");
        System.out.println("==================================================");

        Database db = new Database(101, "University_Marks_DB");
        Administrator admin = new Administrator(1, "Dr. Alice (Dean)", "FullAccess");
        Faculty faculty = new Faculty(2, "Prof. Bob", "Enabled");
        Student student1 = new Student(101, "Charlie", "Standard");
        Student student2 = new Student(102, "Diana", "Standard");
        MarkAnalyst analyst = new MarkAnalyst(3, "Eve (Analyst)");

        admin.login();
        admin.configureSystemSettings("Mark_Entry_Deadline", "2026-09-15");

        faculty.login();
        faculty.enterMarks(101, 88);
        faculty.enterMarks(102, 94);

        student1.setMarks(88);
        student2.setMarks(94);

        db.addUser(admin);
        db.addUser(faculty);
        db.addUser(student1);
        db.addUser(student2);

        analyst.login();
        Report report = analyst.reportGeneration(faculty.getStudentMarks());
        report.display();
        db.addReport(report);

        student1.viewReport();
        student2.viewReport();

        System.out.println("Experiment 2 completed successfully.");
    }
}
