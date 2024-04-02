package parkingLot.repository;

import parkingLot.model.Gate;
import parkingLot.exception.GateNotFoundException;

import java.util.HashMap;

public class GateRepository {
    private HashMap<Integer, Gate> gateMap;

    public GateRepository() {
        this.gateMap= new HashMap<>();
    }
    public Gate get(int gateId){
        Gate gate= gateMap.get(gateId);
        if(gate==null){
            throw new GateNotFoundException("Gate not found for ID "+ gateId);
        }
        return gate;
    }
    public void put(Gate gate){
        gateMap.put(gate.getId(),gate);
        System.out.println("gate has been successfully added");
    }
}
