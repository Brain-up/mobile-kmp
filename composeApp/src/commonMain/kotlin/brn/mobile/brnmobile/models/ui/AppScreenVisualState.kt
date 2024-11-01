package brn.mobile.brnmobile.models.ui

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed interface AppScreenVisualState {
    object Loading : AppScreenVisualState
    object MainScr : AppScreenVisualState
    object Scr2 : AppScreenVisualState
}

data class AdaptiveUiVisualState(
    val isPortrait: Boolean = true,
    val kH: Float = 1f,
    val kW: Float = 1f, val size: WindowSize= WindowSize.EXPANDED,
)

enum class WindowSize {
    COMPACT,
    MEDIUM,
    EXPANDED;

    // Factory method that creates an instance of the class based on window width
    companion object {
        fun basedOnHeight(windowHeight: Dp): WindowSize {
            return when {
                windowHeight < (812 * 0.74).dp -> COMPACT //600
                windowHeight < 812.dp -> MEDIUM
                else -> EXPANDED
            }
        }
    }
}