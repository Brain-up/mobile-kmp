import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import brn.mobile.brnmobile.App
import brn.mobile.brnmobile.MainRes
import brn.mobile.brnmobile.di.initKoin
import java.awt.Dimension

fun main() = application {
    initKoin(emptyList())
    Window(
        title = MainRes.string.app_name,
        state = rememberWindowState(width = 800.dp, height = 600.dp),
        onCloseRequest = ::exitApplication,
    ) {
        window.minimumSize = Dimension(350, 600)
        App()
    }
}

