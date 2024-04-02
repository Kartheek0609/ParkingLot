package parkingLot.model;

import parkingLot.model.Enum.ParkingSpotStatus;
import parkingLot.model.Enum.VehicleType;

public class LuxuryParkingSpot extends ParkingSpot{
    private String gaurdName;
    public LuxuryParkingSpot(int number, VehicleType vehicleType, Vehicle vehicle, ParkingSpotStatus parkingSpotStatus, String gaurdName) {
        super(number, vehicleType, vehicle, parkingSpotStatus);
        this.gaurdName = gaurdName;
    }

    public String getGaurdName() {
        return gaurdName;
    }

    public void setGaurdName(String gaurdName) {
        this.gaurdName = gaurdName;
    }
}
