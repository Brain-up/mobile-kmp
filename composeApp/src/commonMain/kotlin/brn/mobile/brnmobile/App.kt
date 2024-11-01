package brn.mobile.brnmobile

import androidx.compose.animation.Crossfade
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import brn.mobile.brnmobile.models.ui.AppScreenVisualState
import brn.mobile.brnmobile.theme.AppTheme
import brn.mobile.brnmobile.ui.LoginScreen
import brn.mobile.brnmobile.ui.ScreenTest
import brn.mobile.brnmobile.ui.SplashScreen
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.Navigator


@Composable
internal fun App() {
    val appScreenModel = remember { AppScreenModel() }

    val screen: Screen = appScreenModel.uiState.let {
        when (it) {
            AppScreenVisualState.Loading -> SplashScreen
            AppScreenVisualState.MainScr -> ScreenTest
            AppScreenVisualState.Scr2 -> LoginScreen
        }
    }

    AppTheme {
        Surface {
            Crossfade(screen) { screen: Screen ->
                Navigator(screen = screen)
                }
            }
        }
}
