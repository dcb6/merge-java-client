package com.merge.api.resources.accounting.invoices.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum InvoicesListRequestExpand {
    ACCOUNTING_PERIOD("accounting_period"),

    APPLIED_PAYMENTS("applied_payments"),

    APPLIED_PAYMENTS_ACCOUNTING_PERIOD("applied_payments,accounting_period"),

    APPLIED_PAYMENTS_COMPANY("applied_payments,company"),

    APPLIED_PAYMENTS_COMPANY_ACCOUNTING_PERIOD("applied_payments,company,accounting_period"),

    APPLIED_PAYMENTS_CONTACT("applied_payments,contact"),

    APPLIED_PAYMENTS_CONTACT_ACCOUNTING_PERIOD("applied_payments,contact,accounting_period"),

    APPLIED_PAYMENTS_CONTACT_COMPANY("applied_payments,contact,company"),

    APPLIED_PAYMENTS_CONTACT_COMPANY_ACCOUNTING_PERIOD("applied_payments,contact,company,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS("applied_payments,line_items"),

    APPLIED_PAYMENTS_LINE_ITEMS_ACCOUNTING_PERIOD("applied_payments,line_items,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS_COMPANY("applied_payments,line_items,company"),

    APPLIED_PAYMENTS_LINE_ITEMS_COMPANY_ACCOUNTING_PERIOD("applied_payments,line_items,company,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS_CONTACT("applied_payments,line_items,contact"),

    APPLIED_PAYMENTS_LINE_ITEMS_CONTACT_ACCOUNTING_PERIOD("applied_payments,line_items,contact,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS_CONTACT_COMPANY("applied_payments,line_items,contact,company"),

    APPLIED_PAYMENTS_LINE_ITEMS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "applied_payments,line_items,contact,company,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS("applied_payments,line_items,purchase_orders"),

    APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_ACCOUNTING_PERIOD(
            "applied_payments,line_items,purchase_orders,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_COMPANY("applied_payments,line_items,purchase_orders,company"),

    APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD(
            "applied_payments,line_items,purchase_orders,company,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_CONTACT("applied_payments,line_items,purchase_orders,contact"),

    APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD(
            "applied_payments,line_items,purchase_orders,contact,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_CONTACT_COMPANY(
            "applied_payments,line_items,purchase_orders,contact,company"),

    APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "applied_payments,line_items,purchase_orders,contact,company,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES("applied_payments,line_items,tracking_categories"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_ACCOUNTING_PERIOD(
            "applied_payments,line_items,tracking_categories,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_COMPANY("applied_payments,line_items,tracking_categories,company"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_COMPANY_ACCOUNTING_PERIOD(
            "applied_payments,line_items,tracking_categories,company,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_CONTACT("applied_payments,line_items,tracking_categories,contact"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_CONTACT_ACCOUNTING_PERIOD(
            "applied_payments,line_items,tracking_categories,contact,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_CONTACT_COMPANY(
            "applied_payments,line_items,tracking_categories,contact,company"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "applied_payments,line_items,tracking_categories,contact,company,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS(
            "applied_payments,line_items,tracking_categories,purchase_orders"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_ACCOUNTING_PERIOD(
            "applied_payments,line_items,tracking_categories,purchase_orders,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY(
            "applied_payments,line_items,tracking_categories,purchase_orders,company"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD(
            "applied_payments,line_items,tracking_categories,purchase_orders,company,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT(
            "applied_payments,line_items,tracking_categories,purchase_orders,contact"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD(
            "applied_payments,line_items,tracking_categories,purchase_orders,contact,accounting_period"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY(
            "applied_payments,line_items,tracking_categories,purchase_orders,contact,company"),

    APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "applied_payments,line_items,tracking_categories,purchase_orders,contact,company,accounting_period"),

    APPLIED_PAYMENTS_PURCHASE_ORDERS("applied_payments,purchase_orders"),

    APPLIED_PAYMENTS_PURCHASE_ORDERS_ACCOUNTING_PERIOD("applied_payments,purchase_orders,accounting_period"),

    APPLIED_PAYMENTS_PURCHASE_ORDERS_COMPANY("applied_payments,purchase_orders,company"),

    APPLIED_PAYMENTS_PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD(
            "applied_payments,purchase_orders,company,accounting_period"),

    APPLIED_PAYMENTS_PURCHASE_ORDERS_CONTACT("applied_payments,purchase_orders,contact"),

    APPLIED_PAYMENTS_PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD(
            "applied_payments,purchase_orders,contact,accounting_period"),

    APPLIED_PAYMENTS_PURCHASE_ORDERS_CONTACT_COMPANY("applied_payments,purchase_orders,contact,company"),

    APPLIED_PAYMENTS_PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "applied_payments,purchase_orders,contact,company,accounting_period"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES("applied_payments,tracking_categories"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES_ACCOUNTING_PERIOD("applied_payments,tracking_categories,accounting_period"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES_COMPANY("applied_payments,tracking_categories,company"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES_COMPANY_ACCOUNTING_PERIOD(
            "applied_payments,tracking_categories,company,accounting_period"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES_CONTACT("applied_payments,tracking_categories,contact"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES_CONTACT_ACCOUNTING_PERIOD(
            "applied_payments,tracking_categories,contact,accounting_period"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES_CONTACT_COMPANY("applied_payments,tracking_categories,contact,company"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "applied_payments,tracking_categories,contact,company,accounting_period"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS("applied_payments,tracking_categories,purchase_orders"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_ACCOUNTING_PERIOD(
            "applied_payments,tracking_categories,purchase_orders,accounting_period"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY(
            "applied_payments,tracking_categories,purchase_orders,company"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD(
            "applied_payments,tracking_categories,purchase_orders,company,accounting_period"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT(
            "applied_payments,tracking_categories,purchase_orders,contact"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD(
            "applied_payments,tracking_categories,purchase_orders,contact,accounting_period"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY(
            "applied_payments,tracking_categories,purchase_orders,contact,company"),

    APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "applied_payments,tracking_categories,purchase_orders,contact,company,accounting_period"),

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

    LINE_ITEMS_PURCHASE_ORDERS("line_items,purchase_orders"),

    LINE_ITEMS_PURCHASE_ORDERS_ACCOUNTING_PERIOD("line_items,purchase_orders,accounting_period"),

    LINE_ITEMS_PURCHASE_ORDERS_COMPANY("line_items,purchase_orders,company"),

    LINE_ITEMS_PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD("line_items,purchase_orders,company,accounting_period"),

    LINE_ITEMS_PURCHASE_ORDERS_CONTACT("line_items,purchase_orders,contact"),

    LINE_ITEMS_PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD("line_items,purchase_orders,contact,accounting_period"),

    LINE_ITEMS_PURCHASE_ORDERS_CONTACT_COMPANY("line_items,purchase_orders,contact,company"),

    LINE_ITEMS_PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "line_items,purchase_orders,contact,company,accounting_period"),

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

    LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS("line_items,tracking_categories,purchase_orders"),

    LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_ACCOUNTING_PERIOD(
            "line_items,tracking_categories,purchase_orders,accounting_period"),

    LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY("line_items,tracking_categories,purchase_orders,company"),

    LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD(
            "line_items,tracking_categories,purchase_orders,company,accounting_period"),

    LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT("line_items,tracking_categories,purchase_orders,contact"),

    LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD(
            "line_items,tracking_categories,purchase_orders,contact,accounting_period"),

    LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY(
            "line_items,tracking_categories,purchase_orders,contact,company"),

    LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "line_items,tracking_categories,purchase_orders,contact,company,accounting_period"),

    PAYMENTS("payments"),

    PAYMENTS_ACCOUNTING_PERIOD("payments,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS("payments,applied_payments"),

    PAYMENTS_APPLIED_PAYMENTS_ACCOUNTING_PERIOD("payments,applied_payments,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_COMPANY("payments,applied_payments,company"),

    PAYMENTS_APPLIED_PAYMENTS_COMPANY_ACCOUNTING_PERIOD("payments,applied_payments,company,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_CONTACT("payments,applied_payments,contact"),

    PAYMENTS_APPLIED_PAYMENTS_CONTACT_ACCOUNTING_PERIOD("payments,applied_payments,contact,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_CONTACT_COMPANY("payments,applied_payments,contact,company"),

    PAYMENTS_APPLIED_PAYMENTS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "payments,applied_payments,contact,company,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS("payments,applied_payments,line_items"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_ACCOUNTING_PERIOD("payments,applied_payments,line_items,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_COMPANY("payments,applied_payments,line_items,company"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_COMPANY_ACCOUNTING_PERIOD(
            "payments,applied_payments,line_items,company,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_CONTACT("payments,applied_payments,line_items,contact"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_CONTACT_ACCOUNTING_PERIOD(
            "payments,applied_payments,line_items,contact,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_CONTACT_COMPANY("payments,applied_payments,line_items,contact,company"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "payments,applied_payments,line_items,contact,company,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS("payments,applied_payments,line_items,purchase_orders"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_ACCOUNTING_PERIOD(
            "payments,applied_payments,line_items,purchase_orders,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_COMPANY(
            "payments,applied_payments,line_items,purchase_orders,company"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD(
            "payments,applied_payments,line_items,purchase_orders,company,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_CONTACT(
            "payments,applied_payments,line_items,purchase_orders,contact"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD(
            "payments,applied_payments,line_items,purchase_orders,contact,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_CONTACT_COMPANY(
            "payments,applied_payments,line_items,purchase_orders,contact,company"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "payments,applied_payments,line_items,purchase_orders,contact,company,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES(
            "payments,applied_payments,line_items,tracking_categories"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_ACCOUNTING_PERIOD(
            "payments,applied_payments,line_items,tracking_categories,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_COMPANY(
            "payments,applied_payments,line_items,tracking_categories,company"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_COMPANY_ACCOUNTING_PERIOD(
            "payments,applied_payments,line_items,tracking_categories,company,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_CONTACT(
            "payments,applied_payments,line_items,tracking_categories,contact"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_CONTACT_ACCOUNTING_PERIOD(
            "payments,applied_payments,line_items,tracking_categories,contact,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_CONTACT_COMPANY(
            "payments,applied_payments,line_items,tracking_categories,contact,company"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "payments,applied_payments,line_items,tracking_categories,contact,company,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS(
            "payments,applied_payments,line_items,tracking_categories,purchase_orders"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_ACCOUNTING_PERIOD(
            "payments,applied_payments,line_items,tracking_categories,purchase_orders,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY(
            "payments,applied_payments,line_items,tracking_categories,purchase_orders,company"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD(
            "payments,applied_payments,line_items,tracking_categories,purchase_orders,company,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT(
            "payments,applied_payments,line_items,tracking_categories,purchase_orders,contact"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD(
            "payments,applied_payments,line_items,tracking_categories,purchase_orders,contact,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY(
            "payments,applied_payments,line_items,tracking_categories,purchase_orders,contact,company"),

    PAYMENTS_APPLIED_PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "payments,applied_payments,line_items,tracking_categories,purchase_orders,contact,company,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_PURCHASE_ORDERS("payments,applied_payments,purchase_orders"),

    PAYMENTS_APPLIED_PAYMENTS_PURCHASE_ORDERS_ACCOUNTING_PERIOD(
            "payments,applied_payments,purchase_orders,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_PURCHASE_ORDERS_COMPANY("payments,applied_payments,purchase_orders,company"),

    PAYMENTS_APPLIED_PAYMENTS_PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD(
            "payments,applied_payments,purchase_orders,company,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_PURCHASE_ORDERS_CONTACT("payments,applied_payments,purchase_orders,contact"),

    PAYMENTS_APPLIED_PAYMENTS_PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD(
            "payments,applied_payments,purchase_orders,contact,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_PURCHASE_ORDERS_CONTACT_COMPANY(
            "payments,applied_payments,purchase_orders,contact,company"),

    PAYMENTS_APPLIED_PAYMENTS_PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "payments,applied_payments,purchase_orders,contact,company,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES("payments,applied_payments,tracking_categories"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES_ACCOUNTING_PERIOD(
            "payments,applied_payments,tracking_categories,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES_COMPANY("payments,applied_payments,tracking_categories,company"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES_COMPANY_ACCOUNTING_PERIOD(
            "payments,applied_payments,tracking_categories,company,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES_CONTACT("payments,applied_payments,tracking_categories,contact"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES_CONTACT_ACCOUNTING_PERIOD(
            "payments,applied_payments,tracking_categories,contact,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES_CONTACT_COMPANY(
            "payments,applied_payments,tracking_categories,contact,company"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "payments,applied_payments,tracking_categories,contact,company,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS(
            "payments,applied_payments,tracking_categories,purchase_orders"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_ACCOUNTING_PERIOD(
            "payments,applied_payments,tracking_categories,purchase_orders,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY(
            "payments,applied_payments,tracking_categories,purchase_orders,company"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD(
            "payments,applied_payments,tracking_categories,purchase_orders,company,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT(
            "payments,applied_payments,tracking_categories,purchase_orders,contact"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD(
            "payments,applied_payments,tracking_categories,purchase_orders,contact,accounting_period"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY(
            "payments,applied_payments,tracking_categories,purchase_orders,contact,company"),

    PAYMENTS_APPLIED_PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "payments,applied_payments,tracking_categories,purchase_orders,contact,company,accounting_period"),

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

    PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS("payments,line_items,purchase_orders"),

    PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_ACCOUNTING_PERIOD("payments,line_items,purchase_orders,accounting_period"),

    PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_COMPANY("payments,line_items,purchase_orders,company"),

    PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD(
            "payments,line_items,purchase_orders,company,accounting_period"),

    PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_CONTACT("payments,line_items,purchase_orders,contact"),

    PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD(
            "payments,line_items,purchase_orders,contact,accounting_period"),

    PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_CONTACT_COMPANY("payments,line_items,purchase_orders,contact,company"),

    PAYMENTS_LINE_ITEMS_PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "payments,line_items,purchase_orders,contact,company,accounting_period"),

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

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS("payments,line_items,tracking_categories,purchase_orders"),

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_ACCOUNTING_PERIOD(
            "payments,line_items,tracking_categories,purchase_orders,accounting_period"),

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY(
            "payments,line_items,tracking_categories,purchase_orders,company"),

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD(
            "payments,line_items,tracking_categories,purchase_orders,company,accounting_period"),

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT(
            "payments,line_items,tracking_categories,purchase_orders,contact"),

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD(
            "payments,line_items,tracking_categories,purchase_orders,contact,accounting_period"),

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY(
            "payments,line_items,tracking_categories,purchase_orders,contact,company"),

    PAYMENTS_LINE_ITEMS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "payments,line_items,tracking_categories,purchase_orders,contact,company,accounting_period"),

    PAYMENTS_PURCHASE_ORDERS("payments,purchase_orders"),

    PAYMENTS_PURCHASE_ORDERS_ACCOUNTING_PERIOD("payments,purchase_orders,accounting_period"),

    PAYMENTS_PURCHASE_ORDERS_COMPANY("payments,purchase_orders,company"),

    PAYMENTS_PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD("payments,purchase_orders,company,accounting_period"),

    PAYMENTS_PURCHASE_ORDERS_CONTACT("payments,purchase_orders,contact"),

    PAYMENTS_PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD("payments,purchase_orders,contact,accounting_period"),

    PAYMENTS_PURCHASE_ORDERS_CONTACT_COMPANY("payments,purchase_orders,contact,company"),

    PAYMENTS_PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "payments,purchase_orders,contact,company,accounting_period"),

    PAYMENTS_TRACKING_CATEGORIES("payments,tracking_categories"),

    PAYMENTS_TRACKING_CATEGORIES_ACCOUNTING_PERIOD("payments,tracking_categories,accounting_period"),

    PAYMENTS_TRACKING_CATEGORIES_COMPANY("payments,tracking_categories,company"),

    PAYMENTS_TRACKING_CATEGORIES_COMPANY_ACCOUNTING_PERIOD("payments,tracking_categories,company,accounting_period"),

    PAYMENTS_TRACKING_CATEGORIES_CONTACT("payments,tracking_categories,contact"),

    PAYMENTS_TRACKING_CATEGORIES_CONTACT_ACCOUNTING_PERIOD("payments,tracking_categories,contact,accounting_period"),

    PAYMENTS_TRACKING_CATEGORIES_CONTACT_COMPANY("payments,tracking_categories,contact,company"),

    PAYMENTS_TRACKING_CATEGORIES_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "payments,tracking_categories,contact,company,accounting_period"),

    PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS("payments,tracking_categories,purchase_orders"),

    PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_ACCOUNTING_PERIOD(
            "payments,tracking_categories,purchase_orders,accounting_period"),

    PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY("payments,tracking_categories,purchase_orders,company"),

    PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD(
            "payments,tracking_categories,purchase_orders,company,accounting_period"),

    PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT("payments,tracking_categories,purchase_orders,contact"),

    PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD(
            "payments,tracking_categories,purchase_orders,contact,accounting_period"),

    PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY(
            "payments,tracking_categories,purchase_orders,contact,company"),

    PAYMENTS_TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "payments,tracking_categories,purchase_orders,contact,company,accounting_period"),

    PURCHASE_ORDERS("purchase_orders"),

    PURCHASE_ORDERS_ACCOUNTING_PERIOD("purchase_orders,accounting_period"),

    PURCHASE_ORDERS_COMPANY("purchase_orders,company"),

    PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD("purchase_orders,company,accounting_period"),

    PURCHASE_ORDERS_CONTACT("purchase_orders,contact"),

    PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD("purchase_orders,contact,accounting_period"),

    PURCHASE_ORDERS_CONTACT_COMPANY("purchase_orders,contact,company"),

    PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD("purchase_orders,contact,company,accounting_period"),

    TRACKING_CATEGORIES("tracking_categories"),

    TRACKING_CATEGORIES_ACCOUNTING_PERIOD("tracking_categories,accounting_period"),

    TRACKING_CATEGORIES_COMPANY("tracking_categories,company"),

    TRACKING_CATEGORIES_COMPANY_ACCOUNTING_PERIOD("tracking_categories,company,accounting_period"),

    TRACKING_CATEGORIES_CONTACT("tracking_categories,contact"),

    TRACKING_CATEGORIES_CONTACT_ACCOUNTING_PERIOD("tracking_categories,contact,accounting_period"),

    TRACKING_CATEGORIES_CONTACT_COMPANY("tracking_categories,contact,company"),

    TRACKING_CATEGORIES_CONTACT_COMPANY_ACCOUNTING_PERIOD("tracking_categories,contact,company,accounting_period"),

    TRACKING_CATEGORIES_PURCHASE_ORDERS("tracking_categories,purchase_orders"),

    TRACKING_CATEGORIES_PURCHASE_ORDERS_ACCOUNTING_PERIOD("tracking_categories,purchase_orders,accounting_period"),

    TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY("tracking_categories,purchase_orders,company"),

    TRACKING_CATEGORIES_PURCHASE_ORDERS_COMPANY_ACCOUNTING_PERIOD(
            "tracking_categories,purchase_orders,company,accounting_period"),

    TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT("tracking_categories,purchase_orders,contact"),

    TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_ACCOUNTING_PERIOD(
            "tracking_categories,purchase_orders,contact,accounting_period"),

    TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY("tracking_categories,purchase_orders,contact,company"),

    TRACKING_CATEGORIES_PURCHASE_ORDERS_CONTACT_COMPANY_ACCOUNTING_PERIOD(
            "tracking_categories,purchase_orders,contact,company,accounting_period");

    private final String value;

    InvoicesListRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}