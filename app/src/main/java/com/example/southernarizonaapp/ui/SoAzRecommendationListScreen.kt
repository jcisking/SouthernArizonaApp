package com.example.southernarizonaapp.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import com.example.southernarizonaapp.data.Recommendation
import com.example.southernarizonaapp.data.local.LocalRecommendationDataProvider
import com.example.southernarizonaapp.ui.theme.SouthernArizonaAppTheme
import com.example.southernarizonaapp.R

@Composable
fun SoAzRecommendationListScreen(
    recommendations: List<Recommendation>
) {
    Scaffold(
        topBar = { RecommendationListScreenTopBar() }
    ) { it ->
        LazyColumn(modifier = Modifier
            .padding(it)
            .fillMaxWidth()) {
            items(recommendations) {
                RecommendationListItem(it)
            }
        }
    }
}

@Composable
fun RecommendationListItem(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier.fillMaxWidth()) {
        Row() {
            Image(modifier = Modifier.size(65.dp), painter = painterResource(id = recommendation.image), contentDescription = null)
            Text(text = recommendation.name)
        }
    }

}

@Composable 
fun RecommendationListScreenTopBar(
    uiState: SoAzUiState,
    modifier: Modifier = Modifier
) {
    TopAppBar(modifier = modifier) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(painter = , contentDescription = )
            
        }
        Text(text = stringResource(id = R.string.recomm_list_screen_top_bar, uiState.currentCategory ))
    }
}


@Preview
@Composable
fun RecommendationListScreenPreview() {
    SouthernArizonaAppTheme() {
        SoAzRecommendationListScreen(
            recommendations = LocalRecommendationDataProvider.restaurantRecommendations
        )
    }
}
