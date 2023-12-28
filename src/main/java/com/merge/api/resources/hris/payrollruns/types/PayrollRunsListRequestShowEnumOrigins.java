package com.merge.api.resources.hris.payrollruns.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PayrollRunsListRequestShowEnumOrigins {
    RUN_STATE("run_state"),

    RUN_STATE_RUN_TYPE("run_state,run_type"),

    RUN_TYPE("run_type");

    private final String value;

    PayrollRunsListRequestShowEnumOrigins(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}