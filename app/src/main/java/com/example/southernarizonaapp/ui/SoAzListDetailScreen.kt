package com.example.southernarizonaapp.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.southernarizonaapp.data.Category
import com.example.southernarizonaapp.ui.utils.SoAzContentType
import com.example.southernarizonaapp.ui.utils.SoAzNavigationType
import com.example.southernarizonaapp.R
import com.example.southernarizonaapp.data.Recommendation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SoAzListDetailScreen(
    uiState: SoAzUiState,
    contentType: SoAzContentType,
    navigationType: SoAzNavigationType,
    onTabPressed: (Category) -> Unit,
    onDetailBackButtonPressed: () -> Unit,
    onRecommendationCardPressed: (Recommendation) -> Unit,
    modifier: Modifier = Modifier
) {

    if (navigationType == SoAzNavigationType.PERMANENT_NAVIGATION_DRAWER) {
        PermanentNavigationDrawer(
            drawerContent = {
                PermanentDrawerSheet() {
                    NavigationDrawerContent(
                        selectedCategory = uiState.currentCategory,
                        onTabPressed = onTabPressed,
                        navItemList = NavigationItemContent.navigationItemContentList
                    )
                }
            }
        ) {
            SoAzContent(
                contentType = contentType,
                navigationType = navigationType,
                uiState = uiState,
                navItemList = NavigationItemContent.navigationItemContentList,
                onTabPressed = onTabPressed,
                onRecommendationCardPressed = onRecommendationCardPressed
            )
        }
    }
    else if (!uiState.isShowingDetailScreen) {
        SoAzContent(
            contentType = contentType,
            navigationType = navigationType,
            uiState = uiState,
            navItemList = NavigationItemContent.navigationItemContentList,
            onTabPressed = onTabPressed,
            onRecommendationCardPressed = onRecommendationCardPressed
        )
    }
    else {
        SoAzDetailScreen(
            uiState = uiState,
            onBackButtonPressed = onDetailBackButtonPressed
        )
    }

}

@Composable
fun SoAzContent(
    contentType: SoAzContentType,
    navigationType: SoAzNavigationType,
    uiState: SoAzUiState,
    navItemList: List<NavigationItemContent>,
    onTabPressed: (Category) -> Unit,
    onRecommendationCardPressed: (Recommendation) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        AnimatedVisibility(visible = navigationType == SoAzNavigationType.NAVIGATION_RAIL) {
            SoAzNavigationRail(
                onTabPressed = onTabPressed,
                navItemList = navItemList,
                currentTab = uiState.currentCategory
            )
        }

        if (contentType == SoAzContentType.LIST_AND_DETAIL) {
            SoAzListAndDetailScreen(
                uiState = uiState,
                navigationType = navigationType,
                onTabPressed = onTabPressed,
                onRecommendationCardPressed = onRecommendationCardPressed
            )
        }
        else {
            Column(
                modifier = Modifier
                .background(Color.Magenta)
                .fillMaxSize()
            ) {
                if (uiState.currentCategory == null) {
                    SoAzPlaceHolderScreen(
                        navigationType = navigationType,
                        modifier = Modifier
                            .weight(1f)
                            .align(Alignment.CenterHorizontally)
                    )
                }
                else {
                    SoAzRecommendationListScreen(
                        onBackButtonClicked = { /*TODO*/ },
                        uiState = uiState,
                        modifier = Modifier.weight(1f),
                        onTabPressed = onTabPressed,
                        navigationType = navigationType,
                        onRecommendationCardPressed = onRecommendationCardPressed
                    )
                }
                AnimatedVisibility(
                    visible = navigationType == SoAzNavigationType.BOTTOM_NAVIGATION
                ) {
                    SoAzBottomNavigationBar(
                        currentTab = uiState.currentCategory,
                        navigationItemList = navItemList,
                        onTabPressed = onTabPressed
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawerContent(
    selectedCategory: Category?,
    onTabPressed: (Category) -> Unit,
    navItemList: List<NavigationItemContent>,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        for (navItem in navItemList) {
            NavigationDrawerItem(
                label = { Text(text = stringResource(id = navItem.text)) },
                selected = navItem.category == selectedCategory,
                onClick = { onTabPressed },
                icon = {
                    Icon(
                        painter = painterResource(id = navItem.icon), 
                        contentDescription = null
                    )
                }
            )
        }


    }

}

@Composable
fun SoAzBottomNavigationBar(
    currentTab: Category?,
    onTabPressed: (Category) -> Unit,
    navigationItemList: List<NavigationItemContent>,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        for (navItem in navigationItemList) {
            NavigationBarItem(
                selected = navItem.category == currentTab,
                onClick = {onTabPressed(navItem.category)},
                label = { Text(
                    text = stringResource(id = navItem.text),
                    softWrap = true
                ) },
                icon = {
                    Icon(
                        modifier = Modifier.size(30.dp),
                        painter = painterResource(id = navItem.icon),
                        contentDescription = null
                    )
                }
            )
        }
    }
}

@Composable
fun SoAzNavigationRail(
    currentTab: Category?,
    onTabPressed: (Category) -> Unit,
    navItemList: List<NavigationItemContent>,
    modifier: Modifier = Modifier
) {
    NavigationRail(modifier = modifier) {
        for (navItem in navItemList) {
            NavigationRailItem(
                selected = navItem.category == currentTab ,
                onClick = { onTabPressed(navItem.category) },
                label = { Text(text = stringResource(id = navItem.text))},
                icon = {
                    Icon(painter = painterResource(id = navItem.icon), contentDescription = null)
                }
            )

        }

    }

}



