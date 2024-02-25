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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AsyncPassthroughReciept.Builder.class)
public final class AsyncPassthroughReciept {
    private final String asyncPassthroughReceiptId;

    private final Map<String, Object> additionalProperties;

    private AsyncPassthroughReciept(String asyncPassthroughReceiptId, Map<String, Object> additionalProperties) {
        this.asyncPassthroughReceiptId = asyncPassthroughReceiptId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("async_passthrough_receipt_id")
    public String getAsyncPassthroughReceiptId() {
        return asyncPassthroughReceiptId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AsyncPassthroughReciept && equalTo((AsyncPassthroughReciept) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AsyncPassthroughReciept other) {
        return asyncPassthroughReceiptId.equals(other.asyncPassthroughReceiptId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.asyncPassthroughReceiptId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AsyncPassthroughReceiptIdStage builder() {
        return new Builder();
    }

    public interface AsyncPassthroughReceiptIdStage {
        _FinalStage asyncPassthroughReceiptId(String asyncPassthroughReceiptId);

        Builder from(AsyncPassthroughReciept other);
    }

    public interface _FinalStage {
        AsyncPassthroughReciept build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AsyncPassthroughReceiptIdStage, _FinalStage {
        private String asyncPassthroughReceiptId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AsyncPassthroughReciept other) {
            asyncPassthroughReceiptId(other.getAsyncPassthroughReceiptId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("async_passthrough_receipt_id")
        public _FinalStage asyncPassthroughReceiptId(String asyncPassthroughReceiptId) {
            this.asyncPassthroughReceiptId = asyncPassthroughReceiptId;
            return this;
        }

        @java.lang.Override
        public AsyncPassthroughReciept build() {
            return new AsyncPassthroughReciept(asyncPassthroughReceiptId, additionalProperties);
        }
    }
}
