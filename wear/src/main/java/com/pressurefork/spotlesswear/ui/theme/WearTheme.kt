package com.pressurefork.spotlesswear.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val WearDarkColorScheme = darkColorScheme(
    primary = Color(0xFF1ED760),
    onPrimary = Color(0xFF181A20),
    background = Color(0xFF181A20),
    surface = Color(0xFF23272A),
    onBackground = Color(0xFFF2F2F2),
    onSurface = Color(0xFFF2F2F2),
    secondary = Color(0xFF23FF89)
)

@Composable
fun WearTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = WearDarkColorScheme,
        typography = Typography(),
        content = content
    )
}