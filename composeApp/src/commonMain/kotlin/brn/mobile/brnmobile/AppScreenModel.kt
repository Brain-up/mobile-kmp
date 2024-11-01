package brn.mobile.brnmobile

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import brn.mobile.brnmobile.models.ui.AppScreenVisualState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import org.koin.core.component.KoinComponent

class AppScreenModel : KoinComponent {

    // Waiting koinInject for Multiplatform to be released
    // https://insert-koin.io/docs/reference/koin-compose/multiplatform#koin-features-for-your-composable-wip

    private val coroutineScope: CoroutineScope = MainScope()

    var uiState: AppScreenVisualState by mutableStateOf(AppScreenVisualState.Loading)
        private set

}

