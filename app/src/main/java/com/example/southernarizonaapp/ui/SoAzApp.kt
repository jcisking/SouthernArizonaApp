package com.example.southernarizonaapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.southernarizonaapp.data.SoAzScreen


@Composable
fun SoAzApp() {
    val navController = rememberNavController()
    
    NavHost(
        navController = navController,
        startDestination = SoAzScreen.ListDetailRoute.name
    ) {
        composable(route = SoAzScreen.ListDetailRoute.name) {
            SoAzListDetailScreen()
        }

    }
}