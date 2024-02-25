/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.crm.types;

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

    private final Optional<List<ExternalTargetFieldApi>> contact;

    private final Optional<List<ExternalTargetFieldApi>> lead;

    private final Optional<List<ExternalTargetFieldApi>> note;

    private final Optional<List<ExternalTargetFieldApi>> opportunity;

    private final Optional<List<ExternalTargetFieldApi>> stage;

    private final Optional<List<ExternalTargetFieldApi>> user;

    private final Optional<List<ExternalTargetFieldApi>> task;

    private final Optional<List<ExternalTargetFieldApi>> engagement;

    private final Map<String, Object> additionalProperties;

    private ExternalTargetFieldApiResponse(
            Optional<List<ExternalTargetFieldApi>> account,
            Optional<List<ExternalTargetFieldApi>> contact,
            Optional<List<ExternalTargetFieldApi>> lead,
            Optional<List<ExternalTargetFieldApi>> note,
            Optional<List<ExternalTargetFieldApi>> opportunity,
            Optional<List<ExternalTargetFieldApi>> stage,
            Optional<List<ExternalTargetFieldApi>> user,
            Optional<List<ExternalTargetFieldApi>> task,
            Optional<List<ExternalTargetFieldApi>> engagement,
            Map<String, Object> additionalProperties) {
        this.account = account;
        this.contact = contact;
        this.lead = lead;
        this.note = note;
        this.opportunity = opportunity;
        this.stage = stage;
        this.user = user;
        this.task = task;
        this.engagement = engagement;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("Account")
    public Optional<List<ExternalTargetFieldApi>> getAccount() {
        return account;
    }

    @JsonProperty("Contact")
    public Optional<List<ExternalTargetFieldApi>> getContact() {
        return contact;
    }

    @JsonProperty("Lead")
    public Optional<List<ExternalTargetFieldApi>> getLead() {
        return lead;
    }

    @JsonProperty("Note")
    public Optional<List<ExternalTargetFieldApi>> getNote() {
        return note;
    }

    @JsonProperty("Opportunity")
    public Optional<List<ExternalTargetFieldApi>> getOpportunity() {
        return opportunity;
    }

    @JsonProperty("Stage")
    public Optional<List<ExternalTargetFieldApi>> getStage() {
        return stage;
    }

    @JsonProperty("User")
    public Optional<List<ExternalTargetFieldApi>> getUser() {
        return user;
    }

    @JsonProperty("Task")
    public Optional<List<ExternalTargetFieldApi>> getTask() {
        return task;
    }

    @JsonProperty("Engagement")
    public Optional<List<ExternalTargetFieldApi>> getEngagement() {
        return engagement;
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
                && contact.equals(other.contact)
                && lead.equals(other.lead)
                && note.equals(other.note)
                && opportunity.equals(other.opportunity)
                && stage.equals(other.stage)
                && user.equals(other.user)
                && task.equals(other.task)
                && engagement.equals(other.engagement);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.account,
                this.contact,
                this.lead,
                this.note,
                this.opportunity,
                this.stage,
                this.user,
                this.task,
                this.engagement);
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

        private Optional<List<ExternalTargetFieldApi>> contact = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> lead = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> note = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> opportunity = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> stage = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> user = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> task = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> engagement = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ExternalTargetFieldApiResponse other) {
            account(other.getAccount());
            contact(other.getContact());
            lead(other.getLead());
            note(other.getNote());
            opportunity(other.getOpportunity());
            stage(other.getStage());
            user(other.getUser());
            task(other.getTask());
            engagement(other.getEngagement());
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

        @JsonSetter(value = "Contact", nulls = Nulls.SKIP)
        public Builder contact(Optional<List<ExternalTargetFieldApi>> contact) {
            this.contact = contact;
            return this;
        }

        public Builder contact(List<ExternalTargetFieldApi> contact) {
            this.contact = Optional.of(contact);
            return this;
        }

        @JsonSetter(value = "Lead", nulls = Nulls.SKIP)
        public Builder lead(Optional<List<ExternalTargetFieldApi>> lead) {
            this.lead = lead;
            return this;
        }

        public Builder lead(List<ExternalTargetFieldApi> lead) {
            this.lead = Optional.of(lead);
            return this;
        }

        @JsonSetter(value = "Note", nulls = Nulls.SKIP)
        public Builder note(Optional<List<ExternalTargetFieldApi>> note) {
            this.note = note;
            return this;
        }

        public Builder note(List<ExternalTargetFieldApi> note) {
            this.note = Optional.of(note);
            return this;
        }

        @JsonSetter(value = "Opportunity", nulls = Nulls.SKIP)
        public Builder opportunity(Optional<List<ExternalTargetFieldApi>> opportunity) {
            this.opportunity = opportunity;
            return this;
        }

        public Builder opportunity(List<ExternalTargetFieldApi> opportunity) {
            this.opportunity = Optional.of(opportunity);
            return this;
        }

        @JsonSetter(value = "Stage", nulls = Nulls.SKIP)
        public Builder stage(Optional<List<ExternalTargetFieldApi>> stage) {
            this.stage = stage;
            return this;
        }

        public Builder stage(List<ExternalTargetFieldApi> stage) {
            this.stage = Optional.of(stage);
            return this;
        }

        @JsonSetter(value = "User", nulls = Nulls.SKIP)
        public Builder user(Optional<List<ExternalTargetFieldApi>> user) {
            this.user = user;
            return this;
        }

        public Builder user(List<ExternalTargetFieldApi> user) {
            this.user = Optional.of(user);
            return this;
        }

        @JsonSetter(value = "Task", nulls = Nulls.SKIP)
        public Builder task(Optional<List<ExternalTargetFieldApi>> task) {
            this.task = task;
            return this;
        }

        public Builder task(List<ExternalTargetFieldApi> task) {
            this.task = Optional.of(task);
            return this;
        }

        @JsonSetter(value = "Engagement", nulls = Nulls.SKIP)
        public Builder engagement(Optional<List<ExternalTargetFieldApi>> engagement) {
            this.engagement = engagement;
            return this;
        }

        public Builder engagement(List<ExternalTargetFieldApi> engagement) {
            this.engagement = Optional.of(engagement);
            return this;
        }

        public ExternalTargetFieldApiResponse build() {
            return new ExternalTargetFieldApiResponse(
                    account, contact, lead, note, opportunity, stage, user, task, engagement, additionalProperties);
        }
    }
}
