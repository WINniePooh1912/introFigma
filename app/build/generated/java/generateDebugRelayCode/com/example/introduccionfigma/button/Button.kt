package com.example.introduccionfigma.button

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

// Design to select for Button
enum class State {
    Default,
    Pressed
}

/**
 * This composable was generated from the UI Package 'button'.
 * Generated code; do not edit directly
 */
@Composable
fun Button(
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

@Preview(widthDp = 150, heightDp = 50)
@Composable
private fun ButtonStateDefaultPreview() {
    MaterialTheme {
        RelayContainer {
            Button(
                state = State.Default,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 150, heightDp = 50)
@Composable
private fun ButtonStatePressedPreview() {
    MaterialTheme {
        RelayContainer {
            Button(
                state = State.Pressed,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun LabelStateDefault(modifier: Modifier = Modifier) {
    RelayText(
        content = "Inicia Sesión",
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
fun TopLevelStateDefault(
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
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 16.0.dp),
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
        content = "Registrarse",
        fontSize = 15.0.sp,
        fontFamily = jetBrainsMono,
        color = Color(
            alpha = 255,
            red = 111,
            green = 207,
            blue = 151
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
            red = 34,
            green = 33,
            blue = 37
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 16.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 20.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
