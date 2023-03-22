package com.example.southernarizonaapp.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SoAzListAndDetailScreen(
    uiState: SoAzUiState,
    modifier: Modifier

) {

    if (uiState.currentCategory == null) {
        SoAzPlaceHolderScreen()
    }
    else {
        Row() {
            SoAzRecommendationListScreen(onBackButtonClicked = { /*TODO*/ }, uiState = )
            SoAzDetailScreen(uiState = )
        }
    }

}