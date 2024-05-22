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
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CustomObjectClass.Builder.class)
public final class CustomObjectClass {
    private final Optional<String> id;

    private final Optional<String> remoteId;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<String> name;

    private final Optional<String> description;

    private final Optional<Map<String, Optional<String>>> labels;

    private final Optional<List<RemoteFieldClassForCustomObjectClass>> fields;

    private final Optional<List<Map<String, JsonNode>>> associationTypes;

    private final Map<String, Object> additionalProperties;

    private CustomObjectClass(
            Optional<String> id,
            Optional<String> remoteId,
            Optional<OffsetDateTime> createdAt,
            Optional<OffsetDateTime> modifiedAt,
            Optional<String> name,
            Optional<String> description,
            Optional<Map<String, Optional<String>>> labels,
            Optional<List<RemoteFieldClassForCustomObjectClass>> fields,
            Optional<List<Map<String, JsonNode>>> associationTypes,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.remoteId = remoteId;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.name = name;
        this.description = description;
        this.labels = labels;
        this.fields = fields;
        this.associationTypes = associationTypes;
        this.additionalProperties = additionalProperties;
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

    @JsonProperty("created_at")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("modified_at")
    public Optional<OffsetDateTime> getModifiedAt() {
        return modifiedAt;
    }

    /**
     * @return The custom object class's name.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return The custom object class's description.
     */
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    /**
     * @return The custom object class's singular and plural labels.
     */
    @JsonProperty("labels")
    public Optional<Map<String, Optional<String>>> getLabels() {
        return labels;
    }

    @JsonProperty("fields")
    public Optional<List<RemoteFieldClassForCustomObjectClass>> getFields() {
        return fields;
    }

    /**
     * @return The types of associations with other models that the custom object class can have.
     */
    @JsonProperty("association_types")
    public Optional<List<Map<String, JsonNode>>> getAssociationTypes() {
        return associationTypes;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CustomObjectClass && equalTo((CustomObjectClass) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CustomObjectClass other) {
        return id.equals(other.id)
                && remoteId.equals(other.remoteId)
                && createdAt.equals(other.createdAt)
                && modifiedAt.equals(other.modifiedAt)
                && name.equals(other.name)
                && description.equals(other.description)
                && labels.equals(other.labels)
                && fields.equals(other.fields)
                && associationTypes.equals(other.associationTypes);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.remoteId,
                this.createdAt,
                this.modifiedAt,
                this.name,
                this.description,
                this.labels,
                this.fields,
                this.associationTypes);
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
        private Optional<String> id = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<Map<String, Optional<String>>> labels = Optional.empty();

        private Optional<List<RemoteFieldClassForCustomObjectClass>> fields = Optional.empty();

        private Optional<List<Map<String, JsonNode>>> associationTypes = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CustomObjectClass other) {
            id(other.getId());
            remoteId(other.getRemoteId());
            createdAt(other.getCreatedAt());
            modifiedAt(other.getModifiedAt());
            name(other.getName());
            description(other.getDescription());
            labels(other.getLabels());
            fields(other.getFields());
            associationTypes(other.getAssociationTypes());
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

        @JsonSetter(value = "created_at", nulls = Nulls.SKIP)
        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = Optional.of(createdAt);
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

        @JsonSetter(value = "labels", nulls = Nulls.SKIP)
        public Builder labels(Optional<Map<String, Optional<String>>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(Map<String, Optional<String>> labels) {
            this.labels = Optional.of(labels);
            return this;
        }

        @JsonSetter(value = "fields", nulls = Nulls.SKIP)
        public Builder fields(Optional<List<RemoteFieldClassForCustomObjectClass>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder fields(List<RemoteFieldClassForCustomObjectClass> fields) {
            this.fields = Optional.of(fields);
            return this;
        }

        @JsonSetter(value = "association_types", nulls = Nulls.SKIP)
        public Builder associationTypes(Optional<List<Map<String, JsonNode>>> associationTypes) {
            this.associationTypes = associationTypes;
            return this;
        }

        public Builder associationTypes(List<Map<String, JsonNode>> associationTypes) {
            this.associationTypes = Optional.of(associationTypes);
            return this;
        }

        public CustomObjectClass build() {
            return new CustomObjectClass(
                    id,
                    remoteId,
                    createdAt,
                    modifiedAt,
                    name,
                    description,
                    labels,
                    fields,
                    associationTypes,
                    additionalProperties);
        }
    }
}
