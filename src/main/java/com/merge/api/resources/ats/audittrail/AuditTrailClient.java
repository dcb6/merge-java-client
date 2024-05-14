/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.ats.audittrail;

import com.merge.api.core.ApiError;
import com.merge.api.core.ClientOptions;
import com.merge.api.core.ObjectMappers;
import com.merge.api.core.RequestOptions;
import com.merge.api.resources.ats.audittrail.requests.AuditTrailListRequest;
import com.merge.api.resources.ats.types.PaginatedAuditLogEventList;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class AuditTrailClient {
    protected final ClientOptions clientOptions;

    public AuditTrailClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Gets a list of audit trail events.
     */
    public PaginatedAuditLogEventList list() {
        return list(AuditTrailListRequest.builder().build());
    }

    /**
     * Gets a list of audit trail events.
     */
    public PaginatedAuditLogEventList list(AuditTrailListRequest request) {
        return list(request, null);
    }

    /**
     * Gets a list of audit trail events.
     */
    public PaginatedAuditLogEventList list(AuditTrailListRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("ats/v1/audit-trail");
        if (request.getCursor().isPresent()) {
            httpUrl.addQueryParameter("cursor", request.getCursor().get());
        }
        if (request.getEndDate().isPresent()) {
            httpUrl.addQueryParameter("end_date", request.getEndDate().get());
        }
        if (request.getEventType().isPresent()) {
            httpUrl.addQueryParameter("event_type", request.getEventType().get());
        }
        if (request.getPageSize().isPresent()) {
            httpUrl.addQueryParameter("page_size", request.getPageSize().get().toString());
        }
        if (request.getStartDate().isPresent()) {
            httpUrl.addQueryParameter("start_date", request.getStartDate().get());
        }
        if (request.getUserEmail().isPresent()) {
            httpUrl.addQueryParameter("user_email", request.getUserEmail().get());
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
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), PaginatedAuditLogEventList.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(
                            responseBody != null ? responseBody.string() : "{}", Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
