package lld.MachineCoding.ParkingLotSystem.strategies;

import lld.MachineCoding.ParkingLotSystem.enums.VehicleType;
import lld.MachineCoding.ParkingLotSystem.models.Gate;
import lld.MachineCoding.ParkingLotSystem.models.ParkingSlot;

public interface SlotAssignStrategy {

    ParkingSlot getSlot(VehicleType vehicleType, Gate gate);
}
