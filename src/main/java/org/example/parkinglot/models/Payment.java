package org.example.parkinglot.models;

import org.example.parkinglot.enums.PaymentMode;

public class Payment extends BaseModel {
    private PaymentMode mode;
    private Long amount;

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }


    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
