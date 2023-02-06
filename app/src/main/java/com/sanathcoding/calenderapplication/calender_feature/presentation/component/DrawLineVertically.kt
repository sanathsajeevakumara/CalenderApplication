package com.sanathcoding.calenderapplication.calender_feature.presentation.component

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.DrawScope
import com.sanathcoding.calenderapplication.calender_feature.core.util.CalenderConstValue
import com.sanathcoding.calenderapplication.ui.theme.Orange

fun DrawScope.drawLineVertically(
    xStep: Float,
    canvasHeight: Float,
    strokeWidth: Float
) {
    for (i in 1 until CalenderConstValue.CALENDER_COLUMNS) {
        drawLine(
            color = Orange,
            start = Offset(xStep * i, 0f),
            end = Offset(xStep * i, canvasHeight),
            strokeWidth = strokeWidth
        )
    }
}