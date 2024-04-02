package parkingLot.repository;

import parkingLot.exception.ParkingFloorNotFoundException;
import parkingLot.model.ParkingFloor;

import java.util.HashMap;

public class ParkingFloorRepository {
    private HashMap<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository() {
        this.parkingFloorMap= new HashMap<>();
    }
    public ParkingFloor get(int ParkingFloorId){
        ParkingFloor ParkingFloor= parkingFloorMap.get(ParkingFloorId);
        if(ParkingFloor==null){
            throw new ParkingFloorNotFoundException("ParkingFloor not found for ID "+ ParkingFloorId);
        }
        return ParkingFloor;
    }
    public void put(ParkingFloor ParkingFloor){
        parkingFloorMap.put(ParkingFloor.getId(),ParkingFloor);
        System.out.println("ParkingFloor has been successfully added");
    }
}
