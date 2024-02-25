/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.ticketing.scopes.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import com.merge.api.resources.ticketing.types.IndividualCommonModelScopeDeserializerRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LinkedAccountCommonModelScopeDeserializerRequest.Builder.class)
public final class LinkedAccountCommonModelScopeDeserializerRequest {
    private final List<IndividualCommonModelScopeDeserializerRequest> commonModels;

    private final Map<String, Object> additionalProperties;

    private LinkedAccountCommonModelScopeDeserializerRequest(
            List<IndividualCommonModelScopeDeserializerRequest> commonModels,
            Map<String, Object> additionalProperties) {
        this.commonModels = commonModels;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The common models you want to update the scopes for
     */
    @JsonProperty("common_models")
    public List<IndividualCommonModelScopeDeserializerRequest> getCommonModels() {
        return commonModels;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LinkedAccountCommonModelScopeDeserializerRequest
                && equalTo((LinkedAccountCommonModelScopeDeserializerRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(LinkedAccountCommonModelScopeDeserializerRequest other) {
        return commonModels.equals(other.commonModels);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.commonModels);
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
        private List<IndividualCommonModelScopeDeserializerRequest> commonModels = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(LinkedAccountCommonModelScopeDeserializerRequest other) {
            commonModels(other.getCommonModels());
            return this;
        }

        @JsonSetter(value = "common_models", nulls = Nulls.SKIP)
        public Builder commonModels(List<IndividualCommonModelScopeDeserializerRequest> commonModels) {
            this.commonModels.clear();
            this.commonModels.addAll(commonModels);
            return this;
        }

        public Builder addCommonModels(IndividualCommonModelScopeDeserializerRequest commonModels) {
            this.commonModels.add(commonModels);
            return this;
        }

        public Builder addAllCommonModels(List<IndividualCommonModelScopeDeserializerRequest> commonModels) {
            this.commonModels.addAll(commonModels);
            return this;
        }

        public LinkedAccountCommonModelScopeDeserializerRequest build() {
            return new LinkedAccountCommonModelScopeDeserializerRequest(commonModels, additionalProperties);
        }
    }
}
