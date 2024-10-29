package brn.mobile.brnmobile.ui.scr1.utils

// iOS-specific code
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.DrawModifier
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.unit.Dp
import org.jetbrains.skia.BlendMode
import org.jetbrains.skia.Canvas
import org.jetbrains.skia.Color
import org.jetbrains.skiko.SkiaLayer
import org.jetbrains.skiko.SkiaLayerRenderDelegate
import org.jetbrains.skiko.SkikoRenderDelegate
import org.jetbrains.skiko.SkikoUIView
import org.jetbrains.skiko.SkikoView


actual fun Modifier.relayDropShadow(
    color: androidx.compose.ui.graphics.Color,
    borderRadius: Dp,
    blur: Dp,
    offsetY: Dp,
    offsetX: Dp,
    spread: Dp,
    blendMode: androidx.compose.ui.graphics.BlendMode
): Modifier {
    return this.then(
        object : DrawModifier {
            override fun ContentDrawScope.draw() {

            }
        }
    )
}