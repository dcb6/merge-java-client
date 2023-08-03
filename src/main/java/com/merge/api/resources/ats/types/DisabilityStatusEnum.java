package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DisabilityStatusEnum {
    YES_I_HAVE_A_DISABILITY_OR_PREVIOUSLY_HAD_A_DISABILITY("YES_I_HAVE_A_DISABILITY_OR_PREVIOUSLY_HAD_A_DISABILITY"),

    NO_I_DONT_HAVE_A_DISABILITY("NO_I_DONT_HAVE_A_DISABILITY"),

    I_DONT_WISH_TO_ANSWER("I_DONT_WISH_TO_ANSWER");

    private final String value;

    DisabilityStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
