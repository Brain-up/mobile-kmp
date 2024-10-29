package brn.mobile.brnmobile


import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import org.jetbrains.compose.resources.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import brainup.composeapp.generated.resources.Res
import brainup.composeapp.generated.resources.*




@Composable
fun openSans(): FontFamily = FontFamily(
    Font(Res.font.relay_open_sans_light, weight = FontWeight.W300, style = FontStyle.Normal),
    Font(Res.font.relay_open_sans_semibold_italic, weight = FontWeight.W600, style = FontStyle.Italic),
    Font(Res.font.relay_open_sans_semibold, weight = FontWeight.W600, style = FontStyle.Normal),
    Font(Res.font.relay_open_sans_bold, weight = FontWeight.W700, style = FontStyle.Normal),
    Font(Res.font.relay_open_sans_light_italic, weight = FontWeight.W300, style = FontStyle.Italic),
    Font(Res.font.relay_open_sans_medium, weight = FontWeight.W500, style = FontStyle.Normal),
    Font(Res.font.relay_open_sans_extrabold_italic, weight = FontWeight.W800, style = FontStyle.Italic),
    Font(Res.font.relay_open_sans_bold_italic, weight = FontWeight.W700, style = FontStyle.Italic),
    Font(Res.font.relay_open_sans_italic, weight = FontWeight.W400, style = FontStyle.Italic),
    Font(Res.font.relay_open_sans_medium_italic, weight = FontWeight.W500, style = FontStyle.Italic),
    Font(Res.font.relay_open_sans_regular, weight = FontWeight.W400, style = FontStyle.Normal),
    Font(Res.font.relay_open_sans_extrabold, weight = FontWeight.W800, style = FontStyle.Normal)
)
@Composable
fun montserrat(): FontFamily = FontFamily(
    Font(Res.font.relay_montserrat_semibold_italic, weight = FontWeight.W600, style = FontStyle.Italic),
    Font(Res.font.relay_montserrat_medium_italic, weight = FontWeight.W500, style = FontStyle.Italic),
    Font(Res.font.relay_montserrat_extrabold, weight = FontWeight.W800, style = FontStyle.Normal),
    Font(Res.font.relay_montserrat_regular, weight = FontWeight.W400, style = FontStyle.Normal),
    Font(Res.font.relay_montserrat_extralight_italic, weight = FontWeight.W200, style = FontStyle.Italic),
    Font(Res.font.relay_montserrat_black, weight = FontWeight.W900, style = FontStyle.Normal),
    Font(Res.font.relay_montserrat_extralight, weight = FontWeight.W200, style = FontStyle.Normal),
    Font(Res.font.relay_montserrat_medium, weight = FontWeight.W500, style = FontStyle.Normal),
    Font(Res.font.relay_montserrat_bold, weight = FontWeight.W700, style = FontStyle.Normal),
    Font(Res.font.relay_montserrat_light_italic, weight = FontWeight.W300, style = FontStyle.Italic),
    Font(Res.font.relay_montserrat_thin, weight = FontWeight.W100, style = FontStyle.Normal),
    Font(Res.font.relay_montserrat_bold_italic, weight = FontWeight.W700, style = FontStyle.Italic),
    Font(Res.font.relay_montserrat_italic, weight = FontWeight.W400, style = FontStyle.Italic),
    Font(Res.font.relay_montserrat_semibold, weight = FontWeight.W600, style = FontStyle.Normal),
    Font(Res.font.relay_montserrat_light, weight = FontWeight.W300, style = FontStyle.Normal),
    Font(Res.font.relay_montserrat_thin_italic, weight = FontWeight.W100, style = FontStyle.Italic),
    Font(Res.font.relay_montserrat_black_italic, weight = FontWeight.W900, style = FontStyle.Italic),
    Font(Res.font.relay_montserrat_extrabold_italic, weight = FontWeight.W800, style = FontStyle.Italic)
)
@Composable
fun reenieBeanie(): FontFamily = FontFamily(
    Font(Res.font.relay_reenie_beanie_regular, weight = FontWeight.W400, style = FontStyle.Normal)
)
