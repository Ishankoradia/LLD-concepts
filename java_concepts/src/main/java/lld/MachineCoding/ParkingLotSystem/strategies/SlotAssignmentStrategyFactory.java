package lld.MachineCoding.ParkingLotSystem.strategies;

import lld.MachineCoding.ParkingLotSystem.enums.SlotAssignStrategyType;
import lld.MachineCoding.ParkingLotSystem.repositories.ParkingLotRepository;

public class SlotAssignmentStrategyFactory {
    public static SlotAssignStrategy getSlotAssignStrategyByType(SlotAssignStrategyType type,
            ParkingLotRepository parkingLotRepository) {
        if (type.equals(SlotAssignStrategyType.RANDOM)) {
            return new RandomSlotAssignmentStrategy(parkingLotRepository);
        }

        return null;
    }
}
