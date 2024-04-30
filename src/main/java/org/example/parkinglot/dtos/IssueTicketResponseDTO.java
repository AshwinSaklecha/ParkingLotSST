package org.example.parkinglot.dtos;

import org.example.parkinglot.models.Ticket;
import org.springframework.web.bind.annotation.ResponseStatus;

public class IssueTicketResponseDTO {
    private Ticket ticket;
    private ResponseStatus status;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }
}
