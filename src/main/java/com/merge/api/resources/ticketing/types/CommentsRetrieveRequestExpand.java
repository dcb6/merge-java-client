package com.merge.api.resources.ticketing.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CommentsRetrieveRequestExpand {
    CONTACT("contact"),

    CONTACT_TICKET("contact,ticket"),

    TICKET("ticket"),

    USER("user"),

    USER_CONTACT("user,contact"),

    USER_CONTACT_TICKET("user,contact,ticket"),

    USER_TICKET("user,ticket");

    private final String value;

    CommentsRetrieveRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
