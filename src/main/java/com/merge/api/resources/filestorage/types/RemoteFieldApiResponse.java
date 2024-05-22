/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.filestorage.types;

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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = RemoteFieldApiResponse.Builder.class)
public final class RemoteFieldApiResponse {
    private final Optional<List<RemoteFieldApi>> file;

    private final Optional<List<RemoteFieldApi>> folder;

    private final Optional<List<RemoteFieldApi>> drive;

    private final Optional<List<RemoteFieldApi>> group;

    private final Optional<List<RemoteFieldApi>> user;

    private final Map<String, Object> additionalProperties;

    private RemoteFieldApiResponse(
            Optional<List<RemoteFieldApi>> file,
            Optional<List<RemoteFieldApi>> folder,
            Optional<List<RemoteFieldApi>> drive,
            Optional<List<RemoteFieldApi>> group,
            Optional<List<RemoteFieldApi>> user,
            Map<String, Object> additionalProperties) {
        this.file = file;
        this.folder = folder;
        this.drive = drive;
        this.group = group;
        this.user = user;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("File")
    public Optional<List<RemoteFieldApi>> getFile() {
        return file;
    }

    @JsonProperty("Folder")
    public Optional<List<RemoteFieldApi>> getFolder() {
        return folder;
    }

    @JsonProperty("Drive")
    public Optional<List<RemoteFieldApi>> getDrive() {
        return drive;
    }

    @JsonProperty("Group")
    public Optional<List<RemoteFieldApi>> getGroup() {
        return group;
    }

    @JsonProperty("User")
    public Optional<List<RemoteFieldApi>> getUser() {
        return user;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RemoteFieldApiResponse && equalTo((RemoteFieldApiResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RemoteFieldApiResponse other) {
        return file.equals(other.file)
                && folder.equals(other.folder)
                && drive.equals(other.drive)
                && group.equals(other.group)
                && user.equals(other.user);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.file, this.folder, this.drive, this.group, this.user);
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
        private Optional<List<RemoteFieldApi>> file = Optional.empty();

        private Optional<List<RemoteFieldApi>> folder = Optional.empty();

        private Optional<List<RemoteFieldApi>> drive = Optional.empty();

        private Optional<List<RemoteFieldApi>> group = Optional.empty();

        private Optional<List<RemoteFieldApi>> user = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(RemoteFieldApiResponse other) {
            file(other.getFile());
            folder(other.getFolder());
            drive(other.getDrive());
            group(other.getGroup());
            user(other.getUser());
            return this;
        }

        @JsonSetter(value = "File", nulls = Nulls.SKIP)
        public Builder file(Optional<List<RemoteFieldApi>> file) {
            this.file = file;
            return this;
        }

        public Builder file(List<RemoteFieldApi> file) {
            this.file = Optional.of(file);
            return this;
        }

        @JsonSetter(value = "Folder", nulls = Nulls.SKIP)
        public Builder folder(Optional<List<RemoteFieldApi>> folder) {
            this.folder = folder;
            return this;
        }

        public Builder folder(List<RemoteFieldApi> folder) {
            this.folder = Optional.of(folder);
            return this;
        }

        @JsonSetter(value = "Drive", nulls = Nulls.SKIP)
        public Builder drive(Optional<List<RemoteFieldApi>> drive) {
            this.drive = drive;
            return this;
        }

        public Builder drive(List<RemoteFieldApi> drive) {
            this.drive = Optional.of(drive);
            return this;
        }

        @JsonSetter(value = "Group", nulls = Nulls.SKIP)
        public Builder group(Optional<List<RemoteFieldApi>> group) {
            this.group = group;
            return this;
        }

        public Builder group(List<RemoteFieldApi> group) {
            this.group = Optional.of(group);
            return this;
        }

        @JsonSetter(value = "User", nulls = Nulls.SKIP)
        public Builder user(Optional<List<RemoteFieldApi>> user) {
            this.user = user;
            return this;
        }

        public Builder user(List<RemoteFieldApi> user) {
            this.user = Optional.of(user);
            return this;
        }

        public RemoteFieldApiResponse build() {
            return new RemoteFieldApiResponse(file, folder, drive, group, user, additionalProperties);
        }
    }
}