package org.jetbrains.kotlinconf.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.drawscope.translate
import kotlinconfapp.shared.generated.resources.Res
import org.jetbrains.kotlinconf.ui.components.zoomable.rememberZoomableState
import org.jetbrains.kotlinconf.ui.components.zoomable.zoomable
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.kotlinconf.ui.components.Tab
import org.jetbrains.kotlinconf.ui.components.TabBar

enum class Floor(
    override val title: String,
    val resource: String,
    val initialOffset: Offset,
    val initialScale: Float,
) : Tab {
    FIRST(
        "1st floor",
        "files/map-first.svg",
        initialOffset = Offset(-100f, 100f),
        initialScale = 0.7f,
    ),
    SECOND(
        "2nd floor", "files/map-second.svg",
        initialOffset = Offset(-100f, 100f),
        initialScale = 0.55f,
    );

}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun LocationScreen() {
    var floor: Floor by remember { mutableStateOf(Floor.FIRST) }
    var svgString: Svg? by remember { mutableStateOf(null) }

    LaunchedEffect(floor) {
        svgString = Svg(Res.readBytes(floor.resource))
    }

    val state = rememberZoomableState()
    Box(
        Modifier
            .fillMaxSize()
    ) {
        Canvas(
            Modifier
                .fillMaxSize()
                .zoomable(state)
        ) {
            translate(floor.initialOffset.x, floor.initialOffset.y) {
                scale(floor.initialScale) {
                    svgString?.renderTo(this)
                }
            }
        }
        TabBar(
            Floor.entries,
            selected = floor,
            onSelect = { floor = it },
        )
    }
}

expect class Svg(svgBytes: ByteArray) {
    fun renderTo(scope: DrawScope)
}