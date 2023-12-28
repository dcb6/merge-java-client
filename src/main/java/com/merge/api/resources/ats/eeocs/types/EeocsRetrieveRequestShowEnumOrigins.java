package com.merge.api.resources.ats.eeocs.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EeocsRetrieveRequestShowEnumOrigins {
    DISABILITY_STATUS("disability_status"),

    DISABILITY_STATUS_GENDER("disability_status,gender"),

    DISABILITY_STATUS_GENDER_RACE("disability_status,gender,race"),

    DISABILITY_STATUS_GENDER_RACE_VETERAN_STATUS("disability_status,gender,race,veteran_status"),

    DISABILITY_STATUS_GENDER_VETERAN_STATUS("disability_status,gender,veteran_status"),

    DISABILITY_STATUS_RACE("disability_status,race"),

    DISABILITY_STATUS_RACE_VETERAN_STATUS("disability_status,race,veteran_status"),

    DISABILITY_STATUS_VETERAN_STATUS("disability_status,veteran_status"),

    GENDER("gender"),

    GENDER_RACE("gender,race"),

    GENDER_RACE_VETERAN_STATUS("gender,race,veteran_status"),

    GENDER_VETERAN_STATUS("gender,veteran_status"),

    RACE("race"),

    RACE_VETERAN_STATUS("race,veteran_status"),

    VETERAN_STATUS("veteran_status");

    private final String value;

    EeocsRetrieveRequestShowEnumOrigins(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}