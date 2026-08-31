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
fun ActiveButton(text: String, onClick: () -> Unit) {
    FloatingActionButton (
        onClick = onClick,
        containerColor = Color(0xFF1F41BB),
        contentColor = Color.White
    ) {
        Text(text)
    }
}


fun DefaultButton(text: String, onClick: () -> Unit) {
    TextButton(
        onClick = { onClick() },
        conten
    ) {
        Text(text)
    }
}