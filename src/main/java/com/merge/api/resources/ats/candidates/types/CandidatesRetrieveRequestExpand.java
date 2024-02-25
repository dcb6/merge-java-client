/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.ats.candidates.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CandidatesRetrieveRequestExpand {
    APPLICATIONS("applications"),

    APPLICATIONS_ATTACHMENTS("applications,attachments"),

    ATTACHMENTS("attachments");

    private final String value;

    CandidatesRetrieveRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
