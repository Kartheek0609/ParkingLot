package parkingLot.model;

import parkingLot.model.Enum.VehicleType;

public class Vehicle {
    private int id;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String color;

    public Vehicle() {
    }

    public Vehicle(int id, String vehicleNumber, VehicleType vehicleType, String color) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
