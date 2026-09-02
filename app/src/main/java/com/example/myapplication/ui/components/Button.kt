package com.example.myapplication.ui.components

import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun DefaultActiveButton(text: String, onClick: () -> Unit) {
    FloatingActionButton (
        onClick = onClick,
        containerColor = Color(0xFF1F41BB)
    ) {
        Text(text, color=Color.White)
    }
}

@Composable
fun DefaultTextButton(text: String, onClick: () -> Unit) {
    TextButton(
        onClick = { onClick() },
    ) {
        Text(text, color=Color.Black)
    }
}