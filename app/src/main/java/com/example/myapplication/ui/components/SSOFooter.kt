package com.example.myapplication.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

/**
 * Bloque de "Or continue with" + botones de login social (Google, Facebook, Apple).
 */
@Composable
fun SSOFooter(
    onGoogleClick: () -> Unit = {},
    onFacebookClick: () -> Unit = {},
    onAppleClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.sso_text),
            style = MaterialTheme.typography.labelSmall.copy(color = Color.Gray)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            SSOIconButton(iconRes = R.drawable.google_logo, onClick = onGoogleClick)
            SSOIconButton(iconRes = R.drawable.meta_logo, onClick = onFacebookClick)
            SSOIconButton(iconRes = R.drawable.apple_logo, onClick = onAppleClick)
        }
    }
}

@Composable
private fun SSOIconButton(iconRes: Int, onClick: () -> Unit) {
    IconButton(
        onClick = onClick,
        modifier = Modifier
            .size(48.dp)
            .border(width = 1.dp, color = Color(0xFFE0E0E0), shape = CircleShape)
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            modifier = Modifier
                .padding(12.dp)
                .size(20.dp)
        )
    }
}