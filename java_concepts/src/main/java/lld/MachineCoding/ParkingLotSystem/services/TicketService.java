package lld.MachineCoding.ParkingLotSystem.services;

import java.util.Date;
import java.util.Optional;

import lld.MachineCoding.ParkingLotSystem.enums.ParkingSlotStatus;
import lld.MachineCoding.ParkingLotSystem.enums.SlotAssignStrategyType;
import lld.MachineCoding.ParkingLotSystem.enums.VehicleType;
import lld.MachineCoding.ParkingLotSystem.exceptions.GateNotFoundException;
import lld.MachineCoding.ParkingLotSystem.models.Gate;
import lld.MachineCoding.ParkingLotSystem.models.ParkingSlot;
import lld.MachineCoding.ParkingLotSystem.models.Ticket;
import lld.MachineCoding.ParkingLotSystem.models.Vehicle;
import lld.MachineCoding.ParkingLotSystem.repositories.GateRepository;
import lld.MachineCoding.ParkingLotSystem.repositories.ParkingLotRepository;
import lld.MachineCoding.ParkingLotSystem.repositories.TicketRepository;
import lld.MachineCoding.ParkingLotSystem.repositories.VehicleRepository;
import lld.MachineCoding.ParkingLotSystem.strategies.SlotAssignmentStrategyFactory;
import lld.Oops.InheritanceAndPolymorphism.P;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository,
            ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(Long gateId, VehicleType vehicleType, String vehicleNumber, String ownerName)
            throws GateNotFoundException {
        // 1. Create the ticket object
        // 2. Assign the slot to the vehicle(if any)
        // 3. Return the ticket

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        // accept the gate id and get details of the gate
        Optional<Gate> gateOptional = gateRepository.getGateById(gateId);
        // gate.getGateNumber() ; can get a null pointer exception
        // old way to avoid NPE
        // if (gate != null) {
        // ticket.setGateGeneratedAt(gate);
        // ticket.setGeneratedBy(gate.getOperator());
        // }

        // New way is OPTIONALS to avoid NPE
        if (!gateOptional.isPresent()) {
            throw new GateNotFoundException();
        }
        Gate gate = gateOptional.get();
        ticket.setGateGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());

        Vehicle savedVehicle = null;
        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleByNumber(vehicleNumber);
        if (!vehicleOptional.isPresent()) {
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setNumber(vehicleNumber);
            vehicle.setOwnerName(ownerName);
            savedVehicle = vehicleRepository.insertVehicle(vehicle);
        } else {
            savedVehicle = vehicleOptional.get();
        }
        ticket.setVehicle(savedVehicle);

        // Find and assign the time slot
        SlotAssignStrategyType slotAssignStrategyType = parkingLotRepository.getParkingLotByGateId(gate.getId())
                .getSlotAssignStrategyType();
        ParkingSlot parkingSlot = SlotAssignmentStrategyFactory
                .getSlotAssignStrategyByType(slotAssignStrategyType, parkingLotRepository)
                .getSlot(vehicleType, gate);
        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.OCCUPIED);
        ticket.setSlot(parkingSlot);

        // Persist the ticket in DB
        Ticket savedTicket = ticketRepository.saveTicket(ticket);
        savedTicket.setTicketNo("TICKET + " + savedTicket.getId());

        return savedTicket;
    }
}
