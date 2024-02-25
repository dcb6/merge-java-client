/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.accounting.purchaseorders.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PurchaseOrdersRetrieveRequestExpand {
    ACCOUNTING_PERIOD("accounting_period"),

    COMPANY("company"),

    COMPANY_ACCOUNTING_PERIOD("company,accounting_period"),

    DELIVERY_ADDRESS("delivery_address"),

    DELIVERY_ADDRESS_ACCOUNTING_PERIOD("delivery_address,accounting_period"),

    DELIVERY_ADDRESS_COMPANY("delivery_address,company"),

    DELIVERY_ADDRESS_COMPANY_ACCOUNTING_PERIOD("delivery_address,company,accounting_period"),

    DELIVERY_ADDRESS_VENDOR("delivery_address,vendor"),

    DELIVERY_ADDRESS_VENDOR_ACCOUNTING_PERIOD("delivery_address,vendor,accounting_period"),

    DELIVERY_ADDRESS_VENDOR_COMPANY("delivery_address,vendor,company"),

    DELIVERY_ADDRESS_VENDOR_COMPANY_ACCOUNTING_PERIOD("delivery_address,vendor,company,accounting_period"),

    LINE_ITEMS("line_items"),

    LINE_ITEMS_ACCOUNTING_PERIOD("line_items,accounting_period"),

    LINE_ITEMS_COMPANY("line_items,company"),

    LINE_ITEMS_COMPANY_ACCOUNTING_PERIOD("line_items,company,accounting_period"),

    LINE_ITEMS_DELIVERY_ADDRESS("line_items,delivery_address"),

    LINE_ITEMS_DELIVERY_ADDRESS_ACCOUNTING_PERIOD("line_items,delivery_address,accounting_period"),

    LINE_ITEMS_DELIVERY_ADDRESS_COMPANY("line_items,delivery_address,company"),

    LINE_ITEMS_DELIVERY_ADDRESS_COMPANY_ACCOUNTING_PERIOD("line_items,delivery_address,company,accounting_period"),

    LINE_ITEMS_DELIVERY_ADDRESS_VENDOR("line_items,delivery_address,vendor"),

    LINE_ITEMS_DELIVERY_ADDRESS_VENDOR_ACCOUNTING_PERIOD("line_items,delivery_address,vendor,accounting_period"),

    LINE_ITEMS_DELIVERY_ADDRESS_VENDOR_COMPANY("line_items,delivery_address,vendor,company"),

    LINE_ITEMS_DELIVERY_ADDRESS_VENDOR_COMPANY_ACCOUNTING_PERIOD(
            "line_items,delivery_address,vendor,company,accounting_period"),

    LINE_ITEMS_TRACKING_CATEGORIES("line_items,tracking_categories"),

    LINE_ITEMS_TRACKING_CATEGORIES_ACCOUNTING_PERIOD("line_items,tracking_categories,accounting_period"),

    LINE_ITEMS_TRACKING_CATEGORIES_COMPANY("line_items,tracking_categories,company"),

    LINE_ITEMS_TRACKING_CATEGORIES_COMPANY_ACCOUNTING_PERIOD(
            "line_items,tracking_categories,company,accounting_period"),

    LINE_ITEMS_TRACKING_CATEGORIES_DELIVERY_ADDRESS("line_items,tracking_categories,delivery_address"),

    LINE_ITEMS_TRACKING_CATEGORIES_DELIVERY_ADDRESS_ACCOUNTING_PERIOD(
            "line_items,tracking_categories,delivery_address,accounting_period"),

    LINE_ITEMS_TRACKING_CATEGORIES_DELIVERY_ADDRESS_COMPANY("line_items,tracking_categories,delivery_address,company"),

    LINE_ITEMS_TRACKING_CATEGORIES_DELIVERY_ADDRESS_COMPANY_ACCOUNTING_PERIOD(
            "line_items,tracking_categories,delivery_address,company,accounting_period"),

    LINE_ITEMS_TRACKING_CATEGORIES_DELIVERY_ADDRESS_VENDOR("line_items,tracking_categories,delivery_address,vendor"),

    LINE_ITEMS_TRACKING_CATEGORIES_DELIVERY_ADDRESS_VENDOR_ACCOUNTING_PERIOD(
            "line_items,tracking_categories,delivery_address,vendor,accounting_period"),

    LINE_ITEMS_TRACKING_CATEGORIES_DELIVERY_ADDRESS_VENDOR_COMPANY(
            "line_items,tracking_categories,delivery_address,vendor,company"),

    LINE_ITEMS_TRACKING_CATEGORIES_DELIVERY_ADDRESS_VENDOR_COMPANY_ACCOUNTING_PERIOD(
            "line_items,tracking_categories,delivery_address,vendor,company,accounting_period"),

    LINE_ITEMS_TRACKING_CATEGORIES_VENDOR("line_items,tracking_categories,vendor"),

    LINE_ITEMS_TRACKING_CATEGORIES_VENDOR_ACCOUNTING_PERIOD("line_items,tracking_categories,vendor,accounting_period"),

    LINE_ITEMS_TRACKING_CATEGORIES_VENDOR_COMPANY("line_items,tracking_categories,vendor,company"),

    LINE_ITEMS_TRACKING_CATEGORIES_VENDOR_COMPANY_ACCOUNTING_PERIOD(
            "line_items,tracking_categories,vendor,company,accounting_period"),

    LINE_ITEMS_VENDOR("line_items,vendor"),

    LINE_ITEMS_VENDOR_ACCOUNTING_PERIOD("line_items,vendor,accounting_period"),

    LINE_ITEMS_VENDOR_COMPANY("line_items,vendor,company"),

    LINE_ITEMS_VENDOR_COMPANY_ACCOUNTING_PERIOD("line_items,vendor,company,accounting_period"),

    TRACKING_CATEGORIES("tracking_categories"),

    TRACKING_CATEGORIES_ACCOUNTING_PERIOD("tracking_categories,accounting_period"),

    TRACKING_CATEGORIES_COMPANY("tracking_categories,company"),

    TRACKING_CATEGORIES_COMPANY_ACCOUNTING_PERIOD("tracking_categories,company,accounting_period"),

    TRACKING_CATEGORIES_DELIVERY_ADDRESS("tracking_categories,delivery_address"),

    TRACKING_CATEGORIES_DELIVERY_ADDRESS_ACCOUNTING_PERIOD("tracking_categories,delivery_address,accounting_period"),

    TRACKING_CATEGORIES_DELIVERY_ADDRESS_COMPANY("tracking_categories,delivery_address,company"),

    TRACKING_CATEGORIES_DELIVERY_ADDRESS_COMPANY_ACCOUNTING_PERIOD(
            "tracking_categories,delivery_address,company,accounting_period"),

    TRACKING_CATEGORIES_DELIVERY_ADDRESS_VENDOR("tracking_categories,delivery_address,vendor"),

    TRACKING_CATEGORIES_DELIVERY_ADDRESS_VENDOR_ACCOUNTING_PERIOD(
            "tracking_categories,delivery_address,vendor,accounting_period"),

    TRACKING_CATEGORIES_DELIVERY_ADDRESS_VENDOR_COMPANY("tracking_categories,delivery_address,vendor,company"),

    TRACKING_CATEGORIES_DELIVERY_ADDRESS_VENDOR_COMPANY_ACCOUNTING_PERIOD(
            "tracking_categories,delivery_address,vendor,company,accounting_period"),

    TRACKING_CATEGORIES_VENDOR("tracking_categories,vendor"),

    TRACKING_CATEGORIES_VENDOR_ACCOUNTING_PERIOD("tracking_categories,vendor,accounting_period"),

    TRACKING_CATEGORIES_VENDOR_COMPANY("tracking_categories,vendor,company"),

    TRACKING_CATEGORIES_VENDOR_COMPANY_ACCOUNTING_PERIOD("tracking_categories,vendor,company,accounting_period"),

    VENDOR("vendor"),

    VENDOR_ACCOUNTING_PERIOD("vendor,accounting_period"),

    VENDOR_COMPANY("vendor,company"),

    VENDOR_COMPANY_ACCOUNTING_PERIOD("vendor,company,accounting_period");

    private final String value;

    PurchaseOrdersRetrieveRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
