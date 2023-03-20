package com.example.southernarizonaapp.ui

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.southernarizonaapp.data.SoAzScreen


@Composable
fun SoAzApp(
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    val viewModel: SoAzViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()
    
    NavHost(
        navController = navController,
        startDestination = SoAzScreen.ListDetailRoute.name
    ) {
        composable(route = SoAzScreen.ListDetailRoute.name) {
            SoAzListDetailScreen(
                uiState = uiState,
                windowSize = windowSize
            )
        }

    }
}