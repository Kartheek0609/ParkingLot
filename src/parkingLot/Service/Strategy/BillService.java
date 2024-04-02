package parkingLot.Service.Strategy;

import parkingLot.Service.Strategy.billCalculationStrategy.BillCalculationStrategy;
import parkingLot.Service.Strategy.billCalculationStrategy.BillCalculationStrategyFactory;
import parkingLot.model.Bill;

public class BillService {
    public Bill generateBill(int ticketId, int exitGateId){
        BillCalculationStrategy billCalculationStrategy= BillCalculationStrategyFactory.getBill();

        Bill bill= new Bill();

        return  bill;
    }
}
