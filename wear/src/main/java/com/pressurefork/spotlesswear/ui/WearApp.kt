package com.pressurefork.spotlesswear.ui

import androidx.compose.runtime.Composable
import com.pressurefork.spotlesswear.ui.theme.WearTheme
import com.pressurefork.spotlesswear.ui.screens.WearMainScreen

@Composable
fun WearApp() {
    WearTheme {
        WearMainScreen()
    }
}