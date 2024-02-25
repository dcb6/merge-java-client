/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.accounting.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ExternalTargetFieldApiResponse.Builder.class)
public final class ExternalTargetFieldApiResponse {
    private final Optional<List<ExternalTargetFieldApi>> account;

    private final Optional<List<ExternalTargetFieldApi>> accountingAttachment;

    private final Optional<List<ExternalTargetFieldApi>> balanceSheet;

    private final Optional<List<ExternalTargetFieldApi>> cashFlowStatement;

    private final Optional<List<ExternalTargetFieldApi>> companyInfo;

    private final Optional<List<ExternalTargetFieldApi>> contact;

    private final Optional<List<ExternalTargetFieldApi>> incomeStatement;

    private final Optional<List<ExternalTargetFieldApi>> creditNote;

    private final Optional<List<ExternalTargetFieldApi>> item;

    private final Optional<List<ExternalTargetFieldApi>> purchaseOrder;

    private final Optional<List<ExternalTargetFieldApi>> trackingCategory;

    private final Optional<List<ExternalTargetFieldApi>> journalEntry;

    private final Optional<List<ExternalTargetFieldApi>> taxRate;

    private final Optional<List<ExternalTargetFieldApi>> invoice;

    private final Optional<List<ExternalTargetFieldApi>> payment;

    private final Optional<List<ExternalTargetFieldApi>> expense;

    private final Optional<List<ExternalTargetFieldApi>> vendorCredit;

    private final Optional<List<ExternalTargetFieldApi>> transaction;

    private final Optional<List<ExternalTargetFieldApi>> generalLedgerTransaction;

    private final Map<String, Object> additionalProperties;

    private ExternalTargetFieldApiResponse(
            Optional<List<ExternalTargetFieldApi>> account,
            Optional<List<ExternalTargetFieldApi>> accountingAttachment,
            Optional<List<ExternalTargetFieldApi>> balanceSheet,
            Optional<List<ExternalTargetFieldApi>> cashFlowStatement,
            Optional<List<ExternalTargetFieldApi>> companyInfo,
            Optional<List<ExternalTargetFieldApi>> contact,
            Optional<List<ExternalTargetFieldApi>> incomeStatement,
            Optional<List<ExternalTargetFieldApi>> creditNote,
            Optional<List<ExternalTargetFieldApi>> item,
            Optional<List<ExternalTargetFieldApi>> purchaseOrder,
            Optional<List<ExternalTargetFieldApi>> trackingCategory,
            Optional<List<ExternalTargetFieldApi>> journalEntry,
            Optional<List<ExternalTargetFieldApi>> taxRate,
            Optional<List<ExternalTargetFieldApi>> invoice,
            Optional<List<ExternalTargetFieldApi>> payment,
            Optional<List<ExternalTargetFieldApi>> expense,
            Optional<List<ExternalTargetFieldApi>> vendorCredit,
            Optional<List<ExternalTargetFieldApi>> transaction,
            Optional<List<ExternalTargetFieldApi>> generalLedgerTransaction,
            Map<String, Object> additionalProperties) {
        this.account = account;
        this.accountingAttachment = accountingAttachment;
        this.balanceSheet = balanceSheet;
        this.cashFlowStatement = cashFlowStatement;
        this.companyInfo = companyInfo;
        this.contact = contact;
        this.incomeStatement = incomeStatement;
        this.creditNote = creditNote;
        this.item = item;
        this.purchaseOrder = purchaseOrder;
        this.trackingCategory = trackingCategory;
        this.journalEntry = journalEntry;
        this.taxRate = taxRate;
        this.invoice = invoice;
        this.payment = payment;
        this.expense = expense;
        this.vendorCredit = vendorCredit;
        this.transaction = transaction;
        this.generalLedgerTransaction = generalLedgerTransaction;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("Account")
    public Optional<List<ExternalTargetFieldApi>> getAccount() {
        return account;
    }

    @JsonProperty("AccountingAttachment")
    public Optional<List<ExternalTargetFieldApi>> getAccountingAttachment() {
        return accountingAttachment;
    }

    @JsonProperty("BalanceSheet")
    public Optional<List<ExternalTargetFieldApi>> getBalanceSheet() {
        return balanceSheet;
    }

    @JsonProperty("CashFlowStatement")
    public Optional<List<ExternalTargetFieldApi>> getCashFlowStatement() {
        return cashFlowStatement;
    }

    @JsonProperty("CompanyInfo")
    public Optional<List<ExternalTargetFieldApi>> getCompanyInfo() {
        return companyInfo;
    }

    @JsonProperty("Contact")
    public Optional<List<ExternalTargetFieldApi>> getContact() {
        return contact;
    }

    @JsonProperty("IncomeStatement")
    public Optional<List<ExternalTargetFieldApi>> getIncomeStatement() {
        return incomeStatement;
    }

    @JsonProperty("CreditNote")
    public Optional<List<ExternalTargetFieldApi>> getCreditNote() {
        return creditNote;
    }

    @JsonProperty("Item")
    public Optional<List<ExternalTargetFieldApi>> getItem() {
        return item;
    }

    @JsonProperty("PurchaseOrder")
    public Optional<List<ExternalTargetFieldApi>> getPurchaseOrder() {
        return purchaseOrder;
    }

    @JsonProperty("TrackingCategory")
    public Optional<List<ExternalTargetFieldApi>> getTrackingCategory() {
        return trackingCategory;
    }

    @JsonProperty("JournalEntry")
    public Optional<List<ExternalTargetFieldApi>> getJournalEntry() {
        return journalEntry;
    }

    @JsonProperty("TaxRate")
    public Optional<List<ExternalTargetFieldApi>> getTaxRate() {
        return taxRate;
    }

    @JsonProperty("Invoice")
    public Optional<List<ExternalTargetFieldApi>> getInvoice() {
        return invoice;
    }

    @JsonProperty("Payment")
    public Optional<List<ExternalTargetFieldApi>> getPayment() {
        return payment;
    }

    @JsonProperty("Expense")
    public Optional<List<ExternalTargetFieldApi>> getExpense() {
        return expense;
    }

    @JsonProperty("VendorCredit")
    public Optional<List<ExternalTargetFieldApi>> getVendorCredit() {
        return vendorCredit;
    }

    @JsonProperty("Transaction")
    public Optional<List<ExternalTargetFieldApi>> getTransaction() {
        return transaction;
    }

    @JsonProperty("GeneralLedgerTransaction")
    public Optional<List<ExternalTargetFieldApi>> getGeneralLedgerTransaction() {
        return generalLedgerTransaction;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ExternalTargetFieldApiResponse && equalTo((ExternalTargetFieldApiResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ExternalTargetFieldApiResponse other) {
        return account.equals(other.account)
                && accountingAttachment.equals(other.accountingAttachment)
                && balanceSheet.equals(other.balanceSheet)
                && cashFlowStatement.equals(other.cashFlowStatement)
                && companyInfo.equals(other.companyInfo)
                && contact.equals(other.contact)
                && incomeStatement.equals(other.incomeStatement)
                && creditNote.equals(other.creditNote)
                && item.equals(other.item)
                && purchaseOrder.equals(other.purchaseOrder)
                && trackingCategory.equals(other.trackingCategory)
                && journalEntry.equals(other.journalEntry)
                && taxRate.equals(other.taxRate)
                && invoice.equals(other.invoice)
                && payment.equals(other.payment)
                && expense.equals(other.expense)
                && vendorCredit.equals(other.vendorCredit)
                && transaction.equals(other.transaction)
                && generalLedgerTransaction.equals(other.generalLedgerTransaction);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.account,
                this.accountingAttachment,
                this.balanceSheet,
                this.cashFlowStatement,
                this.companyInfo,
                this.contact,
                this.incomeStatement,
                this.creditNote,
                this.item,
                this.purchaseOrder,
                this.trackingCategory,
                this.journalEntry,
                this.taxRate,
                this.invoice,
                this.payment,
                this.expense,
                this.vendorCredit,
                this.transaction,
                this.generalLedgerTransaction);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<ExternalTargetFieldApi>> account = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> accountingAttachment = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> balanceSheet = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> cashFlowStatement = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> companyInfo = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> contact = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> incomeStatement = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> creditNote = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> item = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> purchaseOrder = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> trackingCategory = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> journalEntry = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> taxRate = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> invoice = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> payment = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> expense = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> vendorCredit = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> transaction = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> generalLedgerTransaction = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ExternalTargetFieldApiResponse other) {
            account(other.getAccount());
            accountingAttachment(other.getAccountingAttachment());
            balanceSheet(other.getBalanceSheet());
            cashFlowStatement(other.getCashFlowStatement());
            companyInfo(other.getCompanyInfo());
            contact(other.getContact());
            incomeStatement(other.getIncomeStatement());
            creditNote(other.getCreditNote());
            item(other.getItem());
            purchaseOrder(other.getPurchaseOrder());
            trackingCategory(other.getTrackingCategory());
            journalEntry(other.getJournalEntry());
            taxRate(other.getTaxRate());
            invoice(other.getInvoice());
            payment(other.getPayment());
            expense(other.getExpense());
            vendorCredit(other.getVendorCredit());
            transaction(other.getTransaction());
            generalLedgerTransaction(other.getGeneralLedgerTransaction());
            return this;
        }

        @JsonSetter(value = "Account", nulls = Nulls.SKIP)
        public Builder account(Optional<List<ExternalTargetFieldApi>> account) {
            this.account = account;
            return this;
        }

        public Builder account(List<ExternalTargetFieldApi> account) {
            this.account = Optional.of(account);
            return this;
        }

        @JsonSetter(value = "AccountingAttachment", nulls = Nulls.SKIP)
        public Builder accountingAttachment(Optional<List<ExternalTargetFieldApi>> accountingAttachment) {
            this.accountingAttachment = accountingAttachment;
            return this;
        }

        public Builder accountingAttachment(List<ExternalTargetFieldApi> accountingAttachment) {
            this.accountingAttachment = Optional.of(accountingAttachment);
            return this;
        }

        @JsonSetter(value = "BalanceSheet", nulls = Nulls.SKIP)
        public Builder balanceSheet(Optional<List<ExternalTargetFieldApi>> balanceSheet) {
            this.balanceSheet = balanceSheet;
            return this;
        }

        public Builder balanceSheet(List<ExternalTargetFieldApi> balanceSheet) {
            this.balanceSheet = Optional.of(balanceSheet);
            return this;
        }

        @JsonSetter(value = "CashFlowStatement", nulls = Nulls.SKIP)
        public Builder cashFlowStatement(Optional<List<ExternalTargetFieldApi>> cashFlowStatement) {
            this.cashFlowStatement = cashFlowStatement;
            return this;
        }

        public Builder cashFlowStatement(List<ExternalTargetFieldApi> cashFlowStatement) {
            this.cashFlowStatement = Optional.of(cashFlowStatement);
            return this;
        }

        @JsonSetter(value = "CompanyInfo", nulls = Nulls.SKIP)
        public Builder companyInfo(Optional<List<ExternalTargetFieldApi>> companyInfo) {
            this.companyInfo = companyInfo;
            return this;
        }

        public Builder companyInfo(List<ExternalTargetFieldApi> companyInfo) {
            this.companyInfo = Optional.of(companyInfo);
            return this;
        }

        @JsonSetter(value = "Contact", nulls = Nulls.SKIP)
        public Builder contact(Optional<List<ExternalTargetFieldApi>> contact) {
            this.contact = contact;
            return this;
        }

        public Builder contact(List<ExternalTargetFieldApi> contact) {
            this.contact = Optional.of(contact);
            return this;
        }

        @JsonSetter(value = "IncomeStatement", nulls = Nulls.SKIP)
        public Builder incomeStatement(Optional<List<ExternalTargetFieldApi>> incomeStatement) {
            this.incomeStatement = incomeStatement;
            return this;
        }

        public Builder incomeStatement(List<ExternalTargetFieldApi> incomeStatement) {
            this.incomeStatement = Optional.of(incomeStatement);
            return this;
        }

        @JsonSetter(value = "CreditNote", nulls = Nulls.SKIP)
        public Builder creditNote(Optional<List<ExternalTargetFieldApi>> creditNote) {
            this.creditNote = creditNote;
            return this;
        }

        public Builder creditNote(List<ExternalTargetFieldApi> creditNote) {
            this.creditNote = Optional.of(creditNote);
            return this;
        }

        @JsonSetter(value = "Item", nulls = Nulls.SKIP)
        public Builder item(Optional<List<ExternalTargetFieldApi>> item) {
            this.item = item;
            return this;
        }

        public Builder item(List<ExternalTargetFieldApi> item) {
            this.item = Optional.of(item);
            return this;
        }

        @JsonSetter(value = "PurchaseOrder", nulls = Nulls.SKIP)
        public Builder purchaseOrder(Optional<List<ExternalTargetFieldApi>> purchaseOrder) {
            this.purchaseOrder = purchaseOrder;
            return this;
        }

        public Builder purchaseOrder(List<ExternalTargetFieldApi> purchaseOrder) {
            this.purchaseOrder = Optional.of(purchaseOrder);
            return this;
        }

        @JsonSetter(value = "TrackingCategory", nulls = Nulls.SKIP)
        public Builder trackingCategory(Optional<List<ExternalTargetFieldApi>> trackingCategory) {
            this.trackingCategory = trackingCategory;
            return this;
        }

        public Builder trackingCategory(List<ExternalTargetFieldApi> trackingCategory) {
            this.trackingCategory = Optional.of(trackingCategory);
            return this;
        }

        @JsonSetter(value = "JournalEntry", nulls = Nulls.SKIP)
        public Builder journalEntry(Optional<List<ExternalTargetFieldApi>> journalEntry) {
            this.journalEntry = journalEntry;
            return this;
        }

        public Builder journalEntry(List<ExternalTargetFieldApi> journalEntry) {
            this.journalEntry = Optional.of(journalEntry);
            return this;
        }

        @JsonSetter(value = "TaxRate", nulls = Nulls.SKIP)
        public Builder taxRate(Optional<List<ExternalTargetFieldApi>> taxRate) {
            this.taxRate = taxRate;
            return this;
        }

        public Builder taxRate(List<ExternalTargetFieldApi> taxRate) {
            this.taxRate = Optional.of(taxRate);
            return this;
        }

        @JsonSetter(value = "Invoice", nulls = Nulls.SKIP)
        public Builder invoice(Optional<List<ExternalTargetFieldApi>> invoice) {
            this.invoice = invoice;
            return this;
        }

        public Builder invoice(List<ExternalTargetFieldApi> invoice) {
            this.invoice = Optional.of(invoice);
            return this;
        }

        @JsonSetter(value = "Payment", nulls = Nulls.SKIP)
        public Builder payment(Optional<List<ExternalTargetFieldApi>> payment) {
            this.payment = payment;
            return this;
        }

        public Builder payment(List<ExternalTargetFieldApi> payment) {
            this.payment = Optional.of(payment);
            return this;
        }

        @JsonSetter(value = "Expense", nulls = Nulls.SKIP)
        public Builder expense(Optional<List<ExternalTargetFieldApi>> expense) {
            this.expense = expense;
            return this;
        }

        public Builder expense(List<ExternalTargetFieldApi> expense) {
            this.expense = Optional.of(expense);
            return this;
        }

        @JsonSetter(value = "VendorCredit", nulls = Nulls.SKIP)
        public Builder vendorCredit(Optional<List<ExternalTargetFieldApi>> vendorCredit) {
            this.vendorCredit = vendorCredit;
            return this;
        }

        public Builder vendorCredit(List<ExternalTargetFieldApi> vendorCredit) {
            this.vendorCredit = Optional.of(vendorCredit);
            return this;
        }

        @JsonSetter(value = "Transaction", nulls = Nulls.SKIP)
        public Builder transaction(Optional<List<ExternalTargetFieldApi>> transaction) {
            this.transaction = transaction;
            return this;
        }

        public Builder transaction(List<ExternalTargetFieldApi> transaction) {
            this.transaction = Optional.of(transaction);
            return this;
        }

        @JsonSetter(value = "GeneralLedgerTransaction", nulls = Nulls.SKIP)
        public Builder generalLedgerTransaction(Optional<List<ExternalTargetFieldApi>> generalLedgerTransaction) {
            this.generalLedgerTransaction = generalLedgerTransaction;
            return this;
        }

        public Builder generalLedgerTransaction(List<ExternalTargetFieldApi> generalLedgerTransaction) {
            this.generalLedgerTransaction = Optional.of(generalLedgerTransaction);
            return this;
        }

        public ExternalTargetFieldApiResponse build() {
            return new ExternalTargetFieldApiResponse(
                    account,
                    accountingAttachment,
                    balanceSheet,
                    cashFlowStatement,
                    companyInfo,
                    contact,
                    incomeStatement,
                    creditNote,
                    item,
                    purchaseOrder,
                    trackingCategory,
                    journalEntry,
                    taxRate,
                    invoice,
                    payment,
                    expense,
                    vendorCredit,
                    transaction,
                    generalLedgerTransaction,
                    additionalProperties);
        }
    }
}
