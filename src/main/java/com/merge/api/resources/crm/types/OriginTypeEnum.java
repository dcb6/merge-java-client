package com.merge.api.resources.crm.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OriginTypeEnum {
    CUSTOM_OBJECT("CUSTOM_OBJECT"),

    COMMON_MODEL("COMMON_MODEL"),

    REMOTE_ONLY_MODEL("REMOTE_ONLY_MODEL");

    private final String value;

    OriginTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
