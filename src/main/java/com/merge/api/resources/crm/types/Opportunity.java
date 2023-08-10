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
@JsonDeserialize(builder = Opportunity.Builder.class)
public final class Opportunity {
    private final Optional<String> name;

    private final Optional<String> description;

    private final Optional<Integer> amount;

    private final Optional<OpportunityOwner> owner;

    private final Optional<OpportunityAccount> account;

    private final Optional<OpportunityStage> stage;

    private final Optional<OpportunityStatus> status;

    private final Optional<OffsetDateTime> lastActivityAt;

    private final Optional<OffsetDateTime> closeDate;

    private final Optional<OffsetDateTime> remoteCreatedAt;

    private final Optional<Boolean> remoteWasDeleted;

    private final Optional<String> id;

    private final Optional<String> remoteId;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<Map<String, JsonNode>> fieldMappings;

    private final Optional<List<RemoteData>> remoteData;

    private final Optional<List<RemoteField>> remoteFields;

    private Opportunity(
            Optional<String> name,
            Optional<String> description,
            Optional<Integer> amount,
            Optional<OpportunityOwner> owner,
            Optional<OpportunityAccount> account,
            Optional<OpportunityStage> stage,
            Optional<OpportunityStatus> status,
            Optional<OffsetDateTime> lastActivityAt,
            Optional<OffsetDateTime> closeDate,
            Optional<OffsetDateTime> remoteCreatedAt,
            Optional<Boolean> remoteWasDeleted,
            Optional<String> id,
            Optional<String> remoteId,
            Optional<OffsetDateTime> modifiedAt,
            Optional<Map<String, JsonNode>> fieldMappings,
            Optional<List<RemoteData>> remoteData,
            Optional<List<RemoteField>> remoteFields) {
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.owner = owner;
        this.account = account;
        this.stage = stage;
        this.status = status;
        this.lastActivityAt = lastActivityAt;
        this.closeDate = closeDate;
        this.remoteCreatedAt = remoteCreatedAt;
        this.remoteWasDeleted = remoteWasDeleted;
        this.id = id;
        this.remoteId = remoteId;
        this.modifiedAt = modifiedAt;
        this.fieldMappings = fieldMappings;
        this.remoteData = remoteData;
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
    public Optional<OpportunityOwner> getOwner() {
        return owner;
    }

    /**
     * @return The account of the opportunity.
     */
    @JsonProperty("account")
    public Optional<OpportunityAccount> getAccount() {
        return account;
    }

    /**
     * @return The stage of the opportunity.
     */
    @JsonProperty("stage")
    public Optional<OpportunityStage> getStage() {
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
    public Optional<OpportunityStatus> getStatus() {
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

    /**
     * @return When the third party's opportunity was created.
     */
    @JsonProperty("remote_created_at")
    public Optional<OffsetDateTime> getRemoteCreatedAt() {
        return remoteCreatedAt;
    }

    @JsonProperty("remote_was_deleted")
    public Optional<Boolean> getRemoteWasDeleted() {
        return remoteWasDeleted;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return The third-party API ID of the matching object.
     */
    @JsonProperty("remote_id")
    public Optional<String> getRemoteId() {
        return remoteId;
    }

    /**
     * @return This is the datetime that this object was last updated by Merge
     */
    @JsonProperty("modified_at")
    public Optional<OffsetDateTime> getModifiedAt() {
        return modifiedAt;
    }

    @JsonProperty("field_mappings")
    public Optional<Map<String, JsonNode>> getFieldMappings() {
        return fieldMappings;
    }

    @JsonProperty("remote_data")
    public Optional<List<RemoteData>> getRemoteData() {
        return remoteData;
    }

    @JsonProperty("remote_fields")
    public Optional<List<RemoteField>> getRemoteFields() {
        return remoteFields;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Opportunity && equalTo((Opportunity) other);
    }

    private boolean equalTo(Opportunity other) {
        return name.equals(other.name)
                && description.equals(other.description)
                && amount.equals(other.amount)
                && owner.equals(other.owner)
                && account.equals(other.account)
                && stage.equals(other.stage)
                && status.equals(other.status)
                && lastActivityAt.equals(other.lastActivityAt)
                && closeDate.equals(other.closeDate)
                && remoteCreatedAt.equals(other.remoteCreatedAt)
                && remoteWasDeleted.equals(other.remoteWasDeleted)
                && id.equals(other.id)
                && remoteId.equals(other.remoteId)
                && modifiedAt.equals(other.modifiedAt)
                && fieldMappings.equals(other.fieldMappings)
                && remoteData.equals(other.remoteData)
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
                this.remoteCreatedAt,
                this.remoteWasDeleted,
                this.id,
                this.remoteId,
                this.modifiedAt,
                this.fieldMappings,
                this.remoteData,
                this.remoteFields);
    }

    @Override
    public String toString() {
        return "Opportunity{" + "name: " + name + ", description: " + description + ", amount: " + amount + ", owner: "
                + owner + ", account: " + account + ", stage: " + stage + ", status: " + status + ", lastActivityAt: "
                + lastActivityAt + ", closeDate: " + closeDate + ", remoteCreatedAt: " + remoteCreatedAt
                + ", remoteWasDeleted: " + remoteWasDeleted + ", id: " + id + ", remoteId: " + remoteId
                + ", modifiedAt: " + modifiedAt + ", fieldMappings: " + fieldMappings + ", remoteData: " + remoteData
                + ", remoteFields: " + remoteFields + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> name = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<Integer> amount = Optional.empty();

        private Optional<OpportunityOwner> owner = Optional.empty();

        private Optional<OpportunityAccount> account = Optional.empty();

        private Optional<OpportunityStage> stage = Optional.empty();

        private Optional<OpportunityStatus> status = Optional.empty();

        private Optional<OffsetDateTime> lastActivityAt = Optional.empty();

        private Optional<OffsetDateTime> closeDate = Optional.empty();

        private Optional<OffsetDateTime> remoteCreatedAt = Optional.empty();

        private Optional<Boolean> remoteWasDeleted = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<Map<String, JsonNode>> fieldMappings = Optional.empty();

        private Optional<List<RemoteData>> remoteData = Optional.empty();

        private Optional<List<RemoteField>> remoteFields = Optional.empty();

        private Builder() {}

        public Builder from(Opportunity other) {
            name(other.getName());
            description(other.getDescription());
            amount(other.getAmount());
            owner(other.getOwner());
            account(other.getAccount());
            stage(other.getStage());
            status(other.getStatus());
            lastActivityAt(other.getLastActivityAt());
            closeDate(other.getCloseDate());
            remoteCreatedAt(other.getRemoteCreatedAt());
            remoteWasDeleted(other.getRemoteWasDeleted());
            id(other.getId());
            remoteId(other.getRemoteId());
            modifiedAt(other.getModifiedAt());
            fieldMappings(other.getFieldMappings());
            remoteData(other.getRemoteData());
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
        public Builder owner(Optional<OpportunityOwner> owner) {
            this.owner = owner;
            return this;
        }

        public Builder owner(OpportunityOwner owner) {
            this.owner = Optional.of(owner);
            return this;
        }

        @JsonSetter(value = "account", nulls = Nulls.SKIP)
        public Builder account(Optional<OpportunityAccount> account) {
            this.account = account;
            return this;
        }

        public Builder account(OpportunityAccount account) {
            this.account = Optional.of(account);
            return this;
        }

        @JsonSetter(value = "stage", nulls = Nulls.SKIP)
        public Builder stage(Optional<OpportunityStage> stage) {
            this.stage = stage;
            return this;
        }

        public Builder stage(OpportunityStage stage) {
            this.stage = Optional.of(stage);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<OpportunityStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(OpportunityStatus status) {
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

        @JsonSetter(value = "remote_created_at", nulls = Nulls.SKIP)
        public Builder remoteCreatedAt(Optional<OffsetDateTime> remoteCreatedAt) {
            this.remoteCreatedAt = remoteCreatedAt;
            return this;
        }

        public Builder remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
            this.remoteCreatedAt = Optional.of(remoteCreatedAt);
            return this;
        }

        @JsonSetter(value = "remote_was_deleted", nulls = Nulls.SKIP)
        public Builder remoteWasDeleted(Optional<Boolean> remoteWasDeleted) {
            this.remoteWasDeleted = remoteWasDeleted;
            return this;
        }

        public Builder remoteWasDeleted(Boolean remoteWasDeleted) {
            this.remoteWasDeleted = Optional.of(remoteWasDeleted);
            return this;
        }

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(String id) {
            this.id = Optional.of(id);
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

        @JsonSetter(value = "modified_at", nulls = Nulls.SKIP)
        public Builder modifiedAt(Optional<OffsetDateTime> modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public Builder modifiedAt(OffsetDateTime modifiedAt) {
            this.modifiedAt = Optional.of(modifiedAt);
            return this;
        }

        @JsonSetter(value = "field_mappings", nulls = Nulls.SKIP)
        public Builder fieldMappings(Optional<Map<String, JsonNode>> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }

        public Builder fieldMappings(Map<String, JsonNode> fieldMappings) {
            this.fieldMappings = Optional.of(fieldMappings);
            return this;
        }

        @JsonSetter(value = "remote_data", nulls = Nulls.SKIP)
        public Builder remoteData(Optional<List<RemoteData>> remoteData) {
            this.remoteData = remoteData;
            return this;
        }

        public Builder remoteData(List<RemoteData> remoteData) {
            this.remoteData = Optional.of(remoteData);
            return this;
        }

        @JsonSetter(value = "remote_fields", nulls = Nulls.SKIP)
        public Builder remoteFields(Optional<List<RemoteField>> remoteFields) {
            this.remoteFields = remoteFields;
            return this;
        }

        public Builder remoteFields(List<RemoteField> remoteFields) {
            this.remoteFields = Optional.of(remoteFields);
            return this;
        }

        public Opportunity build() {
            return new Opportunity(
                    name,
                    description,
                    amount,
                    owner,
                    account,
                    stage,
                    status,
                    lastActivityAt,
                    closeDate,
                    remoteCreatedAt,
                    remoteWasDeleted,
                    id,
                    remoteId,
                    modifiedAt,
                    fieldMappings,
                    remoteData,
                    remoteFields);
        }
    }
}
