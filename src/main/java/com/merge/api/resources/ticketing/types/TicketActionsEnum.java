/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.ticketing.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TicketActionsEnum {
    VIEW("VIEW"),

    CREATE("CREATE"),

    EDIT("EDIT"),

    DELETE("DELETE"),

    CLOSE("CLOSE"),

    ASSIGN("ASSIGN");

    private final String value;

    TicketActionsEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
