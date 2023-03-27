package com.example.southernarizonaapp.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.southernarizonaapp.data.Category
import com.example.southernarizonaapp.ui.utils.SoAzContentType
import com.example.southernarizonaapp.ui.utils.SoAzNavigationType
import com.example.southernarizonaapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SoAzListDetailScreen(
    uiState: SoAzUiState,
    contentType: SoAzContentType,
    navigationType: SoAzNavigationType,
    onTabPressed: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
//    val navigationItemContentList: List<NavigationItemContent> = listOf(
//        NavigationItemContent(
//            icon = R.drawable.restaurant_fill0_wght400_grad0_opsz48,
//            text = R.string.nav_item_restaurant_text,
//            category = Category.RESTAURANTS
//        ),
//        NavigationItemContent(
//            icon = R.drawable.attractions_fill0_wght400_grad0_opsz48,
//            text = R.string.nav_item_tourist_attractions_text,
//            category = Category.TOURIST_ATTRACTIONS
//        ),
//        NavigationItemContent(
//            icon = R.drawable.shopping_cart_fill0_wght400_grad0_opsz48,
//            text = R.string.nav_item_shopping_text,
//            category = Category.SHOPPING
//        ),
//        NavigationItemContent(
//            icon = R.drawable.nature_people_fill0_wght400_grad0_opsz48,
//            text = R.string.nav_item_parks_text,
//            category = Category.PARKS
//        ),
//        NavigationItemContent(
//            icon = R.drawable.hotel_fill0_wght400_grad0_opsz48,
//            text = R.string.nav_item_resorts_text,
//            category = Category.RESORTS
//        )
//    )


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
                onTabPressed = onTabPressed
            )
        }
    }
    else if (!uiState.isShowingDetailScreen) {
        SoAzContent(
            contentType = contentType,
            navigationType = navigationType,
            uiState = uiState,
            navItemList = NavigationItemContent.navigationItemContentList,
            onTabPressed = onTabPressed
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
    navItemList: List<NavigationItemContent>,
    onTabPressed: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
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
            Column(modifier = Modifier.background(Color.Magenta).fillMaxSize()) {
                if (uiState.currentCategory == null) {
                    SoAzPlaceHolderScreen(
                        navigationType = navigationType,
                        modifier = Modifier.weight(1f).align(Alignment.CenterHorizontally)
                    )
                }
                else {
                    SoAzRecommendationListScreen(
                        onBackButtonClicked = { /*TODO*/ },
                        uiState = uiState,
                        modifier = Modifier.weight(1f),
                        onTabPressed = onTabPressed
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



