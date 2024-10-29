/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package brn.mobile.brnmobile.ui.scr1.utils


import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

// Modifier that allows a rectangular drop shadow to be applied to a Composable.
//
// Inputs:
// * [color] determines the color and opacity of the shadow.
// * [borderRadius] determines the rounding of the rectangle's corners.
// * [blur] determines the shadow radius i.e. how blurry it is.
// * [offsetY] and [offsetX] determine the position of the shadow layer relative to the main layer.
// * [spread] determines how far the shadow spreads in every direction.
// * [blendMode] allows you to define how you want two layers to blend together.
//
// This modifier currently only has an effect when used in API level 28+ (Android 9+).
// The [blendMode] only has an effect in API level 29+ (Android 10+).
expect fun Modifier.relayDropShadow(
    color: Color,
    borderRadius: Dp = 0.dp,
    blur: Dp = 10.dp,
    offsetY: Dp = 5.dp,
    offsetX: Dp = 5.dp,
    spread: Dp = 0.dp,
    blendMode: BlendMode = BlendMode.SrcOver,
): Modifier
