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
@JsonDeserialize(builder = EmployerBenefit.Builder.class)
public final class EmployerBenefit {
    private final Optional<String> id;

    private final Optional<String> remoteId;

    private final Optional<EmployerBenefitBenefitPlanType> benefitPlanType;

    private final Optional<String> name;

    private final Optional<String> description;

    private final Optional<String> deductionCode;

    private final Optional<Boolean> remoteWasDeleted;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<Map<String, JsonNode>> fieldMappings;

    private final Optional<List<Optional<Map<String, JsonNode>>>> remoteData;

    private EmployerBenefit(
            Optional<String> id,
            Optional<String> remoteId,
            Optional<EmployerBenefitBenefitPlanType> benefitPlanType,
            Optional<String> name,
            Optional<String> description,
            Optional<String> deductionCode,
            Optional<Boolean> remoteWasDeleted,
            Optional<OffsetDateTime> modifiedAt,
            Optional<Map<String, JsonNode>> fieldMappings,
            Optional<List<Optional<Map<String, JsonNode>>>> remoteData) {
        this.id = id;
        this.remoteId = remoteId;
        this.benefitPlanType = benefitPlanType;
        this.name = name;
        this.description = description;
        this.deductionCode = deductionCode;
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
     * @return The type of benefit plan.
     * <ul>
     * <li><code>MEDICAL</code> - MEDICAL</li>
     * <li><code>HEALTH_SAVINGS</code> - HEALTH_SAVINGS</li>
     * <li><code>INSURANCE</code> - INSURANCE</li>
     * <li><code>RETIREMENT</code> - RETIREMENT</li>
     * <li><code>OTHER</code> - OTHER</li>
     * </ul>
     */
    @JsonProperty("benefit_plan_type")
    public Optional<EmployerBenefitBenefitPlanType> getBenefitPlanType() {
        return benefitPlanType;
    }

    /**
     * @return The employer benefit's name - typically the carrier or network name.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return The employer benefit's description.
     */
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    /**
     * @return The employer benefit's deduction code.
     */
    @JsonProperty("deduction_code")
    public Optional<String> getDeductionCode() {
        return deductionCode;
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
    public Optional<List<Optional<Map<String, JsonNode>>>> getRemoteData() {
        return remoteData;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EmployerBenefit && equalTo((EmployerBenefit) other);
    }

    private boolean equalTo(EmployerBenefit other) {
        return id.equals(other.id)
                && remoteId.equals(other.remoteId)
                && benefitPlanType.equals(other.benefitPlanType)
                && name.equals(other.name)
                && description.equals(other.description)
                && deductionCode.equals(other.deductionCode)
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
                this.benefitPlanType,
                this.name,
                this.description,
                this.deductionCode,
                this.remoteWasDeleted,
                this.modifiedAt,
                this.fieldMappings,
                this.remoteData);
    }

    @Override
    public String toString() {
        return "EmployerBenefit{" + "id: " + id + ", remoteId: " + remoteId + ", benefitPlanType: " + benefitPlanType
                + ", name: " + name + ", description: " + description + ", deductionCode: " + deductionCode
                + ", remoteWasDeleted: " + remoteWasDeleted + ", modifiedAt: " + modifiedAt + ", fieldMappings: "
                + fieldMappings + ", remoteData: " + remoteData + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> id = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<EmployerBenefitBenefitPlanType> benefitPlanType = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> deductionCode = Optional.empty();

        private Optional<Boolean> remoteWasDeleted = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<Map<String, JsonNode>> fieldMappings = Optional.empty();

        private Optional<List<Optional<Map<String, JsonNode>>>> remoteData = Optional.empty();

        private Builder() {}

        public Builder from(EmployerBenefit other) {
            id(other.getId());
            remoteId(other.getRemoteId());
            benefitPlanType(other.getBenefitPlanType());
            name(other.getName());
            description(other.getDescription());
            deductionCode(other.getDeductionCode());
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

        @JsonSetter(value = "benefit_plan_type", nulls = Nulls.SKIP)
        public Builder benefitPlanType(Optional<EmployerBenefitBenefitPlanType> benefitPlanType) {
            this.benefitPlanType = benefitPlanType;
            return this;
        }

        public Builder benefitPlanType(EmployerBenefitBenefitPlanType benefitPlanType) {
            this.benefitPlanType = Optional.of(benefitPlanType);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
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

        @JsonSetter(value = "deduction_code", nulls = Nulls.SKIP)
        public Builder deductionCode(Optional<String> deductionCode) {
            this.deductionCode = deductionCode;
            return this;
        }

        public Builder deductionCode(String deductionCode) {
            this.deductionCode = Optional.of(deductionCode);
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
        public Builder remoteData(Optional<List<Optional<Map<String, JsonNode>>>> remoteData) {
            this.remoteData = remoteData;
            return this;
        }

        public Builder remoteData(List<Optional<Map<String, JsonNode>>> remoteData) {
            this.remoteData = Optional.of(remoteData);
            return this;
        }

        public EmployerBenefit build() {
            return new EmployerBenefit(
                    id,
                    remoteId,
                    benefitPlanType,
                    name,
                    description,
                    deductionCode,
                    remoteWasDeleted,
                    modifiedAt,
                    fieldMappings,
                    remoteData);
        }
    }
}
