/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.crm.associations.requests;

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
@JsonDeserialize(builder = CustomObjectClassesCustomObjectsAssociationsUpdateRequest.Builder.class)
public final class CustomObjectClassesCustomObjectsAssociationsUpdateRequest {
    private final Optional<Boolean> isDebugMode;

    private final Optional<Boolean> runAsync;

    private final Map<String, Object> additionalProperties;

    private CustomObjectClassesCustomObjectsAssociationsUpdateRequest(
            Optional<Boolean> isDebugMode, Optional<Boolean> runAsync, Map<String, Object> additionalProperties) {
        this.isDebugMode = isDebugMode;
        this.runAsync = runAsync;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Whether to include debug fields (such as log file links) in the response.
     */
    @JsonProperty("is_debug_mode")
    public Optional<Boolean> getIsDebugMode() {
        return isDebugMode;
    }

    /**
     * @return Whether or not third-party updates should be run asynchronously.
     */
    @JsonProperty("run_async")
    public Optional<Boolean> getRunAsync() {
        return runAsync;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CustomObjectClassesCustomObjectsAssociationsUpdateRequest
                && equalTo((CustomObjectClassesCustomObjectsAssociationsUpdateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CustomObjectClassesCustomObjectsAssociationsUpdateRequest other) {
        return isDebugMode.equals(other.isDebugMode) && runAsync.equals(other.runAsync);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.isDebugMode, this.runAsync);
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
        private Optional<Boolean> isDebugMode = Optional.empty();

        private Optional<Boolean> runAsync = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CustomObjectClassesCustomObjectsAssociationsUpdateRequest other) {
            isDebugMode(other.getIsDebugMode());
            runAsync(other.getRunAsync());
            return this;
        }

        @JsonSetter(value = "is_debug_mode", nulls = Nulls.SKIP)
        public Builder isDebugMode(Optional<Boolean> isDebugMode) {
            this.isDebugMode = isDebugMode;
            return this;
        }

        public Builder isDebugMode(Boolean isDebugMode) {
            this.isDebugMode = Optional.of(isDebugMode);
            return this;
        }

        @JsonSetter(value = "run_async", nulls = Nulls.SKIP)
        public Builder runAsync(Optional<Boolean> runAsync) {
            this.runAsync = runAsync;
            return this;
        }

        public Builder runAsync(Boolean runAsync) {
            this.runAsync = Optional.of(runAsync);
            return this;
        }

        public CustomObjectClassesCustomObjectsAssociationsUpdateRequest build() {
            return new CustomObjectClassesCustomObjectsAssociationsUpdateRequest(
                    isDebugMode, runAsync, additionalProperties);
        }
    }
}
