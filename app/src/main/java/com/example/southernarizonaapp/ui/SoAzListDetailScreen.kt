package com.example.southernarizonaapp.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.southernarizonaapp.data.Category
import com.example.southernarizonaapp.ui.utils.SoAzContentType
import com.example.southernarizonaapp.ui.utils.SoAzNavigationType

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SoAzListDetailScreen(
    uiState: SoAzUiState,
    contentType: SoAzContentType,
    navigationType: SoAzNavigationType,
    modifier: Modifier = Modifier
) {
    data class NavigationItemContent(
        val icon: ImageVector,
        val text: String,
        val category: Category
    ) {

    }

    if (navigationType == SoAzNavigationType.PERMANENT_NAVIGATION_DRAWER) {
        PermanentNavigationDrawer(
            drawerContent = {
                PermanentDrawerSheet() {
                    NavigationDrawerContent()
                }
            }
        ) {
            SoAzContent(
                contentType = contentType,
                navigationType = navigationType,
                uiState = uiState
            )
        }
    }
    else if (!uiState.isShowingDetailScreen) {
        SoAzContent(
            contentType = contentType,
            navigationType = navigationType,
            uiState = uiState
        )
    }
    else {
        SoAzDetailScreen(uiState = uiState)
    }

}

@Composable
fun SoAzContent(
    contentType: SoAzContentType,
    navigationType: SoAzNavigationType,
    uiState: SoAzUiState,
    modifier: Modifier = Modifier
) {
    Row {
        AnimatedVisibility(visible = navigationType == SoAzNavigationType.NAVIGATION_RAIL) {
            NavigationRail() {
                
            }
        }

        if (contentType == SoAzContentType.LIST_AND_DETAIL) {
            SoAzListAndDetailScreen(
                uiState = uiState,
                navigationType = navigationType
            )
        }
        else {
            Column {
                if (uiState.currentCategory == null) {
                    SoAzPlaceHolderScreen(
                        navigationType = navigationType
                    )
                }
                else {
                    SoAzRecommendationListScreen(
                        onBackButtonClicked = { /*TODO*/ },
                        uiState = uiState
                    )
                }
                AnimatedVisibility(
                    visible = navigationType == SoAzNavigationType.BOTTOM_NAVIGATION
                ) {
                    NavigationBar() {
                        
                    }
                }
            }
        }
    }
}

@Composable
fun NavigationDrawerContent(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {

    }

}

