package com.merge.api.resources.accounting.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RequestFormatEnum {
    JSON("JSON"),

    XML("XML"),

    MULTIPART("MULTIPART");

    private final String value;

    RequestFormatEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
