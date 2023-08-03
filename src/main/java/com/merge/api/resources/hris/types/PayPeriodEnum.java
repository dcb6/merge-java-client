package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PayPeriodEnum {
    HOUR("HOUR"),

    DAY("DAY"),

    WEEK("WEEK"),

    EVERY_TWO_WEEKS("EVERY_TWO_WEEKS"),

    SEMIMONTHLY("SEMIMONTHLY"),

    MONTH("MONTH"),

    QUARTER("QUARTER"),

    EVERY_SIX_MONTHS("EVERY_SIX_MONTHS"),

    YEAR("YEAR");

    private final String value;

    PayPeriodEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
