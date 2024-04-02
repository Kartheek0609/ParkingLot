package parkingLot.model;

import parkingLot.model.Enum.ParkingSpotStatus;
import parkingLot.model.Enum.VehicleType;

public class ParkingSpot extends BaseModel{
    private int number;
    private VehicleType vehicleType;
    private Vehicle vehicle;
    private ParkingSpotStatus parkingSpotStatus;

    public ParkingSpot() {
    }

    public ParkingSpot(int number, VehicleType vehicleType, Vehicle vehicle, ParkingSpotStatus parkingSpotStatus) {
        this.number = number;
        this.vehicleType = vehicleType;
        this.vehicle = vehicle;
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }
}
