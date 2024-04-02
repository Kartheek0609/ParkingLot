package parkingLot.model;

import parkingLot.model.Enum.PaymentMode;
import parkingLot.model.Enum.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseModel {
    private Double amount;
    private PaymentMode paymentMode;
    private Bill bill;
    private  String ticketReferenceNumber;
    private PaymentStatus paymentStatus;
    private LocalDateTime paymentTime;

    public Payment() {
    }

    public Payment(Double amount, PaymentMode paymentMode, Bill bill, String ticketReferenceNumber, PaymentStatus paymentStatus, LocalDateTime paymentTime) {
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.bill = bill;
        this.ticketReferenceNumber = ticketReferenceNumber;
        this.paymentStatus = paymentStatus;
        this.paymentTime = paymentTime;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getTicketReferenceNumber() {
        return ticketReferenceNumber;
    }

    public void setTicketReferenceNumber(String ticketReferenceNumber) {
        this.ticketReferenceNumber = ticketReferenceNumber;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }
}
