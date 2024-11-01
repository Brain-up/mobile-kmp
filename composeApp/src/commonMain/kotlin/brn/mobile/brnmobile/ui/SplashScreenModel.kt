package brn.mobile.brnmobile.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

internal class SplashScreenModel() : ScreenModel {

    var uiState: SplashScreenUiState by mutableStateOf(SplashScreenUiState(false))
        private set

    private fun considerAppDataLoaded() {
        screenModelScope.launch {
            delay(500)
            uiState = uiState.copy(doNavigateToMain = true)
        }
    }

    fun initAppData() {
        considerAppDataLoaded()
    }

}