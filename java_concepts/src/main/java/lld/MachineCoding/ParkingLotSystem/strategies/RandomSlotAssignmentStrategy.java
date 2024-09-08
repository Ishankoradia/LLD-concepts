package lld.MachineCoding.ParkingLotSystem.strategies;

import lld.MachineCoding.ParkingLotSystem.enums.ParkingSlotStatus;
import lld.MachineCoding.ParkingLotSystem.enums.VehicleType;
import lld.MachineCoding.ParkingLotSystem.models.Gate;
import lld.MachineCoding.ParkingLotSystem.models.ParkingFloor;
import lld.MachineCoding.ParkingLotSystem.models.ParkingLot;
import lld.MachineCoding.ParkingLotSystem.models.ParkingSlot;
import lld.MachineCoding.ParkingLotSystem.repositories.ParkingLotRepository;

public class RandomSlotAssignmentStrategy implements SlotAssignStrategy {

    private ParkingLotRepository parkingLotRepository;

    public RandomSlotAssignmentStrategy(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    @Override
    public ParkingSlot getSlot(VehicleType vehicleType, Gate gate) {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotByGateId(gate.getId());

        for (ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
            for (ParkingSlot parkingSlot : parkingFloor.getParkingSlots()) {
                if (parkingSlot.getAllowedVehicleType().equals(vehicleType)
                        && parkingSlot.getParkingSlotStatus().equals(ParkingSlotStatus.UNOCCUPIED)) {
                    return parkingSlot;
                }
            }
        }
        return null;
    }
}
