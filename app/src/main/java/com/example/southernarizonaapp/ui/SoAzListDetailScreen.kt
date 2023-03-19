package com.example.southernarizonaapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SoAzListDetailScreen(
    uiState: SoAzUiState,
    modifier: Modifier = Modifier
) {
    SoAzCategoryListScreen(categories = uiState.categories.keys.toList() )

}