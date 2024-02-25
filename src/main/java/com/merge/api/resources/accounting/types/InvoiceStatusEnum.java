/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.accounting.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum InvoiceStatusEnum {
    PAID("PAID"),

    DRAFT("DRAFT"),

    SUBMITTED("SUBMITTED"),

    PARTIALLY_PAID("PARTIALLY_PAID"),

    OPEN("OPEN"),

    VOID("VOID");

    private final String value;

    InvoiceStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
