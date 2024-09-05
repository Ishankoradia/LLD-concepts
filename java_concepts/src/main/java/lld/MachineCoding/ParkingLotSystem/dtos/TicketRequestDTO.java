package lld.MachineCoding.ParkingLotSystem.dtos;

import lld.MachineCoding.ParkingLotSystem.models.Gate;
import lld.MachineCoding.ParkingLotSystem.models.ParkingSlot;
import lld.MachineCoding.ParkingLotSystem.models.Vehicle;

public class TicketRequestDTO {
    private Gate gate;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
