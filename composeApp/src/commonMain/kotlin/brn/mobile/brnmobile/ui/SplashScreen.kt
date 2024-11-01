package brn.mobile.brnmobile.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import brainup.composeapp.generated.resources.Res
import brainup.composeapp.generated.resources.snailvector
import brn.mobile.brnmobile.MainRes
import brn.mobile.brnmobile.di.getScreenModel
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.jetbrains.compose.resources.painterResource

data class SplashScreenUiState(
    val doNavigateToMain: Boolean,
)

internal object SplashScreen : Screen {
    override val key: ScreenKey = uniqueScreenKey

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val screenModel: SplashScreenModel = getScreenModel<SplashScreenModel>()
        val uiState = screenModel.uiState

        LaunchedEffect(uiState.doNavigateToMain) {
            if (uiState.doNavigateToMain) {
                navigator.replaceAll(ScreenTest)
            }
        }
        screenModel.initAppData()
        SplashScreen()

    }

    var uiState: SplashScreenUiState by mutableStateOf(SplashScreenUiState(false))

    data class SplashScreenUiState(
        val doNavigateToMain: Boolean,
    )

    @Composable
   public fun SplashScreen() {

        Box(
            modifier = Modifier.fillMaxSize().padding(26.dp), contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.wrapContentSize().padding(24.dp),
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    painter = painterResource(Res.drawable.snailvector),
                    contentDescription = null,
                    modifier = Modifier.size(140.dp).clip(MaterialTheme.shapes.small),
                    contentScale = ContentScale.Fit
                )
                Text(
                    MainRes.string.app_name,
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 22.0.sp,
                    fontFamily = FontFamily.SansSerif,
                    lineHeight = 1.5.em,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    modifier = Modifier.wrapContentHeight().wrapContentWidth()
                        .align(Alignment.CenterHorizontally)

                )
            }
        }

    }
}


