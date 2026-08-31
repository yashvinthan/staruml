public class Report {
    private String reportName;
    private String reportType;
    private String content;

    public Report() {
    }

    public Report(String reportName, String reportType) {
        this.reportName = reportName;
        this.reportType = reportType;
        this.content = "Default Analysis Content for " + reportName;
    }

    public Report(String reportName, String reportType, String content) {
        this.reportName = reportName;
        this.reportType = reportType;
        this.content = content;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println("========== " + reportName + " (" + reportType + ") ==========");
        System.out.println(content);
        System.out.println("=============================================================");
    }
}
