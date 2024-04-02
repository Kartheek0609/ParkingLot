package parkingLot.Service.Strategy.spotAllocationStrategy;

import parkingLot.exception.ParkingSpotNotFoundForVehicleException;
import parkingLot.model.Enum.ParkingSpotStatus;
import parkingLot.model.ParkingFloor;
import parkingLot.model.ParkingLot;
import parkingLot.model.ParkingSpot;
import parkingLot.model.Vehicle;

import java.util.List;

public class LinearSpotAllocationStrategy implements SpotAllocationStrategy {
    @Override
    public ParkingSpot getSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle) {
        List<ParkingFloor> parkingFloors = parkingLot.getParkingFloors();

        for(ParkingFloor parkingFloor : parkingFloors){
            for(ParkingSpot parkingSpot : parkingFloor.getParkingSpots()){
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY) &&
                        parkingSpot.getVehicleType().equals(vehicle.getVehicleType())
                ){

                    return parkingSpot;
                }
            }
        }
        throw new ParkingSpotNotFoundForVehicleException("Please go home, eat and sleep");
    }
}
