/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.ats.activities.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ActivitiesRetrieveRequestRemoteFields {
    ACTIVITY_TYPE("activity_type"),

    ACTIVITY_TYPE_VISIBILITY("activity_type,visibility"),

    VISIBILITY("visibility");

    private final String value;

    ActivitiesRetrieveRequestRemoteFields(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
