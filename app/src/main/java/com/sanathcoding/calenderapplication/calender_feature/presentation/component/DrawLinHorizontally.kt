package com.sanathcoding.calenderapplication.calender_feature.presentation.component

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.DrawScope
import com.sanathcoding.calenderapplication.calender_feature.core.util.CalenderConstValue
import com.sanathcoding.calenderapplication.ui.theme.Orange

fun DrawScope.drawLineHorizontally(
    yStep: Float,
    canvasWeight: Float,
    strokeWidth: Float
) {
    for (i in 1 until CalenderConstValue.CALENDER_ROWS) {
        drawLine(
            color = Orange,
            start = Offset(0f, yStep * i),
            end = Offset(canvasWeight, yStep * i),
            strokeWidth = strokeWidth
        )
    }
}