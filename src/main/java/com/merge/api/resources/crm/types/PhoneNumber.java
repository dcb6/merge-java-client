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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PhoneNumber.Builder.class)
public final class PhoneNumber {
    private final Optional<OffsetDateTime> createdAt;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<String> phoneNumber;

    private final Optional<String> phoneNumberType;

    private final Map<String, Object> additionalProperties;

    private PhoneNumber(
            Optional<OffsetDateTime> createdAt,
            Optional<OffsetDateTime> modifiedAt,
            Optional<String> phoneNumber,
            Optional<String> phoneNumberType,
            Map<String, Object> additionalProperties) {
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.phoneNumber = phoneNumber;
        this.phoneNumberType = phoneNumberType;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("created_at")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    /**
     * @return This is the datetime that this object was last updated by Merge
     */
    @JsonProperty("modified_at")
    public Optional<OffsetDateTime> getModifiedAt() {
        return modifiedAt;
    }

    /**
     * @return The phone number.
     */
    @JsonProperty("phone_number")
    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return The phone number's type.
     */
    @JsonProperty("phone_number_type")
    public Optional<String> getPhoneNumberType() {
        return phoneNumberType;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PhoneNumber && equalTo((PhoneNumber) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PhoneNumber other) {
        return createdAt.equals(other.createdAt)
                && modifiedAt.equals(other.modifiedAt)
                && phoneNumber.equals(other.phoneNumber)
                && phoneNumberType.equals(other.phoneNumberType);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.createdAt, this.modifiedAt, this.phoneNumber, this.phoneNumberType);
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
        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<String> phoneNumber = Optional.empty();

        private Optional<String> phoneNumberType = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(PhoneNumber other) {
            createdAt(other.getCreatedAt());
            modifiedAt(other.getModifiedAt());
            phoneNumber(other.getPhoneNumber());
            phoneNumberType(other.getPhoneNumberType());
            return this;
        }

        @JsonSetter(value = "created_at", nulls = Nulls.SKIP)
        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = Optional.of(createdAt);
            return this;
        }

        @JsonSetter(value = "modified_at", nulls = Nulls.SKIP)
        public Builder modifiedAt(Optional<OffsetDateTime> modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public Builder modifiedAt(OffsetDateTime modifiedAt) {
            this.modifiedAt = Optional.of(modifiedAt);
            return this;
        }

        @JsonSetter(value = "phone_number", nulls = Nulls.SKIP)
        public Builder phoneNumber(Optional<String> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Optional.of(phoneNumber);
            return this;
        }

        @JsonSetter(value = "phone_number_type", nulls = Nulls.SKIP)
        public Builder phoneNumberType(Optional<String> phoneNumberType) {
            this.phoneNumberType = phoneNumberType;
            return this;
        }

        public Builder phoneNumberType(String phoneNumberType) {
            this.phoneNumberType = Optional.of(phoneNumberType);
            return this;
        }

        public PhoneNumber build() {
            return new PhoneNumber(createdAt, modifiedAt, phoneNumber, phoneNumberType, additionalProperties);
        }
    }
}
