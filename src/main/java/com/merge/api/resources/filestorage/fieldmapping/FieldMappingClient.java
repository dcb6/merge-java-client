/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.filestorage.fieldmapping;

import com.merge.api.core.ApiError;
import com.merge.api.core.ClientOptions;
import com.merge.api.core.MediaTypes;
import com.merge.api.core.ObjectMappers;
import com.merge.api.core.RequestOptions;
import com.merge.api.resources.filestorage.fieldmapping.requests.CreateFieldMappingRequest;
import com.merge.api.resources.filestorage.fieldmapping.requests.PatchedEditFieldMappingRequest;
import com.merge.api.resources.filestorage.fieldmapping.requests.RemoteFieldsRetrieveRequest;
import com.merge.api.resources.filestorage.types.ExternalTargetFieldApiResponse;
import com.merge.api.resources.filestorage.types.FieldMappingApiInstanceResponse;
import com.merge.api.resources.filestorage.types.FieldMappingInstanceResponse;
import com.merge.api.resources.filestorage.types.RemoteFieldApiResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class FieldMappingClient {
    protected final ClientOptions clientOptions;

    public FieldMappingClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Get all Field Mappings for this Linked Account. Field Mappings are mappings between third-party Remote Fields and user defined Merge fields. <a href="https://docs.merge.dev/supplemental-data/field-mappings/overview/">Learn more</a>.
     */
    public FieldMappingApiInstanceResponse fieldMappingsRetrieve() {
        return fieldMappingsRetrieve(null);
    }

    /**
     * Get all Field Mappings for this Linked Account. Field Mappings are mappings between third-party Remote Fields and user defined Merge fields. <a href="https://docs.merge.dev/supplemental-data/field-mappings/overview/">Learn more</a>.
     */
    public FieldMappingApiInstanceResponse fieldMappingsRetrieve(RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("api/filestorage/v1/field-mappings")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), FieldMappingApiInstanceResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Create new Field Mappings that will be available after the next scheduled sync. This will cause the next sync for this Linked Account to sync <strong>ALL</strong> data from start.
     */
    public FieldMappingInstanceResponse fieldMappingsCreate(CreateFieldMappingRequest request) {
        return fieldMappingsCreate(request, null);
    }

    /**
     * Create new Field Mappings that will be available after the next scheduled sync. This will cause the next sync for this Linked Account to sync <strong>ALL</strong> data from start.
     */
    public FieldMappingInstanceResponse fieldMappingsCreate(
            CreateFieldMappingRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("api/filestorage/v1/field-mappings")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), FieldMappingInstanceResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Deletes Field Mappings for a Linked Account. All data related to this Field Mapping will be deleted and these changes will be reflected after the next scheduled sync. This will cause the next sync for this Linked Account to sync <strong>ALL</strong> data from start.
     */
    public FieldMappingInstanceResponse fieldMappingsDestroy(String fieldMappingId) {
        return fieldMappingsDestroy(fieldMappingId, null);
    }

    /**
     * Deletes Field Mappings for a Linked Account. All data related to this Field Mapping will be deleted and these changes will be reflected after the next scheduled sync. This will cause the next sync for this Linked Account to sync <strong>ALL</strong> data from start.
     */
    public FieldMappingInstanceResponse fieldMappingsDestroy(String fieldMappingId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("api/filestorage/v1/field-mappings")
                .addPathSegment(fieldMappingId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), FieldMappingInstanceResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Create or update existing Field Mappings for a Linked Account. Changes will be reflected after the next scheduled sync. This will cause the next sync for this Linked Account to sync <strong>ALL</strong> data from start.
     */
    public FieldMappingInstanceResponse fieldMappingsPartialUpdate(String fieldMappingId) {
        return fieldMappingsPartialUpdate(
                fieldMappingId, PatchedEditFieldMappingRequest.builder().build());
    }

    /**
     * Create or update existing Field Mappings for a Linked Account. Changes will be reflected after the next scheduled sync. This will cause the next sync for this Linked Account to sync <strong>ALL</strong> data from start.
     */
    public FieldMappingInstanceResponse fieldMappingsPartialUpdate(
            String fieldMappingId, PatchedEditFieldMappingRequest request) {
        return fieldMappingsPartialUpdate(fieldMappingId, request, null);
    }

    /**
     * Create or update existing Field Mappings for a Linked Account. Changes will be reflected after the next scheduled sync. This will cause the next sync for this Linked Account to sync <strong>ALL</strong> data from start.
     */
    public FieldMappingInstanceResponse fieldMappingsPartialUpdate(
            String fieldMappingId, PatchedEditFieldMappingRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("api/filestorage/v1/field-mappings")
                .addPathSegment(fieldMappingId)
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("PATCH", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), FieldMappingInstanceResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get all remote fields for a Linked Account. Remote fields are third-party fields that are accessible after initial sync if remote_data is enabled. You can use remote fields to override existing Merge fields or map a new Merge field. <a href="https://docs.merge.dev/supplemental-data/field-mappings/overview/">Learn more</a>.
     */
    public RemoteFieldApiResponse remoteFieldsRetrieve() {
        return remoteFieldsRetrieve(RemoteFieldsRetrieveRequest.builder().build());
    }

    /**
     * Get all remote fields for a Linked Account. Remote fields are third-party fields that are accessible after initial sync if remote_data is enabled. You can use remote fields to override existing Merge fields or map a new Merge field. <a href="https://docs.merge.dev/supplemental-data/field-mappings/overview/">Learn more</a>.
     */
    public RemoteFieldApiResponse remoteFieldsRetrieve(RemoteFieldsRetrieveRequest request) {
        return remoteFieldsRetrieve(request, null);
    }

    /**
     * Get all remote fields for a Linked Account. Remote fields are third-party fields that are accessible after initial sync if remote_data is enabled. You can use remote fields to override existing Merge fields or map a new Merge field. <a href="https://docs.merge.dev/supplemental-data/field-mappings/overview/">Learn more</a>.
     */
    public RemoteFieldApiResponse remoteFieldsRetrieve(
            RemoteFieldsRetrieveRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("api/filestorage/v1/remote-fields");
        if (request.getCommonModels().isPresent()) {
            httpUrl.addQueryParameter("common_models", request.getCommonModels().get());
        }
        if (request.getIncludeExampleValues().isPresent()) {
            httpUrl.addQueryParameter(
                    "include_example_values", request.getIncludeExampleValues().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), RemoteFieldApiResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get all organization-wide Target Fields, this will not include any Linked Account specific Target Fields. Organization-wide Target Fields are additional fields appended to the Merge Common Model for all Linked Accounts in a category. <a href="https://docs.merge.dev/supplemental-data/field-mappings/target-fields/">Learn more</a>.
     */
    public ExternalTargetFieldApiResponse targetFieldsRetrieve() {
        return targetFieldsRetrieve(null);
    }

    /**
     * Get all organization-wide Target Fields, this will not include any Linked Account specific Target Fields. Organization-wide Target Fields are additional fields appended to the Merge Common Model for all Linked Accounts in a category. <a href="https://docs.merge.dev/supplemental-data/field-mappings/target-fields/">Learn more</a>.
     */
    public ExternalTargetFieldApiResponse targetFieldsRetrieve(RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("api/filestorage/v1/target-fields")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), ExternalTargetFieldApiResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
