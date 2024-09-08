package lld.MachineCoding.ParkingLotSystem.repositories;

import java.util.Optional;

import lld.MachineCoding.ParkingLotSystem.models.Vehicle;

public class VehicleRepository { // CRUD behaviours for Vehicle
    // Vehicle
    // 1. It is a new Vehicle -> store and return
    // 2. If it exists -> simply get and return

    public Optional<Vehicle> findVehicleByNumber(String vehicleNumber) {
        return Optional.empty();
    }

    public Vehicle insertVehicle(Vehicle vehicle) {
        return null;
    }
}
