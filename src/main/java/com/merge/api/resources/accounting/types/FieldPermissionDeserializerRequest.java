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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = FieldPermissionDeserializerRequest.Builder.class)
public final class FieldPermissionDeserializerRequest {
    private final Optional<List<JsonNode>> enabled;

    private final Optional<List<JsonNode>> disabled;

    private final Map<String, Object> additionalProperties;

    private FieldPermissionDeserializerRequest(
            Optional<List<JsonNode>> enabled,
            Optional<List<JsonNode>> disabled,
            Map<String, Object> additionalProperties) {
        this.enabled = enabled;
        this.disabled = disabled;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("enabled")
    public Optional<List<JsonNode>> getEnabled() {
        return enabled;
    }

    @JsonProperty("disabled")
    public Optional<List<JsonNode>> getDisabled() {
        return disabled;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FieldPermissionDeserializerRequest
                && equalTo((FieldPermissionDeserializerRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FieldPermissionDeserializerRequest other) {
        return enabled.equals(other.enabled) && disabled.equals(other.disabled);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.enabled, this.disabled);
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
        private Optional<List<JsonNode>> enabled = Optional.empty();

        private Optional<List<JsonNode>> disabled = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(FieldPermissionDeserializerRequest other) {
            enabled(other.getEnabled());
            disabled(other.getDisabled());
            return this;
        }

        @JsonSetter(value = "enabled", nulls = Nulls.SKIP)
        public Builder enabled(Optional<List<JsonNode>> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(List<JsonNode> enabled) {
            this.enabled = Optional.of(enabled);
            return this;
        }

        @JsonSetter(value = "disabled", nulls = Nulls.SKIP)
        public Builder disabled(Optional<List<JsonNode>> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder disabled(List<JsonNode> disabled) {
            this.disabled = Optional.of(disabled);
            return this;
        }

        public FieldPermissionDeserializerRequest build() {
            return new FieldPermissionDeserializerRequest(enabled, disabled, additionalProperties);
        }
    }
}
