package com.example.introduccionfigma.ejercicios

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.introduccionfigma.button2.Button2
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'ejercicios'.
 * Generated code; do not edit directly
 */
@Composable
fun Ejercicios(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Title()
        Group2 {
            Group1 {
                Label3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.927093505859375.dp,
                            y = 32.0.dp
                        )
                    )
                )
                Label2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.927093505859375.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Label1()
            }
            Button2Instance(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 150.0.dp,
                        y = 8.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 330, heightDp = 121)
@Composable
private fun EjerciciosPreview() {
    MaterialTheme {
        RelayContainer {
            Ejercicios(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Title(modifier: Modifier = Modifier) {
    RelayText(
        content = "Ejercicios",
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Label3(modifier: Modifier = Modifier) {
    RelayText(
        content = ">...",
        fontSize = 12.0.sp,
        fontFamily = jetBrainsMono,
        color = Color(
            alpha = 255,
            red = 34,
            green = 33,
            blue = 37
        ),
        height = 1.3200000127156573.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(139.07284545898438.dp)
    )
}

@Composable
fun Label2(modifier: Modifier = Modifier) {
    RelayText(
        content = ">Calculadora",
        fontSize = 12.0.sp,
        fontFamily = jetBrainsMono,
        color = Color(
            alpha = 255,
            red = 34,
            green = 33,
            blue = 37
        ),
        height = 1.3200000127156573.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(139.07284545898438.dp)
    )
}

@Composable
fun Label1(modifier: Modifier = Modifier) {
    RelayText(
        content = ">Hola mundo",
        fontSize = 12.0.sp,
        fontFamily = jetBrainsMono,
        color = Color(
            alpha = 255,
            red = 34,
            green = 33,
            blue = 37
        ),
        height = 1.3200000127156573.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(139.07284545898438.dp)
    )
}

@Composable
fun Group1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(140.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Button2Instance(modifier: Modifier = Modifier) {
    Button2(modifier = modifier.requiredWidth(135.59320068359375.dp).requiredHeight(30.0.dp))
}

@Composable
fun Group2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 20.0,
        content = content,
        modifier = modifier.requiredWidth(285.59320068359375.dp).requiredHeight(48.0.dp)
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
            red = 242,
            green = 201,
            blue = 76
        ),
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 8.0,
        clipToParent = false,
        radius = 20.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
