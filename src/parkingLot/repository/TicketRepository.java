package parkingLot.repository;

import parkingLot.exception.TicketNotFoundException;
import parkingLot.model.Ticket;

import java.util.HashMap;

public class TicketRepository {
    private HashMap<Integer, Ticket> ticketMap;
    private static int idCounter = 0;

    public TicketRepository() {
        this.ticketMap= new HashMap<>();
    }
    public Ticket get(int ticketId){
        Ticket ticket= ticketMap.get(ticketId);
        if(ticket==null){
            throw new TicketNotFoundException("Ticket not found for ID "+ ticketId);
        }
        return ticket;
    }
    public Ticket put(Ticket ticket){
        ticket.setId(++idCounter);
        ticketMap.put(ticket.getId(),ticket);
        System.out.println("Ticket has been successfully added");
        return ticket;
    }
}
