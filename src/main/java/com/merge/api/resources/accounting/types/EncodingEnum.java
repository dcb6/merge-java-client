/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.accounting.types;

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
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
