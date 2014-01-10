package projectDemo;

public class VehicleTripSummary {
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Integer getTrips() {
        return trips;
    }

    public void setTrips(Integer trips) {
        this.trips = trips;
    }

    public Integer getBinCleared() {
        return binCleared;
    }

    public void setBinCleared(Integer binCleared) {
        this.binCleared = binCleared;
    }

    public Double getCollectedWeight() {
        return collectedWeight;
    }

    public void setCollectedWeight(Double collectedWeight) {
        this.collectedWeight = collectedWeight;
    }

    public VehicleTripSummary(String vehicleType, String vehicleNumber, Integer trips, Integer binCleared, Double collectedWeight) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.trips = trips;
        this.binCleared = binCleared;
        this.collectedWeight = collectedWeight;
    }

    String vehicleType;
    String vehicleNumber;
    Integer trips;
    Integer binCleared;
    Double collectedWeight;
}
