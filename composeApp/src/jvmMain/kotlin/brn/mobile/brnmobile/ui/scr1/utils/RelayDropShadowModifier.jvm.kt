package brn.mobile.brnmobile.ui.scr1.utils

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Dp

actual fun Modifier.relayDropShadow(
    color: Color,
    borderRadius: Dp,
    blur: Dp,
    offsetY: Dp,
    offsetX: Dp,
    spread: Dp,
    blendMode: BlendMode
): Modifier  {
    return this.graphicsLayer {
        shadowElevation = blur.toPx()
        shape = androidx.compose.foundation.shape.RoundedCornerShape(borderRadius)
        clip = true
    }.drawBehind {
        drawIntoCanvas { canvas ->
            val paint = androidx.compose.ui.graphics.Paint().apply {
                this.color = color
                this.blendMode = blendMode
            }
            canvas.drawRoundRect(
                left = offsetX.toPx(),
                top = offsetY.toPx(),
                right = size.width + offsetX.toPx(),
                bottom = size.height + offsetY.toPx(),
                radiusX = borderRadius.toPx(),
                radiusY = borderRadius.toPx(),
                paint = paint
            )
        }
    }
}