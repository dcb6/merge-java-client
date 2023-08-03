package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BankInfoListRequestOrderBy {
    REMOTE_CREATED_AT_DESCENDING("-remote_created_at"),

    REMOTE_CREATED_AT_ASCENDING("remote_created_at");

    private final String value;

    BankInfoListRequestOrderBy(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
