package com.example.southernarizonaapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.southernarizonaapp.R
import com.example.southernarizonaapp.data.Recommendation

@Composable
fun SoAzDetailScreen(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        item {
            DetailScreenContent(recommendation)
        }

    }
}

@Composable
fun DetailScreenContent(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        SoAzDetailImage(recommendation)
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
        Button(onClick = { /*TODO*/ }) {
            Text(text = stringResource(id = R.string.website_button_text))
        }
    }
}

@Composable
fun RecommendationLocation(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        Icon(painter =, contentDescription =)
        Text(text = recommendation.location)
    }
}

@Composable
fun SoAzDetailImage(
    recommendation: Recommendation
) {
    Image(
        painter = painterResource(id = recommendation.image), contentDescription = null
    )
}