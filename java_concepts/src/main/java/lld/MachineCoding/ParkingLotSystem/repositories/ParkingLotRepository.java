package lld.MachineCoding.ParkingLotSystem.repositories;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import lld.MachineCoding.ParkingLotSystem.models.Gate;
import lld.MachineCoding.ParkingLotSystem.models.ParkingLot;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLots = new TreeMap<>(); // automatically sort; we are mocking the db basically

    public ParkingLot getParkingLotByGateId(Long gateId) {
        for (ParkingLot parkingLot : parkingLots.values()) {
            List<Gate> gates = parkingLot.getGates();
            for (Gate gate : gates) {
                if (gate.getId() == gateId) {
                    return parkingLot;
                }
            }
        }
        return null;
    }
}
