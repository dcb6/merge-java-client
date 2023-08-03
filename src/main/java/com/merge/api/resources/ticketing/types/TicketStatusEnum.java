package com.merge.api.resources.ticketing.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TicketStatusEnum {
    OPEN("OPEN"),

    CLOSED("CLOSED"),

    IN_PROGRESS("IN_PROGRESS"),

    ON_HOLD("ON_HOLD");

    private final String value;

    TicketStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}