package com.example.myapplication.screens.welcome

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myapplication.ui.components.DefaultActiveButton
import com.example.myapplication.ui.components.DefaultTextButton

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier){
    DefaultActiveButton("Login") { }
    DefaultTextButton("Register") { }
}