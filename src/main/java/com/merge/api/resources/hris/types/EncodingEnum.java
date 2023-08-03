package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EncodingEnum {
    RAW("RAW"),

    BASE_64("BASE64"),

    GZIP_BASE_64("GZIP_BASE64");

    private final String value;

    EncodingEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}