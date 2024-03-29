package com.example.southernarizonaapp.ui

import androidx.lifecycle.ViewModel
import com.example.southernarizonaapp.data.Category
import com.example.southernarizonaapp.data.Recommendation
import com.example.southernarizonaapp.data.local.LocalRecommendationDataProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SoAzViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(SoAzUiState())
    val uiState = _uiState.asStateFlow()

//    init {
//        initializeUiState()
//    }
//    private fun initializeUiState() {
//        val categories: Map<Category, List<Recommendation>> =
//            LocalRecommendationDataProvider.allRecommendations.groupBy { it.category }
//        _uiState.value =
//            SoAzUiState(
//                categories = categories
//            )
//    }

    private fun initializeCategories() {
        val categories: Map<Category, List<Recommendation>> =
            LocalRecommendationDataProvider.allRecommendations.groupBy { it.category }
        _uiState.update {
            it.copy(
                categories = categories
            )
        }
    }

    fun changeCurrentCategory(category: Category) {
        if (_uiState.value.currentCategory == null) {
            initializeCategories()
        }
        _uiState.update {
            it.copy(
                currentCategory = category
            )
        }

    }

    fun onRecommendationClicked(recommendation: Recommendation) {
        _uiState.update {
            it.copy(
                isShowingDetailScreen = true,
                currentRecommendation = recommendation
            )
        }
    }

    fun resetRecommendationScreenState() {
        _uiState.update {
            it.copy(
                isShowingDetailScreen = false
            )
        }
    }
}