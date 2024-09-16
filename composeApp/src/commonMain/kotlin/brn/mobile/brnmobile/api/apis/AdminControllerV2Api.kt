/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package brn.mobile.brnmobile.api.apis

import brn.mobile.brnmobile.api.models.BaseResponseDto
import brn.mobile.brnmobile.api.models.BaseSingleObjectResponseDto

import brn.mobile.brnmobile.api.infrastructure.*
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder
import kotlinx.datetime.LocalDateTime

open class AdminControllerV2Api(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
) : ApiClient(
    baseUrl,
    httpClientEngine,
    httpClientConfig,
) {

    /**
     * Get user&#39;s study histories for period from &lt;&#x3D; startTime &lt;&#x3D; to where startTime is a date in ISO date time format
     *
     * @param from from
     * @param to to
     * @param userId userId
     * @return BaseResponseDto
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getHistoriesUsingGET1(
        from: LocalDateTime,
        to: LocalDateTime,
        userId: kotlin.Long
    ): HttpResponse<BaseResponseDto> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        from?.apply { localVariableQuery["from"] = listOf("$from") }
        to?.apply { localVariableQuery["to"] = listOf("$to") }
        userId?.apply { localVariableQuery["userId"] = listOf("$userId") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/v2/admin/histories",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * Get user&#39;s weekly statistic for the period. Where period is a two dates in the ISO date time format
     *
     * @param from from
     * @param to to
     * @param userId userId
     * @return BaseSingleObjectResponseDto
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getUserWeeklyStatisticUsingGET1(
        from: LocalDateTime,
        to: LocalDateTime,
        userId: kotlin.Long
    ): HttpResponse<BaseSingleObjectResponseDto> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        from?.apply { localVariableQuery["from"] = listOf("$from") }
        to?.apply { localVariableQuery["to"] = listOf("$to") }
        userId?.apply { localVariableQuery["userId"] = listOf("$userId") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/v2/admin/study/week",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * Get user&#39;s yearly statistic for the period. Where period is a two dates in the ISO date time format
     *
     * @param from from
     * @param to to
     * @param userId userId
     * @return BaseSingleObjectResponseDto
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getUserYearlyStatisticUsingGET1(
        from: LocalDateTime,
        to: LocalDateTime,
        userId: kotlin.Long
    ): HttpResponse<BaseSingleObjectResponseDto> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        from?.apply { localVariableQuery["from"] = listOf("$from") }
        to?.apply { localVariableQuery["to"] = listOf("$to") }
        userId?.apply { localVariableQuery["userId"] = listOf("$userId") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/v2/admin/study/year",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

}