package brn.mobile.brnmobile.ui.scr1.utils

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import org.jetbrains.skia.BlendMode
import org.jetbrains.skia.Color

expect fun Modifier.relayDropShadow(
    color: Color,
    borderRadius: Dp,
    blur: Dp,
    offsetY: Dp,
    offsetX: Dp,
    spread: Dp,
    blendMode: BlendMode
): Modifier