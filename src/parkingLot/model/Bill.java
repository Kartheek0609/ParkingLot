package parkingLot.model;

import parkingLot.Service.Strategy.billCalculationStrategy.BillCalculationStrategy;
import parkingLot.model.Enum.BillStatus;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private LocalDateTime exitTime;
    private double amount;
    private Ticket ticket;
    private BillStatus status;
    private Gate exitGate;

    public Bill() {
    }

    public Bill(LocalDateTime exitTime, double amount, Ticket ticket, Gate exitGate) {
        this.exitTime = exitTime;
        this.amount = amount;
        this.ticket = ticket;
        this.exitGate = exitGate;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public BillStatus getStatus() {
        return status;
    }

    public void setStatus(BillStatus status) {
        this.status = status;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }


}
