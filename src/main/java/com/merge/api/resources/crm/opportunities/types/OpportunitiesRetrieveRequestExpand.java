/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.crm.opportunities.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OpportunitiesRetrieveRequestExpand {
    ACCOUNT("account"),

    OWNER("owner"),

    OWNER_ACCOUNT("owner,account"),

    OWNER_STAGE("owner,stage"),

    OWNER_STAGE_ACCOUNT("owner,stage,account"),

    STAGE("stage"),

    STAGE_ACCOUNT("stage,account");

    private final String value;

    OpportunitiesRetrieveRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
