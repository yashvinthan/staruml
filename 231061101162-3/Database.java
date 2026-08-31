import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<String> records;

    public Database() {
        records = new ArrayList<>();
    }

    public void addition() {
        System.out.println("[Database] Addition operation executed.");
    }

    public void addRecord(String record) {
        records.add(record);
        System.out.println("[Database] Added: " + record);
    }

    public void updation() {
        System.out.println("[Database] Updation operation executed.");
    }

    public void updateRecord(int index, String newRecord) {
        if (index >= 0 && index < records.size()) {
            records.set(index, newRecord);
            System.out.println("[Database] Updated record at index " + index + " to: " + newRecord);
        }
    }

    public void deletino() {
        System.out.println("[Database] Deletion (deletino) operation executed.");
    }

    public void deleteRecord(int index) {
        if (index >= 0 && index < records.size()) {
            String removed = records.remove(index);
            System.out.println("[Database] Deleted record: " + removed);
        }
    }

    public List<String> getRecords() {
        return records;
    }
}
