package parkingLot.Service.Strategy.spotAllocationStrategy;

import parkingLot.model.ParkingLot;
import parkingLot.model.ParkingSpot;
import parkingLot.model.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot getSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle);
}
