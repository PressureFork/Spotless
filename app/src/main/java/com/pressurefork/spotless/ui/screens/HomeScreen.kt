package com.pressurefork.spotless.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    // Example home: Now Playing, recommended, etc.
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Now Playing", style = MaterialTheme.typography.headlineSmall, color = MaterialTheme.colorScheme.primary)
        // Playback controls, album art, etc.
    }
}