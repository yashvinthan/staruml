public class HotelClass {
    private int hotel_id;
    private String hotel_description;
    private String hotel_type;
    private String hotel_name;
    private String hotel_rent;
    private String hotel_address;

    public HotelClass() {
    }

    public HotelClass(int hotel_id, String hotel_description, String hotel_type, String hotel_name, String hotel_rent, String hotel_address) {
        this.hotel_id = hotel_id;
        this.hotel_description = hotel_description;
        this.hotel_type = hotel_type;
        this.hotel_name = hotel_name;
        this.hotel_rent = hotel_rent;
        this.hotel_address = hotel_address;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_description() {
        return hotel_description;
    }

    public void setHotel_description(String hotel_description) {
        this.hotel_description = hotel_description;
    }

    public String getHotel_type() {
        return hotel_type;
    }

    public void setHotel_type(String hotel_type) {
        this.hotel_type = hotel_type;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_rent() {
        return hotel_rent;
    }

    public void setHotel_rent(String hotel_rent) {
        this.hotel_rent = hotel_rent;
    }

    public String getHotel_address() {
        return hotel_address;
    }

    public void setHotel_address(String hotel_address) {
        this.hotel_address = hotel_address;
    }

    public void addHotel() {
        System.out.println("[HotelClass] Added Hotel: " + hotel_name + " at " + hotel_address);
    }

    public void editHotel() {
        System.out.println("[HotelClass] Updated Hotel info for: " + hotel_name);
    }

    public void deleteHotel() {
        System.out.println("[HotelClass] Deleted Hotel ID: " + hotel_id);
    }

    public void searchHotel() {
        System.out.println("[HotelClass] Found Hotel: " + hotel_name + " (" + hotel_type + ", Rent: " + hotel_rent + ")");
    }
}
