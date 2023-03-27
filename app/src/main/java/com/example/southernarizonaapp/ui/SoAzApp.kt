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
import com.example.southernarizonaapp.ui.utils.SoAzContentType
import com.example.southernarizonaapp.ui.utils.SoAzNavigationType


@Composable
fun SoAzApp(
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    val viewModel: SoAzViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()
    val navigationType: SoAzNavigationType
    val contentType: SoAzContentType

    when (windowSize) {
        WindowWidthSizeClass.Compact -> {
            navigationType = SoAzNavigationType.BOTTOM_NAVIGATION
            contentType = SoAzContentType.LIST_ONLY
        }
        WindowWidthSizeClass.Medium -> {
            navigationType = SoAzNavigationType.NAVIGATION_RAIL
            contentType = SoAzContentType.LIST_ONLY
        }
        WindowWidthSizeClass.Expanded -> {
            navigationType = SoAzNavigationType.PERMANENT_NAVIGATION_DRAWER
            contentType = SoAzContentType.LIST_AND_DETAIL
        }
        else -> {
            navigationType = SoAzNavigationType.BOTTOM_NAVIGATION
            contentType = SoAzContentType.LIST_ONLY
        }
    }

    
    NavHost(
        navController = navController,
        startDestination = SoAzScreen.ListDetailRoute.name
    ) {
        composable(route = SoAzScreen.ListDetailRoute.name) {
            SoAzListDetailScreen(
                uiState = uiState,
                contentType = contentType,
                navigationType = navigationType,
                onTabPressed = { viewModel.changeCurrentCategory(it) },
                onRecommendationCardPressed = {}
            )
        }

    }
}