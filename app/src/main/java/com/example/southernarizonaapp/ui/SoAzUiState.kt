package com.example.southernarizonaapp.ui

import com.example.southernarizonaapp.data.Category
import com.example.southernarizonaapp.data.Recommendation

data class SoAzUiState(
    val currentCategory: Category? = null,
    val currentRecommendation: Recommendation? = null,
    val isShowingCategoryScreen: Boolean = true,
    val isShowingRecommendationScreen: Boolean = false,
    val isShowingDetailScreen: Boolean = false,
    val categories: Map<Category, List<Recommendation>> = emptyMap(),
) {
    val currentRecommendationList: List<Recommendation> by lazy {categories[currentCategory]!!}
}
