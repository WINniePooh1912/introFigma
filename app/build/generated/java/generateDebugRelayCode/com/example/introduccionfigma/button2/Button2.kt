package com.example.introduccionfigma.button2

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

// Design to select for Button2
enum class State {
    Default,
    Pressed
}

/**
 * This composable was generated from the UI Package 'button2'.
 * Generated code; do not edit directly
 */
@Composable
fun Button2(
    modifier: Modifier = Modifier,
    state: State = State.Default
) {
    when (state) {
        State.Default -> TopLevelStateDefault(modifier = modifier) {
            LabelStateDefault()
        }
        State.Pressed -> TopLevelStatePressed(modifier = modifier) {
            LabelStatePressed()
        }
    }
}

@Preview(widthDp = 150, heightDp = 30)
@Composable
private fun Button2StateDefaultPreview() {
    MaterialTheme {
        RelayContainer {
            Button2(
                state = State.Default,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 150, heightDp = 30)
@Composable
private fun Button2StatePressedPreview() {
    MaterialTheme {
        RelayContainer {
            Button2(
                state = State.Pressed,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun LabelStateDefault(modifier: Modifier = Modifier) {
    RelayText(
        content = "Continuar",
        fontSize = 15.0.sp,
        fontFamily = jetBrainsMono,
        color = Color(
            alpha = 255,
            red = 242,
            green = 201,
            blue = 76
        ),
        height = 1.3200000762939452.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TopLevelStateDefault(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 34,
            green = 33,
            blue = 37
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 34.0.dp,
            top = 15.0.dp,
            end = 34.0.dp,
            bottom = 15.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 20.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun LabelStatePressed(modifier: Modifier = Modifier) {
    RelayText(
        content = "Continuar",
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
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TopLevelStatePressed(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 214,
            green = 173,
            blue = 50
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 34.0.dp,
            top = 15.0.dp,
            end = 34.0.dp,
            bottom = 15.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 20.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
