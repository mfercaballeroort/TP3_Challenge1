package com.example.myapplication.screens.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.ui.components.DefaultActiveButton
import com.example.myapplication.ui.components.DefaultTextButton
import com.example.myapplication.ui.components.DefaultTextField
import com.example.myapplication.ui.components.SSOFooter
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.PrimaryLight

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onSignInClick: (String, String) -> Unit = { _, _ -> },
    onForgotPasswordClick: () -> Unit = {},
    onCreateAccountClick: () -> Unit = {}
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 28.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(id = R.string.login_title),
            style = MaterialTheme.typography.titleLarge.copy(
                color = PrimaryLight,
                fontWeight = FontWeight.Bold
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = stringResource(id = R.string.login_subtitle),
            style = MaterialTheme.typography.bodyLarge.copy(color = Color.DarkGray)
        )

        Spacer(modifier = Modifier.height(32.dp))

        DefaultTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = stringResource(id = R.string.email_placeholder),
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
        )

        Spacer(modifier = Modifier.height(16.dp))

        DefaultTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = stringResource(id = R.string.password_placeholder),
            isPassword = true,
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done
        )

        Spacer(modifier = Modifier.height(8.dp))

        DefaultTextButton(
            text = stringResource(id = R.string.forgot_password),
            onClick = onForgotPasswordClick
        )

        Spacer(modifier = Modifier.height(24.dp))

        // TODO: reemplazar por el botón nuevo (imagen "Components") cuando esté listo.
        DefaultActiveButton(
            text = stringResource(id = R.string.sign_in_button),
            onClick = { onSignInClick(email, password) }
        )

        Spacer(modifier = Modifier.height(16.dp))

        DefaultTextButton(
            text = stringResource(id = R.string.create_account_button),
            onClick = onCreateAccountClick
        )

        Spacer(modifier = Modifier.height(40.dp))

        SSOFooter(modifier = Modifier.align(Alignment.CenterHorizontally))
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    MyApplicationTheme {
        LoginScreen()
    }
}