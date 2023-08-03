package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PayrollRunsRetrieveRequestRemoteFields {
    RUN_STATE("run_state"),

    RUN_STATE_RUN_TYPE("run_state,run_type"),

    RUN_TYPE("run_type");

    private final String value;

    PayrollRunsRetrieveRequestRemoteFields(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
