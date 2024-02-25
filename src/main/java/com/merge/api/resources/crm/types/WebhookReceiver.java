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
@JsonDeserialize(builder = WebhookReceiver.Builder.class)
public final class WebhookReceiver {
    private final String event;

    private final boolean isActive;

    private final Optional<String> key;

    private final Map<String, Object> additionalProperties;

    private WebhookReceiver(
            String event, boolean isActive, Optional<String> key, Map<String, Object> additionalProperties) {
        this.event = event;
        this.isActive = isActive;
        this.key = key;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    @JsonProperty("is_active")
    public boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("key")
    public Optional<String> getKey() {
        return key;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WebhookReceiver && equalTo((WebhookReceiver) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(WebhookReceiver other) {
        return event.equals(other.event) && isActive == other.isActive && key.equals(other.key);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.event, this.isActive, this.key);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EventStage builder() {
        return new Builder();
    }

    public interface EventStage {
        IsActiveStage event(String event);

        Builder from(WebhookReceiver other);
    }

    public interface IsActiveStage {
        _FinalStage isActive(boolean isActive);
    }

    public interface _FinalStage {
        WebhookReceiver build();

        _FinalStage key(Optional<String> key);

        _FinalStage key(String key);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EventStage, IsActiveStage, _FinalStage {
        private String event;

        private boolean isActive;

        private Optional<String> key = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(WebhookReceiver other) {
            event(other.getEvent());
            isActive(other.getIsActive());
            key(other.getKey());
            return this;
        }

        @java.lang.Override
        @JsonSetter("event")
        public IsActiveStage event(String event) {
            this.event = event;
            return this;
        }

        @java.lang.Override
        @JsonSetter("is_active")
        public _FinalStage isActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        @java.lang.Override
        public _FinalStage key(String key) {
            this.key = Optional.of(key);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "key", nulls = Nulls.SKIP)
        public _FinalStage key(Optional<String> key) {
            this.key = key;
            return this;
        }

        @java.lang.Override
        public WebhookReceiver build() {
            return new WebhookReceiver(event, isActive, key, additionalProperties);
        }
    }
}
