package org.example.parkinglot.models;

import org.example.parkinglot.enums.VehicleType;

public class Vehicle extends BaseModel {
    private VehicleType type;
    private String number;

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
