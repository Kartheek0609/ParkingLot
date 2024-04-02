package parkingLot.Service.Strategy.billCalculationStrategy;

public class BillCalculationStrategyFactory {
    public static BillCalculationStrategy getBill(){
        return new SimpleBillCalculationStrategy();
    }
}
