package com.example.southernarizonaapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.southernarizonaapp.data.Recommendation

@Composable
fun SoAzDetailScreen(
    recommendation: Recommendation,
    modifier: Modifier
) {
    Column(modifier = modifier) {
        SoAzDetailImage(recommendation)
        Text(text = "Name of place")
        Text(text = "Location of place")
        Text(text = "Website")
        Text(text = "Description")
    }
}

@Composable
fun SoAzDetailImage(
    recommendation: Recommendation
) {
    Image(painter = painterResource(id = recommendation.image), contentDescription = null)
}