package parkingLot.controller;

import parkingLot.Service.Strategy.TicketService;
import parkingLot.exception.InvalidRequestException;
import parkingLot.model.Ticket;
import parkingLot.model.Vehicle;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId){
        if(gateId <= 0 || parkingLotId <= 0){
            throw new InvalidRequestException("Please enter valid request");
        }
        return ticketService.generateTicket(vehicle, gateId, parkingLotId);
    }
}
