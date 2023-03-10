package com.example.southernarizonaapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.southernarizonaapp.R
import com.example.southernarizonaapp.data.Recommendation
import com.example.southernarizonaapp.data.local.LocalRecommendationDataProvider
import com.example.southernarizonaapp.ui.theme.SouthernArizonaAppTheme

@Composable
fun SoAzDetailScreen(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        item {
            SoAzDetailScreenTopAppBar(recommendation)
            DetailScreenContent(recommendation)
        }
    }
}

@Composable
fun SoAzDetailScreenTopAppBar(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier.fillMaxWidth()) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.ArrowBack , contentDescription = null)
        }
        Text(text = recommendation.name)
    }
}

@Composable
fun DetailScreenContent(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Image(
            painter = painterResource(id = recommendation.image), contentDescription = null
        )
        RecommendationDetailsAndDescription(recommendation)
    }
}

@Composable
fun RecommendationDetailsAndDescription(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(text = recommendation.name)
        RecommendationLocation(recommendation)
        Text(text = recommendation.description)
        DetailScreenButton()
    }
}

@Composable
fun DetailScreenButton() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = stringResource(id = R.string.website_button_text))
    }
}

@Composable
fun RecommendationLocation(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        Icon(
            painter = painterResource(id = R.drawable.baseline_location_on_24),
            contentDescription = null
        )
        Text(text = recommendation.location)
    }
}





@Preview
@Composable
fun SoAzDetailScreen() {
    SouthernArizonaAppTheme {
        SoAzDetailScreen(recommendation = LocalRecommendationDataProvider.restaurantRecommendations[0]
        )
    }
}