package parkingLot.controller;

import parkingLot.Service.Strategy.InitialisationService;
import parkingLot.model.ParkingLot;

public class InitController {
    private InitialisationService initialisationService;

    public InitController(InitialisationService initialisationService) {
        this.initialisationService = initialisationService;
    }

    public ParkingLot init(){
        return initialisationService.init();
    }
}
