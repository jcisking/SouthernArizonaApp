package com.example.southernarizonaapp.ui

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SoAzListDetailScreen(
    windowSize: WindowWidthSizeClass,
    uiState: SoAzUiState,
    modifier: Modifier = Modifier
) {

    when(windowSize) {

        WindowWidthSizeClass.Expanded -> {
            SoAzListAndDetailScreen()
        }

        WindowWidthSizeClass.Compact, WindowWidthSizeClass.Medium -> {

        }
    }

    SoAzCategoryListScreen(categories = uiState.categories.keys.toList())
}