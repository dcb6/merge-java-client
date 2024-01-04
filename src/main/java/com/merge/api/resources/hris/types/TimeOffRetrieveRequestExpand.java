package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TimeOffRetrieveRequestExpand {
    APPROVER("approver"),

    EMPLOYEE("employee"),

    EMPLOYEE_APPROVER("employee,approver");

    private final String value;

    TimeOffRetrieveRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
