package lld.MachineCoding.ParkingLotSystem.models;

import java.util.List;

import lld.MachineCoding.ParkingLotSystem.enums.ParkingFloorStatus;

public class ParkingFloor extends BaseModel {
    private List<ParkingSlot> parkingSlots;
    private String floorNumber;
    private ParkingFloorStatus floorStatus;

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public ParkingFloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(ParkingFloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }

}
