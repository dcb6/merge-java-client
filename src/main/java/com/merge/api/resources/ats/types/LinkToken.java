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
@JsonDeserialize(builder = LinkToken.Builder.class)
public final class LinkToken {
    private final String linkToken;

    private final Optional<String> integrationName;

    private final Optional<String> magicLinkUrl;

    private final Map<String, Object> additionalProperties;

    private LinkToken(
            String linkToken,
            Optional<String> integrationName,
            Optional<String> magicLinkUrl,
            Map<String, Object> additionalProperties) {
        this.linkToken = linkToken;
        this.integrationName = integrationName;
        this.magicLinkUrl = magicLinkUrl;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("link_token")
    public String getLinkToken() {
        return linkToken;
    }

    @JsonProperty("integration_name")
    public Optional<String> getIntegrationName() {
        return integrationName;
    }

    @JsonProperty("magic_link_url")
    public Optional<String> getMagicLinkUrl() {
        return magicLinkUrl;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LinkToken && equalTo((LinkToken) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(LinkToken other) {
        return linkToken.equals(other.linkToken)
                && integrationName.equals(other.integrationName)
                && magicLinkUrl.equals(other.magicLinkUrl);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.linkToken, this.integrationName, this.magicLinkUrl);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LinkTokenStage builder() {
        return new Builder();
    }

    public interface LinkTokenStage {
        _FinalStage linkToken(String linkToken);

        Builder from(LinkToken other);
    }

    public interface _FinalStage {
        LinkToken build();

        _FinalStage integrationName(Optional<String> integrationName);

        _FinalStage integrationName(String integrationName);

        _FinalStage magicLinkUrl(Optional<String> magicLinkUrl);

        _FinalStage magicLinkUrl(String magicLinkUrl);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LinkTokenStage, _FinalStage {
        private String linkToken;

        private Optional<String> magicLinkUrl = Optional.empty();

        private Optional<String> integrationName = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(LinkToken other) {
            linkToken(other.getLinkToken());
            integrationName(other.getIntegrationName());
            magicLinkUrl(other.getMagicLinkUrl());
            return this;
        }

        @java.lang.Override
        @JsonSetter("link_token")
        public _FinalStage linkToken(String linkToken) {
            this.linkToken = linkToken;
            return this;
        }

        @java.lang.Override
        public _FinalStage magicLinkUrl(String magicLinkUrl) {
            this.magicLinkUrl = Optional.of(magicLinkUrl);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "magic_link_url", nulls = Nulls.SKIP)
        public _FinalStage magicLinkUrl(Optional<String> magicLinkUrl) {
            this.magicLinkUrl = magicLinkUrl;
            return this;
        }

        @java.lang.Override
        public _FinalStage integrationName(String integrationName) {
            this.integrationName = Optional.of(integrationName);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "integration_name", nulls = Nulls.SKIP)
        public _FinalStage integrationName(Optional<String> integrationName) {
            this.integrationName = integrationName;
            return this;
        }

        @java.lang.Override
        public LinkToken build() {
            return new LinkToken(linkToken, integrationName, magicLinkUrl, additionalProperties);
        }
    }
}
