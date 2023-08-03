package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TimeOffListRequestShowEnumOrigins {
    REQUEST_TYPE("request_type"),

    REQUEST_TYPE_STATUS("request_type,status"),

    REQUEST_TYPE_STATUS_UNITS("request_type,status,units"),

    REQUEST_TYPE_UNITS("request_type,units"),

    STATUS("status"),

    STATUS_UNITS("status,units"),

    UNITS("units");

    private final String value;

    TimeOffListRequestShowEnumOrigins(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
