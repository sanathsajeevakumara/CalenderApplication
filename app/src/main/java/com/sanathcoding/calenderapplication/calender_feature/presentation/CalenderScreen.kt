package com.sanathcoding.calenderapplication.calender_feature.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sanathcoding.calenderapplication.R
import com.sanathcoding.calenderapplication.calender_feature.core.util.UiText
import com.sanathcoding.calenderapplication.calender_feature.presentation.component.Calender
import com.sanathcoding.calenderapplication.ui.theme.Gray

@Composable
fun CalenderScreen(
    viewModel: CalenderViewModel = hiltViewModel()
) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Gray),
    contentAlignment = Alignment.TopCenter) {
        Calender(
            modifier = Modifier
                .padding(16.dp)
                .aspectRatio(1.3f),
            calenderInput = viewModel.calenderInputList,
            onDayClick = { },
            month = UiText.StringResource(R.string.month)
        )
    }


}