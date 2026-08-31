import java.time.LocalTime;

public class TrainInfo {
    private Integer trainId;
    private String trainname;
    private String sourceStn;
    private String desstn;
    private LocalTime deptime;
    private LocalTime arrivaltime;
    private String trainType;
    private Integer distance;
    private String speed;
    private Double fare;
    private Integer noofseats;

    public TrainInfo() {
    }

    public TrainInfo(Integer trainId, String trainname, String sourceStn, String desstn, LocalTime deptime, LocalTime arrivaltime, String trainType, Integer distance, String speed, Double fare, Integer noofseats) {
        this.trainId = trainId;
        this.trainname = trainname;
        this.sourceStn = sourceStn;
        this.desstn = desstn;
        this.deptime = deptime;
        this.arrivaltime = arrivaltime;
        this.trainType = trainType;
        this.distance = distance;
        this.speed = speed;
        this.fare = fare;
        this.noofseats = noofseats;
    }

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public String getSourceStn() {
        return sourceStn;
    }

    public void setSourceStn(String sourceStn) {
        this.sourceStn = sourceStn;
    }

    public String getDesstn() {
        return desstn;
    }

    public void setDesstn(String desstn) {
        this.desstn = desstn;
    }

    public LocalTime getDeptime() {
        return deptime;
    }

    public void setDeptime(LocalTime deptime) {
        this.deptime = deptime;
    }

    public LocalTime getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(LocalTime arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public Integer getNoofseats() {
        return noofseats;
    }

    public void setNoofseats(Integer noofseats) {
        this.noofseats = noofseats;
    }

    public void addTrainInfo() {
        System.out.println("[TrainInfo] Added Train: " + trainname + " (#" + trainId + ") Route: " + sourceStn + " -> " + desstn);
    }

    public void updateTrainInfo() {
        System.out.println("[TrainInfo] Updated Train #" + trainId);
    }

    public void deleteTrainInfo() {
        System.out.println("[TrainInfo] Deleted Train #" + trainId);
    }
}
