import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   EXPERIMENT 5: HOTEL RESERVATION SYSTEM   ");
        System.out.println("==================================================");

        RoleClass adminRole = new RoleClass(1, "Administrator", "Full system access");
        adminRole.addRole();
        adminRole.assignRole();

        PermissionClass manageRoomsPerm = new PermissionClass(10, 1, "MANAGE_ROOMS", "ROOM_MANAGEMENT", "Ability to create and edit rooms");
        manageRoomsPerm.addPermission();

        UserClass staffUser = new UserClass(501, 1, "Admin Staff", "staff@grandhotel.com", LocalDate.of(1990, 5, 20), "123 Hotel Ave");
        staffUser.addUser();
        staffUser.executeInterface1Operation();

        HotelClass hotel = new HotelClass(1, "Luxury 5-Star Seaside Resort", "Resort", "Grand Azure Hotel", "$250/night", "100 Ocean Blvd");
        hotel.addHotel();
        hotel.searchHotel();

        RoomsClass deluxeRoom = new RoomsClass(101, 1, "Suite-302", "Deluxe Ocean Suite", "King bed, balcony, sea view");
        deluxeRoom.addRooms();
        deluxeRoom.searchRooms();

        CustomerClass guest = new CustomerClass(701, "Alice Morgan", "alice@example.com", "+1-555-0199", "456 Elm St", "alicem", "secret123");
        guest.addCustomer();
        guest.executeInterface2Operation();

        BookingClass booking = new BookingClass(9001, "Online", "Weekend Suite Stay", "2 nights stay in Suite-302", LocalDate.now());
        booking.addBooking();
        booking.executeInterface3Operation();

        PaymentsClass payment = new PaymentsClass(8001, 701, "Credit Card Payment for Suite-302", "500.00", LocalDate.now());
        payment.addPayments();
        payment.executeInterface4Operation();

        System.out.println("EXPERIMENT 5: HOTEL RESERVATION SYSTEM completed successfully.");
    }
}
