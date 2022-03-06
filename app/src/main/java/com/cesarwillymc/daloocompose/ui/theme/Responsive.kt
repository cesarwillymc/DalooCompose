package com.cesarwillymc.daloocompose.ui.theme

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Created by cesarwillymamanicanaza on 5/03/22.
 * cesarwilly.mc@gmail.com
 *
 * Lima, Peru.
 */
class Responsive constructor(private val configuration: Configuration) {
    private var width = ZERO
    private var height = ZERO
    private var inch = ZERO

    init {
        getDimension()
    }

    private fun getDimension() {
        width = configuration.screenWidthDp
        height = configuration.screenHeightDp
        inch = sqrt(
            width.toDouble().pow(TWO.toDouble()) + height.toDouble().pow(TWO.toDouble())
        ).toInt()
    }

    /** get size screen by size **/
    fun withR(percent: Float = FRACTION_100) = width * percent / HUNDRED
    fun heightR(percent: Float = FRACTION_100) = height * percent / HUNDRED
    fun inchR(percent: Float = FRACTION_100) = inch * percent / HUNDRED
}
