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
@JsonDeserialize(builder = FieldMappingApiInstanceResponse.Builder.class)
public final class FieldMappingApiInstanceResponse {
    private final Optional<List<FieldMappingApiInstance>> file;

    private final Optional<List<FieldMappingApiInstance>> folder;

    private final Optional<List<FieldMappingApiInstance>> drive;

    private final Optional<List<FieldMappingApiInstance>> group;

    private final Optional<List<FieldMappingApiInstance>> user;

    private final Map<String, Object> additionalProperties;

    private FieldMappingApiInstanceResponse(
            Optional<List<FieldMappingApiInstance>> file,
            Optional<List<FieldMappingApiInstance>> folder,
            Optional<List<FieldMappingApiInstance>> drive,
            Optional<List<FieldMappingApiInstance>> group,
            Optional<List<FieldMappingApiInstance>> user,
            Map<String, Object> additionalProperties) {
        this.file = file;
        this.folder = folder;
        this.drive = drive;
        this.group = group;
        this.user = user;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("File")
    public Optional<List<FieldMappingApiInstance>> getFile() {
        return file;
    }

    @JsonProperty("Folder")
    public Optional<List<FieldMappingApiInstance>> getFolder() {
        return folder;
    }

    @JsonProperty("Drive")
    public Optional<List<FieldMappingApiInstance>> getDrive() {
        return drive;
    }

    @JsonProperty("Group")
    public Optional<List<FieldMappingApiInstance>> getGroup() {
        return group;
    }

    @JsonProperty("User")
    public Optional<List<FieldMappingApiInstance>> getUser() {
        return user;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FieldMappingApiInstanceResponse && equalTo((FieldMappingApiInstanceResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FieldMappingApiInstanceResponse other) {
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
        private Optional<List<FieldMappingApiInstance>> file = Optional.empty();

        private Optional<List<FieldMappingApiInstance>> folder = Optional.empty();

        private Optional<List<FieldMappingApiInstance>> drive = Optional.empty();

        private Optional<List<FieldMappingApiInstance>> group = Optional.empty();

        private Optional<List<FieldMappingApiInstance>> user = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(FieldMappingApiInstanceResponse other) {
            file(other.getFile());
            folder(other.getFolder());
            drive(other.getDrive());
            group(other.getGroup());
            user(other.getUser());
            return this;
        }

        @JsonSetter(value = "File", nulls = Nulls.SKIP)
        public Builder file(Optional<List<FieldMappingApiInstance>> file) {
            this.file = file;
            return this;
        }

        public Builder file(List<FieldMappingApiInstance> file) {
            this.file = Optional.of(file);
            return this;
        }

        @JsonSetter(value = "Folder", nulls = Nulls.SKIP)
        public Builder folder(Optional<List<FieldMappingApiInstance>> folder) {
            this.folder = folder;
            return this;
        }

        public Builder folder(List<FieldMappingApiInstance> folder) {
            this.folder = Optional.of(folder);
            return this;
        }

        @JsonSetter(value = "Drive", nulls = Nulls.SKIP)
        public Builder drive(Optional<List<FieldMappingApiInstance>> drive) {
            this.drive = drive;
            return this;
        }

        public Builder drive(List<FieldMappingApiInstance> drive) {
            this.drive = Optional.of(drive);
            return this;
        }

        @JsonSetter(value = "Group", nulls = Nulls.SKIP)
        public Builder group(Optional<List<FieldMappingApiInstance>> group) {
            this.group = group;
            return this;
        }

        public Builder group(List<FieldMappingApiInstance> group) {
            this.group = Optional.of(group);
            return this;
        }

        @JsonSetter(value = "User", nulls = Nulls.SKIP)
        public Builder user(Optional<List<FieldMappingApiInstance>> user) {
            this.user = user;
            return this;
        }

        public Builder user(List<FieldMappingApiInstance> user) {
            this.user = Optional.of(user);
            return this;
        }

        public FieldMappingApiInstanceResponse build() {
            return new FieldMappingApiInstanceResponse(file, folder, drive, group, user, additionalProperties);
        }
    }
}
