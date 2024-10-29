package brn.mobile.brnmobile.ui.scr1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import brainup.composeapp.generated.resources.Res
import brainup.composeapp.generated.resources.scr1_rectangle_15
import brainup.composeapp.generated.resources.scr1_rectangle_16
import brainup.composeapp.generated.resources.scr1_vector
import brn.mobile.brnmobile.montserrat
import brn.mobile.brnmobile.openSans
import brn.mobile.brnmobile.reenieBeanie
import brn.mobile.brnmobile.ui.scr1.utils.BoxScopeInstanceImpl.align
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

internal object SplashScreen : Screen {
    override val key: ScreenKey = uniqueScreenKey

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Scr1()

    }

    @Composable
    fun Scr1(modifier: Modifier = Modifier) {
        Column(modifier = modifier.fillMaxSize()) {
            Column(modifier = Modifier.weight(1f)) {
                Column(modifier = Modifier.weight(1f)) {
                    Box(
                        modifier = Modifier.align(Alignment.TopStart).offset(x = 32.dp, y = 280.dp)
                    ) {
                        Column(modifier = Modifier.requiredSize(296.dp, 40.dp)) {
                            Divider(
                                modifier = Modifier.align(Alignment.Start).weight(1f).fillMaxWidth()
                                    .height(1.dp)
                            )
                            Text(
                                text = "Name",
                                modifier = Modifier.align(Alignment.Start).offset(y = 9.dp)
                                    .weight(1f)
                                    .padding(start = 8.dp, end = 48.dp).fillMaxWidth(),
                                color = Color(165, 161, 183),
                                fontFamily = openSans(),
                                textAlign = TextAlign.Left
                            )
                        }
                        Column(modifier = Modifier.requiredSize(296.dp, 40.dp)) {
                            Divider(
                                modifier = Modifier.align(Alignment.Start).weight(1f).fillMaxWidth()
                                    .height(1.dp)
                            )
                            Text(
                                text = "Password",
                                modifier = Modifier.align(Alignment.Start).offset(y = 9.dp)
                                    .weight(1f)
                                    .padding(start = 8.dp, end = 48.dp).fillMaxWidth(),
                                color = Color(165, 161, 183),
                                fontFamily = openSans(),
                                textAlign = TextAlign.Left
                            )
                        }
                    }
                    Button(
                        onClick = {},
                        modifier = Modifier.align(Alignment.BottomCenter).offset(y = -160.dp)
                            .requiredHeight(40.dp)
                            .background(Color(234, 230, 254), shape = RoundedCornerShape(16.dp))
                    ) {
                        Text(
                            text = "Войти",
                            color = Color.White,
                            fontFamily = montserrat(),
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp
                        )
                    }
                    Button(
                        onClick = {},
                        modifier = Modifier.align(Alignment.BottomCenter).offset(y = -40.dp)
                            .requiredHeight(40.dp)
                            .background(Color.White, shape = RoundedCornerShape(16.dp))
                            .border(1.dp, Color(230, 228, 240), shape = RoundedCornerShape(16.dp))
                    ) {
                        Text(
                            text = "Зарегистрироваться",
                            color = Color(79, 60, 173),
                            fontFamily = montserrat(),
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp
                        )
                    }
                    Box(
                        modifier = Modifier.align(Alignment.Center).offset(x = -0.5.dp, y = -171.dp)
                            .requiredSize(143.dp, 180.dp)
                    ) {
                        Text(
                            text = "BrainUP",
                            modifier = Modifier.align(Alignment.TopStart)
                                .offset(x = 15.dp, y = 132.dp),
                            fontSize = 40.sp,
                            fontFamily = reenieBeanie(),
                            color = Color(61, 58, 76),
                            letterSpacing = 1.2.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Box(
                            modifier = Modifier.align(Alignment.TopCenter)
                                .requiredSize(143.dp, 118.dp)
                        ) {
                            Image(
                                painter = painterResource(Res.drawable.scr1_vector),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                }
                Row(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "12:20",
                        modifier = Modifier.padding(
                            start = 5.dp,
                            top = 4.dp,
                            end = 320.dp,
                            bottom = 4.dp
                        ).fillMaxSize(),
                        color = Color(61, 58, 76),
                        textAlign = TextAlign.Left
                    )
                    Text(
                        text = "99%",
                        modifier = Modifier.padding(
                            start = 328.95.dp,
                            top = 4.dp,
                            end = 4.05.dp,
                            bottom = 4.dp
                        ).fillMaxSize(),
                        color = Color(61, 58, 76),
                        textAlign = TextAlign.Left
                    )
                    Row(
                        modifier = Modifier.padding(
                            start = 316.dp,
                            top = 5.dp,
                            end = 36.dp,
                            bottom = 5.dp
                        ).fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(Res.drawable.scr1_rectangle_15),
                            contentDescription = null,
                            modifier = Modifier.padding(top = 1.4.dp).fillMaxSize()
                        )
                        Image(
                            painter = painterResource(Res.drawable.scr1_rectangle_16),
                            contentDescription = null,
                            modifier = Modifier.padding(
                                start = 2.6.dp,
                                end = 2.6.dp,
                                bottom = 11.2.dp
                            )
                                .fillMaxSize()
                        )
                    }
                }
            }
        }
    }
}

@Preview()//widthDp = 360, heightDp = 640
@Composable
private fun Scr1Preview() {
    MaterialTheme {
        SplashScreen.Scr1()
    }
}


//@Composable
//fun Scr1(modifier: Modifier = Modifier) {
//    TopLevel(modifier = modifier) {
//        Scr1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
//            Content(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
//                Frame1302(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 32.0.dp,
//                            y = 280.0.dp
//                        )
//                    )
//                ) {
//                    InputHint {
//                        Divider(
//                            modifier = Modifier.boxAlign(
//                                alignment = Alignment.BottomStart,
//                                offset = DpOffset(
//                                    x = 0.0.dp,
//                                    y = 0.0.dp
//                                )
//                            ).rowWeight(1.0f)
//                        ) {
//                            Rectangle378(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
//                        }
//                        BodyRegularLine(
//                            modifier = Modifier.boxAlign(
//                                alignment = Alignment.TopStart,
//                                offset = DpOffset(
//                                    x = 0.0.dp,
//                                    y = 9.0.dp
//                                )
//                            ).rowWeight(1.0f)
//                        ) {
//                            Hint()
//                        }
//                    }
//                    InputHint1 {
//                        Divider1(
//                            modifier = Modifier.boxAlign(
//                                alignment = Alignment.BottomStart,
//                                offset = DpOffset(
//                                    x = 0.0.dp,
//                                    y = 0.0.dp
//                                )
//                            ).rowWeight(1.0f)
//                        ) {
//                            Rectangle379(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
//                        }
//                        BodyRegularLine1(
//                            modifier = Modifier.boxAlign(
//                                alignment = Alignment.TopStart,
//                                offset = DpOffset(
//                                    x = 0.0.dp,
//                                    y = 9.0.dp
//                                )
//                            ).rowWeight(1.0f)
//                        ) {
//                            Hint1()
//                        }
//                    }
//                }
//                ButtonPrimaryDisabled(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.BottomCenter,
//                        offset = DpOffset(
//                            x = 0.0.dp,
//                            y = -160.0.dp
//                        )
//                    )
//                ) {
//                    Command()
//                }
//                ButtonSecondaryNormal(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.BottomCenter,
//                        offset = DpOffset(
//                            x = 0.0.dp,
//                            y = -40.0.dp
//                        )
//                    )
//                ) {
//                    Cancel()
//                }
//                Logo(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.Center,
//                        offset = DpOffset(
//                            x = -0.5.dp,
//                            y = -171.0.dp
//                        )
//                    )
//                ) {
//                    BrainUP(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = 15.0.dp,
//                                y = 132.0.dp
//                            )
//                        )
//                    )
//                    SnailLogo(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopCenter,
//                            offset = DpOffset(
//                                x = 0.0.dp,
//                                y = 0.0.dp
//                            )
//                        )
//                    ) {
//                        Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
//                    }
//                }
//            }
//            StatusBar(modifier = Modifier.rowWeight(1.0f)) {
//                Class1220(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
//                Class99(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
//                Group26(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
//                    Rectangle15(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
//                    Rectangle16(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
//                }
//            }
//        }
//    }
//}
//
//@Preview(widthDp = 360, heightDp = 640)
//@Composable
//private fun Scr1Preview() {
//    MaterialTheme {
//        RelayContainer {
//            Scr1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
//        }
//    }
//}
//
//@Composable
//fun Rectangle378(modifier: Modifier = Modifier) {
//    RelayVector(
//        vector = painterResource(Res.drawable.scr1_rectangle_378),
//        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
//    )
//}
//
//@Composable
//fun Divider(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        isStructured = false,
//        clipToParent = false,
//        content = content,
//        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(1.0.dp)
//    )
//}
//
//@Composable
//fun Hint(modifier: Modifier = Modifier) {
//    RelayText(
//        content = "Name ",
//        fontFamily = openSans(),
//        color = Color(
//            alpha = 255,
//            red = 165,
//            green = 161,
//            blue = 183
//        ),
//        height = 1.4285714721679688.em,
//        textAlign = TextAlign.Left,
//        modifier = modifier
//    )
//}
//
//@Composable
//fun BodyRegularLine(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        mainAxisAlignment = MainAxisAlignment.Start,
//        crossAxisAlignment = CrossAxisAlignment.Start,
//        clipToParent = false,
//        content = content,
//        modifier = modifier.padding(
//            paddingValues = PaddingValues(
//                start = 8.0.dp,
//                top = 0.0.dp,
//                end = 48.0.dp,
//                bottom = 0.0.dp
//            )
//        ).fillMaxWidth(1.0f)
//    )
//}
//
//@Composable
//fun InputHint(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        isStructured = false,
//        clipToParent = false,
//        content = content,
//        modifier = modifier.requiredWidth(296.0.dp).requiredHeight(40.0.dp)
//    )
//}
//
//@Composable
//fun Rectangle379(modifier: Modifier = Modifier) {
//    RelayVector(
//        vector = painterResource(Res.drawable.scr1_rectangle_379),
//        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
//    )
//}
//
//@Composable
//fun Divider1(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        isStructured = false,
//        clipToParent = false,
//        content = content,
//        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(1.0.dp)
//    )
//}
//
//@Composable
//fun Hint1(modifier: Modifier = Modifier) {
//    RelayText(
//        content = "Password",
//        fontFamily = openSans(),
//        color = Color(
//            alpha = 255,
//            red = 165,
//            green = 161,
//            blue = 183
//        ),
//        height = 1.4285714721679688.em,
//        textAlign = TextAlign.Left,
//        modifier = modifier
//    )
//}
//
//@Composable
//fun BodyRegularLine1(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        mainAxisAlignment = MainAxisAlignment.Start,
//        crossAxisAlignment = CrossAxisAlignment.Start,
//        clipToParent = false,
//        content = content,
//        modifier = modifier.padding(
//            paddingValues = PaddingValues(
//                start = 8.0.dp,
//                top = 0.0.dp,
//                end = 48.0.dp,
//                bottom = 0.0.dp
//            )
//        ).fillMaxWidth(1.0f)
//    )
//}
//
//@Composable
//fun InputHint1(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        isStructured = false,
//        clipToParent = false,
//        content = content,
//        modifier = modifier.requiredWidth(296.0.dp).requiredHeight(40.0.dp)
//    )
//}
//
//@Composable
//fun Frame1302(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        mainAxisAlignment = MainAxisAlignment.Start,
//        crossAxisAlignment = CrossAxisAlignment.Start,
//        itemSpacing = 16.0,
//        clipToParent = false,
//        content = content,
//        modifier = modifier.width(IntrinsicSize.Min)
//    )
//}
//
//@Composable
//fun Command(modifier: Modifier = Modifier) {
//    RelayText(
//        content = "Войти",
//        fontSize = 12.0.sp,
//        fontFamily = montserrat(),
//        color = Color(
//            alpha = 255,
//            red = 255,
//            green = 255,
//            blue = 255
//        ),
//        height = 1.6666667175292968.em,
//        fontWeight = FontWeight(600.0.toInt()),
//        case = Case.Upper,
//        modifier = modifier
//    )
//}
//
//@Composable
//fun ButtonPrimaryDisabled(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        backgroundColor = Color(
//            alpha = 255,
//            red = 234,
//            green = 230,
//            blue = 254
//        ),
//        arrangement = RelayContainerArrangement.Row,
//        padding = PaddingValues(
//            start = 16.0.dp,
//            top = 8.0.dp,
//            end = 16.0.dp,
//            bottom = 8.0.dp
//        ),
//        itemSpacing = 8.0,
//        clipToParent = false,
//        radius = 16.0,
//        content = content,
//        modifier = modifier.requiredHeight(40.0.dp)
//    )
//}
//
//@Composable
//fun Cancel(modifier: Modifier = Modifier) {
//    RelayText(
//        content = "Зарегистрироваться",
//        fontSize = 12.0.sp,
//        fontFamily = montserrat(),
//        color = Color(
//            alpha = 255,
//            red = 79,
//            green = 60,
//            blue = 173
//        ),
//        height = 1.6666667175292968.em,
//        fontWeight = FontWeight(600.0.toInt()),
//        case = Case.Upper,
//        modifier = modifier
//    )
//}
//
//@Composable
//fun ButtonSecondaryNormal(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        backgroundColor = Color(
//            alpha = 255,
//            red = 255,
//            green = 255,
//            blue = 255
//        ),
//        arrangement = RelayContainerArrangement.Row,
//        padding = PaddingValues(
//            start = 16.0.dp,
//            top = 12.0.dp,
//            end = 16.0.dp,
//            bottom = 12.0.dp
//        ),
//        itemSpacing = 8.0,
//        clipToParent = false,
//        radius = 16.0,
//        strokeWidth = 1.0,
//        strokeColor = Color(
//            alpha = 255,
//            red = 230,
//            green = 228,
//            blue = 240
//        ),
//        content = content,
//        modifier = modifier.requiredHeight(40.0.dp).relayDropShadow(
//            color = Color(
//                alpha = 25,
//                red = 89,
//                green = 71,
//                blue = 178
//            ),
//            borderRadius = 16.0.dp,
//            blur = 16.0.dp,
//            offsetX = 0.0.dp,
//            offsetY = 4.0.dp,
//            spread = 0.0.dp
//        )
//    )
//}
//
//@Composable
//fun BrainUP(modifier: Modifier = Modifier) {
//    RelayText(
//        content = "BrainUP",
//        fontSize = 40.0.sp,
//        fontFamily = reenieBeanie,
//        color = Color(
//            alpha = 255,
//            red = 61,
//            green = 58,
//            blue = 76
//        ),
//        height = 1.2.em,
//        letterSpacing = 1.2.sp,
//        fontWeight = FontWeight(500.0.toInt()),
//        modifier = modifier
//    )
//}
//
//@Composable
//fun Vector(modifier: Modifier = Modifier) {
//    RelayVector(
//        vector = painterResource(Res.drawable.scr1_vector),
//        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
//    )
//}
//
//@Composable
//fun SnailLogo(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        isStructured = false,
//        clipToParent = false,
//        content = content,
//        modifier = modifier.requiredWidth(143.0.dp).requiredHeight(118.0.dp)
//    )
//}
//
//@Composable
//fun Logo(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        isStructured = false,
//        clipToParent = false,
//        content = content,
//        modifier = modifier.requiredWidth(143.0.dp).requiredHeight(180.0.dp)
//    )
//}
//
//@Composable
//fun Content(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        backgroundColor = Color(
//            alpha = 255,
//            red = 255,
//            green = 255,
//            blue = 255
//        ),
//        isStructured = false,
//        clipToParent = false,
//        content = content,
//        modifier = modifier.padding(
//            paddingValues = PaddingValues(
//                start = 0.0.dp,
//                top = 24.0.dp,
//                end = 0.0.dp,
//                bottom = 0.0.dp
//            )
//        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
//    )
//}
//
//@Composable
//fun Class1220(modifier: Modifier = Modifier) {
//    RelayText(
//        content = "12:20",
//        color = Color(
//            alpha = 255,
//            red = 61,
//            green = 58,
//            blue = 76
//        ),
//        height = 1.171875.em,
//        textAlign = TextAlign.Left,
//        modifier = modifier.padding(
//            paddingValues = PaddingValues(
//                start = 5.0.dp,
//                top = 4.0.dp,
//                end = 320.0.dp,
//                bottom = 4.0.dp
//            )
//        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
//    )
//}
//
//@Composable
//fun Class99(modifier: Modifier = Modifier) {
//    RelayText(
//        content = "99%",
//        color = Color(
//            alpha = 255,
//            red = 61,
//            green = 58,
//            blue = 76
//        ),
//        height = 1.171875.em,
//        textAlign = TextAlign.Left,
//        modifier = modifier.padding(
//            paddingValues = PaddingValues(
//                start = 328.9501953125.dp,
//                top = 4.0.dp,
//                end = 4.0498046875.dp,
//                bottom = 4.0.dp
//            )
//        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
//    )
//}
//
//@Composable
//fun Rectangle15(modifier: Modifier = Modifier) {
//    RelayVector(
//        vector = painterResource(Res.drawable.scr1_rectangle_15),
//        modifier = modifier.padding(
//            paddingValues = PaddingValues(
//                start = 0.0.dp,
//                top = 1.3994140625.dp,
//                end = 0.0.dp,
//                bottom = 0.0.dp
//            )
//        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
//    )
//}
//
//@Composable
//fun Rectangle16(modifier: Modifier = Modifier) {
//    RelayVector(
//        vector = painterResource(Res.drawable.scr1_rectangle_16),
//        modifier = modifier.padding(
//            paddingValues = PaddingValues(
//                start = 2.60107421875.dp,
//                top = 0.0.dp,
//                end = 2.6009256839752197.dp,
//                bottom = 11.201997995376587.dp
//            )
//        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
//    )
//}
//
//@Composable
//fun Group26(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        isStructured = false,
//        clipToParent = false,
//        content = content,
//        modifier = modifier.padding(
//            paddingValues = PaddingValues(
//                start = 316.0.dp,
//                top = 5.0.dp,
//                end = 36.0.dp,
//                bottom = 5.000001907348633.dp
//            )
//        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
//    )
//}
//
//@Composable
//fun StatusBar(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        isStructured = false,
//        clipToParent = false,
//        content = content,
//        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(24.0.dp)
//    )
//}
//
//@Composable
//fun Scr1(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        backgroundColor = Color(
//            alpha = 255,
//            red = 255,
//            green = 255,
//            blue = 255
//        ),
//        isStructured = false,
//        radius = 16.0,
//        strokeWidth = 1.0,
//        borderAlignment = BorderAlignment.Outside,
//        strokeColor = Color(
//            alpha = 255,
//            red = 109,
//            green = 105,
//            blue = 127
//        ),
//        content = content,
//        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
//    )
//}
//
//@Composable
//fun TopLevel(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        isStructured = false,
//        clipToParent = false,
//        content = content,
//        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
//    )
//}
