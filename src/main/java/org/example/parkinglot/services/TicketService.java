package org.example.parkinglot.services;


import org.example.parkinglot.enums.VehicleType;
import org.example.parkinglot.models.Gate;
import org.example.parkinglot.models.Ticket;
import org.example.parkinglot.repositories.GateRepository;

import java.sql.Date;
import java.util.Optional;

public class TicketService {
    private final GateRepository gateRepository;

    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber, VehicleType vehicleType, String ownerName) {
        Ticket ticket = new Ticket();

        Optional<Gate> optionalGate = gateRepository.findById(gateId);


        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());

        return ticket;
    }
}
