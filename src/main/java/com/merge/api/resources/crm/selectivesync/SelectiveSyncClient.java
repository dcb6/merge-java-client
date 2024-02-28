/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.crm.selectivesync;

import com.fasterxml.jackson.core.type.TypeReference;
import com.merge.api.core.ApiError;
import com.merge.api.core.ClientOptions;
import com.merge.api.core.MediaTypes;
import com.merge.api.core.ObjectMappers;
import com.merge.api.core.RequestOptions;
import com.merge.api.resources.crm.selectivesync.requests.LinkedAccountSelectiveSyncConfigurationListRequest;
import com.merge.api.resources.crm.selectivesync.requests.SelectiveSyncMetaListRequest;
import com.merge.api.resources.crm.types.LinkedAccountSelectiveSyncConfiguration;
import com.merge.api.resources.crm.types.PaginatedConditionSchemaList;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SelectiveSyncClient {
    protected final ClientOptions clientOptions;

    public SelectiveSyncClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Get a linked account's selective syncs.
     */
    public List<LinkedAccountSelectiveSyncConfiguration> configurationsList() {
        return configurationsList(null);
    }

    /**
     * Get a linked account's selective syncs.
     */
    public List<LinkedAccountSelectiveSyncConfiguration> configurationsList(RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("crm/v1/selective-sync/configurations")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
                client = clientOptions.httpClientWithTimeout(requestOptions);
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(),
                        new TypeReference<List<LinkedAccountSelectiveSyncConfiguration>>() {});
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Replace a linked account's selective syncs.
     */
    public List<LinkedAccountSelectiveSyncConfiguration> configurationsUpdate(
            LinkedAccountSelectiveSyncConfigurationListRequest request) {
        return configurationsUpdate(request, null);
    }

    /**
     * Replace a linked account's selective syncs.
     */
    public List<LinkedAccountSelectiveSyncConfiguration> configurationsUpdate(
            LinkedAccountSelectiveSyncConfigurationListRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("crm/v1/selective-sync/configurations")
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
                .method("PUT", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
                client = clientOptions.httpClientWithTimeout(requestOptions);
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(),
                        new TypeReference<List<LinkedAccountSelectiveSyncConfiguration>>() {});
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get metadata for the conditions available to a linked account.
     */
    public PaginatedConditionSchemaList metaList() {
        return metaList(SelectiveSyncMetaListRequest.builder().build());
    }

    /**
     * Get metadata for the conditions available to a linked account.
     */
    public PaginatedConditionSchemaList metaList(SelectiveSyncMetaListRequest request) {
        return metaList(request, null);
    }

    /**
     * Get metadata for the conditions available to a linked account.
     */
    public PaginatedConditionSchemaList metaList(SelectiveSyncMetaListRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("crm/v1/selective-sync/meta");
        if (request.getCommonModel().isPresent()) {
            httpUrl.addQueryParameter("common_model", request.getCommonModel().get());
        }
        if (request.getCursor().isPresent()) {
            httpUrl.addQueryParameter("cursor", request.getCursor().get());
        }
        if (request.getPageSize().isPresent()) {
            httpUrl.addQueryParameter("page_size", request.getPageSize().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
                client = clientOptions.httpClientWithTimeout(requestOptions);
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), PaginatedConditionSchemaList.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
