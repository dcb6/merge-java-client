package com.merge.api.resources.ticketing.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SelectiveSyncConfigurationsUsageEnum {
    IN_NEXT_SYNC("IN_NEXT_SYNC"),

    IN_LAST_SYNC("IN_LAST_SYNC");

    private final String value;

    SelectiveSyncConfigurationsUsageEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}