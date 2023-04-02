package com.example.southernarizonaapp.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.southernarizonaapp.data.Recommendation
import com.example.southernarizonaapp.R
import com.example.southernarizonaapp.data.Category
import com.example.southernarizonaapp.ui.utils.SoAzNavigationType

@Composable
fun SoAzRecommendationListScreen(
    uiState: SoAzUiState,
    navigationType: SoAzNavigationType,
    onTabPressed: (Category) -> Unit,
    onRecommendationCardPressed: (Recommendation) -> Unit,
    modifier: Modifier = Modifier
) {
    val recommendations = uiState.currentRecommendationList
    Scaffold(
        topBar = { RecommendationListScreenTopBar(uiState = uiState) },
        bottomBar = {
            if (navigationType == SoAzNavigationType.BOTTOM_NAVIGATION) {
                SoAzBottomNavigationBar(
                    currentTab = uiState.currentCategory,
                    onTabPressed = onTabPressed,
                    navigationItemList = NavigationItemContent.navigationItemContentList
                )
            }
        }
    ) {
        LazyColumn(
            modifier = modifier.padding(it)
        ) {
            items(recommendations) { recommendation ->
                RecommendationListItem(
                    recommendation = recommendation,
                    onCardPressed = { onRecommendationCardPressed(recommendation) }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RecommendationListItem(
    recommendation: Recommendation,
    onCardPressed: (Recommendation) -> Unit,
    modifier: Modifier = Modifier
) {
    Card (
        onClick = { onCardPressed(recommendation) },
        shape = RoundedCornerShape(12.dp),
        elevation = 2.dp,
        modifier = modifier.padding(vertical = 16.dp, horizontal = 8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .height(85.dp)
                .padding(8.dp)
        ) {
            Image(
                modifier = Modifier
                    .padding(end = 30.dp)
                    .clip(RoundedCornerShape(6.dp)),
                painter = painterResource(id = recommendation.image),
                contentDescription = null
            )
            Text(
                modifier = Modifier.weight(1f),
                text = recommendation.name,
                style = MaterialTheme.typography.h3
            )
        }
    }

}

@Composable
fun RecommendationListScreenTopBar(
    uiState: SoAzUiState,
    modifier: Modifier = Modifier
) {
    TopAppBar(modifier = modifier) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = stringResource(
                id = R.string.recomm_list_screen_top_bar, uiState.currentCategory!!.displayName
            ),
            style = MaterialTheme.typography.h1
        )
    }
}


//@Preview
//@Composable
//fun RecommendationListScreenPreview() {
//    SouthernArizonaAppTheme() {
//        SoAzRecommendationListScreen(
//            recommendations = LocalRecommendationDataProvider.restaurantRecommendations,
//            onBackButtonClicked = {},
//            uiState = SoAzUiState()
//        )
//    }
//}
