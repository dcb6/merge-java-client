package com.merge.api.resources.accounting.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CreditNoteApplyLine.Builder.class)
public final class CreditNoteApplyLine {
    private final Optional<CreditNoteApplyLineInvoice> invoice;

    private final Optional<OffsetDateTime> appliedDate;

    private final Optional<String> appliedAmount;

    private final Optional<OffsetDateTime> modifiedAt;

    private CreditNoteApplyLine(
            Optional<CreditNoteApplyLineInvoice> invoice,
            Optional<OffsetDateTime> appliedDate,
            Optional<String> appliedAmount,
            Optional<OffsetDateTime> modifiedAt) {
        this.invoice = invoice;
        this.appliedDate = appliedDate;
        this.appliedAmount = appliedAmount;
        this.modifiedAt = modifiedAt;
    }

    @JsonProperty("invoice")
    public Optional<CreditNoteApplyLineInvoice> getInvoice() {
        return invoice;
    }

    /**
     * @return Date that the credit note is applied to the invoice.
     */
    @JsonProperty("applied_date")
    public Optional<OffsetDateTime> getAppliedDate() {
        return appliedDate;
    }

    /**
     * @return The amount of the Credit Note applied to the invoice.
     */
    @JsonProperty("applied_amount")
    public Optional<String> getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * @return This is the datetime that this object was last updated by Merge
     */
    @JsonProperty("modified_at")
    public Optional<OffsetDateTime> getModifiedAt() {
        return modifiedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreditNoteApplyLine && equalTo((CreditNoteApplyLine) other);
    }

    private boolean equalTo(CreditNoteApplyLine other) {
        return invoice.equals(other.invoice)
                && appliedDate.equals(other.appliedDate)
                && appliedAmount.equals(other.appliedAmount)
                && modifiedAt.equals(other.modifiedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.invoice, this.appliedDate, this.appliedAmount, this.modifiedAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<CreditNoteApplyLineInvoice> invoice = Optional.empty();

        private Optional<OffsetDateTime> appliedDate = Optional.empty();

        private Optional<String> appliedAmount = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Builder() {}

        public Builder from(CreditNoteApplyLine other) {
            invoice(other.getInvoice());
            appliedDate(other.getAppliedDate());
            appliedAmount(other.getAppliedAmount());
            modifiedAt(other.getModifiedAt());
            return this;
        }

        @JsonSetter(value = "invoice", nulls = Nulls.SKIP)
        public Builder invoice(Optional<CreditNoteApplyLineInvoice> invoice) {
            this.invoice = invoice;
            return this;
        }

        public Builder invoice(CreditNoteApplyLineInvoice invoice) {
            this.invoice = Optional.of(invoice);
            return this;
        }

        @JsonSetter(value = "applied_date", nulls = Nulls.SKIP)
        public Builder appliedDate(Optional<OffsetDateTime> appliedDate) {
            this.appliedDate = appliedDate;
            return this;
        }

        public Builder appliedDate(OffsetDateTime appliedDate) {
            this.appliedDate = Optional.of(appliedDate);
            return this;
        }

        @JsonSetter(value = "applied_amount", nulls = Nulls.SKIP)
        public Builder appliedAmount(Optional<String> appliedAmount) {
            this.appliedAmount = appliedAmount;
            return this;
        }

        public Builder appliedAmount(String appliedAmount) {
            this.appliedAmount = Optional.of(appliedAmount);
            return this;
        }

        @JsonSetter(value = "modified_at", nulls = Nulls.SKIP)
        public Builder modifiedAt(Optional<OffsetDateTime> modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public Builder modifiedAt(OffsetDateTime modifiedAt) {
            this.modifiedAt = Optional.of(modifiedAt);
            return this;
        }

        public CreditNoteApplyLine build() {
            return new CreditNoteApplyLine(invoice, appliedDate, appliedAmount, modifiedAt);
        }
    }
}