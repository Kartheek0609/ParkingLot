package parkingLot.model;

import parkingLot.model.Enum.ParkingSpotStatus;
import parkingLot.model.Enum.VehicleType;

public class EvParkingSpot extends ParkingSpot{
    private String charge;

    public EvParkingSpot(int number, VehicleType vehicleType, Vehicle vehicle, ParkingSpotStatus parkingSpotStatus, String charge) {
        super(number, vehicleType, vehicle, parkingSpotStatus);
        this.charge = charge;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }
}
