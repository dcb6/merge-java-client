package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TimesheetEntry.Builder.class)
public final class TimesheetEntry {
    private final Optional<String> id;

    private final Optional<String> remoteId;

    private final Optional<String> employee;

    private final Optional<Double> hoursWorked;

    private final Optional<OffsetDateTime> startTime;

    private final Optional<OffsetDateTime> endTime;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<OffsetDateTime> modifiedAt;

    private TimesheetEntry(
            Optional<String> id,
            Optional<String> remoteId,
            Optional<String> employee,
            Optional<Double> hoursWorked,
            Optional<OffsetDateTime> startTime,
            Optional<OffsetDateTime> endTime,
            Optional<OffsetDateTime> createdAt,
            Optional<OffsetDateTime> modifiedAt) {
        this.id = id;
        this.remoteId = remoteId;
        this.employee = employee;
        this.hoursWorked = hoursWorked;
        this.startTime = startTime;
        this.endTime = endTime;
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
     * @return The employee the timesheet entry is for.
     */
    @JsonProperty("employee")
    public Optional<String> getEmployee() {
        return employee;
    }

    /**
     * @return The number of hours logged by the employee.
     */
    @JsonProperty("hours_worked")
    public Optional<Double> getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @return The time at which the employee started work.
     */
    @JsonProperty("start_time")
    public Optional<OffsetDateTime> getStartTime() {
        return startTime;
    }

    /**
     * @return The time at which the employee ended work.
     */
    @JsonProperty("end_time")
    public Optional<OffsetDateTime> getEndTime() {
        return endTime;
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
        return other instanceof TimesheetEntry && equalTo((TimesheetEntry) other);
    }

    private boolean equalTo(TimesheetEntry other) {
        return id.equals(other.id)
                && remoteId.equals(other.remoteId)
                && employee.equals(other.employee)
                && hoursWorked.equals(other.hoursWorked)
                && startTime.equals(other.startTime)
                && endTime.equals(other.endTime)
                && createdAt.equals(other.createdAt)
                && modifiedAt.equals(other.modifiedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.remoteId,
                this.employee,
                this.hoursWorked,
                this.startTime,
                this.endTime,
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

        private Optional<String> employee = Optional.empty();

        private Optional<Double> hoursWorked = Optional.empty();

        private Optional<OffsetDateTime> startTime = Optional.empty();

        private Optional<OffsetDateTime> endTime = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Builder() {}

        public Builder from(TimesheetEntry other) {
            id(other.getId());
            remoteId(other.getRemoteId());
            employee(other.getEmployee());
            hoursWorked(other.getHoursWorked());
            startTime(other.getStartTime());
            endTime(other.getEndTime());
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

        @JsonSetter(value = "employee", nulls = Nulls.SKIP)
        public Builder employee(Optional<String> employee) {
            this.employee = employee;
            return this;
        }

        public Builder employee(String employee) {
            this.employee = Optional.of(employee);
            return this;
        }

        @JsonSetter(value = "hours_worked", nulls = Nulls.SKIP)
        public Builder hoursWorked(Optional<Double> hoursWorked) {
            this.hoursWorked = hoursWorked;
            return this;
        }

        public Builder hoursWorked(Double hoursWorked) {
            this.hoursWorked = Optional.of(hoursWorked);
            return this;
        }

        @JsonSetter(value = "start_time", nulls = Nulls.SKIP)
        public Builder startTime(Optional<OffsetDateTime> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(OffsetDateTime startTime) {
            this.startTime = Optional.of(startTime);
            return this;
        }

        @JsonSetter(value = "end_time", nulls = Nulls.SKIP)
        public Builder endTime(Optional<OffsetDateTime> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder endTime(OffsetDateTime endTime) {
            this.endTime = Optional.of(endTime);
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

        public TimesheetEntry build() {
            return new TimesheetEntry(id, remoteId, employee, hoursWorked, startTime, endTime, createdAt, modifiedAt);
        }
    }
}
