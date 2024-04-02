package parkingLot.repository;

import parkingLot.exception.ParkingSpotNotFoundException;
import parkingLot.model.ParkingSpot;

import java.util.HashMap;

public class ParkingSpotRepository {

    private HashMap<Integer, ParkingSpot> parkingSpotMap;

    public ParkingSpotRepository() {
        this.parkingSpotMap= new HashMap<>();
    }
    public ParkingSpot get(int ParkingSpotId){
        ParkingSpot parkingSpot= parkingSpotMap.get(ParkingSpotId);
        if(parkingSpot==null){
            throw new ParkingSpotNotFoundException("ParkingSpot not found for ID "+ ParkingSpotId);
        }
        return parkingSpot;
    }
    public  void put(ParkingSpot parkingSpot){
        parkingSpotMap.put(parkingSpot.getId(),parkingSpot);
        System.out.println("ParkingSpot has been successfully added");
    }
}
