package parkingLot.Service.Strategy.spotAllocationStrategy;

public class SpotAllocationStrategyFactory {
    public static SpotAllocationStrategy getSpotAllocationStrategy(){
        return new LinearSpotAllocationStrategy();
    }

}
