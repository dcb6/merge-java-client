package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UrlTypeEnum {
    PERSONAL("PERSONAL"),

    COMPANY("COMPANY"),

    PORTFOLIO("PORTFOLIO"),

    BLOG("BLOG"),

    SOCIAL_MEDIA("SOCIAL_MEDIA"),

    OTHER("OTHER"),

    JOB_POSTING("JOB_POSTING");

    private final String value;

    UrlTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}