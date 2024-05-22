/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.ats.types;

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
@JsonDeserialize(builder = ExternalTargetFieldApiResponse.Builder.class)
public final class ExternalTargetFieldApiResponse {
    private final Optional<List<ExternalTargetFieldApi>> activity;

    private final Optional<List<ExternalTargetFieldApi>> application;

    private final Optional<List<ExternalTargetFieldApi>> attachment;

    private final Optional<List<ExternalTargetFieldApi>> candidate;

    private final Optional<List<ExternalTargetFieldApi>> department;

    private final Optional<List<ExternalTargetFieldApi>> eeoc;

    private final Optional<List<ExternalTargetFieldApi>> scheduledInterview;

    private final Optional<List<ExternalTargetFieldApi>> job;

    private final Optional<List<ExternalTargetFieldApi>> jobPosting;

    private final Optional<List<ExternalTargetFieldApi>> jobInterviewStage;

    private final Optional<List<ExternalTargetFieldApi>> offer;

    private final Optional<List<ExternalTargetFieldApi>> office;

    private final Optional<List<ExternalTargetFieldApi>> rejectReason;

    private final Optional<List<ExternalTargetFieldApi>> scorecard;

    private final Optional<List<ExternalTargetFieldApi>> tag;

    private final Optional<List<ExternalTargetFieldApi>> remoteUser;

    private final Map<String, Object> additionalProperties;

    private ExternalTargetFieldApiResponse(
            Optional<List<ExternalTargetFieldApi>> activity,
            Optional<List<ExternalTargetFieldApi>> application,
            Optional<List<ExternalTargetFieldApi>> attachment,
            Optional<List<ExternalTargetFieldApi>> candidate,
            Optional<List<ExternalTargetFieldApi>> department,
            Optional<List<ExternalTargetFieldApi>> eeoc,
            Optional<List<ExternalTargetFieldApi>> scheduledInterview,
            Optional<List<ExternalTargetFieldApi>> job,
            Optional<List<ExternalTargetFieldApi>> jobPosting,
            Optional<List<ExternalTargetFieldApi>> jobInterviewStage,
            Optional<List<ExternalTargetFieldApi>> offer,
            Optional<List<ExternalTargetFieldApi>> office,
            Optional<List<ExternalTargetFieldApi>> rejectReason,
            Optional<List<ExternalTargetFieldApi>> scorecard,
            Optional<List<ExternalTargetFieldApi>> tag,
            Optional<List<ExternalTargetFieldApi>> remoteUser,
            Map<String, Object> additionalProperties) {
        this.activity = activity;
        this.application = application;
        this.attachment = attachment;
        this.candidate = candidate;
        this.department = department;
        this.eeoc = eeoc;
        this.scheduledInterview = scheduledInterview;
        this.job = job;
        this.jobPosting = jobPosting;
        this.jobInterviewStage = jobInterviewStage;
        this.offer = offer;
        this.office = office;
        this.rejectReason = rejectReason;
        this.scorecard = scorecard;
        this.tag = tag;
        this.remoteUser = remoteUser;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("Activity")
    public Optional<List<ExternalTargetFieldApi>> getActivity() {
        return activity;
    }

    @JsonProperty("Application")
    public Optional<List<ExternalTargetFieldApi>> getApplication() {
        return application;
    }

    @JsonProperty("Attachment")
    public Optional<List<ExternalTargetFieldApi>> getAttachment() {
        return attachment;
    }

    @JsonProperty("Candidate")
    public Optional<List<ExternalTargetFieldApi>> getCandidate() {
        return candidate;
    }

    @JsonProperty("Department")
    public Optional<List<ExternalTargetFieldApi>> getDepartment() {
        return department;
    }

    @JsonProperty("EEOC")
    public Optional<List<ExternalTargetFieldApi>> getEeoc() {
        return eeoc;
    }

    @JsonProperty("ScheduledInterview")
    public Optional<List<ExternalTargetFieldApi>> getScheduledInterview() {
        return scheduledInterview;
    }

    @JsonProperty("Job")
    public Optional<List<ExternalTargetFieldApi>> getJob() {
        return job;
    }

    @JsonProperty("JobPosting")
    public Optional<List<ExternalTargetFieldApi>> getJobPosting() {
        return jobPosting;
    }

    @JsonProperty("JobInterviewStage")
    public Optional<List<ExternalTargetFieldApi>> getJobInterviewStage() {
        return jobInterviewStage;
    }

    @JsonProperty("Offer")
    public Optional<List<ExternalTargetFieldApi>> getOffer() {
        return offer;
    }

    @JsonProperty("Office")
    public Optional<List<ExternalTargetFieldApi>> getOffice() {
        return office;
    }

    @JsonProperty("RejectReason")
    public Optional<List<ExternalTargetFieldApi>> getRejectReason() {
        return rejectReason;
    }

    @JsonProperty("Scorecard")
    public Optional<List<ExternalTargetFieldApi>> getScorecard() {
        return scorecard;
    }

    @JsonProperty("Tag")
    public Optional<List<ExternalTargetFieldApi>> getTag() {
        return tag;
    }

    @JsonProperty("RemoteUser")
    public Optional<List<ExternalTargetFieldApi>> getRemoteUser() {
        return remoteUser;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ExternalTargetFieldApiResponse && equalTo((ExternalTargetFieldApiResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ExternalTargetFieldApiResponse other) {
        return activity.equals(other.activity)
                && application.equals(other.application)
                && attachment.equals(other.attachment)
                && candidate.equals(other.candidate)
                && department.equals(other.department)
                && eeoc.equals(other.eeoc)
                && scheduledInterview.equals(other.scheduledInterview)
                && job.equals(other.job)
                && jobPosting.equals(other.jobPosting)
                && jobInterviewStage.equals(other.jobInterviewStage)
                && offer.equals(other.offer)
                && office.equals(other.office)
                && rejectReason.equals(other.rejectReason)
                && scorecard.equals(other.scorecard)
                && tag.equals(other.tag)
                && remoteUser.equals(other.remoteUser);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.activity,
                this.application,
                this.attachment,
                this.candidate,
                this.department,
                this.eeoc,
                this.scheduledInterview,
                this.job,
                this.jobPosting,
                this.jobInterviewStage,
                this.offer,
                this.office,
                this.rejectReason,
                this.scorecard,
                this.tag,
                this.remoteUser);
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
        private Optional<List<ExternalTargetFieldApi>> activity = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> application = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> attachment = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> candidate = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> department = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> eeoc = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> scheduledInterview = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> job = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> jobPosting = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> jobInterviewStage = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> offer = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> office = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> rejectReason = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> scorecard = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> tag = Optional.empty();

        private Optional<List<ExternalTargetFieldApi>> remoteUser = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ExternalTargetFieldApiResponse other) {
            activity(other.getActivity());
            application(other.getApplication());
            attachment(other.getAttachment());
            candidate(other.getCandidate());
            department(other.getDepartment());
            eeoc(other.getEeoc());
            scheduledInterview(other.getScheduledInterview());
            job(other.getJob());
            jobPosting(other.getJobPosting());
            jobInterviewStage(other.getJobInterviewStage());
            offer(other.getOffer());
            office(other.getOffice());
            rejectReason(other.getRejectReason());
            scorecard(other.getScorecard());
            tag(other.getTag());
            remoteUser(other.getRemoteUser());
            return this;
        }

        @JsonSetter(value = "Activity", nulls = Nulls.SKIP)
        public Builder activity(Optional<List<ExternalTargetFieldApi>> activity) {
            this.activity = activity;
            return this;
        }

        public Builder activity(List<ExternalTargetFieldApi> activity) {
            this.activity = Optional.of(activity);
            return this;
        }

        @JsonSetter(value = "Application", nulls = Nulls.SKIP)
        public Builder application(Optional<List<ExternalTargetFieldApi>> application) {
            this.application = application;
            return this;
        }

        public Builder application(List<ExternalTargetFieldApi> application) {
            this.application = Optional.of(application);
            return this;
        }

        @JsonSetter(value = "Attachment", nulls = Nulls.SKIP)
        public Builder attachment(Optional<List<ExternalTargetFieldApi>> attachment) {
            this.attachment = attachment;
            return this;
        }

        public Builder attachment(List<ExternalTargetFieldApi> attachment) {
            this.attachment = Optional.of(attachment);
            return this;
        }

        @JsonSetter(value = "Candidate", nulls = Nulls.SKIP)
        public Builder candidate(Optional<List<ExternalTargetFieldApi>> candidate) {
            this.candidate = candidate;
            return this;
        }

        public Builder candidate(List<ExternalTargetFieldApi> candidate) {
            this.candidate = Optional.of(candidate);
            return this;
        }

        @JsonSetter(value = "Department", nulls = Nulls.SKIP)
        public Builder department(Optional<List<ExternalTargetFieldApi>> department) {
            this.department = department;
            return this;
        }

        public Builder department(List<ExternalTargetFieldApi> department) {
            this.department = Optional.of(department);
            return this;
        }

        @JsonSetter(value = "EEOC", nulls = Nulls.SKIP)
        public Builder eeoc(Optional<List<ExternalTargetFieldApi>> eeoc) {
            this.eeoc = eeoc;
            return this;
        }

        public Builder eeoc(List<ExternalTargetFieldApi> eeoc) {
            this.eeoc = Optional.of(eeoc);
            return this;
        }

        @JsonSetter(value = "ScheduledInterview", nulls = Nulls.SKIP)
        public Builder scheduledInterview(Optional<List<ExternalTargetFieldApi>> scheduledInterview) {
            this.scheduledInterview = scheduledInterview;
            return this;
        }

        public Builder scheduledInterview(List<ExternalTargetFieldApi> scheduledInterview) {
            this.scheduledInterview = Optional.of(scheduledInterview);
            return this;
        }

        @JsonSetter(value = "Job", nulls = Nulls.SKIP)
        public Builder job(Optional<List<ExternalTargetFieldApi>> job) {
            this.job = job;
            return this;
        }

        public Builder job(List<ExternalTargetFieldApi> job) {
            this.job = Optional.of(job);
            return this;
        }

        @JsonSetter(value = "JobPosting", nulls = Nulls.SKIP)
        public Builder jobPosting(Optional<List<ExternalTargetFieldApi>> jobPosting) {
            this.jobPosting = jobPosting;
            return this;
        }

        public Builder jobPosting(List<ExternalTargetFieldApi> jobPosting) {
            this.jobPosting = Optional.of(jobPosting);
            return this;
        }

        @JsonSetter(value = "JobInterviewStage", nulls = Nulls.SKIP)
        public Builder jobInterviewStage(Optional<List<ExternalTargetFieldApi>> jobInterviewStage) {
            this.jobInterviewStage = jobInterviewStage;
            return this;
        }

        public Builder jobInterviewStage(List<ExternalTargetFieldApi> jobInterviewStage) {
            this.jobInterviewStage = Optional.of(jobInterviewStage);
            return this;
        }

        @JsonSetter(value = "Offer", nulls = Nulls.SKIP)
        public Builder offer(Optional<List<ExternalTargetFieldApi>> offer) {
            this.offer = offer;
            return this;
        }

        public Builder offer(List<ExternalTargetFieldApi> offer) {
            this.offer = Optional.of(offer);
            return this;
        }

        @JsonSetter(value = "Office", nulls = Nulls.SKIP)
        public Builder office(Optional<List<ExternalTargetFieldApi>> office) {
            this.office = office;
            return this;
        }

        public Builder office(List<ExternalTargetFieldApi> office) {
            this.office = Optional.of(office);
            return this;
        }

        @JsonSetter(value = "RejectReason", nulls = Nulls.SKIP)
        public Builder rejectReason(Optional<List<ExternalTargetFieldApi>> rejectReason) {
            this.rejectReason = rejectReason;
            return this;
        }

        public Builder rejectReason(List<ExternalTargetFieldApi> rejectReason) {
            this.rejectReason = Optional.of(rejectReason);
            return this;
        }

        @JsonSetter(value = "Scorecard", nulls = Nulls.SKIP)
        public Builder scorecard(Optional<List<ExternalTargetFieldApi>> scorecard) {
            this.scorecard = scorecard;
            return this;
        }

        public Builder scorecard(List<ExternalTargetFieldApi> scorecard) {
            this.scorecard = Optional.of(scorecard);
            return this;
        }

        @JsonSetter(value = "Tag", nulls = Nulls.SKIP)
        public Builder tag(Optional<List<ExternalTargetFieldApi>> tag) {
            this.tag = tag;
            return this;
        }

        public Builder tag(List<ExternalTargetFieldApi> tag) {
            this.tag = Optional.of(tag);
            return this;
        }

        @JsonSetter(value = "RemoteUser", nulls = Nulls.SKIP)
        public Builder remoteUser(Optional<List<ExternalTargetFieldApi>> remoteUser) {
            this.remoteUser = remoteUser;
            return this;
        }

        public Builder remoteUser(List<ExternalTargetFieldApi> remoteUser) {
            this.remoteUser = Optional.of(remoteUser);
            return this;
        }

        public ExternalTargetFieldApiResponse build() {
            return new ExternalTargetFieldApiResponse(
                    activity,
                    application,
                    attachment,
                    candidate,
                    department,
                    eeoc,
                    scheduledInterview,
                    job,
                    jobPosting,
                    jobInterviewStage,
                    offer,
                    office,
                    rejectReason,
                    scorecard,
                    tag,
                    remoteUser,
                    additionalProperties);
        }
    }
}