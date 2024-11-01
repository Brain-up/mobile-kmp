package brn.mobile.brnmobile.ui

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import brainup.composeapp.generated.resources.snailvector
import brn.mobile.brnmobile.montserrat
import brn.mobile.brnmobile.openSans
import brn.mobile.brnmobile.reenieBeanie
import brn.mobile.brnmobile.ui.scr1.Scr1a
import brn.mobile.brnmobile.ui.scr1.utils.BoxScopeInstanceImpl.align
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.jetbrains.compose.resources.painterResource

internal object LoginScreen : Screen {
    override val key: ScreenKey = uniqueScreenKey

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        Scr1a()
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
                                painter = painterResource(Res.drawable.snailvector),
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