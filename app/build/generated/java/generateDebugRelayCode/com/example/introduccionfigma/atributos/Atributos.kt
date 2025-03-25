package com.example.introduccionfigma.atributos

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.introduccionfigma.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'atributos'.
 * Generated code; do not edit directly
 */
@Composable
fun Atributos(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Texto()
        Scanner {
            Ellipse1()
            _1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 4.0.dp,
                        y = 4.0.dp
                    )
                )
            )
        }
        ReconocimientoDeImGen()
    }
}

@Preview(widthDp = 150, heightDp = 148)
@Composable
private fun AtributosPreview() {
    MaterialTheme {
        RelayContainer {
            Atributos(modifier = Modifier.rowWeight(1.0f))
        }
    }
}

@Composable
fun Texto(modifier: Modifier = Modifier) {
    RelayText(
        content = "Atributos",
        fontSize = 24.0.sp,
        fontFamily = jetBrainsMono,
        color = Color(
            alpha = 255,
            red = 34,
            green = 33,
            blue = 37
        ),
        height = 1.3200000127156573.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(130.0.dp)
    )
}

@Composable
fun Ellipse1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.atributos_ellipse_1),
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun _1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.atributos_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Scanner(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun ReconocimientoDeImGen(modifier: Modifier = Modifier) {
    RelayText(
        content = "Reconocimiento de imágen",
        fontSize = 12.0.sp,
        fontFamily = jetBrainsMono,
        color = Color(
            alpha = 255,
            red = 34,
            green = 33,
            blue = 37
        ),
        height = 1.3200000127156573.em,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 60,
            green = 145,
            blue = 230
        ),
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 8.0,
        clipToParent = false,
        radius = 20.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}
