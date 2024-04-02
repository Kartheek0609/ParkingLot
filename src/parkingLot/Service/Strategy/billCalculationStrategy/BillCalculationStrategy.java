package parkingLot.Service.Strategy.billCalculationStrategy;

import parkingLot.model.Bill;
import parkingLot.model.Ticket;

public interface BillCalculationStrategy {
    Bill generateBill(Ticket ticket);
}
