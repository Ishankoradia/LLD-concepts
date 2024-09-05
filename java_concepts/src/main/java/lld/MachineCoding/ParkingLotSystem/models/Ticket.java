package lld.MachineCoding.ParkingLotSystem.models;

import java.util.Date;

public class Ticket extends BaseModel {
    private String ticketNo;
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSlot slot;
    private Gate gateGeneratedAt;
    private Operator generatedBy;

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getSlot() {
        return slot;
    }

    public void setSlot(ParkingSlot slot) {
        this.slot = slot;
    }

    public Gate getGateGeneratedAt() {
        return gateGeneratedAt;
    }

    public void setGateGeneratedAt(Gate gateGeneratedAt) {
        this.gateGeneratedAt = gateGeneratedAt;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

}
