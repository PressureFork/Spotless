package com.pressurefork.spotless.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.pressurefork.spotless.R

@Composable
fun AnimatedLogo() {
    val infiniteTransition = rememberInfiniteTransition(label = "logoAnim")
    val scale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.10f,
        animationSpec = infiniteRepeatable(
            animation = tween(1350, easing = FastOutLinearInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "logoScale"
    )
    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "Spotless Logo",
        modifier = Modifier.size((40 * scale).dp)
    )
}