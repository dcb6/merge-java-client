/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.crm.leads.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LeadsRetrieveRequestExpand {
    CONVERTED_ACCOUNT("converted_account"),

    CONVERTED_CONTACT("converted_contact"),

    CONVERTED_CONTACT_CONVERTED_ACCOUNT("converted_contact,converted_account"),

    OWNER("owner"),

    OWNER_CONVERTED_ACCOUNT("owner,converted_account"),

    OWNER_CONVERTED_CONTACT("owner,converted_contact"),

    OWNER_CONVERTED_CONTACT_CONVERTED_ACCOUNT("owner,converted_contact,converted_account");

    private final String value;

    LeadsRetrieveRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
