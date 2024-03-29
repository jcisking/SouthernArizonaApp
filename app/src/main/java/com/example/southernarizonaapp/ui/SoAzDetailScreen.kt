package com.example.southernarizonaapp.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.southernarizonaapp.R
import com.example.southernarizonaapp.data.Recommendation
import com.example.southernarizonaapp.data.local.LocalRecommendationDataProvider

@Composable
fun SoAzDetailScreen(
    uiState: SoAzUiState,
    onBackButtonPressed: () -> Unit,
    modifier: Modifier = Modifier
) {
    BackHandler() {
        onBackButtonPressed()
    }
    LazyColumn(
        modifier = modifier
            .background(MaterialTheme.colors.background)
            .fillMaxSize()
    ) {
        item {
            SoAzDetailScreenTopAppBar(
                uiState?.currentRecommendation ?:
                LocalRecommendationDataProvider.defautRecommendation,
                onBackButtonPressed = onBackButtonPressed
            )
            DetailScreenContent(
                uiState?.currentRecommendation ?:
                LocalRecommendationDataProvider.defautRecommendation
            )
        }
    }
}

@Composable
fun SoAzDetailScreenTopAppBar(
    recommendation: Recommendation,
    onBackButtonPressed: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = onBackButtonPressed ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack ,
                tint = MaterialTheme.colors.onBackground,
                contentDescription = null)
        }
        Text(
            modifier = Modifier.weight(1f),
            text = recommendation.name,
            style = MaterialTheme.typography.h1,
            color = MaterialTheme.colors.onBackground
        )
    }
}

@Composable
fun DetailScreenContent(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(start = 12.dp, end =  12.dp, bottom = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
            ) {
        Image(
            modifier = Modifier
                .padding(bottom = 16.dp)
                .clip(RoundedCornerShape(6.dp)),
            painter = painterResource(id = recommendation.image), contentDescription = null
        )
        RecommendationDetailsAndDescription(
            recommendation = recommendation
        )
        DetailScreenButton()
    }
}

@Composable
fun RecommendationDetailsAndDescription(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(bottom = 20.dp)) {
        Text(
            modifier = Modifier
                .padding(bottom = 8.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(MaterialTheme.colors.surface)
                .padding(9.dp),
            text = recommendation.name,
            style = MaterialTheme.typography.h2
            )
        RecommendationLocation(recommendation)
        Text(
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(MaterialTheme.colors.surface)
                .padding(15.dp),
            text = recommendation.description,
            style = MaterialTheme.typography.body1
        )
    }
}

@Composable
fun DetailScreenButton(
    modifier: Modifier = Modifier
) {
    Button(
        elevation = ButtonDefaults.elevation(defaultElevation = 5.dp),
        contentPadding = PaddingValues(horizontal = 40.dp, vertical = 20.dp),
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Black
        ),
        border = BorderStroke(2.dp, MaterialTheme.colors.surface),
        onClick = { /*TODO*/ }
    ) {
        Text(
            text = stringResource(id = R.string.website_button_text),
            fontSize = 15.sp,
            color = Color.White
//            style = MaterialTheme.typography.button
        )
    }
}

@Composable
fun RecommendationLocation(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .padding(bottom = 20.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colors.surface)
            .padding(9.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.baseline_location_on_24),
            contentDescription = null
        )
        Text(text = recommendation.location, style = MaterialTheme.typography.h3)
    }
}


//@Preview
//@Composable
//fun SoAzDetailScreen() {
//    SouthernArizonaAppTheme {
//        SoAzDetailScreen(recommendation = LocalRecommendationDataProvider.restaurantRecommendations[0]
//        )
//    }
//}