package lld.MachineCoding.ParkingLotSystem.controllers;

import lld.MachineCoding.ParkingLotSystem.dtos.TicketRequestDTO;
import lld.MachineCoding.ParkingLotSystem.dtos.TicketResponseDTO;
import lld.MachineCoding.ParkingLotSystem.models.Ticket;

public class TicketController {

    // use dtos to expose or take in less information or minimal information needed
    public TicketResponseDTO issueTicket(TicketRequestDTO ticketRequestDTO) {
        // business logic
        TicketResponseDTO ticketResponseDTO = new TicketResponseDTO();
        ticketResponseDTO.setTicketNumber("123A");
        ticketResponseDTO.setGateNumber(1);
        ticketResponseDTO.setVehicleId("UP123");
        return ticketResponseDTO;
    }
}
