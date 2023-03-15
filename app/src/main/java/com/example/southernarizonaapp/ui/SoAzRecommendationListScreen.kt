package com.example.southernarizonaapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.southernarizonaapp.data.Recommendation
import com.example.southernarizonaapp.data.local.LocalRecommendationDataProvider
import com.example.southernarizonaapp.ui.theme.SouthernArizonaAppTheme

@Composable
fun SoAzRecommendationListScreen(
    recommendations: List<Recommendation>
) {
    Scaffold() { it ->
        LazyColumn(modifier = Modifier.padding(it).fillMaxWidth()) {
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
    Card(modifier = modifier.height(70.dp)) {
        Row() {
            Image(modifier = Modifier.size(65.dp), painter = painterResource(id = recommendation.image), contentDescription = null)
            Text(text = recommendation.name)
        }
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
