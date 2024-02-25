/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.accounting.accountingperiods;

import com.merge.api.core.ApiError;
import com.merge.api.core.ClientOptions;
import com.merge.api.core.ObjectMappers;
import com.merge.api.core.RequestOptions;
import com.merge.api.resources.accounting.accountingperiods.requests.AccountingPeriodsListRequest;
import com.merge.api.resources.accounting.accountingperiods.requests.AccountingPeriodsRetrieveRequest;
import com.merge.api.resources.accounting.types.AccountingPeriod;
import com.merge.api.resources.accounting.types.PaginatedAccountingPeriodList;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class AccountingPeriodsClient {
    protected final ClientOptions clientOptions;

    public AccountingPeriodsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Returns a list of <code>AccountingPeriod</code> objects.
     */
    public PaginatedAccountingPeriodList list() {
        return list(AccountingPeriodsListRequest.builder().build());
    }

    /**
     * Returns a list of <code>AccountingPeriod</code> objects.
     */
    public PaginatedAccountingPeriodList list(AccountingPeriodsListRequest request) {
        return list(request, null);
    }

    /**
     * Returns a list of <code>AccountingPeriod</code> objects.
     */
    public PaginatedAccountingPeriodList list(AccountingPeriodsListRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("api/accounting/v1/accounting-periods");
        if (request.getCursor().isPresent()) {
            httpUrl.addQueryParameter("cursor", request.getCursor().get());
        }
        if (request.getIncludeDeletedData().isPresent()) {
            httpUrl.addQueryParameter(
                    "include_deleted_data",
                    request.getIncludeDeletedData().get().toString());
        }
        if (request.getIncludeRemoteData().isPresent()) {
            httpUrl.addQueryParameter(
                    "include_remote_data", request.getIncludeRemoteData().get().toString());
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
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), PaginatedAccountingPeriodList.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns an <code>AccountingPeriod</code> object with the given <code>id</code>.
     */
    public AccountingPeriod retrieve(String id) {
        return retrieve(id, AccountingPeriodsRetrieveRequest.builder().build());
    }

    /**
     * Returns an <code>AccountingPeriod</code> object with the given <code>id</code>.
     */
    public AccountingPeriod retrieve(String id, AccountingPeriodsRetrieveRequest request) {
        return retrieve(id, request, null);
    }

    /**
     * Returns an <code>AccountingPeriod</code> object with the given <code>id</code>.
     */
    public AccountingPeriod retrieve(
            String id, AccountingPeriodsRetrieveRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("api/accounting/v1/accounting-periods")
                .addPathSegment(id);
        if (request.getIncludeRemoteData().isPresent()) {
            httpUrl.addQueryParameter(
                    "include_remote_data", request.getIncludeRemoteData().get().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AccountingPeriod.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
