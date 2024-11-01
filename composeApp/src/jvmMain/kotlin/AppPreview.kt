import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import brn.mobile.brnmobile.App
import brn.mobile.brnmobile.ui.scr1.Scr1a

@Preview
@Composable
fun AppPreview() {
    App()
}

@Preview
@Composable
fun Scr1Preview() {
    brn.mobile.brnmobile.ui.scr1.SplashScreen.Scr1()
}

@Preview
@Composable
fun Scr1aPreview() {
    Scr1a()
}