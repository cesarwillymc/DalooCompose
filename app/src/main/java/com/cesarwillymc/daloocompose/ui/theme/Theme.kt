package com.cesarwillymc.daloocompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

private val DarkColorPalette = darkColors(
    primary = InformativeBlueDark,
    secondary = BabyBlue,
    error = DangerRed,
    background = OnyxBlack

)

private val LightColorPalette = lightColors(
    primary = InformativeBlueDark,
    secondary = BabyBlue,
    error = DangerRed,
    background = White

)

@Composable
fun DalooComposeTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {

    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}