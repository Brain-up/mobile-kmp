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
import brn.mobile.brnmobile.api.models.HeadphonesDto
import brn.mobile.brnmobile.api.models.UserAccountChangeRequest

import brn.mobile.brnmobile.api.infrastructure.*
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder

    open class UserDetailControllerApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    ) : ApiClient(
        baseUrl,
        httpClientEngine,
        httpClientConfig,
    ) {

        /**
        * Add headphones to current user
        * 
         * @param headphones headphones 
         * @return BaseSingleObjectResponseDto
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun addHeadphonesToCurrentUserUsingPOST(headphones: HeadphonesDto): HttpResponse<BaseSingleObjectResponseDto> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = headphones

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/users/current/headphones",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Add headphones to the user
        * 
         * @param userId userId 
         * @param headphones headphones 
         * @return BaseSingleObjectResponseDto
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun addHeadphonesToUserUsingPOST(userId: kotlin.Long, headphones: HeadphonesDto): HttpResponse<BaseSingleObjectResponseDto> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = headphones

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/users/{userId}/headphones".replace("{" + "userId" + "}", "$userId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Delete doctor from patient
        * 
         * @param patientId patientId 
         * @return void
        */
        open suspend fun deleteDoctorFromPatientUsingDELETE(patientId: kotlin.Long): HttpResponse<Unit> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/users/current/{patientId}/doctor".replace("{" + "patientId" + "}", "$patientId"),
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
        * Delete headphone by id
        * 
         * @param headphonesId headphonesId 
         * @return BaseSingleObjectResponseDto
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun deleteHeadphonesForCurrentUserUsingDELETE(headphonesId: kotlin.Long): HttpResponse<BaseSingleObjectResponseDto> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/users/current/headphones/{headphonesId}".replace("{" + "headphonesId" + "}", "$headphonesId"),
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
        * Get user by id
        * 
         * @param userId userId 
         * @return BaseResponseDto
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun findUserByIdUsingGET(userId: kotlin.Long): HttpResponse<BaseResponseDto> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/users/{userId}".replace("{" + "userId" + "}", "$userId"),
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
        * Get user by name
        * 
         * @param name name 
         * @return BaseResponseDto
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun findUserByNameUsingGET(name: kotlin.String): HttpResponse<BaseResponseDto> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()
            name?.apply { localVariableQuery["name"] = listOf("$name") }

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/users",
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
        * Get all headphones for current user
        * 
         * @return BaseResponseDto
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun getAllHeadphonesForUserUsingGET(): HttpResponse<BaseResponseDto> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/users/current/headphones",
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
        * Get all user&#39;s headphones
        * 
         * @param userId userId 
         * @return BaseResponseDto
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun getAllHeadphonesForUserUsingGET1(userId: kotlin.Long): HttpResponse<BaseResponseDto> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/users/{userId}/headphones".replace("{" + "userId" + "}", "$userId"),
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
        * Get current logged in user
        * 
         * @return BaseResponseDto
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun getCurrentUserUsingGET(): HttpResponse<BaseResponseDto> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/users/current",
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
        * Get patient&#39;s doctor
        * 
         * @param patientId patientId 
         * @return BaseSingleObjectResponseDto
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun getDoctorAssignedToPatientUsingGET(patientId: kotlin.Long): HttpResponse<BaseSingleObjectResponseDto> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/users/current/{patientId}/doctor".replace("{" + "patientId" + "}", "$patientId"),
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
        * Update avatar current user
        * 
         * @param avatar avatar 
         * @return BaseSingleObjectResponseDto
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun updateAvatarCurrentUserUsingPUT(avatar: kotlin.String): HttpResponse<BaseSingleObjectResponseDto> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()
            avatar?.apply { localVariableQuery["avatar"] = listOf("$avatar") }

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/users/current/avatar",
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
        * Update current logged in user
        * 
         * @param userAccountChangeRequest userAccountChangeRequest 
         * @return BaseSingleObjectResponseDto
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun updateCurrentUserUsingPATCH(userAccountChangeRequest: UserAccountChangeRequest): HttpResponse<BaseSingleObjectResponseDto> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = userAccountChangeRequest

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PATCH,
            "/users/current",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        }
