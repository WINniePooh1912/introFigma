package com.example.introduccionfigma.teoria

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.introduccionfigma.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'teoria'.
 * Generated code; do not edit directly
 *
 * @param clickTeoria Al dar click en teoria
 */
@Composable
fun Teoria(
    modifier: Modifier = Modifier,
    clickTeoria: () -> Unit = {}
) {
    TopLevel(
        clickTeoria = clickTeoria,
        modifier = modifier
    ) {
        Rectangle1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Label(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 100, heightDp = 168)
@Composable
private fun TeoriaPreview() {
    MaterialTheme {
        RelayContainer {
            Teoria(
                clickTeoria = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Rectangle1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.teoria_rectangle_1),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Label(modifier: Modifier = Modifier) {
    RelayText(
        content = "Teoría",
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
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 59.0.dp,
                end = 1.4210854715202004e-14.dp,
                bottom = 59.0.dp
            )
        ).graphicsLayer(rotationZ = 90.00000000000001f).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevel(
    clickTeoria: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = clickTeoria).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
