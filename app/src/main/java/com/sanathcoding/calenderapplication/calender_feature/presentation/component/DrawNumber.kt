package com.sanathcoding.calenderapplication.calender_feature.presentation.component

import android.graphics.Paint
import android.util.Log
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import com.sanathcoding.calenderapplication.calender_feature.core.util.CalenderConstValue
import com.sanathcoding.calenderapplication.calender_feature.presentation.CalenderInput
import com.sanathcoding.calenderapplication.ui.theme.White

fun DrawScope.drawNumber(
    tag: String,
    calenderInput: List<CalenderInput>,
    xStep: Float,
    yStep: Float,
    strokeWidth: Float,
    textHeight: Float
) {
    for (i in calenderInput.indices) {
        val numberPositionX = (xStep * (i % CalenderConstValue.CALENDER_COLUMNS) + strokeWidth)
        Log.d(tag, "numberPositionX: $numberPositionX")
        val numberPositionY =
            ((i / CalenderConstValue.CALENDER_COLUMNS) * yStep + textHeight + (strokeWidth / 2))
        Log.d(tag, "numberPositionY: $numberPositionY")
        drawContext.canvas.nativeCanvas.apply {
            drawText(
                "${i + 1}",
                numberPositionX,
                numberPositionY,
                Paint().apply {
                    textSize = textHeight
                    color = White.toArgb()
                    isFakeBoldText = true
                }
            )
        }
    }
}