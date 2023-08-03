package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EmployeesListRequestShowEnumOrigins {
    EMPLOYMENT_STATUS("employment_status"),

    EMPLOYMENT_STATUS_ETHNICITY("employment_status,ethnicity"),

    EMPLOYMENT_STATUS_ETHNICITY_GENDER("employment_status,ethnicity,gender"),

    EMPLOYMENT_STATUS_ETHNICITY_GENDER_MARITAL_STATUS("employment_status,ethnicity,gender,marital_status"),

    EMPLOYMENT_STATUS_ETHNICITY_MARITAL_STATUS("employment_status,ethnicity,marital_status"),

    EMPLOYMENT_STATUS_GENDER("employment_status,gender"),

    EMPLOYMENT_STATUS_GENDER_MARITAL_STATUS("employment_status,gender,marital_status"),

    EMPLOYMENT_STATUS_MARITAL_STATUS("employment_status,marital_status"),

    ETHNICITY("ethnicity"),

    ETHNICITY_GENDER("ethnicity,gender"),

    ETHNICITY_GENDER_MARITAL_STATUS("ethnicity,gender,marital_status"),

    ETHNICITY_MARITAL_STATUS("ethnicity,marital_status"),

    GENDER("gender"),

    GENDER_MARITAL_STATUS("gender,marital_status"),

    MARITAL_STATUS("marital_status");

    private final String value;

    EmployeesListRequestShowEnumOrigins(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
