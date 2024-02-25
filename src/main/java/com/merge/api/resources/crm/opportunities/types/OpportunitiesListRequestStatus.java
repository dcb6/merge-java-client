/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.crm.opportunities.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OpportunitiesListRequestStatus {
    LOST("LOST"),

    OPEN("OPEN"),

    WON("WON");

    private final String value;

    OpportunitiesListRequestStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
