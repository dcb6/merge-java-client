package com.merge.api.resources.ticketing.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Attachment.Builder.class)
public final class Attachment {
    private final Optional<String> id;

    private final Optional<String> remoteId;

    private final Optional<String> fileName;

    private final Optional<String> ticket;

    private final Optional<String> fileUrl;

    private final Optional<String> contentType;

    private final Optional<String> uploadedBy;

    private final Optional<OffsetDateTime> remoteCreatedAt;

    private final Optional<Boolean> remoteWasDeleted;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<Map<String, JsonNode>> fieldMappings;

    private final Optional<List<RemoteData>> remoteData;

    private Attachment(
            Optional<String> id,
            Optional<String> remoteId,
            Optional<String> fileName,
            Optional<String> ticket,
            Optional<String> fileUrl,
            Optional<String> contentType,
            Optional<String> uploadedBy,
            Optional<OffsetDateTime> remoteCreatedAt,
            Optional<Boolean> remoteWasDeleted,
            Optional<OffsetDateTime> modifiedAt,
            Optional<Map<String, JsonNode>> fieldMappings,
            Optional<List<RemoteData>> remoteData) {
        this.id = id;
        this.remoteId = remoteId;
        this.fileName = fileName;
        this.ticket = ticket;
        this.fileUrl = fileUrl;
        this.contentType = contentType;
        this.uploadedBy = uploadedBy;
        this.remoteCreatedAt = remoteCreatedAt;
        this.remoteWasDeleted = remoteWasDeleted;
        this.modifiedAt = modifiedAt;
        this.fieldMappings = fieldMappings;
        this.remoteData = remoteData;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return The third-party API ID of the matching object.
     */
    @JsonProperty("remote_id")
    public Optional<String> getRemoteId() {
        return remoteId;
    }

    /**
     * @return The attachment's name. It is required to include the file extension in the attachment's name.
     */
    @JsonProperty("file_name")
    public Optional<String> getFileName() {
        return fileName;
    }

    /**
     * @return The ticket associated with the attachment.
     */
    @JsonProperty("ticket")
    public Optional<String> getTicket() {
        return ticket;
    }

    /**
     * @return The attachment's url. It is required to include the file extension in the file's URL.
     */
    @JsonProperty("file_url")
    public Optional<String> getFileUrl() {
        return fileUrl;
    }

    /**
     * @return The attachment's file format.
     */
    @JsonProperty("content_type")
    public Optional<String> getContentType() {
        return contentType;
    }

    /**
     * @return The user who uploaded the attachment.
     */
    @JsonProperty("uploaded_by")
    public Optional<String> getUploadedBy() {
        return uploadedBy;
    }

    /**
     * @return When the third party's attachment was created.
     */
    @JsonProperty("remote_created_at")
    public Optional<OffsetDateTime> getRemoteCreatedAt() {
        return remoteCreatedAt;
    }

    @JsonProperty("remote_was_deleted")
    public Optional<Boolean> getRemoteWasDeleted() {
        return remoteWasDeleted;
    }

    /**
     * @return This is the datetime that this object was last updated by Merge
     */
    @JsonProperty("modified_at")
    public Optional<OffsetDateTime> getModifiedAt() {
        return modifiedAt;
    }

    @JsonProperty("field_mappings")
    public Optional<Map<String, JsonNode>> getFieldMappings() {
        return fieldMappings;
    }

    @JsonProperty("remote_data")
    public Optional<List<RemoteData>> getRemoteData() {
        return remoteData;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Attachment && equalTo((Attachment) other);
    }

    private boolean equalTo(Attachment other) {
        return id.equals(other.id)
                && remoteId.equals(other.remoteId)
                && fileName.equals(other.fileName)
                && ticket.equals(other.ticket)
                && fileUrl.equals(other.fileUrl)
                && contentType.equals(other.contentType)
                && uploadedBy.equals(other.uploadedBy)
                && remoteCreatedAt.equals(other.remoteCreatedAt)
                && remoteWasDeleted.equals(other.remoteWasDeleted)
                && modifiedAt.equals(other.modifiedAt)
                && fieldMappings.equals(other.fieldMappings)
                && remoteData.equals(other.remoteData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.remoteId,
                this.fileName,
                this.ticket,
                this.fileUrl,
                this.contentType,
                this.uploadedBy,
                this.remoteCreatedAt,
                this.remoteWasDeleted,
                this.modifiedAt,
                this.fieldMappings,
                this.remoteData);
    }

    @Override
    public String toString() {
        return "Attachment{" + "id: " + id + ", remoteId: " + remoteId + ", fileName: " + fileName + ", ticket: "
                + ticket + ", fileUrl: " + fileUrl + ", contentType: " + contentType + ", uploadedBy: " + uploadedBy
                + ", remoteCreatedAt: " + remoteCreatedAt + ", remoteWasDeleted: " + remoteWasDeleted + ", modifiedAt: "
                + modifiedAt + ", fieldMappings: " + fieldMappings + ", remoteData: " + remoteData + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> id = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<String> fileName = Optional.empty();

        private Optional<String> ticket = Optional.empty();

        private Optional<String> fileUrl = Optional.empty();

        private Optional<String> contentType = Optional.empty();

        private Optional<String> uploadedBy = Optional.empty();

        private Optional<OffsetDateTime> remoteCreatedAt = Optional.empty();

        private Optional<Boolean> remoteWasDeleted = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<Map<String, JsonNode>> fieldMappings = Optional.empty();

        private Optional<List<RemoteData>> remoteData = Optional.empty();

        private Builder() {}

        public Builder from(Attachment other) {
            id(other.getId());
            remoteId(other.getRemoteId());
            fileName(other.getFileName());
            ticket(other.getTicket());
            fileUrl(other.getFileUrl());
            contentType(other.getContentType());
            uploadedBy(other.getUploadedBy());
            remoteCreatedAt(other.getRemoteCreatedAt());
            remoteWasDeleted(other.getRemoteWasDeleted());
            modifiedAt(other.getModifiedAt());
            fieldMappings(other.getFieldMappings());
            remoteData(other.getRemoteData());
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

        @JsonSetter(value = "remote_id", nulls = Nulls.SKIP)
        public Builder remoteId(Optional<String> remoteId) {
            this.remoteId = remoteId;
            return this;
        }

        public Builder remoteId(String remoteId) {
            this.remoteId = Optional.of(remoteId);
            return this;
        }

        @JsonSetter(value = "file_name", nulls = Nulls.SKIP)
        public Builder fileName(Optional<String> fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder fileName(String fileName) {
            this.fileName = Optional.of(fileName);
            return this;
        }

        @JsonSetter(value = "ticket", nulls = Nulls.SKIP)
        public Builder ticket(Optional<String> ticket) {
            this.ticket = ticket;
            return this;
        }

        public Builder ticket(String ticket) {
            this.ticket = Optional.of(ticket);
            return this;
        }

        @JsonSetter(value = "file_url", nulls = Nulls.SKIP)
        public Builder fileUrl(Optional<String> fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }

        public Builder fileUrl(String fileUrl) {
            this.fileUrl = Optional.of(fileUrl);
            return this;
        }

        @JsonSetter(value = "content_type", nulls = Nulls.SKIP)
        public Builder contentType(Optional<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = Optional.of(contentType);
            return this;
        }

        @JsonSetter(value = "uploaded_by", nulls = Nulls.SKIP)
        public Builder uploadedBy(Optional<String> uploadedBy) {
            this.uploadedBy = uploadedBy;
            return this;
        }

        public Builder uploadedBy(String uploadedBy) {
            this.uploadedBy = Optional.of(uploadedBy);
            return this;
        }

        @JsonSetter(value = "remote_created_at", nulls = Nulls.SKIP)
        public Builder remoteCreatedAt(Optional<OffsetDateTime> remoteCreatedAt) {
            this.remoteCreatedAt = remoteCreatedAt;
            return this;
        }

        public Builder remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
            this.remoteCreatedAt = Optional.of(remoteCreatedAt);
            return this;
        }

        @JsonSetter(value = "remote_was_deleted", nulls = Nulls.SKIP)
        public Builder remoteWasDeleted(Optional<Boolean> remoteWasDeleted) {
            this.remoteWasDeleted = remoteWasDeleted;
            return this;
        }

        public Builder remoteWasDeleted(Boolean remoteWasDeleted) {
            this.remoteWasDeleted = Optional.of(remoteWasDeleted);
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

        @JsonSetter(value = "field_mappings", nulls = Nulls.SKIP)
        public Builder fieldMappings(Optional<Map<String, JsonNode>> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }

        public Builder fieldMappings(Map<String, JsonNode> fieldMappings) {
            this.fieldMappings = Optional.of(fieldMappings);
            return this;
        }

        @JsonSetter(value = "remote_data", nulls = Nulls.SKIP)
        public Builder remoteData(Optional<List<RemoteData>> remoteData) {
            this.remoteData = remoteData;
            return this;
        }

        public Builder remoteData(List<RemoteData> remoteData) {
            this.remoteData = Optional.of(remoteData);
            return this;
        }

        public Attachment build() {
            return new Attachment(
                    id,
                    remoteId,
                    fileName,
                    ticket,
                    fileUrl,
                    contentType,
                    uploadedBy,
                    remoteCreatedAt,
                    remoteWasDeleted,
                    modifiedAt,
                    fieldMappings,
                    remoteData);
        }
    }
}
