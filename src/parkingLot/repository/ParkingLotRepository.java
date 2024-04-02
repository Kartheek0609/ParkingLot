package parkingLot.repository;

import parkingLot.exception.ParkingLotNotFoundException;
import parkingLot.model.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepository {
    private HashMap<Integer, ParkingLot> parkingLotMap;
    private static int idCounter = 0;
    public ParkingLotRepository() {
        this.parkingLotMap= new HashMap<>();
    }
    public ParkingLot get(int parkingLotId){
        ParkingLot ParkingLot= parkingLotMap.get(parkingLotId);
        if(ParkingLot==null){
            throw new ParkingLotNotFoundException("ParkingLot not found for ID "+ parkingLotId);
        }
        return ParkingLot;
    }
    public void put(ParkingLot parkingLot){
        parkingLot.setId(++idCounter);
        parkingLotMap.put(parkingLot.getId(),parkingLot);
        System.out.println("ParkingLot has been successfully added");
    }
}
