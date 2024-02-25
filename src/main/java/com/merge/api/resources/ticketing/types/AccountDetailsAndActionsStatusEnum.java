/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.ticketing.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountDetailsAndActionsStatusEnum {
    COMPLETE("COMPLETE"),

    INCOMPLETE("INCOMPLETE"),

    RELINK_NEEDED("RELINK_NEEDED");

    private final String value;

    AccountDetailsAndActionsStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
