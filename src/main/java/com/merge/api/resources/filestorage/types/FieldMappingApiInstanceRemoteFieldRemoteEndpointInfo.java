/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.filestorage.types;

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
@JsonDeserialize(builder = FieldMappingApiInstanceRemoteFieldRemoteEndpointInfo.Builder.class)
public final class FieldMappingApiInstanceRemoteFieldRemoteEndpointInfo {
    private final Optional<String> method;

    private final Optional<String> urlPath;

    private final Optional<List<String>> fieldTraversalPath;

    private final Map<String, Object> additionalProperties;

    private FieldMappingApiInstanceRemoteFieldRemoteEndpointInfo(
            Optional<String> method,
            Optional<String> urlPath,
            Optional<List<String>> fieldTraversalPath,
            Map<String, Object> additionalProperties) {
        this.method = method;
        this.urlPath = urlPath;
        this.fieldTraversalPath = fieldTraversalPath;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("method")
    public Optional<String> getMethod() {
        return method;
    }

    @JsonProperty("url_path")
    public Optional<String> getUrlPath() {
        return urlPath;
    }

    @JsonProperty("field_traversal_path")
    public Optional<List<String>> getFieldTraversalPath() {
        return fieldTraversalPath;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FieldMappingApiInstanceRemoteFieldRemoteEndpointInfo
                && equalTo((FieldMappingApiInstanceRemoteFieldRemoteEndpointInfo) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FieldMappingApiInstanceRemoteFieldRemoteEndpointInfo other) {
        return method.equals(other.method)
                && urlPath.equals(other.urlPath)
                && fieldTraversalPath.equals(other.fieldTraversalPath);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.method, this.urlPath, this.fieldTraversalPath);
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
        private Optional<String> method = Optional.empty();

        private Optional<String> urlPath = Optional.empty();

        private Optional<List<String>> fieldTraversalPath = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(FieldMappingApiInstanceRemoteFieldRemoteEndpointInfo other) {
            method(other.getMethod());
            urlPath(other.getUrlPath());
            fieldTraversalPath(other.getFieldTraversalPath());
            return this;
        }

        @JsonSetter(value = "method", nulls = Nulls.SKIP)
        public Builder method(Optional<String> method) {
            this.method = method;
            return this;
        }

        public Builder method(String method) {
            this.method = Optional.of(method);
            return this;
        }

        @JsonSetter(value = "url_path", nulls = Nulls.SKIP)
        public Builder urlPath(Optional<String> urlPath) {
            this.urlPath = urlPath;
            return this;
        }

        public Builder urlPath(String urlPath) {
            this.urlPath = Optional.of(urlPath);
            return this;
        }

        @JsonSetter(value = "field_traversal_path", nulls = Nulls.SKIP)
        public Builder fieldTraversalPath(Optional<List<String>> fieldTraversalPath) {
            this.fieldTraversalPath = fieldTraversalPath;
            return this;
        }

        public Builder fieldTraversalPath(List<String> fieldTraversalPath) {
            this.fieldTraversalPath = Optional.of(fieldTraversalPath);
            return this;
        }

        public FieldMappingApiInstanceRemoteFieldRemoteEndpointInfo build() {
            return new FieldMappingApiInstanceRemoteFieldRemoteEndpointInfo(
                    method, urlPath, fieldTraversalPath, additionalProperties);
        }
    }
}
