import java.time.LocalDate;

public class TicketReservation {
    private Integer passId;
    private Integer trainId;
    private String sourceStn;
    private String destStn;
    private String travelClass;
    private Integer proofId;
    private String proofname;
    private LocalDate date;
    private Integer noofSeatreserved;
    private Double fare;
    private Integer PNR;
    private Integer reserveId;

    public TicketReservation() {
    }

    public TicketReservation(Integer reserveId, Integer PNR, Integer passId, Integer trainId, String sourceStn, String destStn, String travelClass, Integer proofId, String proofname, LocalDate date, Integer noofSeatreserved, Double fare) {
        this.reserveId = reserveId;
        this.PNR = PNR;
        this.passId = passId;
        this.trainId = trainId;
        this.sourceStn = sourceStn;
        this.destStn = destStn;
        this.travelClass = travelClass;
        this.proofId = proofId;
        this.proofname = proofname;
        this.date = date;
        this.noofSeatreserved = noofSeatreserved;
        this.fare = fare;
    }

    public Integer getPassId() {
        return passId;
    }

    public void setPassId(Integer passId) {
        this.passId = passId;
    }

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public String getSourceStn() {
        return sourceStn;
    }

    public void setSourceStn(String sourceStn) {
        this.sourceStn = sourceStn;
    }

    public String getDestStn() {
        return destStn;
    }

    public void setDestStn(String destStn) {
        this.destStn = destStn;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public Integer getProofId() {
        return proofId;
    }

    public void setProofId(Integer proofId) {
        this.proofId = proofId;
    }

    public String getProofname() {
        return proofname;
    }

    public void setProofname(String proofname) {
        this.proofname = proofname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getNoofSeatreserved() {
        return noofSeatreserved;
    }

    public void setNoofSeatreserved(Integer noofSeatreserved) {
        this.noofSeatreserved = noofSeatreserved;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public Integer getPNR() {
        return PNR;
    }

    public void setPNR(Integer PNR) {
        this.PNR = PNR;
    }

    public Integer getReserveId() {
        return reserveId;
    }

    public void setReserveId(Integer reserveId) {
        this.reserveId = reserveId;
    }

    public void reserveTicket() {
        System.out.println("==================================================");
        System.out.println("        TICKET CONFIRMED - PNR: " + PNR);
        System.out.println("==================================================");
        System.out.println("Reservation ID: " + reserveId + " | Passenger ID: " + passId);
        System.out.println("Train #" + trainId + " | Route: " + sourceStn + " -> " + destStn);
        System.out.println("Date: " + date + " | Class: " + travelClass + " | Seats: " + noofSeatreserved);
        System.out.println("Total Fare: $" + fare + " | ID Proof: " + proofname + " (" + proofId + ")");
        System.out.println("==================================================");
    }

    public void cancelTicket() {
        System.out.println("[TicketReservation] Cancelled Reservation #" + reserveId + " (PNR: " + PNR + "). Refund initiated: $" + (fare * 0.9));
    }
}
