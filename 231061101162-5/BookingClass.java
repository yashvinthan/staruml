import java.time.LocalDate;

public class BookingClass implements Interface3 {
    private int booking_id;
    private String booking_type;
    private String booking_title;
    private String booking_description;
    private LocalDate booking_date;

    public BookingClass() {
    }

    public BookingClass(int booking_id, String booking_type, String booking_title, String booking_description, LocalDate booking_date) {
        this.booking_id = booking_id;
        this.booking_type = booking_type;
        this.booking_title = booking_title;
        this.booking_description = booking_description;
        this.booking_date = booking_date;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getBooking_type() {
        return booking_type;
    }

    public void setBooking_type(String booking_type) {
        this.booking_type = booking_type;
    }

    public String getBooking_title() {
        return booking_title;
    }

    public void setBooking_title(String booking_title) {
        this.booking_title = booking_title;
    }

    public String getBooking_description() {
        return booking_description;
    }

    public void setBooking_description(String booking_description) {
        this.booking_description = booking_description;
    }

    public LocalDate getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(LocalDate booking_date) {
        this.booking_date = booking_date;
    }

    public void addBooking() {
        System.out.println("[BookingClass] Created booking #" + booking_id + ": " + booking_title + " on " + booking_date);
    }

    public void editBooking() {
        System.out.println("[BookingClass] Modified booking #" + booking_id);
    }

    public void deleteBooking() {
        System.out.println("[BookingClass] Cancelled booking #" + booking_id);
    }

    public void searchBooking() {
        System.out.println("[BookingClass] Found booking #" + booking_id + " (" + booking_type + ")");
    }

    @Override
    public void executeInterface3Operation() {
        System.out.println("[BookingClass] Interface3 action executed for booking #" + booking_id);
    }
}
