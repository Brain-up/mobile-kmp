import androidx.compose.ui.window.ComposeUIViewController
import brn.mobile.brnmobile.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
