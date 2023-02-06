package com.sanathcoding.calenderapplication.calender_feature.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CalenderViewModel @Inject constructor(

): ViewModel() {

    val calenderInputList by mutableStateOf(createCalenderList())

    private fun createCalenderList(): List<CalenderInput> {
        val calenderInputList = mutableListOf<CalenderInput>()
        for (i in 1..31) {
            calenderInputList.add(
                CalenderInput(
                    day = i,
                    toDos = listOf(
                        "Day: $i",
                        "2 p.m Meeting"
                    )
                )
            )
        }
        return calenderInputList
    }

}