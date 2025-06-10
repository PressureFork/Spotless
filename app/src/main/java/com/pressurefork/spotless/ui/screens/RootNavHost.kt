package com.pressurefork.spotless.ui.screens

import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pressurefork.spotless.ui.splash.SplashScreen

@Composable
fun RootNavHost() {
    val navController = rememberNavController()
    var showSplash by remember { mutableStateOf(true) }
    if (showSplash) {
        SplashScreen(onFinish = { showSplash = false })
    } else {
        MainScreen(navController)
    }
}