package lld.MachineCoding.ParkingLotSystem.dtos;

import lld.MachineCoding.ParkingLotSystem.enums.VehicleType;
import lld.MachineCoding.ParkingLotSystem.models.Gate;
import lld.MachineCoding.ParkingLotSystem.models.ParkingSlot;
import lld.MachineCoding.ParkingLotSystem.models.Vehicle;

public class IssueTicketRequestDTO {
    private Long gateId;
    private VehicleType vechicleType;
    private String vehicleNumber;
    private String ownerName;

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public VehicleType getVechicleType() {
        return vechicleType;
    }

    public void setVechicleType(VehicleType vechicleType) {
        this.vechicleType = vechicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

}
