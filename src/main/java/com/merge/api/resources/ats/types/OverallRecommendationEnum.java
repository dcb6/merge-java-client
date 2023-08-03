package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OverallRecommendationEnum {
    DEFINITELY_NO("DEFINITELY_NO"),

    NO("NO"),

    YES("YES"),

    STRONG_YES("STRONG_YES"),

    NO_DECISION("NO_DECISION");

    private final String value;

    OverallRecommendationEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
