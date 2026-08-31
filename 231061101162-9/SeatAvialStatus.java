import java.time.LocalDate;

public class SeatAvialStatus {
    private Integer trainId;
    private LocalDate journeyDate;
    private Integer availSeat;
    private String travelClass;

    public SeatAvialStatus() {
    }

    public SeatAvialStatus(Integer trainId, LocalDate journeyDate, Integer availSeat, String travelClass) {
        this.trainId = trainId;
        this.journeyDate = journeyDate;
        this.availSeat = availSeat;
        this.travelClass = travelClass;
    }

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public LocalDate getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(LocalDate journeyDate) {
        this.journeyDate = journeyDate;
    }

    public Integer getAvailSeat() {
        return availSeat;
    }

    public void setAvailSeat(Integer availSeat) {
        this.availSeat = availSeat;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public void updateStatus() {
        System.out.println("[SeatAvialStatus] Train #" + trainId + " on " + journeyDate + " [" + travelClass + "] Available Seats: " + availSeat);
    }

    public void Operation2() {
        System.out.println("[SeatAvialStatus] Querying real-time quota availability...");
    }
}
