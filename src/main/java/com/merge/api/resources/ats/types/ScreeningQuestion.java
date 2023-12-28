package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ScreeningQuestion.Builder.class)
public final class ScreeningQuestion {
    private final Optional<String> id;

    private final Optional<String> remoteId;

    private final Optional<ScreeningQuestionJob> job;

    private final Optional<String> description;

    private final Optional<String> title;

    private final Optional<ScreeningQuestionType> type;

    private final Optional<Boolean> required;

    private final Optional<List<JsonNode>> options;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<OffsetDateTime> modifiedAt;

    private ScreeningQuestion(
            Optional<String> id,
            Optional<String> remoteId,
            Optional<ScreeningQuestionJob> job,
            Optional<String> description,
            Optional<String> title,
            Optional<ScreeningQuestionType> type,
            Optional<Boolean> required,
            Optional<List<JsonNode>> options,
            Optional<OffsetDateTime> createdAt,
            Optional<OffsetDateTime> modifiedAt) {
        this.id = id;
        this.remoteId = remoteId;
        this.job = job;
        this.description = description;
        this.title = title;
        this.type = type;
        this.required = required;
        this.options = options;
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
     * @return The job associated with the screening question.
     */
    @JsonProperty("job")
    public Optional<ScreeningQuestionJob> getJob() {
        return job;
    }

    /**
     * @return The description of the screening question
     */
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    /**
     * @return The title of the screening question
     */
    @JsonProperty("title")
    public Optional<String> getTitle() {
        return title;
    }

    /**
     * @return The data type for the screening question.
     * <ul>
     * <li><code>DATE</code> - DATE</li>
     * <li><code>FILE</code> - FILE</li>
     * <li><code>SINGLE_SELECT</code> - SINGLE_SELECT</li>
     * <li><code>MULTI_SELECT</code> - MULTI_SELECT</li>
     * <li><code>SINGLE_LINE_TEXT</code> - SINGLE_LINE_TEXT</li>
     * <li><code>MULTI_LINE_TEXT</code> - MULTI_LINE_TEXT</li>
     * <li><code>NUMERIC</code> - NUMERIC</li>
     * <li><code>BOOLEAN</code> - BOOLEAN</li>
     * </ul>
     */
    @JsonProperty("type")
    public Optional<ScreeningQuestionType> getType() {
        return type;
    }

    /**
     * @return Whether or not the screening question is required.
     */
    @JsonProperty("required")
    public Optional<Boolean> getRequired() {
        return required;
    }

    @JsonProperty("options")
    public Optional<List<JsonNode>> getOptions() {
        return options;
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
        return other instanceof ScreeningQuestion && equalTo((ScreeningQuestion) other);
    }

    private boolean equalTo(ScreeningQuestion other) {
        return id.equals(other.id)
                && remoteId.equals(other.remoteId)
                && job.equals(other.job)
                && description.equals(other.description)
                && title.equals(other.title)
                && type.equals(other.type)
                && required.equals(other.required)
                && options.equals(other.options)
                && createdAt.equals(other.createdAt)
                && modifiedAt.equals(other.modifiedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.remoteId,
                this.job,
                this.description,
                this.title,
                this.type,
                this.required,
                this.options,
                this.createdAt,
                this.modifiedAt);
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

        private Optional<ScreeningQuestionJob> job = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> title = Optional.empty();

        private Optional<ScreeningQuestionType> type = Optional.empty();

        private Optional<Boolean> required = Optional.empty();

        private Optional<List<JsonNode>> options = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Builder() {}

        public Builder from(ScreeningQuestion other) {
            id(other.getId());
            remoteId(other.getRemoteId());
            job(other.getJob());
            description(other.getDescription());
            title(other.getTitle());
            type(other.getType());
            required(other.getRequired());
            options(other.getOptions());
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

        @JsonSetter(value = "job", nulls = Nulls.SKIP)
        public Builder job(Optional<ScreeningQuestionJob> job) {
            this.job = job;
            return this;
        }

        public Builder job(ScreeningQuestionJob job) {
            this.job = Optional.of(job);
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

        @JsonSetter(value = "title", nulls = Nulls.SKIP)
        public Builder title(Optional<String> title) {
            this.title = title;
            return this;
        }

        public Builder title(String title) {
            this.title = Optional.of(title);
            return this;
        }

        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public Builder type(Optional<ScreeningQuestionType> type) {
            this.type = type;
            return this;
        }

        public Builder type(ScreeningQuestionType type) {
            this.type = Optional.of(type);
            return this;
        }

        @JsonSetter(value = "required", nulls = Nulls.SKIP)
        public Builder required(Optional<Boolean> required) {
            this.required = required;
            return this;
        }

        public Builder required(Boolean required) {
            this.required = Optional.of(required);
            return this;
        }

        @JsonSetter(value = "options", nulls = Nulls.SKIP)
        public Builder options(Optional<List<JsonNode>> options) {
            this.options = options;
            return this;
        }

        public Builder options(List<JsonNode> options) {
            this.options = Optional.of(options);
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

        public ScreeningQuestion build() {
            return new ScreeningQuestion(
                    id, remoteId, job, description, title, type, required, options, createdAt, modifiedAt);
        }
    }
}