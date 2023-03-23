package com.example.southernarizonaapp.ui

import androidx.lifecycle.ViewModel
import com.example.southernarizonaapp.data.Category
import com.example.southernarizonaapp.data.Recommendation
import com.example.southernarizonaapp.data.local.LocalRecommendationDataProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SoAzViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(SoAzUiState())
    val uiState = _uiState.asStateFlow()

    init {
        initializeUiState()

    }
    private fun initializeUiState() {
        val categories: Map<Category, List<Recommendation>> =
            LocalRecommendationDataProvider.allRecommendations.groupBy { it.category }
        _uiState.value =
            SoAzUiState(
                categories = categories
            )


    }
}