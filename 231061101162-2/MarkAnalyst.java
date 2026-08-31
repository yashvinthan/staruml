import java.util.Map;

public class MarkAnalyst extends User {

    public MarkAnalyst() {
        super();
        this.role = "Mark Analyst";
    }

    public MarkAnalyst(int id, String name) {
        super(id, name, "Mark Analyst");
    }

    public void marksAnalysis() {
        System.out.println("Mark Analyst '" + name + "' is analyzing aggregate student mark distributions...");
    }

    public Report reportGeneration(Map<Integer, Integer> marksMap) {
        marksAnalysis();
        if (marksMap == null || marksMap.isEmpty()) {
            return new Report("Semester Mark Analysis", "Statistical Report", "No data available for analysis.");
        }
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int m : marksMap.values()) {
            total += m;
            if (m > max) max = m;
            if (m < min) min = m;
        }
        double avg = (double) total / marksMap.size();
        String summary = String.format("Total Students: %d\nAverage Marks: %.2f\nHighest Marks: %d\nLowest Marks: %d",
                marksMap.size(), avg, max, min);
        Report report = new Report("Semester Mark Analysis", "Statistical Summary", summary);
        System.out.println("Report generated successfully by Analyst: " + name);
        return report;
    }
}
