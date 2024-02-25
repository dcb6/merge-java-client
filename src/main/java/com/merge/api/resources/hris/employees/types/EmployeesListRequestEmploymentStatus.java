/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.hris.employees.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EmployeesListRequestEmploymentStatus {
    ACTIVE("ACTIVE"),

    INACTIVE("INACTIVE"),

    PENDING("PENDING");

    private final String value;

    EmployeesListRequestEmploymentStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
