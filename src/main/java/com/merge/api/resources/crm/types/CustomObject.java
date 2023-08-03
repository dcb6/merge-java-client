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
@JsonDeserialize(builder = CustomObject.Builder.class)
public final class CustomObject {
    private final Optional<String> objectClass;

    private final Optional<Map<String, JsonNode>> fields;

    private final Optional<String> remoteId;

    private final Optional<String> id;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<List<RemoteField>> remoteFields;

    private CustomObject(
            Optional<String> objectClass,
            Optional<Map<String, JsonNode>> fields,
            Optional<String> remoteId,
            Optional<String> id,
            Optional<OffsetDateTime> modifiedAt,
            Optional<List<RemoteField>> remoteFields) {
        this.objectClass = objectClass;
        this.fields = fields;
        this.remoteId = remoteId;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.remoteFields = remoteFields;
    }

    @JsonProperty("object_class")
    public Optional<String> getObjectClass() {
        return objectClass;
    }

    @JsonProperty("fields")
    public Optional<Map<String, JsonNode>> getFields() {
        return fields;
    }

    /**
     * @return The third-party API ID of the matching object.
     */
    @JsonProperty("remote_id")
    public Optional<String> getRemoteId() {
        return remoteId;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return This is the datetime that this object was last updated by Merge
     */
    @JsonProperty("modified_at")
    public Optional<OffsetDateTime> getModifiedAt() {
        return modifiedAt;
    }

    @JsonProperty("remote_fields")
    public Optional<List<RemoteField>> getRemoteFields() {
        return remoteFields;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CustomObject && equalTo((CustomObject) other);
    }

    private boolean equalTo(CustomObject other) {
        return objectClass.equals(other.objectClass)
                && fields.equals(other.fields)
                && remoteId.equals(other.remoteId)
                && id.equals(other.id)
                && modifiedAt.equals(other.modifiedAt)
                && remoteFields.equals(other.remoteFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.objectClass, this.fields, this.remoteId, this.id, this.modifiedAt, this.remoteFields);
    }

    @Override
    public String toString() {
        return "CustomObject{" + "objectClass: " + objectClass + ", fields: " + fields + ", remoteId: " + remoteId
                + ", id: " + id + ", modifiedAt: " + modifiedAt + ", remoteFields: " + remoteFields + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> objectClass = Optional.empty();

        private Optional<Map<String, JsonNode>> fields = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<List<RemoteField>> remoteFields = Optional.empty();

        private Builder() {}

        public Builder from(CustomObject other) {
            objectClass(other.getObjectClass());
            fields(other.getFields());
            remoteId(other.getRemoteId());
            id(other.getId());
            modifiedAt(other.getModifiedAt());
            remoteFields(other.getRemoteFields());
            return this;
        }

        @JsonSetter(value = "object_class", nulls = Nulls.SKIP)
        public Builder objectClass(Optional<String> objectClass) {
            this.objectClass = objectClass;
            return this;
        }

        public Builder objectClass(String objectClass) {
            this.objectClass = Optional.of(objectClass);
            return this;
        }

        @JsonSetter(value = "fields", nulls = Nulls.SKIP)
        public Builder fields(Optional<Map<String, JsonNode>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder fields(Map<String, JsonNode> fields) {
            this.fields = Optional.of(fields);
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

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(String id) {
            this.id = Optional.of(id);
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

        @JsonSetter(value = "remote_fields", nulls = Nulls.SKIP)
        public Builder remoteFields(Optional<List<RemoteField>> remoteFields) {
            this.remoteFields = remoteFields;
            return this;
        }

        public Builder remoteFields(List<RemoteField> remoteFields) {
            this.remoteFields = Optional.of(remoteFields);
            return this;
        }

        public CustomObject build() {
            return new CustomObject(objectClass, fields, remoteId, id, modifiedAt, remoteFields);
        }
    }
}