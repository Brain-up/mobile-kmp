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

package brn.mobile.brnmobile.api.models

import brn.mobile.brnmobile.api.models.ExerciseCreateDto
import brn.mobile.brnmobile.api.models.SetOfWords

import kotlinx.serialization.json.JsonNames


/**
 * Request dto for create exercise 'sentences'
 *
 * @param exerciseName Exercise name
 * @param level Level
 * @param locale Locale
 * @param subGroup Subgroup code
 * @param typeOfExercise type of exercise
 * @param orderNumber Order number
 * @param words
 */


data class ExerciseSentencesCreateDto(

    /* Exercise name */
    @JsonNames("exerciseName")
    override val exerciseName: kotlin.String,

    /* Level */
    @JsonNames("level")
    override val level: kotlin.Int,

    /* Locale */
    @JsonNames("locale")
    override val locale: ExerciseCreateDto.Locale,

    /* Subgroup code */
    @JsonNames("subGroup")
    override val subGroup: kotlin.String,

    /* type of exercise */
    @JsonNames("typeOfExercise")
    override val typeOfExercise: ExerciseCreateDto.TypeOfExercise,

    /* Order number */
    @JsonNames("orderNumber")
    val orderNumber: kotlin.Int,

    @JsonNames("words")
    val words: SetOfWords

) : ExerciseCreateDto {

    /**
     * Locale
     *
     * Values: RU,EN,TR
     */

    enum class Locale(val value: kotlin.String) {
        @JsonNames("RU")
        RU("RU"),
        @JsonNames("EN")
        EN("EN"),
        @JsonNames("TR")
        TR("TR");
    }

    /**
     * type of exercise
     *
     * Values: SINGLE_SIMPLE_WORDS,PHRASES,SENTENCE
     */

    enum class TypeOfExercise(val value: kotlin.String) {
        @JsonNames("SINGLE_SIMPLE_WORDS")
        SINGLE_SIMPLE_WORDS("SINGLE_SIMPLE_WORDS"),
        @JsonNames("PHRASES")
        PHRASES("PHRASES"),
        @JsonNames("SENTENCE")
        SENTENCE("SENTENCE");
    }

}

data class SetOfWords(

    val count: List<String> = emptyList(),

    val objectDescription: List<String> = emptyList(),

    val objectWord: List<String> = emptyList(),

    val objectAction: List<String> = emptyList(),

    val additionObjectDescription: List<String> = emptyList(),

    val additionObject: List<String> = emptyList()
) {
    fun toRecordList(): List<String> = listOf(
        count.joinToString(separator = StringUtils.SPACE),
        objectDescription.joinToString(separator = StringUtils.SPACE),
        objectWord.joinToString(separator = StringUtils.SPACE),
        objectAction.joinToString(separator = StringUtils.SPACE),
        additionObjectDescription.joinToString(separator = StringUtils.SPACE),
        additionObject.joinToString(separator = StringUtils.SPACE)
    )

    fun toFlattenList(): List<String> = listOf(
        count,
        objectDescription,
        objectWord,
        objectAction,
        additionObjectDescription,
        additionObject,
    ).flatten()
}