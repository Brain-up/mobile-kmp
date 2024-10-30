package brn.mobile.brnmobile.ui.scr1.utils

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.DrawModifier
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.unit.Dp
import org.jetbrains.skia.BlendMode
import org.jetbrains.skia.Color

actual fun Modifier.relayDropShadow(
    color: Color,
    borderRadius: Dp,
    blur: Dp,
    offsetY: Dp,
    offsetX: Dp,
    spread: Dp,
    blendMode: BlendMode
): Modifier{
    return this.then(
        object : DrawModifier {
            override fun ContentDrawScope.draw() {

            }
        }
    )
}