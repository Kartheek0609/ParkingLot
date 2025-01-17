package parkingLot.model;

import parkingLot.model.Enum.GateStatus;
import parkingLot.model.Enum.GateType;

public class Gate extends  BaseModel {
    private int gateNumber;
    private GateType gateType;

    private GateStatus gateStatus;
    private String operatorName;

    public Gate() {
    }

    public Gate(GateType gateType, int gateNumber, GateStatus gateStatus, String operatorName) {
        this.gateType = gateType;
        this.gateNumber = gateNumber;
        this.gateStatus = gateStatus;
        this.operatorName = operatorName;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
