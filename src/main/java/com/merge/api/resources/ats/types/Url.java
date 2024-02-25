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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Url.Builder.class)
public final class Url {
    private final Optional<String> value;

    private final Optional<UrlUrlType> urlType;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Map<String, Object> additionalProperties;

    private Url(
            Optional<String> value,
            Optional<UrlUrlType> urlType,
            Optional<OffsetDateTime> createdAt,
            Optional<OffsetDateTime> modifiedAt,
            Map<String, Object> additionalProperties) {
        this.value = value;
        this.urlType = urlType;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The site's url.
     */
    @JsonProperty("value")
    public Optional<String> getValue() {
        return value;
    }

    /**
     * @return The type of site.
     * <ul>
     * <li><code>PERSONAL</code> - PERSONAL</li>
     * <li><code>COMPANY</code> - COMPANY</li>
     * <li><code>PORTFOLIO</code> - PORTFOLIO</li>
     * <li><code>BLOG</code> - BLOG</li>
     * <li><code>SOCIAL_MEDIA</code> - SOCIAL_MEDIA</li>
     * <li><code>OTHER</code> - OTHER</li>
     * <li><code>JOB_POSTING</code> - JOB_POSTING</li>
     * </ul>
     */
    @JsonProperty("url_type")
    public Optional<UrlUrlType> getUrlType() {
        return urlType;
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

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Url && equalTo((Url) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Url other) {
        return value.equals(other.value)
                && urlType.equals(other.urlType)
                && createdAt.equals(other.createdAt)
                && modifiedAt.equals(other.modifiedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.value, this.urlType, this.createdAt, this.modifiedAt);
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
        private Optional<String> value = Optional.empty();

        private Optional<UrlUrlType> urlType = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Url other) {
            value(other.getValue());
            urlType(other.getUrlType());
            createdAt(other.getCreatedAt());
            modifiedAt(other.getModifiedAt());
            return this;
        }

        @JsonSetter(value = "value", nulls = Nulls.SKIP)
        public Builder value(Optional<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(String value) {
            this.value = Optional.of(value);
            return this;
        }

        @JsonSetter(value = "url_type", nulls = Nulls.SKIP)
        public Builder urlType(Optional<UrlUrlType> urlType) {
            this.urlType = urlType;
            return this;
        }

        public Builder urlType(UrlUrlType urlType) {
            this.urlType = Optional.of(urlType);
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

        public Url build() {
            return new Url(value, urlType, createdAt, modifiedAt, additionalProperties);
        }
    }
}
