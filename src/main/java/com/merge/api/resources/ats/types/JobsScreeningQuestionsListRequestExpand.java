package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum JobsScreeningQuestionsListRequestExpand {
    JOB("job"),

    OPTIONS("options"),

    OPTIONS_JOB("options,job");

    private final String value;

    JobsScreeningQuestionsListRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
