/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.accounting.companyinfo.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CompanyInfoListRequestExpand {
    ADDRESSES("addresses"),

    ADDRESSES_PHONE_NUMBERS("addresses,phone_numbers"),

    PHONE_NUMBERS("phone_numbers");

    private final String value;

    CompanyInfoListRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
