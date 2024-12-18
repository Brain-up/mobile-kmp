package brn.mobile.brnmobile.ui.scr1.utils

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.Dp

// Android-specific code
actual fun Modifier.relayDropShadow(
    color: Color,
    borderRadius: Dp,
    blur: Dp,
    offsetY: Dp,
    offsetX: Dp,
    spread: Dp,
    blendMode: BlendMode,
): Modifier {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
        val shadowColor = color.toArgb()
        val transparent = color.copy(alpha = 0f).toArgb()

        this.drawBehind {
            this.drawIntoCanvas {
                val paint = Paint()
                val frameworkPaint = paint.asFrameworkPaint()
                frameworkPaint.color = transparent

                frameworkPaint.setShadowLayer(
                    blur.toPx(),
                    offsetX.toPx(),
                    offsetY.toPx(),
                    shadowColor,
                )
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    frameworkPaint.blendMode = convertBlendModeToAndroid(blendMode)
                }
                it.drawRoundRect(
                    0f - spread.value,
                    0f - spread.value,
                    this.size.width + spread.value,
                    this.size.height + spread.value,
                    borderRadius.toPx(),
                    borderRadius.toPx(),
                    paint,
                )
            }
        }
    } else {
        Modifier
    }
}

@RequiresApi(Build.VERSION_CODES.Q)
fun convertBlendModeToAndroid(composeBlendMode: BlendMode): android.graphics.BlendMode {
    return when (composeBlendMode) {
        BlendMode.SrcOver -> android.graphics.BlendMode.SRC_OVER
        BlendMode.Darken -> android.graphics.BlendMode.DARKEN
        BlendMode.Multiply -> android.graphics.BlendMode.MULTIPLY
        BlendMode.ColorBurn -> android.graphics.BlendMode.COLOR_BURN
        BlendMode.Lighten -> android.graphics.BlendMode.LIGHTEN
        BlendMode.Screen -> android.graphics.BlendMode.SCREEN
        BlendMode.ColorDodge -> android.graphics.BlendMode.COLOR_DODGE
        BlendMode.Overlay -> android.graphics.BlendMode.OVERLAY
        BlendMode.Softlight -> android.graphics.BlendMode.SOFT_LIGHT
        BlendMode.Hardlight -> android.graphics.BlendMode.HARD_LIGHT
        BlendMode.Difference -> android.graphics.BlendMode.DIFFERENCE
        BlendMode.Exclusion -> android.graphics.BlendMode.EXCLUSION
        BlendMode.Hue -> android.graphics.BlendMode.HUE
        BlendMode.Saturation -> android.graphics.BlendMode.SATURATION
        BlendMode.Color -> android.graphics.BlendMode.COLOR
        BlendMode.Luminosity -> android.graphics.BlendMode.LUMINOSITY
        else -> android.graphics.BlendMode.SRC_OVER
    }
}