/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.hris.accountdetails;

import com.merge.api.core.ApiError;
import com.merge.api.core.ClientOptions;
import com.merge.api.core.ObjectMappers;
import com.merge.api.core.RequestOptions;
import com.merge.api.resources.hris.types.AccountDetails;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class AccountDetailsClient {
    protected final ClientOptions clientOptions;

    public AccountDetailsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Get details for a linked account.
     */
    public AccountDetails retrieve() {
        return retrieve(null);
    }

    /**
     * Get details for a linked account.
     */
    public AccountDetails retrieve(RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("api/hris/v1/account-details")
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AccountDetails.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
