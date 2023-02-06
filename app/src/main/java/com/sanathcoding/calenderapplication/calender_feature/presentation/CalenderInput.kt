package com.sanathcoding.calenderapplication.calender_feature.presentation

data class CalenderInput(
    val day: Int,
    val toDos: List<String> = emptyList()
)