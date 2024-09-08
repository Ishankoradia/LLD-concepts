package lld.MachineCoding.ParkingLotSystem.repositories;

import java.util.Map;
import java.util.TreeMap;

import lld.MachineCoding.ParkingLotSystem.models.Ticket;

public class TicketRepository {

    private Map<Long, Ticket> tickets = new TreeMap<>();
    private int previousId = 0;

    public Ticket saveTicket(Ticket ticket) {
        previousId += 1;
        ticket.setId((long) previousId);
        tickets.put((long) previousId, ticket);
        return ticket;
    }
}
