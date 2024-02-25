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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = RemoteFieldRequest.Builder.class)
public final class RemoteFieldRequest {
    private final RemoteFieldRequestRemoteFieldClass remoteFieldClass;

    private final Optional<String> value;

    private final Map<String, Object> additionalProperties;

    private RemoteFieldRequest(
            RemoteFieldRequestRemoteFieldClass remoteFieldClass,
            Optional<String> value,
            Map<String, Object> additionalProperties) {
        this.remoteFieldClass = remoteFieldClass;
        this.value = value;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("remote_field_class")
    public RemoteFieldRequestRemoteFieldClass getRemoteFieldClass() {
        return remoteFieldClass;
    }

    @JsonProperty("value")
    public Optional<String> getValue() {
        return value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RemoteFieldRequest && equalTo((RemoteFieldRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RemoteFieldRequest other) {
        return remoteFieldClass.equals(other.remoteFieldClass) && value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.remoteFieldClass, this.value);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RemoteFieldClassStage builder() {
        return new Builder();
    }

    public interface RemoteFieldClassStage {
        _FinalStage remoteFieldClass(RemoteFieldRequestRemoteFieldClass remoteFieldClass);

        Builder from(RemoteFieldRequest other);
    }

    public interface _FinalStage {
        RemoteFieldRequest build();

        _FinalStage value(Optional<String> value);

        _FinalStage value(String value);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements RemoteFieldClassStage, _FinalStage {
        private RemoteFieldRequestRemoteFieldClass remoteFieldClass;

        private Optional<String> value = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(RemoteFieldRequest other) {
            remoteFieldClass(other.getRemoteFieldClass());
            value(other.getValue());
            return this;
        }

        @java.lang.Override
        @JsonSetter("remote_field_class")
        public _FinalStage remoteFieldClass(RemoteFieldRequestRemoteFieldClass remoteFieldClass) {
            this.remoteFieldClass = remoteFieldClass;
            return this;
        }

        @java.lang.Override
        public _FinalStage value(String value) {
            this.value = Optional.of(value);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "value", nulls = Nulls.SKIP)
        public _FinalStage value(Optional<String> value) {
            this.value = value;
            return this;
        }

        @java.lang.Override
        public RemoteFieldRequest build() {
            return new RemoteFieldRequest(remoteFieldClass, value, additionalProperties);
        }
    }
}
