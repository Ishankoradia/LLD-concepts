package lld.MachineCoding.ParkingLotSystem.models;

import java.util.List;

import lld.MachineCoding.ParkingLotSystem.enums.ParkingLotStatus;
import lld.MachineCoding.ParkingLotSystem.enums.SlotAssignStrategyType;
import lld.MachineCoding.ParkingLotSystem.enums.VehicleType;
import lld.MachineCoding.ParkingLotSystem.strategies.SlotAssignStrategy;

public class ParkingLot extends BaseModel {
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private List<VehicleType> supporVehicleTypes;
    private String address;
    private ParkingLotStatus parkingLotStatus;
    private SlotAssignStrategyType slotAssignStrategyType;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getSupporVehicleTypes() {
        return supporVehicleTypes;
    }

    public void setSupporVehicleTypes(List<VehicleType> supporVehicleTypes) {
        this.supporVehicleTypes = supporVehicleTypes;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public SlotAssignStrategyType getSlotAssignStrategyType() {
        return slotAssignStrategyType;
    }

    public void setSlotAssignStrategyType(SlotAssignStrategyType slotAssignStrategyType) {
        this.slotAssignStrategyType = slotAssignStrategyType;
    }

}
