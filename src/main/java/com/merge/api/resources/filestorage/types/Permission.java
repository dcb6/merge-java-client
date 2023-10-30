package com.merge.api.resources.filestorage.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Permission.Builder.class)
public final class Permission {
    private final Optional<String> id;

    private final Optional<String> remoteId;

    private final Optional<PermissionUser> user;

    private final Optional<PermissionGroup> group;

    private final Optional<PermissionType> type;

    private final Optional<List<Optional<PermissionRolesItem>>> roles;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<OffsetDateTime> modifiedAt;

    private Permission(
            Optional<String> id,
            Optional<String> remoteId,
            Optional<PermissionUser> user,
            Optional<PermissionGroup> group,
            Optional<PermissionType> type,
            Optional<List<Optional<PermissionRolesItem>>> roles,
            Optional<OffsetDateTime> createdAt,
            Optional<OffsetDateTime> modifiedAt) {
        this.id = id;
        this.remoteId = remoteId;
        this.user = user;
        this.group = group;
        this.type = type;
        this.roles = roles;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
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
     * @return The user that is granted this permission.
     */
    @JsonProperty("user")
    public Optional<PermissionUser> getUser() {
        return user;
    }

    /**
     * @return The group that is granted this permission.
     */
    @JsonProperty("group")
    public Optional<PermissionGroup> getGroup() {
        return group;
    }

    /**
     * @return Denotes what type of people have access to the file.
     * <ul>
     * <li><code>USER</code> - USER</li>
     * <li><code>GROUP</code> - GROUP</li>
     * <li><code>COMPANY</code> - COMPANY</li>
     * <li><code>ANYONE</code> - ANYONE</li>
     * </ul>
     */
    @JsonProperty("type")
    public Optional<PermissionType> getType() {
        return type;
    }

    /**
     * @return The permissions that the user or group has for the File or Folder. It is possible for a user or group to have multiple roles, such as viewing &amp; uploading. Possible values include: <code>READ</code>, <code>WRITE</code>, <code>OWNER</code>. In cases where there is no clear mapping, the original value passed through will be returned.
     */
    @JsonProperty("roles")
    public Optional<List<Optional<PermissionRolesItem>>> getRoles() {
        return roles;
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

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Permission && equalTo((Permission) other);
    }

    private boolean equalTo(Permission other) {
        return id.equals(other.id)
                && remoteId.equals(other.remoteId)
                && user.equals(other.user)
                && group.equals(other.group)
                && type.equals(other.type)
                && roles.equals(other.roles)
                && createdAt.equals(other.createdAt)
                && modifiedAt.equals(other.modifiedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id, this.remoteId, this.user, this.group, this.type, this.roles, this.createdAt, this.modifiedAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> id = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<PermissionUser> user = Optional.empty();

        private Optional<PermissionGroup> group = Optional.empty();

        private Optional<PermissionType> type = Optional.empty();

        private Optional<List<Optional<PermissionRolesItem>>> roles = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Builder() {}

        public Builder from(Permission other) {
            id(other.getId());
            remoteId(other.getRemoteId());
            user(other.getUser());
            group(other.getGroup());
            type(other.getType());
            roles(other.getRoles());
            createdAt(other.getCreatedAt());
            modifiedAt(other.getModifiedAt());
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

        @JsonSetter(value = "user", nulls = Nulls.SKIP)
        public Builder user(Optional<PermissionUser> user) {
            this.user = user;
            return this;
        }

        public Builder user(PermissionUser user) {
            this.user = Optional.of(user);
            return this;
        }

        @JsonSetter(value = "group", nulls = Nulls.SKIP)
        public Builder group(Optional<PermissionGroup> group) {
            this.group = group;
            return this;
        }

        public Builder group(PermissionGroup group) {
            this.group = Optional.of(group);
            return this;
        }

        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public Builder type(Optional<PermissionType> type) {
            this.type = type;
            return this;
        }

        public Builder type(PermissionType type) {
            this.type = Optional.of(type);
            return this;
        }

        @JsonSetter(value = "roles", nulls = Nulls.SKIP)
        public Builder roles(Optional<List<Optional<PermissionRolesItem>>> roles) {
            this.roles = roles;
            return this;
        }

        public Builder roles(List<Optional<PermissionRolesItem>> roles) {
            this.roles = Optional.of(roles);
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

        public Permission build() {
            return new Permission(id, remoteId, user, group, type, roles, createdAt, modifiedAt);
        }
    }
}
