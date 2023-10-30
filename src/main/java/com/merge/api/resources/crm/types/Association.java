package com.merge.api.resources.crm.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Association.Builder.class)
public final class Association {
    private final Optional<Map<String, JsonNode>> sourceObject;

    private final Optional<Map<String, JsonNode>> targetObject;

    private final Optional<AssociationAssociationType> associationType;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<OffsetDateTime> modifiedAt;

    private Association(
            Optional<Map<String, JsonNode>> sourceObject,
            Optional<Map<String, JsonNode>> targetObject,
            Optional<AssociationAssociationType> associationType,
            Optional<OffsetDateTime> createdAt,
            Optional<OffsetDateTime> modifiedAt) {
        this.sourceObject = sourceObject;
        this.targetObject = targetObject;
        this.associationType = associationType;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    @JsonProperty("source_object")
    public Optional<Map<String, JsonNode>> getSourceObject() {
        return sourceObject;
    }

    @JsonProperty("target_object")
    public Optional<Map<String, JsonNode>> getTargetObject() {
        return targetObject;
    }

    @JsonProperty("association_type")
    public Optional<AssociationAssociationType> getAssociationType() {
        return associationType;
    }

    @JsonProperty("created_at")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
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
        return other instanceof Association && equalTo((Association) other);
    }

    private boolean equalTo(Association other) {
        return sourceObject.equals(other.sourceObject)
                && targetObject.equals(other.targetObject)
                && associationType.equals(other.associationType)
                && createdAt.equals(other.createdAt)
                && modifiedAt.equals(other.modifiedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.sourceObject, this.targetObject, this.associationType, this.createdAt, this.modifiedAt);
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
        private Optional<Map<String, JsonNode>> sourceObject = Optional.empty();

        private Optional<Map<String, JsonNode>> targetObject = Optional.empty();

        private Optional<AssociationAssociationType> associationType = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Builder() {}

        public Builder from(Association other) {
            sourceObject(other.getSourceObject());
            targetObject(other.getTargetObject());
            associationType(other.getAssociationType());
            createdAt(other.getCreatedAt());
            modifiedAt(other.getModifiedAt());
            return this;
        }

        @JsonSetter(value = "source_object", nulls = Nulls.SKIP)
        public Builder sourceObject(Optional<Map<String, JsonNode>> sourceObject) {
            this.sourceObject = sourceObject;
            return this;
        }

        public Builder sourceObject(Map<String, JsonNode> sourceObject) {
            this.sourceObject = Optional.of(sourceObject);
            return this;
        }

        @JsonSetter(value = "target_object", nulls = Nulls.SKIP)
        public Builder targetObject(Optional<Map<String, JsonNode>> targetObject) {
            this.targetObject = targetObject;
            return this;
        }

        public Builder targetObject(Map<String, JsonNode> targetObject) {
            this.targetObject = Optional.of(targetObject);
            return this;
        }

        @JsonSetter(value = "association_type", nulls = Nulls.SKIP)
        public Builder associationType(Optional<AssociationAssociationType> associationType) {
            this.associationType = associationType;
            return this;
        }

        public Builder associationType(AssociationAssociationType associationType) {
            this.associationType = Optional.of(associationType);
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

        public Association build() {
            return new Association(sourceObject, targetObject, associationType, createdAt, modifiedAt);
        }
    }
}
