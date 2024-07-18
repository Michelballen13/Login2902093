package com.example.login2902093m.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.login2902093m.R
import com.example.login2902093m.components.NormalTextComponent

@Composable
fun SignUpScreen() {


    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)
            .background(color = Color.White)
    ) {
        NormalTextComponent(value = stringResource(id = R.string.hello))
    } //surface
} //SignUpScreen

@Preview(showBackground = true)
@Composable
fun SignUpScreenPreview() {
    SignUpScreen()

}

