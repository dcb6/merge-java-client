package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum GenderEnum {
    MALE("MALE"),

    FEMALE("FEMALE"),

    NON_BINARY("NON-BINARY"),

    OTHER("OTHER"),

    PREFER_NOT_TO_DISCLOSE("PREFER_NOT_TO_DISCLOSE");

    private final String value;

    GenderEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}