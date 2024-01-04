package com.merge.api.resources.hris.timeoff.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import com.merge.api.resources.hris.types.TimeOffListRequestExpand;
import com.merge.api.resources.hris.types.TimeOffListRequestRemoteFields;
import com.merge.api.resources.hris.types.TimeOffListRequestRequestType;
import com.merge.api.resources.hris.types.TimeOffListRequestShowEnumOrigins;
import com.merge.api.resources.hris.types.TimeOffListRequestStatus;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TimeOffListRequest.Builder.class)
public final class TimeOffListRequest {
    private final Optional<String> approverId;

    private final Optional<OffsetDateTime> createdAfter;

    private final Optional<OffsetDateTime> createdBefore;

    private final Optional<String> cursor;

    private final Optional<String> employeeId;

    private final Optional<TimeOffListRequestExpand> expand;

    private final Optional<Boolean> includeDeletedData;

    private final Optional<Boolean> includeRemoteData;

    private final Optional<OffsetDateTime> modifiedAfter;

    private final Optional<OffsetDateTime> modifiedBefore;

    private final Optional<Integer> pageSize;

    private final Optional<TimeOffListRequestRemoteFields> remoteFields;

    private final Optional<String> remoteId;

    private final Optional<TimeOffListRequestRequestType> requestType;

    private final Optional<TimeOffListRequestShowEnumOrigins> showEnumOrigins;

    private final Optional<TimeOffListRequestStatus> status;

    private TimeOffListRequest(
            Optional<String> approverId,
            Optional<OffsetDateTime> createdAfter,
            Optional<OffsetDateTime> createdBefore,
            Optional<String> cursor,
            Optional<String> employeeId,
            Optional<TimeOffListRequestExpand> expand,
            Optional<Boolean> includeDeletedData,
            Optional<Boolean> includeRemoteData,
            Optional<OffsetDateTime> modifiedAfter,
            Optional<OffsetDateTime> modifiedBefore,
            Optional<Integer> pageSize,
            Optional<TimeOffListRequestRemoteFields> remoteFields,
            Optional<String> remoteId,
            Optional<TimeOffListRequestRequestType> requestType,
            Optional<TimeOffListRequestShowEnumOrigins> showEnumOrigins,
            Optional<TimeOffListRequestStatus> status) {
        this.approverId = approverId;
        this.createdAfter = createdAfter;
        this.createdBefore = createdBefore;
        this.cursor = cursor;
        this.employeeId = employeeId;
        this.expand = expand;
        this.includeDeletedData = includeDeletedData;
        this.includeRemoteData = includeRemoteData;
        this.modifiedAfter = modifiedAfter;
        this.modifiedBefore = modifiedBefore;
        this.pageSize = pageSize;
        this.remoteFields = remoteFields;
        this.remoteId = remoteId;
        this.requestType = requestType;
        this.showEnumOrigins = showEnumOrigins;
        this.status = status;
    }

    /**
     * @return If provided, will only return time off for this approver.
     */
    @JsonProperty("approver_id")
    public Optional<String> getApproverId() {
        return approverId;
    }

    /**
     * @return If provided, will only return objects created after this datetime.
     */
    @JsonProperty("created_after")
    public Optional<OffsetDateTime> getCreatedAfter() {
        return createdAfter;
    }

    /**
     * @return If provided, will only return objects created before this datetime.
     */
    @JsonProperty("created_before")
    public Optional<OffsetDateTime> getCreatedBefore() {
        return createdBefore;
    }

    /**
     * @return The pagination cursor value.
     */
    @JsonProperty("cursor")
    public Optional<String> getCursor() {
        return cursor;
    }

    /**
     * @return If provided, will only return time off for this employee.
     */
    @JsonProperty("employee_id")
    public Optional<String> getEmployeeId() {
        return employeeId;
    }

    /**
     * @return Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
     */
    @JsonProperty("expand")
    public Optional<TimeOffListRequestExpand> getExpand() {
        return expand;
    }

    /**
     * @return Whether to include data that was marked as deleted by third party webhooks.
     */
    @JsonProperty("include_deleted_data")
    public Optional<Boolean> getIncludeDeletedData() {
        return includeDeletedData;
    }

    /**
     * @return Whether to include the original data Merge fetched from the third-party to produce these models.
     */
    @JsonProperty("include_remote_data")
    public Optional<Boolean> getIncludeRemoteData() {
        return includeRemoteData;
    }

    /**
     * @return If provided, only objects synced by Merge after this date time will be returned.
     */
    @JsonProperty("modified_after")
    public Optional<OffsetDateTime> getModifiedAfter() {
        return modifiedAfter;
    }

    /**
     * @return If provided, only objects synced by Merge before this date time will be returned.
     */
    @JsonProperty("modified_before")
    public Optional<OffsetDateTime> getModifiedBefore() {
        return modifiedBefore;
    }

    /**
     * @return Number of results to return per page.
     */
    @JsonProperty("page_size")
    public Optional<Integer> getPageSize() {
        return pageSize;
    }

    /**
     * @return Deprecated. Use show_enum_origins.
     */
    @JsonProperty("remote_fields")
    public Optional<TimeOffListRequestRemoteFields> getRemoteFields() {
        return remoteFields;
    }

    /**
     * @return The API provider's ID for the given object.
     */
    @JsonProperty("remote_id")
    public Optional<String> getRemoteId() {
        return remoteId;
    }

    /**
     * @return If provided, will only return TimeOff with this request type. Options: ('VACATION', 'SICK', 'PERSONAL', 'JURY_DUTY', 'VOLUNTEER', 'BEREAVEMENT')
     * <ul>
     * <li><code>VACATION</code> - VACATION</li>
     * <li><code>SICK</code> - SICK</li>
     * <li><code>PERSONAL</code> - PERSONAL</li>
     * <li><code>JURY_DUTY</code> - JURY_DUTY</li>
     * <li><code>VOLUNTEER</code> - VOLUNTEER</li>
     * <li><code>BEREAVEMENT</code> - BEREAVEMENT</li>
     * </ul>
     */
    @JsonProperty("request_type")
    public Optional<TimeOffListRequestRequestType> getRequestType() {
        return requestType;
    }

    /**
     * @return Which fields should be returned in non-normalized form.
     */
    @JsonProperty("show_enum_origins")
    public Optional<TimeOffListRequestShowEnumOrigins> getShowEnumOrigins() {
        return showEnumOrigins;
    }

    /**
     * @return If provided, will only return TimeOff with this status. Options: ('REQUESTED', 'APPROVED', 'DECLINED', 'CANCELLED', 'DELETED')
     * <ul>
     * <li><code>REQUESTED</code> - REQUESTED</li>
     * <li><code>APPROVED</code> - APPROVED</li>
     * <li><code>DECLINED</code> - DECLINED</li>
     * <li><code>CANCELLED</code> - CANCELLED</li>
     * <li><code>DELETED</code> - DELETED</li>
     * </ul>
     */
    @JsonProperty("status")
    public Optional<TimeOffListRequestStatus> getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TimeOffListRequest && equalTo((TimeOffListRequest) other);
    }

    private boolean equalTo(TimeOffListRequest other) {
        return approverId.equals(other.approverId)
                && createdAfter.equals(other.createdAfter)
                && createdBefore.equals(other.createdBefore)
                && cursor.equals(other.cursor)
                && employeeId.equals(other.employeeId)
                && expand.equals(other.expand)
                && includeDeletedData.equals(other.includeDeletedData)
                && includeRemoteData.equals(other.includeRemoteData)
                && modifiedAfter.equals(other.modifiedAfter)
                && modifiedBefore.equals(other.modifiedBefore)
                && pageSize.equals(other.pageSize)
                && remoteFields.equals(other.remoteFields)
                && remoteId.equals(other.remoteId)
                && requestType.equals(other.requestType)
                && showEnumOrigins.equals(other.showEnumOrigins)
                && status.equals(other.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.approverId,
                this.createdAfter,
                this.createdBefore,
                this.cursor,
                this.employeeId,
                this.expand,
                this.includeDeletedData,
                this.includeRemoteData,
                this.modifiedAfter,
                this.modifiedBefore,
                this.pageSize,
                this.remoteFields,
                this.remoteId,
                this.requestType,
                this.showEnumOrigins,
                this.status);
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
        private Optional<String> approverId = Optional.empty();

        private Optional<OffsetDateTime> createdAfter = Optional.empty();

        private Optional<OffsetDateTime> createdBefore = Optional.empty();

        private Optional<String> cursor = Optional.empty();

        private Optional<String> employeeId = Optional.empty();

        private Optional<TimeOffListRequestExpand> expand = Optional.empty();

        private Optional<Boolean> includeDeletedData = Optional.empty();

        private Optional<Boolean> includeRemoteData = Optional.empty();

        private Optional<OffsetDateTime> modifiedAfter = Optional.empty();

        private Optional<OffsetDateTime> modifiedBefore = Optional.empty();

        private Optional<Integer> pageSize = Optional.empty();

        private Optional<TimeOffListRequestRemoteFields> remoteFields = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<TimeOffListRequestRequestType> requestType = Optional.empty();

        private Optional<TimeOffListRequestShowEnumOrigins> showEnumOrigins = Optional.empty();

        private Optional<TimeOffListRequestStatus> status = Optional.empty();

        private Builder() {}

        public Builder from(TimeOffListRequest other) {
            approverId(other.getApproverId());
            createdAfter(other.getCreatedAfter());
            createdBefore(other.getCreatedBefore());
            cursor(other.getCursor());
            employeeId(other.getEmployeeId());
            expand(other.getExpand());
            includeDeletedData(other.getIncludeDeletedData());
            includeRemoteData(other.getIncludeRemoteData());
            modifiedAfter(other.getModifiedAfter());
            modifiedBefore(other.getModifiedBefore());
            pageSize(other.getPageSize());
            remoteFields(other.getRemoteFields());
            remoteId(other.getRemoteId());
            requestType(other.getRequestType());
            showEnumOrigins(other.getShowEnumOrigins());
            status(other.getStatus());
            return this;
        }

        @JsonSetter(value = "approver_id", nulls = Nulls.SKIP)
        public Builder approverId(Optional<String> approverId) {
            this.approverId = approverId;
            return this;
        }

        public Builder approverId(String approverId) {
            this.approverId = Optional.of(approverId);
            return this;
        }

        @JsonSetter(value = "created_after", nulls = Nulls.SKIP)
        public Builder createdAfter(Optional<OffsetDateTime> createdAfter) {
            this.createdAfter = createdAfter;
            return this;
        }

        public Builder createdAfter(OffsetDateTime createdAfter) {
            this.createdAfter = Optional.of(createdAfter);
            return this;
        }

        @JsonSetter(value = "created_before", nulls = Nulls.SKIP)
        public Builder createdBefore(Optional<OffsetDateTime> createdBefore) {
            this.createdBefore = createdBefore;
            return this;
        }

        public Builder createdBefore(OffsetDateTime createdBefore) {
            this.createdBefore = Optional.of(createdBefore);
            return this;
        }

        @JsonSetter(value = "cursor", nulls = Nulls.SKIP)
        public Builder cursor(Optional<String> cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = Optional.of(cursor);
            return this;
        }

        @JsonSetter(value = "employee_id", nulls = Nulls.SKIP)
        public Builder employeeId(Optional<String> employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder employeeId(String employeeId) {
            this.employeeId = Optional.of(employeeId);
            return this;
        }

        @JsonSetter(value = "expand", nulls = Nulls.SKIP)
        public Builder expand(Optional<TimeOffListRequestExpand> expand) {
            this.expand = expand;
            return this;
        }

        public Builder expand(TimeOffListRequestExpand expand) {
            this.expand = Optional.of(expand);
            return this;
        }

        @JsonSetter(value = "include_deleted_data", nulls = Nulls.SKIP)
        public Builder includeDeletedData(Optional<Boolean> includeDeletedData) {
            this.includeDeletedData = includeDeletedData;
            return this;
        }

        public Builder includeDeletedData(Boolean includeDeletedData) {
            this.includeDeletedData = Optional.of(includeDeletedData);
            return this;
        }

        @JsonSetter(value = "include_remote_data", nulls = Nulls.SKIP)
        public Builder includeRemoteData(Optional<Boolean> includeRemoteData) {
            this.includeRemoteData = includeRemoteData;
            return this;
        }

        public Builder includeRemoteData(Boolean includeRemoteData) {
            this.includeRemoteData = Optional.of(includeRemoteData);
            return this;
        }

        @JsonSetter(value = "modified_after", nulls = Nulls.SKIP)
        public Builder modifiedAfter(Optional<OffsetDateTime> modifiedAfter) {
            this.modifiedAfter = modifiedAfter;
            return this;
        }

        public Builder modifiedAfter(OffsetDateTime modifiedAfter) {
            this.modifiedAfter = Optional.of(modifiedAfter);
            return this;
        }

        @JsonSetter(value = "modified_before", nulls = Nulls.SKIP)
        public Builder modifiedBefore(Optional<OffsetDateTime> modifiedBefore) {
            this.modifiedBefore = modifiedBefore;
            return this;
        }

        public Builder modifiedBefore(OffsetDateTime modifiedBefore) {
            this.modifiedBefore = Optional.of(modifiedBefore);
            return this;
        }

        @JsonSetter(value = "page_size", nulls = Nulls.SKIP)
        public Builder pageSize(Optional<Integer> pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder pageSize(Integer pageSize) {
            this.pageSize = Optional.of(pageSize);
            return this;
        }

        @JsonSetter(value = "remote_fields", nulls = Nulls.SKIP)
        public Builder remoteFields(Optional<TimeOffListRequestRemoteFields> remoteFields) {
            this.remoteFields = remoteFields;
            return this;
        }

        public Builder remoteFields(TimeOffListRequestRemoteFields remoteFields) {
            this.remoteFields = Optional.of(remoteFields);
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

        @JsonSetter(value = "request_type", nulls = Nulls.SKIP)
        public Builder requestType(Optional<TimeOffListRequestRequestType> requestType) {
            this.requestType = requestType;
            return this;
        }

        public Builder requestType(TimeOffListRequestRequestType requestType) {
            this.requestType = Optional.of(requestType);
            return this;
        }

        @JsonSetter(value = "show_enum_origins", nulls = Nulls.SKIP)
        public Builder showEnumOrigins(Optional<TimeOffListRequestShowEnumOrigins> showEnumOrigins) {
            this.showEnumOrigins = showEnumOrigins;
            return this;
        }

        public Builder showEnumOrigins(TimeOffListRequestShowEnumOrigins showEnumOrigins) {
            this.showEnumOrigins = Optional.of(showEnumOrigins);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<TimeOffListRequestStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(TimeOffListRequestStatus status) {
            this.status = Optional.of(status);
            return this;
        }

        public TimeOffListRequest build() {
            return new TimeOffListRequest(
                    approverId,
                    createdAfter,
                    createdBefore,
                    cursor,
                    employeeId,
                    expand,
                    includeDeletedData,
                    includeRemoteData,
                    modifiedAfter,
                    modifiedBefore,
                    pageSize,
                    remoteFields,
                    remoteId,
                    requestType,
                    showEnumOrigins,
                    status);
        }
    }
}
