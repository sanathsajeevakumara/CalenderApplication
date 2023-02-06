package com.sanathcoding.calenderapplication.calender_feature.presentation.component

import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sanathcoding.calenderapplication.R
import com.sanathcoding.calenderapplication.calender_feature.core.util.CalenderConstValue.CALENDER_COLUMNS
import com.sanathcoding.calenderapplication.calender_feature.core.util.CalenderConstValue.CALENDER_ROWS
import com.sanathcoding.calenderapplication.calender_feature.core.util.UiText
import com.sanathcoding.calenderapplication.calender_feature.presentation.CalenderInput
import com.sanathcoding.calenderapplication.ui.theme.Orange
import com.sanathcoding.calenderapplication.ui.theme.White

@Composable
fun Calender(
    modifier: Modifier,
    calenderInput: List<CalenderInput>,
    onDayClick: () -> Unit,
    strokeWidth: Float = 5f,
    month: UiText
) {

    val tag = "Calender"

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Text(
            text = UiText.StringResource(R.string.month).asString(),
            fontWeight = FontWeight.SemiBold,
            color = White,
            fontSize = 30.sp,
            modifier = Modifier.align(CenterHorizontally)
        )
        Canvas(
            modifier = Modifier.fillMaxSize()
        ) {
            val canvasHeight = size.height
            val canvasWeight = size.width
            val yStep = canvasHeight / CALENDER_ROWS
            val xStep = canvasWeight / CALENDER_COLUMNS

            drawRoundRect(
                color = Orange,
                cornerRadius = CornerRadius(25f, 25f),
                style = Stroke(
                    width = strokeWidth
                )
            )

            for (i in 1 until CALENDER_ROWS) {
                Log.d(tag, "loop count : $i")
                Log.d(tag, "yStep: ${yStep*i}, xStep: ${xStep * i}")
                drawLine(
                    color = Orange,
                    start = Offset(0f, yStep * i),
                    end = Offset(canvasWeight, yStep * i),
                    strokeWidth = strokeWidth
                )
            }
            for (i in 1 until CALENDER_COLUMNS) {
                drawLine(
                    color = Orange,
                    start = Offset(xStep * i, 0f),
                    end = Offset(xStep * i, canvasHeight),
                    strokeWidth = strokeWidth
                )
            }
        }

    }
}