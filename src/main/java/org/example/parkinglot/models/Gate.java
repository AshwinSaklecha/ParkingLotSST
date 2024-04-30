package org.example.parkinglot.models;

import org.example.parkinglot.enums.GateStatus;
import org.example.parkinglot.enums.GateType;
import org.springframework.expression.spel.ast.Operator;

public class Gate extends BaseModel {
    private GateStatus status;
    private GateType type;
    private Operator operator;

    public GateStatus getStatus() {
        return status;
    }

    public void setStatus(GateStatus status) {
        this.status = status;
    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
