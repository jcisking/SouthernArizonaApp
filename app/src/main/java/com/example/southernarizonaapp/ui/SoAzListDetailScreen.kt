package com.example.southernarizonaapp.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SoAzListDetailScreen(
    windowSize: WindowWidthSizeClass,
    uiState: SoAzUiState,
    modifier: Modifier = Modifier
) {
    when (windowSize) {
        WindowWidthSizeClass.Expanded -> {
            PermanentNavigationDrawer(drawerContent = { /*TODO*/ }) {
                if (uiState.currentCategory == null) {
                    SoAzPlaceHolderScreen()
                }
                else SoAzListAndDetailScreen()
                
            }
        }

        WindowWidthSizeClass.Medium -> {
            Row {
                NavigationRail() {

                }
                if (uiState.currentCategory == null) {
                    SoAzPlaceHolderScreen()
                }
                else if (uiState.isShowingRecommendationScreen) {
                    SoAzRecommendationListScreen(
                        recommendations = /*TODO*/,
                        onBackButtonClicked = { /*TODO*/ },
                        uiState = /*TODO*/
                    )
                }
                else SoAzDetailScreen(recommendation = )
            }
        }
        
        WindowWidthSizeClass.Compact -> {
            if (uiState.currentCategory == null) {
                SoAzPlaceHolderScreen()
            }
            else if (uiState.isShowingRecommendationScreen) {
                SoAzRecommendationListScreen(
                    recommendations = ,
                    onBackButtonClicked = { /*TODO*/ },
                    uiState = 
                )
            }
            else SoAzDetailScreen(recommendation = )
        }
    }
}
