package com.pressurefork.spotless.ui

import androidx.compose.runtime.Composable
import com.pressurefork.spotless.ui.theme.SpotlessTheme
import com.pressurefork.spotless.ui.screens.RootNavHost

@Composable
fun SpotlessApp() {
    SpotlessTheme {
        RootNavHost()
    }
}