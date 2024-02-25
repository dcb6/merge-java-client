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
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AdvancedMetadata.Builder.class)
public final class AdvancedMetadata {
    private final String id;

    private final Optional<String> displayName;

    private final Optional<String> description;

    private final Optional<Boolean> isRequired;

    private final Optional<Boolean> isCustom;

    private final Optional<List<JsonNode>> fieldChoices;

    private final Map<String, Object> additionalProperties;

    private AdvancedMetadata(
            String id,
            Optional<String> displayName,
            Optional<String> description,
            Optional<Boolean> isRequired,
            Optional<Boolean> isCustom,
            Optional<List<JsonNode>> fieldChoices,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.isRequired = isRequired;
        this.isCustom = isCustom;
        this.fieldChoices = fieldChoices;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("display_name")
    public Optional<String> getDisplayName() {
        return displayName;
    }

    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    @JsonProperty("is_required")
    public Optional<Boolean> getIsRequired() {
        return isRequired;
    }

    @JsonProperty("is_custom")
    public Optional<Boolean> getIsCustom() {
        return isCustom;
    }

    @JsonProperty("field_choices")
    public Optional<List<JsonNode>> getFieldChoices() {
        return fieldChoices;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AdvancedMetadata && equalTo((AdvancedMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AdvancedMetadata other) {
        return id.equals(other.id)
                && displayName.equals(other.displayName)
                && description.equals(other.description)
                && isRequired.equals(other.isRequired)
                && isCustom.equals(other.isCustom)
                && fieldChoices.equals(other.fieldChoices);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id, this.displayName, this.description, this.isRequired, this.isCustom, this.fieldChoices);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        _FinalStage id(String id);

        Builder from(AdvancedMetadata other);
    }

    public interface _FinalStage {
        AdvancedMetadata build();

        _FinalStage displayName(Optional<String> displayName);

        _FinalStage displayName(String displayName);

        _FinalStage description(Optional<String> description);

        _FinalStage description(String description);

        _FinalStage isRequired(Optional<Boolean> isRequired);

        _FinalStage isRequired(Boolean isRequired);

        _FinalStage isCustom(Optional<Boolean> isCustom);

        _FinalStage isCustom(Boolean isCustom);

        _FinalStage fieldChoices(Optional<List<JsonNode>> fieldChoices);

        _FinalStage fieldChoices(List<JsonNode> fieldChoices);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, _FinalStage {
        private String id;

        private Optional<List<JsonNode>> fieldChoices = Optional.empty();

        private Optional<Boolean> isCustom = Optional.empty();

        private Optional<Boolean> isRequired = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> displayName = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AdvancedMetadata other) {
            id(other.getId());
            displayName(other.getDisplayName());
            description(other.getDescription());
            isRequired(other.getIsRequired());
            isCustom(other.getIsCustom());
            fieldChoices(other.getFieldChoices());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public _FinalStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        public _FinalStage fieldChoices(List<JsonNode> fieldChoices) {
            this.fieldChoices = Optional.of(fieldChoices);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "field_choices", nulls = Nulls.SKIP)
        public _FinalStage fieldChoices(Optional<List<JsonNode>> fieldChoices) {
            this.fieldChoices = fieldChoices;
            return this;
        }

        @java.lang.Override
        public _FinalStage isCustom(Boolean isCustom) {
            this.isCustom = Optional.of(isCustom);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "is_custom", nulls = Nulls.SKIP)
        public _FinalStage isCustom(Optional<Boolean> isCustom) {
            this.isCustom = isCustom;
            return this;
        }

        @java.lang.Override
        public _FinalStage isRequired(Boolean isRequired) {
            this.isRequired = Optional.of(isRequired);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "is_required", nulls = Nulls.SKIP)
        public _FinalStage isRequired(Optional<Boolean> isRequired) {
            this.isRequired = isRequired;
            return this;
        }

        @java.lang.Override
        public _FinalStage description(String description) {
            this.description = Optional.of(description);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public _FinalStage description(Optional<String> description) {
            this.description = description;
            return this;
        }

        @java.lang.Override
        public _FinalStage displayName(String displayName) {
            this.displayName = Optional.of(displayName);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "display_name", nulls = Nulls.SKIP)
        public _FinalStage displayName(Optional<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        @java.lang.Override
        public AdvancedMetadata build() {
            return new AdvancedMetadata(
                    id, displayName, description, isRequired, isCustom, fieldChoices, additionalProperties);
        }
    }
}
