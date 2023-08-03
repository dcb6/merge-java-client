package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EmploymentStatusEnum {
    ACTIVE("ACTIVE"),

    PENDING("PENDING"),

    INACTIVE("INACTIVE");

    private final String value;

    EmploymentStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}