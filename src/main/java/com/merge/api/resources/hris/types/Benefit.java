package com.merge.api.resources.hris.types;

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
@JsonDeserialize(builder = Benefit.Builder.class)
public final class Benefit {
    private final Optional<String> id;

    private final Optional<String> remoteId;

    private final Optional<String> employee;

    private final Optional<String> providerName;

    private final Optional<String> benefitPlanType;

    private final Optional<Double> employeeContribution;

    private final Optional<Double> companyContribution;

    private final Optional<OffsetDateTime> startDate;

    private final Optional<OffsetDateTime> endDate;

    private final Optional<Boolean> remoteWasDeleted;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<Map<String, JsonNode>> fieldMappings;

    private final Optional<List<RemoteData>> remoteData;

    private Benefit(
            Optional<String> id,
            Optional<String> remoteId,
            Optional<String> employee,
            Optional<String> providerName,
            Optional<String> benefitPlanType,
            Optional<Double> employeeContribution,
            Optional<Double> companyContribution,
            Optional<OffsetDateTime> startDate,
            Optional<OffsetDateTime> endDate,
            Optional<Boolean> remoteWasDeleted,
            Optional<OffsetDateTime> modifiedAt,
            Optional<Map<String, JsonNode>> fieldMappings,
            Optional<List<RemoteData>> remoteData) {
        this.id = id;
        this.remoteId = remoteId;
        this.employee = employee;
        this.providerName = providerName;
        this.benefitPlanType = benefitPlanType;
        this.employeeContribution = employeeContribution;
        this.companyContribution = companyContribution;
        this.startDate = startDate;
        this.endDate = endDate;
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
     * @return The employee on the plan.
     */
    @JsonProperty("employee")
    public Optional<String> getEmployee() {
        return employee;
    }

    /**
     * @return The name of the benefit provider.
     */
    @JsonProperty("provider_name")
    public Optional<String> getProviderName() {
        return providerName;
    }

    /**
     * @return The type of benefit plan
     */
    @JsonProperty("benefit_plan_type")
    public Optional<String> getBenefitPlanType() {
        return benefitPlanType;
    }

    /**
     * @return The employee's contribution.
     */
    @JsonProperty("employee_contribution")
    public Optional<Double> getEmployeeContribution() {
        return employeeContribution;
    }

    /**
     * @return The company's contribution.
     */
    @JsonProperty("company_contribution")
    public Optional<Double> getCompanyContribution() {
        return companyContribution;
    }

    /**
     * @return The day and time the benefit started.
     */
    @JsonProperty("start_date")
    public Optional<OffsetDateTime> getStartDate() {
        return startDate;
    }

    /**
     * @return The day and time the benefit ended.
     */
    @JsonProperty("end_date")
    public Optional<OffsetDateTime> getEndDate() {
        return endDate;
    }

    /**
     * @return Indicates whether or not this object has been deleted by third party webhooks.
     */
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
        return other instanceof Benefit && equalTo((Benefit) other);
    }

    private boolean equalTo(Benefit other) {
        return id.equals(other.id)
                && remoteId.equals(other.remoteId)
                && employee.equals(other.employee)
                && providerName.equals(other.providerName)
                && benefitPlanType.equals(other.benefitPlanType)
                && employeeContribution.equals(other.employeeContribution)
                && companyContribution.equals(other.companyContribution)
                && startDate.equals(other.startDate)
                && endDate.equals(other.endDate)
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
                this.employee,
                this.providerName,
                this.benefitPlanType,
                this.employeeContribution,
                this.companyContribution,
                this.startDate,
                this.endDate,
                this.remoteWasDeleted,
                this.modifiedAt,
                this.fieldMappings,
                this.remoteData);
    }

    @Override
    public String toString() {
        return "Benefit{" + "id: " + id + ", remoteId: " + remoteId + ", employee: " + employee + ", providerName: "
                + providerName + ", benefitPlanType: " + benefitPlanType + ", employeeContribution: "
                + employeeContribution + ", companyContribution: " + companyContribution + ", startDate: " + startDate
                + ", endDate: " + endDate + ", remoteWasDeleted: " + remoteWasDeleted + ", modifiedAt: " + modifiedAt
                + ", fieldMappings: " + fieldMappings + ", remoteData: " + remoteData + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> id = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<String> employee = Optional.empty();

        private Optional<String> providerName = Optional.empty();

        private Optional<String> benefitPlanType = Optional.empty();

        private Optional<Double> employeeContribution = Optional.empty();

        private Optional<Double> companyContribution = Optional.empty();

        private Optional<OffsetDateTime> startDate = Optional.empty();

        private Optional<OffsetDateTime> endDate = Optional.empty();

        private Optional<Boolean> remoteWasDeleted = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<Map<String, JsonNode>> fieldMappings = Optional.empty();

        private Optional<List<RemoteData>> remoteData = Optional.empty();

        private Builder() {}

        public Builder from(Benefit other) {
            id(other.getId());
            remoteId(other.getRemoteId());
            employee(other.getEmployee());
            providerName(other.getProviderName());
            benefitPlanType(other.getBenefitPlanType());
            employeeContribution(other.getEmployeeContribution());
            companyContribution(other.getCompanyContribution());
            startDate(other.getStartDate());
            endDate(other.getEndDate());
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

        @JsonSetter(value = "employee", nulls = Nulls.SKIP)
        public Builder employee(Optional<String> employee) {
            this.employee = employee;
            return this;
        }

        public Builder employee(String employee) {
            this.employee = Optional.of(employee);
            return this;
        }

        @JsonSetter(value = "provider_name", nulls = Nulls.SKIP)
        public Builder providerName(Optional<String> providerName) {
            this.providerName = providerName;
            return this;
        }

        public Builder providerName(String providerName) {
            this.providerName = Optional.of(providerName);
            return this;
        }

        @JsonSetter(value = "benefit_plan_type", nulls = Nulls.SKIP)
        public Builder benefitPlanType(Optional<String> benefitPlanType) {
            this.benefitPlanType = benefitPlanType;
            return this;
        }

        public Builder benefitPlanType(String benefitPlanType) {
            this.benefitPlanType = Optional.of(benefitPlanType);
            return this;
        }

        @JsonSetter(value = "employee_contribution", nulls = Nulls.SKIP)
        public Builder employeeContribution(Optional<Double> employeeContribution) {
            this.employeeContribution = employeeContribution;
            return this;
        }

        public Builder employeeContribution(Double employeeContribution) {
            this.employeeContribution = Optional.of(employeeContribution);
            return this;
        }

        @JsonSetter(value = "company_contribution", nulls = Nulls.SKIP)
        public Builder companyContribution(Optional<Double> companyContribution) {
            this.companyContribution = companyContribution;
            return this;
        }

        public Builder companyContribution(Double companyContribution) {
            this.companyContribution = Optional.of(companyContribution);
            return this;
        }

        @JsonSetter(value = "start_date", nulls = Nulls.SKIP)
        public Builder startDate(Optional<OffsetDateTime> startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            this.startDate = Optional.of(startDate);
            return this;
        }

        @JsonSetter(value = "end_date", nulls = Nulls.SKIP)
        public Builder endDate(Optional<OffsetDateTime> endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder endDate(OffsetDateTime endDate) {
            this.endDate = Optional.of(endDate);
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

        public Benefit build() {
            return new Benefit(
                    id,
                    remoteId,
                    employee,
                    providerName,
                    benefitPlanType,
                    employeeContribution,
                    companyContribution,
                    startDate,
                    endDate,
                    remoteWasDeleted,
                    modifiedAt,
                    fieldMappings,
                    remoteData);
        }
    }
}