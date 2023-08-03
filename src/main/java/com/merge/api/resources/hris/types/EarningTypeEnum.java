package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EarningTypeEnum {
    SALARY("SALARY"),

    REIMBURSEMENT("REIMBURSEMENT"),

    OVERTIME("OVERTIME"),

    BONUS("BONUS");

    private final String value;

    EarningTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}