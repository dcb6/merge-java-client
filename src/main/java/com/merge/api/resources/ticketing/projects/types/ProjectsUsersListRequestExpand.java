/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.ticketing.projects.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ProjectsUsersListRequestExpand {
    ROLES("roles"),

    TEAMS("teams"),

    TEAMS_ROLES("teams,roles");

    private final String value;

    ProjectsUsersListRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
