package lld.MachineCoding.ParkingLotSystem;

import lld.MachineCoding.ParkingLotSystem.controllers.TicketController;
import lld.MachineCoding.ParkingLotSystem.dtos.IssueTicketRequestDTO;
import lld.MachineCoding.ParkingLotSystem.repositories.GateRepository;
import lld.MachineCoding.ParkingLotSystem.repositories.ParkingLotRepository;
import lld.MachineCoding.ParkingLotSystem.repositories.TicketRepository;
import lld.MachineCoding.ParkingLotSystem.repositories.VehicleRepository;
import lld.MachineCoding.ParkingLotSystem.services.TicketService;

public class Client {
    public static void main(String[] args) {
        // TicketController -> Service -> Repos
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingLotRepository,
                ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

    }
}
