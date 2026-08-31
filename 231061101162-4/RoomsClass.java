public class RoomsClass {
    private int room_id;
    private int room_exam_id;
    private String room_number;
    private String room_type;
    private String room_description;

    public RoomsClass() {
    }

    public RoomsClass(int room_id, int room_exam_id, String room_number, String room_type, String room_description) {
        this.room_id = room_id;
        this.room_exam_id = room_exam_id;
        this.room_number = room_number;
        this.room_type = room_type;
        this.room_description = room_description;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getRoom_exam_id() {
        return room_exam_id;
    }

    public void setRoom_exam_id(int room_exam_id) {
        this.room_exam_id = room_exam_id;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getRoom_description() {
        return room_description;
    }

    public void setRoom_description(String room_description) {
        this.room_description = room_description;
    }

    public void addRooms() {
        System.out.println("[RoomsClass] Added Room: " + room_number + " (" + room_type + ")");
    }

    public void editRooms() {
        System.out.println("[RoomsClass] Updated Room: " + room_number);
    }

    public void deleteRooms() {
        System.out.println("[RoomsClass] Deleted Room ID: " + room_id);
    }

    public void searchRooms() {
        System.out.println("[RoomsClass] Found Room: " + room_number + " [" + room_type + "] - " + room_description);
    }
}
