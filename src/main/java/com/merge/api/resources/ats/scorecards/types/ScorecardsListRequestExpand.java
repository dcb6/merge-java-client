package com.merge.api.resources.ats.scorecards.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ScorecardsListRequestExpand {
    APPLICATION("application"),

    APPLICATION_INTERVIEW("application,interview"),

    APPLICATION_INTERVIEW_INTERVIEWER("application,interview,interviewer"),

    APPLICATION_INTERVIEWER("application,interviewer"),

    INTERVIEW("interview"),

    INTERVIEW_INTERVIEWER("interview,interviewer"),

    INTERVIEWER("interviewer");

    private final String value;

    ScorecardsListRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}