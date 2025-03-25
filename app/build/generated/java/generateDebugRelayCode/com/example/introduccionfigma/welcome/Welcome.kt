package com.example.introduccionfigma.welcome

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.introduccionfigma.R
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'welcome'.
 * Generated code; do not edit directly
 */
@Composable
fun Welcome(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Title()
        Label()
        ProgressBar {
            ProgressBar1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -7.0.dp
                    )
                )
            )
            Progress(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 3.0.dp,
                        y = -4.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 330, heightDp = 100)
@Composable
private fun WelcomePreview() {
    MaterialTheme {
        RelayContainer {
            Welcome(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Title(modifier: Modifier = Modifier) {
    RelayText(
        content = "Bienvenido Sly",
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
        modifier = modifier.requiredWidth(243.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Label(modifier: Modifier = Modifier) {
    RelayText(
        content = "Progreso:",
        fontSize = 15.0.sp,
        fontFamily = jetBrainsMono,
        color = Color(
            alpha = 255,
            red = 34,
            green = 33,
            blue = 37
        ),
        height = 1.3200000762939452.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(81.0.dp)
    )
}

@Composable
fun ProgressBar1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.welcome_progress_bar),
        modifier = modifier.requiredWidth(250.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Progress(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.welcome_progress),
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun ProgressBar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(250.0.dp).requiredHeight(3.0.dp)
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
            red = 111,
            green = 207,
            blue = 151
        ),
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 25.0.dp,
            top = 18.0.dp,
            end = 25.0.dp,
            bottom = 18.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        radius = 20.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
