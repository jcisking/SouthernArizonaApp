package com.example.southernarizonaapp.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SoAzListAndDetailScreen(
    uiState: SoAzUiState,
    modifier: Modifier = Modifier
) {
        Row(modifier = modifier) {
            if (uiState.currentCategory == null) {
                SoAzPlaceHolderScreen()
            }
            else {
                SoAzRecommendationListScreen(
                    onBackButtonClicked = { /*TODO*/ }, uiState = uiState
                )
            }
            SoAzDetailScreen(uiState = uiState)
        }
}