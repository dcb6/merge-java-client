package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PayFrequencyEnum {
    WEEKLY("WEEKLY"),

    BIWEEKLY("BIWEEKLY"),

    MONTHLY("MONTHLY"),

    QUARTERLY("QUARTERLY"),

    SEMIANNUALLY("SEMIANNUALLY"),

    ANNUALLY("ANNUALLY"),

    THIRTEEN_MONTHLY("THIRTEEN-MONTHLY"),

    PRO_RATA("PRO_RATA"),

    SEMIMONTHLY("SEMIMONTHLY");

    private final String value;

    PayFrequencyEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
