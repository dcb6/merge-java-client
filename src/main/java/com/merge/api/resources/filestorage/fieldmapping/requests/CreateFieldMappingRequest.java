/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.filestorage.fieldmapping.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CreateFieldMappingRequest.Builder.class)
public final class CreateFieldMappingRequest {
    private final String targetFieldName;

    private final String targetFieldDescription;

    private final List<JsonNode> remoteFieldTraversalPath;

    private final String remoteMethod;

    private final String remoteUrlPath;

    private final String commonModelName;

    private final Map<String, Object> additionalProperties;

    private CreateFieldMappingRequest(
            String targetFieldName,
            String targetFieldDescription,
            List<JsonNode> remoteFieldTraversalPath,
            String remoteMethod,
            String remoteUrlPath,
            String commonModelName,
            Map<String, Object> additionalProperties) {
        this.targetFieldName = targetFieldName;
        this.targetFieldDescription = targetFieldDescription;
        this.remoteFieldTraversalPath = remoteFieldTraversalPath;
        this.remoteMethod = remoteMethod;
        this.remoteUrlPath = remoteUrlPath;
        this.commonModelName = commonModelName;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The name of the target field you want this remote field to map to.
     */
    @JsonProperty("target_field_name")
    public String getTargetFieldName() {
        return targetFieldName;
    }

    /**
     * @return The description of the target field you want this remote field to map to.
     */
    @JsonProperty("target_field_description")
    public String getTargetFieldDescription() {
        return targetFieldDescription;
    }

    /**
     * @return The field traversal path of the remote field listed when you hit the GET /remote-fields endpoint.
     */
    @JsonProperty("remote_field_traversal_path")
    public List<JsonNode> getRemoteFieldTraversalPath() {
        return remoteFieldTraversalPath;
    }

    /**
     * @return The method of the remote endpoint where the remote field is coming from.
     */
    @JsonProperty("remote_method")
    public String getRemoteMethod() {
        return remoteMethod;
    }

    /**
     * @return The path of the remote endpoint where the remote field is coming from.
     */
    @JsonProperty("remote_url_path")
    public String getRemoteUrlPath() {
        return remoteUrlPath;
    }

    /**
     * @return The name of the Common Model that the remote field corresponds to in a given category.
     */
    @JsonProperty("common_model_name")
    public String getCommonModelName() {
        return commonModelName;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateFieldMappingRequest && equalTo((CreateFieldMappingRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateFieldMappingRequest other) {
        return targetFieldName.equals(other.targetFieldName)
                && targetFieldDescription.equals(other.targetFieldDescription)
                && remoteFieldTraversalPath.equals(other.remoteFieldTraversalPath)
                && remoteMethod.equals(other.remoteMethod)
                && remoteUrlPath.equals(other.remoteUrlPath)
                && commonModelName.equals(other.commonModelName);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.targetFieldName,
                this.targetFieldDescription,
                this.remoteFieldTraversalPath,
                this.remoteMethod,
                this.remoteUrlPath,
                this.commonModelName);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TargetFieldNameStage builder() {
        return new Builder();
    }

    public interface TargetFieldNameStage {
        TargetFieldDescriptionStage targetFieldName(String targetFieldName);

        Builder from(CreateFieldMappingRequest other);
    }

    public interface TargetFieldDescriptionStage {
        RemoteMethodStage targetFieldDescription(String targetFieldDescription);
    }

    public interface RemoteMethodStage {
        RemoteUrlPathStage remoteMethod(String remoteMethod);
    }

    public interface RemoteUrlPathStage {
        CommonModelNameStage remoteUrlPath(String remoteUrlPath);
    }

    public interface CommonModelNameStage {
        _FinalStage commonModelName(String commonModelName);
    }

    public interface _FinalStage {
        CreateFieldMappingRequest build();

        _FinalStage remoteFieldTraversalPath(List<JsonNode> remoteFieldTraversalPath);

        _FinalStage addRemoteFieldTraversalPath(JsonNode remoteFieldTraversalPath);

        _FinalStage addAllRemoteFieldTraversalPath(List<JsonNode> remoteFieldTraversalPath);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements TargetFieldNameStage,
                    TargetFieldDescriptionStage,
                    RemoteMethodStage,
                    RemoteUrlPathStage,
                    CommonModelNameStage,
                    _FinalStage {
        private String targetFieldName;

        private String targetFieldDescription;

        private String remoteMethod;

        private String remoteUrlPath;

        private String commonModelName;

        private List<JsonNode> remoteFieldTraversalPath = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CreateFieldMappingRequest other) {
            targetFieldName(other.getTargetFieldName());
            targetFieldDescription(other.getTargetFieldDescription());
            remoteFieldTraversalPath(other.getRemoteFieldTraversalPath());
            remoteMethod(other.getRemoteMethod());
            remoteUrlPath(other.getRemoteUrlPath());
            commonModelName(other.getCommonModelName());
            return this;
        }

        /**
         * <p>The name of the target field you want this remote field to map to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("target_field_name")
        public TargetFieldDescriptionStage targetFieldName(String targetFieldName) {
            this.targetFieldName = targetFieldName;
            return this;
        }

        /**
         * <p>The description of the target field you want this remote field to map to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("target_field_description")
        public RemoteMethodStage targetFieldDescription(String targetFieldDescription) {
            this.targetFieldDescription = targetFieldDescription;
            return this;
        }

        /**
         * <p>The method of the remote endpoint where the remote field is coming from.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("remote_method")
        public RemoteUrlPathStage remoteMethod(String remoteMethod) {
            this.remoteMethod = remoteMethod;
            return this;
        }

        /**
         * <p>The path of the remote endpoint where the remote field is coming from.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("remote_url_path")
        public CommonModelNameStage remoteUrlPath(String remoteUrlPath) {
            this.remoteUrlPath = remoteUrlPath;
            return this;
        }

        /**
         * <p>The name of the Common Model that the remote field corresponds to in a given category.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("common_model_name")
        public _FinalStage commonModelName(String commonModelName) {
            this.commonModelName = commonModelName;
            return this;
        }

        /**
         * <p>The field traversal path of the remote field listed when you hit the GET /remote-fields endpoint.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllRemoteFieldTraversalPath(List<JsonNode> remoteFieldTraversalPath) {
            this.remoteFieldTraversalPath.addAll(remoteFieldTraversalPath);
            return this;
        }

        /**
         * <p>The field traversal path of the remote field listed when you hit the GET /remote-fields endpoint.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addRemoteFieldTraversalPath(JsonNode remoteFieldTraversalPath) {
            this.remoteFieldTraversalPath.add(remoteFieldTraversalPath);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "remote_field_traversal_path", nulls = Nulls.SKIP)
        public _FinalStage remoteFieldTraversalPath(List<JsonNode> remoteFieldTraversalPath) {
            this.remoteFieldTraversalPath.clear();
            this.remoteFieldTraversalPath.addAll(remoteFieldTraversalPath);
            return this;
        }

        @java.lang.Override
        public CreateFieldMappingRequest build() {
            return new CreateFieldMappingRequest(
                    targetFieldName,
                    targetFieldDescription,
                    remoteFieldTraversalPath,
                    remoteMethod,
                    remoteUrlPath,
                    commonModelName,
                    additionalProperties);
        }
    }
}
