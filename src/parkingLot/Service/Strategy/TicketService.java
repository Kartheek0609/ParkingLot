package parkingLot.Service.Strategy;

import parkingLot.Service.Strategy.spotAllocationStrategy.SpotAllocationStrategy;
import parkingLot.Service.Strategy.spotAllocationStrategy.SpotAllocationStrategyFactory;
import parkingLot.model.Enum.ParkingSpotStatus;
import parkingLot.model.ParkingLot;
import parkingLot.model.ParkingSpot;
import parkingLot.model.Ticket;
import parkingLot.model.Vehicle;
import parkingLot.repository.GateRepository;
import parkingLot.repository.ParkingLotRepository;
import parkingLot.repository.ParkingSpotRepository;
import parkingLot.repository.TicketRepository;

import java.time.LocalDateTime;

public class TicketService {
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private GateRepository gateRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, GateRepository gateRepository, ParkingSpotRepository parkingSpotRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.gateRepository = gateRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }
    public Ticket generateTicket(Vehicle vehicle,int gateId,int parkingLotId){
        SpotAllocationStrategy strategy = SpotAllocationStrategyFactory.getSpotAllocationStrategy();
        ParkingLot parkingLot =parkingLotRepository.get(parkingLotId);

        ParkingSpot allocatedSpot = strategy.getSpotForVehicle(parkingLot,vehicle);
        allocatedSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        allocatedSpot.setVehicle(vehicle);
        parkingSpotRepository.put(allocatedSpot);

        Ticket ticket = new Ticket();
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(allocatedSpot);
        ticket.setEntryGate(gateRepository.get(gateId));
        return ticketRepository.put(ticket);
    }
}
