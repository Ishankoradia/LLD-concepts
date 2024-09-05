package lld.MachineCoding.ParkingLotSystem.models;

import java.util.List;

import lld.MachineCoding.ParkingLotSystem.enums.ParkingSlotStatus;
import lld.MachineCoding.ParkingLotSystem.enums.VehicleType;

public class ParkingSlot extends BaseModel {
    private VehicleType allowedVehicleType;
    private ParkingSlotStatus parkingSlotStatus;
    private ParkingFloor floor;
    private String slotNo;

    public VehicleType getAllowedVehicleType() {
        return allowedVehicleType;
    }

    public void setAllowedVehicleType(VehicleType allowedVehicleType) {
        this.allowedVehicleType = allowedVehicleType;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public ParkingFloor getFloor() {
        return floor;
    }

    public void setFloor(ParkingFloor floor) {
        this.floor = floor;
    }

    public String getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(String slotNo) {
        this.slotNo = slotNo;
    }

}
