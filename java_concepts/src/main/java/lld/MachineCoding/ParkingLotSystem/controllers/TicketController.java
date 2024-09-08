package lld.MachineCoding.ParkingLotSystem.controllers;

import lld.MachineCoding.ParkingLotSystem.dtos.IssueTicketRequestDTO;
import lld.MachineCoding.ParkingLotSystem.dtos.IssueTicketResponseDTO;
import lld.MachineCoding.ParkingLotSystem.enums.ResponseStatus;
import lld.MachineCoding.ParkingLotSystem.exceptions.GateNotFoundException;
import lld.MachineCoding.ParkingLotSystem.models.Ticket;
import lld.MachineCoding.ParkingLotSystem.services.TicketService;

public class TicketController {

    private TicketService ticketService; // tight coupling; there wont be a third party so we are okay with the tight
                                         // coupling here. Bascially its not a third party service

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService; // Dependenct Injection
    }

    // use dtos to expose or take in less information or minimal information needed
    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO ticketRequestDTO) {
        // business logic
        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();
        Ticket ticket = null;
        try {
            ticket = ticketService.issueTicket(ticketRequestDTO.getGateId(), ticketRequestDTO.getVechicleType(),
                    ticketRequestDTO.getVehicleNumber(), ticketRequestDTO.getOwnerName());

        } catch (GateNotFoundException e) {
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
            responseDTO.setFailureMessage("GateId not found"); // can be a custom message
            return responseDTO;
        } catch (Exception e) {
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
            responseDTO.setFailureMessage(e.getMessage()); // can be a custom message
            return responseDTO;
        }

        responseDTO.setTicket(ticket);
        responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        return null;
    }
}

// Client -> Controller -> Service -> Repository -> Uses models & intereact with
// db(mock in our case)