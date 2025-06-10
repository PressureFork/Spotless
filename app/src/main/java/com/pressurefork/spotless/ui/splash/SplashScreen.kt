package com.pressurefork.spotless.ui.splash

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.pressurefork.spotless.R

@Composable
fun SplashScreen(onFinish: () -> Unit) {
    val scale = remember { Animatable(0.7f) }
    LaunchedEffect(true) {
        scale.animateTo(1.0f, animationSpec = tween(900, easing = FastOutSlowInEasing))
        kotlinx.coroutines.delay(1200)
        onFinish()
    }
    Surface(color = androidx.compose.ui.graphics.Color(0xFF181A20), modifier = Modifier.fillMaxSize()) {
        Box(contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "Spotless Logo",
                modifier = Modifier
                    .size(128.dp)
                    .scale(scale.value)
            )
        }
    }
}