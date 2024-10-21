package org.jetbrains.kotlinconf.ui25.theme

import androidx.compose.ui.graphics.Color

class Colors(
    val textIconHard: Color,
    val textIconAverage: Color,
    val textIconPale: Color,
)

val KotlinConfLightColors = Colors(
    textIconHard = textIconHard,
    textIconAverage = textIconAverage,
    textIconPale = textIconPale,
)

val KotlinConfDarkColors = Colors(
    textIconHard = textIconHardInverted,
    textIconAverage = textIconAverageInverted,
    textIconPale = textIconPaleInverted,
)
