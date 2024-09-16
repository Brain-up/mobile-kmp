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

import brn.mobile.brnmobile.api.models.AddPatientToDoctorRequest
import brn.mobile.brnmobile.api.models.BaseResponseDto

import brn.mobile.brnmobile.api.infrastructure.*
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder

    open class DoctorControllerApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    ) : ApiClient(
        baseUrl,
        httpClientEngine,
        httpClientConfig,
    ) {

        /**
        * Add patient to doctor
        * 
         * @param doctorId doctorId 
         * @param addPatientToDoctorRequest addPatientToDoctorRequest 
         * @return void
        */
        open suspend fun addPatientToDoctorUsingPOST(doctorId: kotlin.Long, addPatientToDoctorRequest: AddPatientToDoctorRequest): HttpResponse<Unit> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = addPatientToDoctorRequest

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/doctors/{doctorId}/patients".replace("{" + "doctorId" + "}", "$doctorId"),
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
        * Delete patient from doctor
        * 
         * @param doctorId doctorId 
         * @param patientId patientId 
         * @return void
        */
        open suspend fun deletePatientFromDoctorUsingDELETE(doctorId: kotlin.Long, patientId: kotlin.Long): HttpResponse<Unit> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/doctors/{doctorId}/patients/{patientId}".replace("{" + "doctorId" + "}", "$doctorId").replace("{" + "patientId" + "}", "$patientId"),
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
        * Get all patients for doctor
        * 
         * @param doctorId doctorId 
         * @return BaseResponseDto
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun getAllPatientForDoctorUsingGET(doctorId: kotlin.Long): HttpResponse<BaseResponseDto> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/doctors/{doctorId}/patients".replace("{" + "doctorId" + "}", "$doctorId"),
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