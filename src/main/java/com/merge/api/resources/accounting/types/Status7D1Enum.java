package com.merge.api.resources.accounting.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Status7D1Enum {
    ACTIVE("ACTIVE"),

    ARCHIVED("ARCHIVED");

    private final String value;

    Status7D1Enum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}