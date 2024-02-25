/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.ats.selectivesync.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import com.merge.api.resources.ats.types.LinkedAccountSelectiveSyncConfigurationRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LinkedAccountSelectiveSyncConfigurationListRequest.Builder.class)
public final class LinkedAccountSelectiveSyncConfigurationListRequest {
    private final List<LinkedAccountSelectiveSyncConfigurationRequest> syncConfigurations;

    private final Map<String, Object> additionalProperties;

    private LinkedAccountSelectiveSyncConfigurationListRequest(
            List<LinkedAccountSelectiveSyncConfigurationRequest> syncConfigurations,
            Map<String, Object> additionalProperties) {
        this.syncConfigurations = syncConfigurations;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The selective syncs associated with a linked account.
     */
    @JsonProperty("sync_configurations")
    public List<LinkedAccountSelectiveSyncConfigurationRequest> getSyncConfigurations() {
        return syncConfigurations;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LinkedAccountSelectiveSyncConfigurationListRequest
                && equalTo((LinkedAccountSelectiveSyncConfigurationListRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(LinkedAccountSelectiveSyncConfigurationListRequest other) {
        return syncConfigurations.equals(other.syncConfigurations);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.syncConfigurations);
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
        private List<LinkedAccountSelectiveSyncConfigurationRequest> syncConfigurations = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(LinkedAccountSelectiveSyncConfigurationListRequest other) {
            syncConfigurations(other.getSyncConfigurations());
            return this;
        }

        @JsonSetter(value = "sync_configurations", nulls = Nulls.SKIP)
        public Builder syncConfigurations(List<LinkedAccountSelectiveSyncConfigurationRequest> syncConfigurations) {
            this.syncConfigurations.clear();
            this.syncConfigurations.addAll(syncConfigurations);
            return this;
        }

        public Builder addSyncConfigurations(LinkedAccountSelectiveSyncConfigurationRequest syncConfigurations) {
            this.syncConfigurations.add(syncConfigurations);
            return this;
        }

        public Builder addAllSyncConfigurations(
                List<LinkedAccountSelectiveSyncConfigurationRequest> syncConfigurations) {
            this.syncConfigurations.addAll(syncConfigurations);
            return this;
        }

        public LinkedAccountSelectiveSyncConfigurationListRequest build() {
            return new LinkedAccountSelectiveSyncConfigurationListRequest(syncConfigurations, additionalProperties);
        }
    }
}
