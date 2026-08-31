package com.example.myapplication.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorInt

fun hex(value: String): Color = Color(value.toColorInt())

val PrimaryLight = hex("#1F41BB")
val SecondaryLight = hex("#F1F4FF")