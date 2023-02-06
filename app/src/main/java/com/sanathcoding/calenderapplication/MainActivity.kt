package com.sanathcoding.calenderapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.sanathcoding.calenderapplication.calender_feature.presentation.CalenderScreen
import com.sanathcoding.calenderapplication.ui.theme.CalenderApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalenderApplicationTheme {
                CalenderScreen()
            }
        }
    }
}