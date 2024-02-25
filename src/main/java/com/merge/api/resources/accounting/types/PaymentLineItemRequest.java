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
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PaymentLineItemRequest.Builder.class)
public final class PaymentLineItemRequest {
    private final Optional<String> appliedAmount;

    private final Optional<OffsetDateTime> appliedDate;

    private final Optional<String> remoteId;

    private final Optional<String> relatedObjectId;

    private final Optional<String> relatedObjectType;

    private final Optional<Map<String, JsonNode>> integrationParams;

    private final Optional<Map<String, JsonNode>> linkedAccountParams;

    private final Map<String, Object> additionalProperties;

    private PaymentLineItemRequest(
            Optional<String> appliedAmount,
            Optional<OffsetDateTime> appliedDate,
            Optional<String> remoteId,
            Optional<String> relatedObjectId,
            Optional<String> relatedObjectType,
            Optional<Map<String, JsonNode>> integrationParams,
            Optional<Map<String, JsonNode>> linkedAccountParams,
            Map<String, Object> additionalProperties) {
        this.appliedAmount = appliedAmount;
        this.appliedDate = appliedDate;
        this.remoteId = remoteId;
        this.relatedObjectId = relatedObjectId;
        this.relatedObjectType = relatedObjectType;
        this.integrationParams = integrationParams;
        this.linkedAccountParams = linkedAccountParams;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The amount being applied to the transaction.
     */
    @JsonProperty("applied_amount")
    public Optional<String> getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * @return The date the payment portion is applied.
     */
    @JsonProperty("applied_date")
    public Optional<OffsetDateTime> getAppliedDate() {
        return appliedDate;
    }

    /**
     * @return The third-party API ID of the matching object.
     */
    @JsonProperty("remote_id")
    public Optional<String> getRemoteId() {
        return remoteId;
    }

    /**
     * @return The Merge ID of the transaction the payment portion is being applied to.
     */
    @JsonProperty("related_object_id")
    public Optional<String> getRelatedObjectId() {
        return relatedObjectId;
    }

    /**
     * @return The type of transaction the payment portion is being applied to. Possible values include: INVOICE, JOURNAL_ENTRY, or CREDIT_NOTE.
     */
    @JsonProperty("related_object_type")
    public Optional<String> getRelatedObjectType() {
        return relatedObjectType;
    }

    @JsonProperty("integration_params")
    public Optional<Map<String, JsonNode>> getIntegrationParams() {
        return integrationParams;
    }

    @JsonProperty("linked_account_params")
    public Optional<Map<String, JsonNode>> getLinkedAccountParams() {
        return linkedAccountParams;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PaymentLineItemRequest && equalTo((PaymentLineItemRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PaymentLineItemRequest other) {
        return appliedAmount.equals(other.appliedAmount)
                && appliedDate.equals(other.appliedDate)
                && remoteId.equals(other.remoteId)
                && relatedObjectId.equals(other.relatedObjectId)
                && relatedObjectType.equals(other.relatedObjectType)
                && integrationParams.equals(other.integrationParams)
                && linkedAccountParams.equals(other.linkedAccountParams);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.appliedAmount,
                this.appliedDate,
                this.remoteId,
                this.relatedObjectId,
                this.relatedObjectType,
                this.integrationParams,
                this.linkedAccountParams);
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
        private Optional<String> appliedAmount = Optional.empty();

        private Optional<OffsetDateTime> appliedDate = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<String> relatedObjectId = Optional.empty();

        private Optional<String> relatedObjectType = Optional.empty();

        private Optional<Map<String, JsonNode>> integrationParams = Optional.empty();

        private Optional<Map<String, JsonNode>> linkedAccountParams = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(PaymentLineItemRequest other) {
            appliedAmount(other.getAppliedAmount());
            appliedDate(other.getAppliedDate());
            remoteId(other.getRemoteId());
            relatedObjectId(other.getRelatedObjectId());
            relatedObjectType(other.getRelatedObjectType());
            integrationParams(other.getIntegrationParams());
            linkedAccountParams(other.getLinkedAccountParams());
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

        @JsonSetter(value = "applied_date", nulls = Nulls.SKIP)
        public Builder appliedDate(Optional<OffsetDateTime> appliedDate) {
            this.appliedDate = appliedDate;
            return this;
        }

        public Builder appliedDate(OffsetDateTime appliedDate) {
            this.appliedDate = Optional.of(appliedDate);
            return this;
        }

        @JsonSetter(value = "remote_id", nulls = Nulls.SKIP)
        public Builder remoteId(Optional<String> remoteId) {
            this.remoteId = remoteId;
            return this;
        }

        public Builder remoteId(String remoteId) {
            this.remoteId = Optional.of(remoteId);
            return this;
        }

        @JsonSetter(value = "related_object_id", nulls = Nulls.SKIP)
        public Builder relatedObjectId(Optional<String> relatedObjectId) {
            this.relatedObjectId = relatedObjectId;
            return this;
        }

        public Builder relatedObjectId(String relatedObjectId) {
            this.relatedObjectId = Optional.of(relatedObjectId);
            return this;
        }

        @JsonSetter(value = "related_object_type", nulls = Nulls.SKIP)
        public Builder relatedObjectType(Optional<String> relatedObjectType) {
            this.relatedObjectType = relatedObjectType;
            return this;
        }

        public Builder relatedObjectType(String relatedObjectType) {
            this.relatedObjectType = Optional.of(relatedObjectType);
            return this;
        }

        @JsonSetter(value = "integration_params", nulls = Nulls.SKIP)
        public Builder integrationParams(Optional<Map<String, JsonNode>> integrationParams) {
            this.integrationParams = integrationParams;
            return this;
        }

        public Builder integrationParams(Map<String, JsonNode> integrationParams) {
            this.integrationParams = Optional.of(integrationParams);
            return this;
        }

        @JsonSetter(value = "linked_account_params", nulls = Nulls.SKIP)
        public Builder linkedAccountParams(Optional<Map<String, JsonNode>> linkedAccountParams) {
            this.linkedAccountParams = linkedAccountParams;
            return this;
        }

        public Builder linkedAccountParams(Map<String, JsonNode> linkedAccountParams) {
            this.linkedAccountParams = Optional.of(linkedAccountParams);
            return this;
        }

        public PaymentLineItemRequest build() {
            return new PaymentLineItemRequest(
                    appliedAmount,
                    appliedDate,
                    remoteId,
                    relatedObjectId,
                    relatedObjectType,
                    integrationParams,
                    linkedAccountParams,
                    additionalProperties);
        }
    }
}
