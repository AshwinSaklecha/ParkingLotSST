package org.example.parkinglot.models;

import org.example.parkinglot.enums.TicketStatus;
import org.springframework.expression.spel.ast.Operator;

import java.sql.Date;

public class Ticket extends BaseModel {
    private Vehicle vehicle;
    private Gate generatedAt;
    private Operator generatedBy;
    private Date entryTime;
    private TicketStatus status;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public Gate getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(Gate generatedAt) {
        this.generatedAt = generatedAt;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }
}
