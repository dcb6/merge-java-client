package dev.merge.api.services.blocking.ticketing

import dev.merge.api.TestServerExtension
import dev.merge.api.client.okhttp.MergeOkHttpClient
import dev.merge.api.models.*
import dev.merge.api.models.ticketing.*
import dev.merge.api.models.ticketing.LinkedAccountListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LinkedAccountServiceTest {

    @Test
    fun callList() {
        val client =
            MergeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .accountToken("<account-token>")
                .build()
        val linkedAccountService = client.ticketing().linkedAccounts()
        val paginatedAccountDetailsAndActionsList =
            linkedAccountService.list(LinkedAccountListParams.builder().build())
        println(paginatedAccountDetailsAndActionsList)
        paginatedAccountDetailsAndActionsList.results().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            MergeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .accountToken("<account-token>")
                .build()
        val linkedAccountService = client.ticketing().linkedAccounts()
        linkedAccountService.delete(LinkedAccountDeleteParams.builder().build())
    }
}