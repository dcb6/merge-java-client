/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.filestorage.files.requests;

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
@JsonDeserialize(builder = FilesDownloadRetrieveRequest.Builder.class)
public final class FilesDownloadRetrieveRequest {
    private final Optional<String> mimeType;

    private final Map<String, Object> additionalProperties;

    private FilesDownloadRetrieveRequest(Optional<String> mimeType, Map<String, Object> additionalProperties) {
        this.mimeType = mimeType;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If provided, specifies the export format of the file to be downloaded. For information on supported export formats, please refer to our &lt;a href='https://help.merge.dev/en/articles/8615316-file-export-and-download-specification' target='_blank'&gt;export format help center article&lt;/a&gt;.
     */
    @JsonProperty("mime_type")
    public Optional<String> getMimeType() {
        return mimeType;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FilesDownloadRetrieveRequest && equalTo((FilesDownloadRetrieveRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FilesDownloadRetrieveRequest other) {
        return mimeType.equals(other.mimeType);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.mimeType);
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
        private Optional<String> mimeType = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(FilesDownloadRetrieveRequest other) {
            mimeType(other.getMimeType());
            return this;
        }

        @JsonSetter(value = "mime_type", nulls = Nulls.SKIP)
        public Builder mimeType(Optional<String> mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public Builder mimeType(String mimeType) {
            this.mimeType = Optional.of(mimeType);
            return this;
        }

        public FilesDownloadRetrieveRequest build() {
            return new FilesDownloadRetrieveRequest(mimeType, additionalProperties);
        }
    }
}
