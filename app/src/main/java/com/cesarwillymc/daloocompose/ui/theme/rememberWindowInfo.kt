package com.cesarwillymc.daloocompose.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Created by cesarwillymamanicanaza on 5/03/22.
 * cesarwilly.mc@gmail.com
 *
 * Lima, Peru.
 */
@Composable
fun rememberWindowInfo(): WindowInfo {
    val configuration = LocalConfiguration.current
    return WindowInfo(
        screenWidthInfo = when {
            configuration.screenWidthDp < WIDTH_DPI_SMALL -> WindowInfo.WindowType.Compact
            configuration.screenWidthDp < WIDTH_DPI_MEDIUM -> WindowInfo.WindowType.Medium
            else -> WindowInfo.WindowType.Expanded
        },
        screenHeightInfo = when {
            configuration.screenHeightDp < HEIGHT_DPI_SMALL -> WindowInfo.WindowType.Compact
            configuration.screenHeightDp < HEIGHT_DPI_MEDIUM -> WindowInfo.WindowType.Medium
            else -> WindowInfo.WindowType.Expanded
        },
        screenHeight = configuration.screenHeightDp.dp,
        screenWidth = configuration.screenWidthDp.dp
    )
}

data class WindowInfo(
    val screenWidthInfo: WindowType,
    val screenHeightInfo: WindowType,
    val screenWidth: Dp,
    val screenHeight: Dp
) {
    sealed class WindowType {
        /**Use for cellphones**/
        object Compact : WindowType()

        /**Use mediums tablets**/
        object Medium : WindowType()

        /**Use large tablets**/
        object Expanded : WindowType()
    }
}