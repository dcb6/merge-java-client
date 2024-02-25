/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.hris.linkedaccounts.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LinkedAccountsListRequestCategory {
    ACCOUNTING("accounting"),

    ATS("ats"),

    CRM("crm"),

    FILESTORAGE("filestorage"),

    HRIS("hris"),

    MKTG("mktg"),

    TICKETING("ticketing");

    private final String value;

    LinkedAccountsListRequestCategory(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
