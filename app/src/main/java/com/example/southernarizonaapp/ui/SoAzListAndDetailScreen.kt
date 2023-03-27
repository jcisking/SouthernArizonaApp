package com.example.southernarizonaapp.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.southernarizonaapp.data.Category
import com.example.southernarizonaapp.ui.utils.SoAzNavigationType

@Composable
fun SoAzListAndDetailScreen(
    uiState: SoAzUiState,
    navigationType: SoAzNavigationType,
    onTabPressed: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
        Row(modifier = modifier) {
            if (uiState.currentCategory == null) {
                SoAzPlaceHolderScreen(navigationType = navigationType)
            }
            else {
                SoAzRecommendationListScreen(
                    onBackButtonClicked = { /*TODO*/ },
                    uiState = uiState,
                    onTabPressed = onTabPressed,
                    navigationType = navigationType
                )
            }
            SoAzDetailScreen(uiState = uiState)
        }
}