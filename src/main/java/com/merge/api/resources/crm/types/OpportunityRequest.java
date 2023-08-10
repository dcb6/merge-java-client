package com.merge.api.resources.crm.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = OpportunityRequest.Builder.class)
public final class OpportunityRequest {
    private final Optional<String> name;

    private final Optional<String> description;

    private final Optional<Integer> amount;

    private final Optional<OpportunityRequestOwner> owner;

    private final Optional<OpportunityRequestAccount> account;

    private final Optional<OpportunityRequestStage> stage;

    private final Optional<OpportunityRequestStatus> status;

    private final Optional<OffsetDateTime> lastActivityAt;

    private final Optional<OffsetDateTime> closeDate;

    private final Optional<Map<String, JsonNode>> integrationParams;

    private final Optional<Map<String, JsonNode>> linkedAccountParams;

    private final Optional<List<RemoteFieldRequest>> remoteFields;

    private OpportunityRequest(
            Optional<String> name,
            Optional<String> description,
            Optional<Integer> amount,
            Optional<OpportunityRequestOwner> owner,
            Optional<OpportunityRequestAccount> account,
            Optional<OpportunityRequestStage> stage,
            Optional<OpportunityRequestStatus> status,
            Optional<OffsetDateTime> lastActivityAt,
            Optional<OffsetDateTime> closeDate,
            Optional<Map<String, JsonNode>> integrationParams,
            Optional<Map<String, JsonNode>> linkedAccountParams,
            Optional<List<RemoteFieldRequest>> remoteFields) {
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.owner = owner;
        this.account = account;
        this.stage = stage;
        this.status = status;
        this.lastActivityAt = lastActivityAt;
        this.closeDate = closeDate;
        this.integrationParams = integrationParams;
        this.linkedAccountParams = linkedAccountParams;
        this.remoteFields = remoteFields;
    }

    /**
     * @return The opportunity's name.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return The opportunity's description.
     */
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    /**
     * @return The opportunity's amount.
     */
    @JsonProperty("amount")
    public Optional<Integer> getAmount() {
        return amount;
    }

    /**
     * @return The opportunity's owner.
     */
    @JsonProperty("owner")
    public Optional<OpportunityRequestOwner> getOwner() {
        return owner;
    }

    /**
     * @return The account of the opportunity.
     */
    @JsonProperty("account")
    public Optional<OpportunityRequestAccount> getAccount() {
        return account;
    }

    /**
     * @return The stage of the opportunity.
     */
    @JsonProperty("stage")
    public Optional<OpportunityRequestStage> getStage() {
        return stage;
    }

    /**
     * @return The opportunity's status.
     * <ul>
     * <li><code>OPEN</code> - OPEN</li>
     * <li><code>WON</code> - WON</li>
     * <li><code>LOST</code> - LOST</li>
     * </ul>
     */
    @JsonProperty("status")
    public Optional<OpportunityRequestStatus> getStatus() {
        return status;
    }

    /**
     * @return When the opportunity's last activity occurred.
     */
    @JsonProperty("last_activity_at")
    public Optional<OffsetDateTime> getLastActivityAt() {
        return lastActivityAt;
    }

    /**
     * @return When the opportunity was closed.
     */
    @JsonProperty("close_date")
    public Optional<OffsetDateTime> getCloseDate() {
        return closeDate;
    }

    @JsonProperty("integration_params")
    public Optional<Map<String, JsonNode>> getIntegrationParams() {
        return integrationParams;
    }

    @JsonProperty("linked_account_params")
    public Optional<Map<String, JsonNode>> getLinkedAccountParams() {
        return linkedAccountParams;
    }

    @JsonProperty("remote_fields")
    public Optional<List<RemoteFieldRequest>> getRemoteFields() {
        return remoteFields;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof OpportunityRequest && equalTo((OpportunityRequest) other);
    }

    private boolean equalTo(OpportunityRequest other) {
        return name.equals(other.name)
                && description.equals(other.description)
                && amount.equals(other.amount)
                && owner.equals(other.owner)
                && account.equals(other.account)
                && stage.equals(other.stage)
                && status.equals(other.status)
                && lastActivityAt.equals(other.lastActivityAt)
                && closeDate.equals(other.closeDate)
                && integrationParams.equals(other.integrationParams)
                && linkedAccountParams.equals(other.linkedAccountParams)
                && remoteFields.equals(other.remoteFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.description,
                this.amount,
                this.owner,
                this.account,
                this.stage,
                this.status,
                this.lastActivityAt,
                this.closeDate,
                this.integrationParams,
                this.linkedAccountParams,
                this.remoteFields);
    }

    @Override
    public String toString() {
        return "OpportunityRequest{" + "name: " + name + ", description: " + description + ", amount: " + amount
                + ", owner: " + owner + ", account: " + account + ", stage: " + stage + ", status: " + status
                + ", lastActivityAt: " + lastActivityAt + ", closeDate: " + closeDate + ", integrationParams: "
                + integrationParams + ", linkedAccountParams: " + linkedAccountParams + ", remoteFields: "
                + remoteFields + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> name = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<Integer> amount = Optional.empty();

        private Optional<OpportunityRequestOwner> owner = Optional.empty();

        private Optional<OpportunityRequestAccount> account = Optional.empty();

        private Optional<OpportunityRequestStage> stage = Optional.empty();

        private Optional<OpportunityRequestStatus> status = Optional.empty();

        private Optional<OffsetDateTime> lastActivityAt = Optional.empty();

        private Optional<OffsetDateTime> closeDate = Optional.empty();

        private Optional<Map<String, JsonNode>> integrationParams = Optional.empty();

        private Optional<Map<String, JsonNode>> linkedAccountParams = Optional.empty();

        private Optional<List<RemoteFieldRequest>> remoteFields = Optional.empty();

        private Builder() {}

        public Builder from(OpportunityRequest other) {
            name(other.getName());
            description(other.getDescription());
            amount(other.getAmount());
            owner(other.getOwner());
            account(other.getAccount());
            stage(other.getStage());
            status(other.getStatus());
            lastActivityAt(other.getLastActivityAt());
            closeDate(other.getCloseDate());
            integrationParams(other.getIntegrationParams());
            linkedAccountParams(other.getLinkedAccountParams());
            remoteFields(other.getRemoteFields());
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public Builder description(Optional<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(String description) {
            this.description = Optional.of(description);
            return this;
        }

        @JsonSetter(value = "amount", nulls = Nulls.SKIP)
        public Builder amount(Optional<Integer> amount) {
            this.amount = amount;
            return this;
        }

        public Builder amount(Integer amount) {
            this.amount = Optional.of(amount);
            return this;
        }

        @JsonSetter(value = "owner", nulls = Nulls.SKIP)
        public Builder owner(Optional<OpportunityRequestOwner> owner) {
            this.owner = owner;
            return this;
        }

        public Builder owner(OpportunityRequestOwner owner) {
            this.owner = Optional.of(owner);
            return this;
        }

        @JsonSetter(value = "account", nulls = Nulls.SKIP)
        public Builder account(Optional<OpportunityRequestAccount> account) {
            this.account = account;
            return this;
        }

        public Builder account(OpportunityRequestAccount account) {
            this.account = Optional.of(account);
            return this;
        }

        @JsonSetter(value = "stage", nulls = Nulls.SKIP)
        public Builder stage(Optional<OpportunityRequestStage> stage) {
            this.stage = stage;
            return this;
        }

        public Builder stage(OpportunityRequestStage stage) {
            this.stage = Optional.of(stage);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<OpportunityRequestStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(OpportunityRequestStatus status) {
            this.status = Optional.of(status);
            return this;
        }

        @JsonSetter(value = "last_activity_at", nulls = Nulls.SKIP)
        public Builder lastActivityAt(Optional<OffsetDateTime> lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }

        public Builder lastActivityAt(OffsetDateTime lastActivityAt) {
            this.lastActivityAt = Optional.of(lastActivityAt);
            return this;
        }

        @JsonSetter(value = "close_date", nulls = Nulls.SKIP)
        public Builder closeDate(Optional<OffsetDateTime> closeDate) {
            this.closeDate = closeDate;
            return this;
        }

        public Builder closeDate(OffsetDateTime closeDate) {
            this.closeDate = Optional.of(closeDate);
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

        @JsonSetter(value = "remote_fields", nulls = Nulls.SKIP)
        public Builder remoteFields(Optional<List<RemoteFieldRequest>> remoteFields) {
            this.remoteFields = remoteFields;
            return this;
        }

        public Builder remoteFields(List<RemoteFieldRequest> remoteFields) {
            this.remoteFields = Optional.of(remoteFields);
            return this;
        }

        public OpportunityRequest build() {
            return new OpportunityRequest(
                    name,
                    description,
                    amount,
                    owner,
                    account,
                    stage,
                    status,
                    lastActivityAt,
                    closeDate,
                    integrationParams,
                    linkedAccountParams,
                    remoteFields);
        }
    }
}
