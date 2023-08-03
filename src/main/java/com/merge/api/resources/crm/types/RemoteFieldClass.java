package com.merge.api.resources.crm.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = RemoteFieldClass.Builder.class)
public final class RemoteFieldClass {
    private final Optional<String> id;

    private final Optional<String> displayName;

    private final Optional<String> remoteKeyName;

    private final Optional<String> description;

    private final Optional<Boolean> isCustom;

    private final Optional<Boolean> isRequired;

    private final Optional<FieldTypeEnum> fieldType;

    private final Optional<FieldFormatEnum> fieldFormat;

    private final Optional<List<String>> fieldChoices;

    private final Optional<ItemSchema> itemSchema;

    private RemoteFieldClass(
            Optional<String> id,
            Optional<String> displayName,
            Optional<String> remoteKeyName,
            Optional<String> description,
            Optional<Boolean> isCustom,
            Optional<Boolean> isRequired,
            Optional<FieldTypeEnum> fieldType,
            Optional<FieldFormatEnum> fieldFormat,
            Optional<List<String>> fieldChoices,
            Optional<ItemSchema> itemSchema) {
        this.id = id;
        this.displayName = displayName;
        this.remoteKeyName = remoteKeyName;
        this.description = description;
        this.isCustom = isCustom;
        this.isRequired = isRequired;
        this.fieldType = fieldType;
        this.fieldFormat = fieldFormat;
        this.fieldChoices = fieldChoices;
        this.itemSchema = itemSchema;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    @JsonProperty("display_name")
    public Optional<String> getDisplayName() {
        return displayName;
    }

    @JsonProperty("remote_key_name")
    public Optional<String> getRemoteKeyName() {
        return remoteKeyName;
    }

    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    @JsonProperty("is_custom")
    public Optional<Boolean> getIsCustom() {
        return isCustom;
    }

    @JsonProperty("is_required")
    public Optional<Boolean> getIsRequired() {
        return isRequired;
    }

    @JsonProperty("field_type")
    public Optional<FieldTypeEnum> getFieldType() {
        return fieldType;
    }

    @JsonProperty("field_format")
    public Optional<FieldFormatEnum> getFieldFormat() {
        return fieldFormat;
    }

    @JsonProperty("field_choices")
    public Optional<List<String>> getFieldChoices() {
        return fieldChoices;
    }

    @JsonProperty("item_schema")
    public Optional<ItemSchema> getItemSchema() {
        return itemSchema;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RemoteFieldClass && equalTo((RemoteFieldClass) other);
    }

    private boolean equalTo(RemoteFieldClass other) {
        return id.equals(other.id)
                && displayName.equals(other.displayName)
                && remoteKeyName.equals(other.remoteKeyName)
                && description.equals(other.description)
                && isCustom.equals(other.isCustom)
                && isRequired.equals(other.isRequired)
                && fieldType.equals(other.fieldType)
                && fieldFormat.equals(other.fieldFormat)
                && fieldChoices.equals(other.fieldChoices)
                && itemSchema.equals(other.itemSchema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.displayName,
                this.remoteKeyName,
                this.description,
                this.isCustom,
                this.isRequired,
                this.fieldType,
                this.fieldFormat,
                this.fieldChoices,
                this.itemSchema);
    }

    @Override
    public String toString() {
        return "RemoteFieldClass{" + "id: " + id + ", displayName: " + displayName + ", remoteKeyName: " + remoteKeyName
                + ", description: " + description + ", isCustom: " + isCustom + ", isRequired: " + isRequired
                + ", fieldType: " + fieldType + ", fieldFormat: " + fieldFormat + ", fieldChoices: " + fieldChoices
                + ", itemSchema: " + itemSchema + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> id = Optional.empty();

        private Optional<String> displayName = Optional.empty();

        private Optional<String> remoteKeyName = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<Boolean> isCustom = Optional.empty();

        private Optional<Boolean> isRequired = Optional.empty();

        private Optional<FieldTypeEnum> fieldType = Optional.empty();

        private Optional<FieldFormatEnum> fieldFormat = Optional.empty();

        private Optional<List<String>> fieldChoices = Optional.empty();

        private Optional<ItemSchema> itemSchema = Optional.empty();

        private Builder() {}

        public Builder from(RemoteFieldClass other) {
            id(other.getId());
            displayName(other.getDisplayName());
            remoteKeyName(other.getRemoteKeyName());
            description(other.getDescription());
            isCustom(other.getIsCustom());
            isRequired(other.getIsRequired());
            fieldType(other.getFieldType());
            fieldFormat(other.getFieldFormat());
            fieldChoices(other.getFieldChoices());
            itemSchema(other.getItemSchema());
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

        @JsonSetter(value = "display_name", nulls = Nulls.SKIP)
        public Builder displayName(Optional<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Optional.of(displayName);
            return this;
        }

        @JsonSetter(value = "remote_key_name", nulls = Nulls.SKIP)
        public Builder remoteKeyName(Optional<String> remoteKeyName) {
            this.remoteKeyName = remoteKeyName;
            return this;
        }

        public Builder remoteKeyName(String remoteKeyName) {
            this.remoteKeyName = Optional.of(remoteKeyName);
            return this;
        }

        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public Builder description(Optional<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(String description) {
            this.description = Optional.of(description);
            return this;
        }

        @JsonSetter(value = "is_custom", nulls = Nulls.SKIP)
        public Builder isCustom(Optional<Boolean> isCustom) {
            this.isCustom = isCustom;
            return this;
        }

        public Builder isCustom(Boolean isCustom) {
            this.isCustom = Optional.of(isCustom);
            return this;
        }

        @JsonSetter(value = "is_required", nulls = Nulls.SKIP)
        public Builder isRequired(Optional<Boolean> isRequired) {
            this.isRequired = isRequired;
            return this;
        }

        public Builder isRequired(Boolean isRequired) {
            this.isRequired = Optional.of(isRequired);
            return this;
        }

        @JsonSetter(value = "field_type", nulls = Nulls.SKIP)
        public Builder fieldType(Optional<FieldTypeEnum> fieldType) {
            this.fieldType = fieldType;
            return this;
        }

        public Builder fieldType(FieldTypeEnum fieldType) {
            this.fieldType = Optional.of(fieldType);
            return this;
        }

        @JsonSetter(value = "field_format", nulls = Nulls.SKIP)
        public Builder fieldFormat(Optional<FieldFormatEnum> fieldFormat) {
            this.fieldFormat = fieldFormat;
            return this;
        }

        public Builder fieldFormat(FieldFormatEnum fieldFormat) {
            this.fieldFormat = Optional.of(fieldFormat);
            return this;
        }

        @JsonSetter(value = "field_choices", nulls = Nulls.SKIP)
        public Builder fieldChoices(Optional<List<String>> fieldChoices) {
            this.fieldChoices = fieldChoices;
            return this;
        }

        public Builder fieldChoices(List<String> fieldChoices) {
            this.fieldChoices = Optional.of(fieldChoices);
            return this;
        }

        @JsonSetter(value = "item_schema", nulls = Nulls.SKIP)
        public Builder itemSchema(Optional<ItemSchema> itemSchema) {
            this.itemSchema = itemSchema;
            return this;
        }

        public Builder itemSchema(ItemSchema itemSchema) {
            this.itemSchema = Optional.of(itemSchema);
            return this;
        }

        public RemoteFieldClass build() {
            return new RemoteFieldClass(
                    id,
                    displayName,
                    remoteKeyName,
                    description,
                    isCustom,
                    isRequired,
                    fieldType,
                    fieldFormat,
                    fieldChoices,
                    itemSchema);
        }
    }
}