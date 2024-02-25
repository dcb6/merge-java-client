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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = FieldMappingApiInstance.Builder.class)
public final class FieldMappingApiInstance {
    private final Optional<String> id;

    private final Optional<Boolean> isIntegrationWide;

    private final Optional<FieldMappingApiInstanceTargetField> targetField;

    private final Optional<FieldMappingApiInstanceRemoteField> remoteField;

    private final Map<String, Object> additionalProperties;

    private FieldMappingApiInstance(
            Optional<String> id,
            Optional<Boolean> isIntegrationWide,
            Optional<FieldMappingApiInstanceTargetField> targetField,
            Optional<FieldMappingApiInstanceRemoteField> remoteField,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.isIntegrationWide = isIntegrationWide;
        this.targetField = targetField;
        this.remoteField = remoteField;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    @JsonProperty("is_integration_wide")
    public Optional<Boolean> getIsIntegrationWide() {
        return isIntegrationWide;
    }

    @JsonProperty("target_field")
    public Optional<FieldMappingApiInstanceTargetField> getTargetField() {
        return targetField;
    }

    @JsonProperty("remote_field")
    public Optional<FieldMappingApiInstanceRemoteField> getRemoteField() {
        return remoteField;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FieldMappingApiInstance && equalTo((FieldMappingApiInstance) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FieldMappingApiInstance other) {
        return id.equals(other.id)
                && isIntegrationWide.equals(other.isIntegrationWide)
                && targetField.equals(other.targetField)
                && remoteField.equals(other.remoteField);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.isIntegrationWide, this.targetField, this.remoteField);
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

        private Optional<Boolean> isIntegrationWide = Optional.empty();

        private Optional<FieldMappingApiInstanceTargetField> targetField = Optional.empty();

        private Optional<FieldMappingApiInstanceRemoteField> remoteField = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(FieldMappingApiInstance other) {
            id(other.getId());
            isIntegrationWide(other.getIsIntegrationWide());
            targetField(other.getTargetField());
            remoteField(other.getRemoteField());
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

        @JsonSetter(value = "is_integration_wide", nulls = Nulls.SKIP)
        public Builder isIntegrationWide(Optional<Boolean> isIntegrationWide) {
            this.isIntegrationWide = isIntegrationWide;
            return this;
        }

        public Builder isIntegrationWide(Boolean isIntegrationWide) {
            this.isIntegrationWide = Optional.of(isIntegrationWide);
            return this;
        }

        @JsonSetter(value = "target_field", nulls = Nulls.SKIP)
        public Builder targetField(Optional<FieldMappingApiInstanceTargetField> targetField) {
            this.targetField = targetField;
            return this;
        }

        public Builder targetField(FieldMappingApiInstanceTargetField targetField) {
            this.targetField = Optional.of(targetField);
            return this;
        }

        @JsonSetter(value = "remote_field", nulls = Nulls.SKIP)
        public Builder remoteField(Optional<FieldMappingApiInstanceRemoteField> remoteField) {
            this.remoteField = remoteField;
            return this;
        }

        public Builder remoteField(FieldMappingApiInstanceRemoteField remoteField) {
            this.remoteField = Optional.of(remoteField);
            return this;
        }

        public FieldMappingApiInstance build() {
            return new FieldMappingApiInstance(id, isIntegrationWide, targetField, remoteField, additionalProperties);
        }
    }
}
