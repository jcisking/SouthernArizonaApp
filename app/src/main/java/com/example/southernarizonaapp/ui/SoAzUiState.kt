package com.example.southernarizonaapp.ui

import com.example.southernarizonaapp.data.Category
import com.example.southernarizonaapp.data.Recommendation

data class SoAzUiState(
    val currentCategory: Category,
    val currentRecommendation: Recommendation,
    val isShowingCategoryScreen: Boolean,

)
