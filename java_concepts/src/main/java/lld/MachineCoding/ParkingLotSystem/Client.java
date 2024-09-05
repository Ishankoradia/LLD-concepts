package lld.MachineCoding.ParkingLotSystem;

import lld.MachineCoding.ParkingLotSystem.controllers.TicketController;
import lld.MachineCoding.ParkingLotSystem.dtos.TicketRequestDTO;

public class Client {
    public static void main(String[] args) {
        TicketController ticketController = new TicketController();
        ticketController.issueTicket(new TicketRequestDTO());
    }
}
