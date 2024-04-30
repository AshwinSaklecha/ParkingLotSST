package org.example.parkinglot.models;

import org.example.parkinglot.enums.FloorStatus;

public class Floor extends BaseModel {
    private ParkingLot parkingLot;
    private Integer levelNumber;
    private FloorStatus status;

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Integer getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(Integer levelNumber) {
        this.levelNumber = levelNumber;
    }

    public FloorStatus getStatus() {
        return status;
    }

    public void setStatus(FloorStatus status) {
        this.status = status;
    }
}
