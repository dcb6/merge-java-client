/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.hris.timeoff.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TimeOffListRequestStatus {
    APPROVED("APPROVED"),

    CANCELLED("CANCELLED"),

    DECLINED("DECLINED"),

    DELETED("DELETED"),

    REQUESTED("REQUESTED");

    private final String value;

    TimeOffListRequestStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
