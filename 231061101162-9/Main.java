import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   EXPERIMENT 9: RAILWAY TICKET RESERVATION       ");
        System.out.println("==================================================");

        TrainInfo train = new TrainInfo(
                12424, "Rajdhani Express", "New Delhi", "Mumbai Central",
                LocalTime.of(16, 30), LocalTime.of(8, 45), "Superfast Express",
                1380, "130 km/h", 2400.0, 720
        );
        train.addTrainInfo();

        PassengerInfo passenger = new PassengerInfo(
                101, "David Miller", 32, "Male", "42 Park Lane", 987654321, "david@example.com"
        );
        passenger.addPassenger();

        SeatAvialStatus seatStatus = new SeatAvialStatus(12424, LocalDate.now().plusDays(5), 45, "AC-2 Tier");
        seatStatus.Operation2();
        seatStatus.updateStatus();

        TicketReservation reservation = new TicketReservation(
                7701, 843920112, 101, 12424, "New Delhi", "Mumbai Central",
                "AC-2 Tier", 445566, "Passport", LocalDate.now().plusDays(5), 1, 2400.0
        );
        reservation.reserveTicket();

        System.out.println("Experiment 9 completed successfully.");
    }
}
