package com.example.myapplication.screens.signup


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
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
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
fun SignUpScreen(
    modifier: Modifier = Modifier,
    onSignUpClick: (String, String, String) -> Unit = { _, _, _ -> },
    onLoginClick: () -> Unit = {}
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 28.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(id = R.string.register_title),
            style = MaterialTheme.typography.titleLarge.copy(
                color = PrimaryLight,
                fontWeight = FontWeight.Bold
            ),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = stringResource(id = R.string.register_subtitle),
            style = MaterialTheme.typography.bodyLarge.copy(color = Color.DarkGray),
            textAlign = TextAlign.Center
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
            imeAction = ImeAction.Next
        )

        Spacer(modifier = Modifier.height(16.dp))

        DefaultTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            placeholder = stringResource(id = R.string.register_confirm_password_placeholder),
            isPassword = true,
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done
        )

        Spacer(modifier = Modifier.height(32.dp))

        DefaultActiveButton(
            text = stringResource(id = R.string.sign_up_button),
            onClick = { onSignUpClick(email, password, confirmPassword) }
        )

        Spacer(modifier = Modifier.height(16.dp))

        DefaultTextButton(
            text = stringResource(id = R.string.already_have_account),
            onClick = onLoginClick
        )

        Spacer(modifier = Modifier.height(40.dp))

        SSOFooter()
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpScreenPreview() {
    MyApplicationTheme {
        SignUpScreen()
    }
}