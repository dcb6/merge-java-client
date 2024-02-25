/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.ats.types;

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
@JsonDeserialize(builder = IndividualCommonModelScopeDeserializer.Builder.class)
public final class IndividualCommonModelScopeDeserializer {
    private final String modelName;

    private final Optional<Map<String, ModelPermissionDeserializer>> modelPermissions;

    private final Optional<FieldPermissionDeserializer> fieldPermissions;

    private final Map<String, Object> additionalProperties;

    private IndividualCommonModelScopeDeserializer(
            String modelName,
            Optional<Map<String, ModelPermissionDeserializer>> modelPermissions,
            Optional<FieldPermissionDeserializer> fieldPermissions,
            Map<String, Object> additionalProperties) {
        this.modelName = modelName;
        this.modelPermissions = modelPermissions;
        this.fieldPermissions = fieldPermissions;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("model_name")
    public String getModelName() {
        return modelName;
    }

    @JsonProperty("model_permissions")
    public Optional<Map<String, ModelPermissionDeserializer>> getModelPermissions() {
        return modelPermissions;
    }

    @JsonProperty("field_permissions")
    public Optional<FieldPermissionDeserializer> getFieldPermissions() {
        return fieldPermissions;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof IndividualCommonModelScopeDeserializer
                && equalTo((IndividualCommonModelScopeDeserializer) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(IndividualCommonModelScopeDeserializer other) {
        return modelName.equals(other.modelName)
                && modelPermissions.equals(other.modelPermissions)
                && fieldPermissions.equals(other.fieldPermissions);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.modelName, this.modelPermissions, this.fieldPermissions);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ModelNameStage builder() {
        return new Builder();
    }

    public interface ModelNameStage {
        _FinalStage modelName(String modelName);

        Builder from(IndividualCommonModelScopeDeserializer other);
    }

    public interface _FinalStage {
        IndividualCommonModelScopeDeserializer build();

        _FinalStage modelPermissions(Optional<Map<String, ModelPermissionDeserializer>> modelPermissions);

        _FinalStage modelPermissions(Map<String, ModelPermissionDeserializer> modelPermissions);

        _FinalStage fieldPermissions(Optional<FieldPermissionDeserializer> fieldPermissions);

        _FinalStage fieldPermissions(FieldPermissionDeserializer fieldPermissions);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ModelNameStage, _FinalStage {
        private String modelName;

        private Optional<FieldPermissionDeserializer> fieldPermissions = Optional.empty();

        private Optional<Map<String, ModelPermissionDeserializer>> modelPermissions = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(IndividualCommonModelScopeDeserializer other) {
            modelName(other.getModelName());
            modelPermissions(other.getModelPermissions());
            fieldPermissions(other.getFieldPermissions());
            return this;
        }

        @java.lang.Override
        @JsonSetter("model_name")
        public _FinalStage modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        @java.lang.Override
        public _FinalStage fieldPermissions(FieldPermissionDeserializer fieldPermissions) {
            this.fieldPermissions = Optional.of(fieldPermissions);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "field_permissions", nulls = Nulls.SKIP)
        public _FinalStage fieldPermissions(Optional<FieldPermissionDeserializer> fieldPermissions) {
            this.fieldPermissions = fieldPermissions;
            return this;
        }

        @java.lang.Override
        public _FinalStage modelPermissions(Map<String, ModelPermissionDeserializer> modelPermissions) {
            this.modelPermissions = Optional.of(modelPermissions);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "model_permissions", nulls = Nulls.SKIP)
        public _FinalStage modelPermissions(Optional<Map<String, ModelPermissionDeserializer>> modelPermissions) {
            this.modelPermissions = modelPermissions;
            return this;
        }

        @java.lang.Override
        public IndividualCommonModelScopeDeserializer build() {
            return new IndividualCommonModelScopeDeserializer(
                    modelName, modelPermissions, fieldPermissions, additionalProperties);
        }
    }
}
