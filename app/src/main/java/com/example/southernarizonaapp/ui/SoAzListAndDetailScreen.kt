package com.example.southernarizonaapp.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.southernarizonaapp.data.Category
import com.example.southernarizonaapp.data.Recommendation
import com.example.southernarizonaapp.ui.utils.SoAzNavigationType

@Composable
fun SoAzListAndDetailScreen(
    uiState: SoAzUiState,
    navigationType: SoAzNavigationType,
    onTabPressed: (Category) -> Unit,
    onRecommendationCardPressed: (Recommendation) -> Unit,
    modifier: Modifier = Modifier
) {
        Row(modifier = modifier) {
            if (uiState.currentCategory == null) {
                SoAzPlaceHolderScreen(navigationType = navigationType)
            }
            else {
                SoAzRecommendationListScreen(
                    modifier = Modifier.weight(1f),
                    uiState = uiState,
                    onTabPressed = onTabPressed,
                    navigationType = navigationType,
                    onRecommendationCardPressed = onRecommendationCardPressed
                )
            }
            SoAzDetailScreen(
                modifier = Modifier.weight(1f),
                uiState = uiState,
                onBackButtonPressed = {}
            )
        }
}