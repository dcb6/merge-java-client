/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.ticketing.types;

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
@JsonDeserialize(builder = FieldMappingApiInstanceResponse.Builder.class)
public final class FieldMappingApiInstanceResponse {
    private final Optional<List<FieldMappingApiInstance>> ticket;

    private final Optional<List<FieldMappingApiInstance>> comment;

    private final Optional<List<FieldMappingApiInstance>> project;

    private final Optional<List<FieldMappingApiInstance>> collection;

    private final Optional<List<FieldMappingApiInstance>> user;

    private final Optional<List<FieldMappingApiInstance>> role;

    private final Optional<List<FieldMappingApiInstance>> account;

    private final Optional<List<FieldMappingApiInstance>> team;

    private final Optional<List<FieldMappingApiInstance>> attachment;

    private final Optional<List<FieldMappingApiInstance>> tag;

    private final Optional<List<FieldMappingApiInstance>> contact;

    private final Map<String, Object> additionalProperties;

    private FieldMappingApiInstanceResponse(
            Optional<List<FieldMappingApiInstance>> ticket,
            Optional<List<FieldMappingApiInstance>> comment,
            Optional<List<FieldMappingApiInstance>> project,
            Optional<List<FieldMappingApiInstance>> collection,
            Optional<List<FieldMappingApiInstance>> user,
            Optional<List<FieldMappingApiInstance>> role,
            Optional<List<FieldMappingApiInstance>> account,
            Optional<List<FieldMappingApiInstance>> team,
            Optional<List<FieldMappingApiInstance>> attachment,
            Optional<List<FieldMappingApiInstance>> tag,
            Optional<List<FieldMappingApiInstance>> contact,
            Map<String, Object> additionalProperties) {
        this.ticket = ticket;
        this.comment = comment;
        this.project = project;
        this.collection = collection;
        this.user = user;
        this.role = role;
        this.account = account;
        this.team = team;
        this.attachment = attachment;
        this.tag = tag;
        this.contact = contact;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("Ticket")
    public Optional<List<FieldMappingApiInstance>> getTicket() {
        return ticket;
    }

    @JsonProperty("Comment")
    public Optional<List<FieldMappingApiInstance>> getComment() {
        return comment;
    }

    @JsonProperty("Project")
    public Optional<List<FieldMappingApiInstance>> getProject() {
        return project;
    }

    @JsonProperty("Collection")
    public Optional<List<FieldMappingApiInstance>> getCollection() {
        return collection;
    }

    @JsonProperty("User")
    public Optional<List<FieldMappingApiInstance>> getUser() {
        return user;
    }

    @JsonProperty("Role")
    public Optional<List<FieldMappingApiInstance>> getRole() {
        return role;
    }

    @JsonProperty("Account")
    public Optional<List<FieldMappingApiInstance>> getAccount() {
        return account;
    }

    @JsonProperty("Team")
    public Optional<List<FieldMappingApiInstance>> getTeam() {
        return team;
    }

    @JsonProperty("Attachment")
    public Optional<List<FieldMappingApiInstance>> getAttachment() {
        return attachment;
    }

    @JsonProperty("Tag")
    public Optional<List<FieldMappingApiInstance>> getTag() {
        return tag;
    }

    @JsonProperty("Contact")
    public Optional<List<FieldMappingApiInstance>> getContact() {
        return contact;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FieldMappingApiInstanceResponse && equalTo((FieldMappingApiInstanceResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FieldMappingApiInstanceResponse other) {
        return ticket.equals(other.ticket)
                && comment.equals(other.comment)
                && project.equals(other.project)
                && collection.equals(other.collection)
                && user.equals(other.user)
                && role.equals(other.role)
                && account.equals(other.account)
                && team.equals(other.team)
                && attachment.equals(other.attachment)
                && tag.equals(other.tag)
                && contact.equals(other.contact);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.ticket,
                this.comment,
                this.project,
                this.collection,
                this.user,
                this.role,
                this.account,
                this.team,
                this.attachment,
                this.tag,
                this.contact);
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
        private Optional<List<FieldMappingApiInstance>> ticket = Optional.empty();

        private Optional<List<FieldMappingApiInstance>> comment = Optional.empty();

        private Optional<List<FieldMappingApiInstance>> project = Optional.empty();

        private Optional<List<FieldMappingApiInstance>> collection = Optional.empty();

        private Optional<List<FieldMappingApiInstance>> user = Optional.empty();

        private Optional<List<FieldMappingApiInstance>> role = Optional.empty();

        private Optional<List<FieldMappingApiInstance>> account = Optional.empty();

        private Optional<List<FieldMappingApiInstance>> team = Optional.empty();

        private Optional<List<FieldMappingApiInstance>> attachment = Optional.empty();

        private Optional<List<FieldMappingApiInstance>> tag = Optional.empty();

        private Optional<List<FieldMappingApiInstance>> contact = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(FieldMappingApiInstanceResponse other) {
            ticket(other.getTicket());
            comment(other.getComment());
            project(other.getProject());
            collection(other.getCollection());
            user(other.getUser());
            role(other.getRole());
            account(other.getAccount());
            team(other.getTeam());
            attachment(other.getAttachment());
            tag(other.getTag());
            contact(other.getContact());
            return this;
        }

        @JsonSetter(value = "Ticket", nulls = Nulls.SKIP)
        public Builder ticket(Optional<List<FieldMappingApiInstance>> ticket) {
            this.ticket = ticket;
            return this;
        }

        public Builder ticket(List<FieldMappingApiInstance> ticket) {
            this.ticket = Optional.of(ticket);
            return this;
        }

        @JsonSetter(value = "Comment", nulls = Nulls.SKIP)
        public Builder comment(Optional<List<FieldMappingApiInstance>> comment) {
            this.comment = comment;
            return this;
        }

        public Builder comment(List<FieldMappingApiInstance> comment) {
            this.comment = Optional.of(comment);
            return this;
        }

        @JsonSetter(value = "Project", nulls = Nulls.SKIP)
        public Builder project(Optional<List<FieldMappingApiInstance>> project) {
            this.project = project;
            return this;
        }

        public Builder project(List<FieldMappingApiInstance> project) {
            this.project = Optional.of(project);
            return this;
        }

        @JsonSetter(value = "Collection", nulls = Nulls.SKIP)
        public Builder collection(Optional<List<FieldMappingApiInstance>> collection) {
            this.collection = collection;
            return this;
        }

        public Builder collection(List<FieldMappingApiInstance> collection) {
            this.collection = Optional.of(collection);
            return this;
        }

        @JsonSetter(value = "User", nulls = Nulls.SKIP)
        public Builder user(Optional<List<FieldMappingApiInstance>> user) {
            this.user = user;
            return this;
        }

        public Builder user(List<FieldMappingApiInstance> user) {
            this.user = Optional.of(user);
            return this;
        }

        @JsonSetter(value = "Role", nulls = Nulls.SKIP)
        public Builder role(Optional<List<FieldMappingApiInstance>> role) {
            this.role = role;
            return this;
        }

        public Builder role(List<FieldMappingApiInstance> role) {
            this.role = Optional.of(role);
            return this;
        }

        @JsonSetter(value = "Account", nulls = Nulls.SKIP)
        public Builder account(Optional<List<FieldMappingApiInstance>> account) {
            this.account = account;
            return this;
        }

        public Builder account(List<FieldMappingApiInstance> account) {
            this.account = Optional.of(account);
            return this;
        }

        @JsonSetter(value = "Team", nulls = Nulls.SKIP)
        public Builder team(Optional<List<FieldMappingApiInstance>> team) {
            this.team = team;
            return this;
        }

        public Builder team(List<FieldMappingApiInstance> team) {
            this.team = Optional.of(team);
            return this;
        }

        @JsonSetter(value = "Attachment", nulls = Nulls.SKIP)
        public Builder attachment(Optional<List<FieldMappingApiInstance>> attachment) {
            this.attachment = attachment;
            return this;
        }

        public Builder attachment(List<FieldMappingApiInstance> attachment) {
            this.attachment = Optional.of(attachment);
            return this;
        }

        @JsonSetter(value = "Tag", nulls = Nulls.SKIP)
        public Builder tag(Optional<List<FieldMappingApiInstance>> tag) {
            this.tag = tag;
            return this;
        }

        public Builder tag(List<FieldMappingApiInstance> tag) {
            this.tag = Optional.of(tag);
            return this;
        }

        @JsonSetter(value = "Contact", nulls = Nulls.SKIP)
        public Builder contact(Optional<List<FieldMappingApiInstance>> contact) {
            this.contact = contact;
            return this;
        }

        public Builder contact(List<FieldMappingApiInstance> contact) {
            this.contact = Optional.of(contact);
            return this;
        }

        public FieldMappingApiInstanceResponse build() {
            return new FieldMappingApiInstanceResponse(
                    ticket,
                    comment,
                    project,
                    collection,
                    user,
                    role,
                    account,
                    team,
                    attachment,
                    tag,
                    contact,
                    additionalProperties);
        }
    }
}
