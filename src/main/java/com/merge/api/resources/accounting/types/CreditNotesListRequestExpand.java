package com.merge.api.resources.accounting.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CreditNotesListRequestExpand {
    ACCOUNTING_PERIOD("accounting_period"),

    COMPANY("company"),

    COMPANY_ACCOUNTING_PERIOD("company,accounting_period"),

    CONTACT("contact"),

    CONTACT_ACCOUNTING_PERIOD("contact,accounting_period"),

    CONTACT_COMPANY("contact,company"),

    CONTACT_COMPANY_ACCOUNTING_PERIOD("contact,company,accounting_period"),

    LINE_ITEMS("line_items"),

    LINE_ITEMS_ACCOUNTING_PERIOD("line_items,accounting_period"),

    LINE_ITEMS_COMPANY("line_items,company"),

    LINE_ITEMS_COMPANY_ACCOUNTING_PERIOD("line_items,company,accounting_period"),

    LINE_ITEMS_CONTACT("line_items,contact"),

    LINE_ITEMS_CONTACT_ACCOUNTING_PERIOD("line_items,contact,accounting_period"),

    LINE_ITEMS_CONTACT_COMPANY("line_items,contact,company"),

    LINE_ITEMS_CONTACT_COMPANY_ACCOUNTING_PERIOD("line_items,contact,company,accounting_period"),

    LINE_ITEMS_TRACKING_CATEGORIES("line_items,tracking_categories"),

    LINE_ITEMS_TRACKING_CATEGORIES_ACCOUNTING_PERIOD("line_items,tracking_categories,accounting_period"),

    LINE_ITEMS_TRACKING_CATEGORIES_COMPANY("line_items,tracking_categories,company"),

    LINE_ITEMS_TRACKING_CATEGORIES_COMPANY_ACCOUNTING_PERIOD(
            "line_items,tracking_categories,company,accounting_period"),

    LINE_ITEMS_TRACKING_CATEGORIES_CONTACT("line_items,tracking_categories,contact"),

    LINE_ITEMS_TRACKING_CATEGORIES_CONTACT_ACCOUNTING_PERIOD(
            "line_items,tracking_categories,contact,accounting_period"),

    LINE_ITEMS_TRACKING_CATEGORIES_CONTACT_COMPANY("line_items,tracking_categories,contact,company"),

    LINE_ITEMS_TRACKING_CATEGORIES_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "line_items,tracking_categories,contact,company,accounting_period"),

    PAYMENTS("payments"),

    PAYMENTS_ACCOUNTING_PERIOD("payments,accounting_period"),

    PAYMENTS_COMPANY("payments,company"),

    PAYMENTS_COMPANY_ACCOUNTING_PERIOD("payments,company,accounting_period"),

    PAYMENTS_CONTACT("payments,contact"),

    PAYMENTS_CONTACT_ACCOUNTING_PERIOD("payments,contact,accounting_period"),

    PAYMENTS_CONTACT_COMPANY("payments,contact,company"),

    PAYMENTS_CONTACT_COMPANY_ACCOUNTING_PERIOD("payments,contact,company,accounting_period"),

    PAYMENTS_LINE_ITEMS("payments,line_items"),

    PAYMENTS_LINE_ITEMS_ACCOUNTING_PERIOD("payments,line_items,accounting_period"),

    PAYMENTS_LINE_ITEMS_COMPANY("payments,line_items,company"),

    PAYMENTS_LINE_ITEMS_COMPANY_ACCOUNTING_PERIOD("payments,line_items,company,accounting_period"),

    PAYMENTS_LINE_ITEMS_CONTACT("payments,line_items,contact"),

    PAYMENTS_LINE_ITEMS_CONTACT_ACCOUNTING_PERIOD("payments,line_items,contact,accounting_period"),

    PAYMENTS_LINE_ITEMS_CONTACT_COMPANY("payments,line_items,contact,company"),

    PAYMENTS_LINE_ITEMS_CONTACT_COMPANY_ACCOUNTING_PERIOD("payments,line_items,contact,company,accounting_period"),

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES("payments,line_items,tracking_categories"),

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_ACCOUNTING_PERIOD(
            "payments,line_items,tracking_categories,accounting_period"),

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_COMPANY("payments,line_items,tracking_categories,company"),

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_COMPANY_ACCOUNTING_PERIOD(
            "payments,line_items,tracking_categories,company,accounting_period"),

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_CONTACT("payments,line_items,tracking_categories,contact"),

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_CONTACT_ACCOUNTING_PERIOD(
            "payments,line_items,tracking_categories,contact,accounting_period"),

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_CONTACT_COMPANY("payments,line_items,tracking_categories,contact,company"),

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "payments,line_items,tracking_categories,contact,company,accounting_period"),

    PAYMENTS_TRACKING_CATEGORIES("payments,tracking_categories"),

    PAYMENTS_TRACKING_CATEGORIES_ACCOUNTING_PERIOD("payments,tracking_categories,accounting_period"),

    PAYMENTS_TRACKING_CATEGORIES_COMPANY("payments,tracking_categories,company"),

    PAYMENTS_TRACKING_CATEGORIES_COMPANY_ACCOUNTING_PERIOD("payments,tracking_categories,company,accounting_period"),

    PAYMENTS_TRACKING_CATEGORIES_CONTACT("payments,tracking_categories,contact"),

    PAYMENTS_TRACKING_CATEGORIES_CONTACT_ACCOUNTING_PERIOD("payments,tracking_categories,contact,accounting_period"),

    PAYMENTS_TRACKING_CATEGORIES_CONTACT_COMPANY("payments,tracking_categories,contact,company"),

    PAYMENTS_TRACKING_CATEGORIES_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "payments,tracking_categories,contact,company,accounting_period"),

    TRACKING_CATEGORIES("tracking_categories"),

    TRACKING_CATEGORIES_ACCOUNTING_PERIOD("tracking_categories,accounting_period"),

    TRACKING_CATEGORIES_COMPANY("tracking_categories,company"),

    TRACKING_CATEGORIES_COMPANY_ACCOUNTING_PERIOD("tracking_categories,company,accounting_period"),

    TRACKING_CATEGORIES_CONTACT("tracking_categories,contact"),

    TRACKING_CATEGORIES_CONTACT_ACCOUNTING_PERIOD("tracking_categories,contact,accounting_period"),

    TRACKING_CATEGORIES_CONTACT_COMPANY("tracking_categories,contact,company"),

    TRACKING_CATEGORIES_CONTACT_COMPANY_ACCOUNTING_PERIOD("tracking_categories,contact,company,accounting_period");

    private final String value;

    CreditNotesListRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
