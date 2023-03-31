package com.example.southernarizonaapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.southernarizonaapp.R
import com.example.southernarizonaapp.ui.utils.SoAzNavigationType

@Composable
fun SoAzPlaceHolderScreen(
    navigationType: SoAzNavigationType,
    modifier: Modifier = Modifier
) {
    if (navigationType == SoAzNavigationType.BOTTOM_NAVIGATION) {
        Column(
            modifier = modifier.background(Color.Green),
            verticalArrangement = Arrangement.Center

        ) {
            Text(
                text = stringResource(id = R.string.bottom_bar_text_placeholder),
                style = MaterialTheme.typography.h1
            )
        }
    }
    else {
        Column(modifier = modifier) {
            Text(
                text = stringResource(id = R.string.side_bar_text_placeholder),
                style = MaterialTheme.typography.h1
            )
        }
    }

}