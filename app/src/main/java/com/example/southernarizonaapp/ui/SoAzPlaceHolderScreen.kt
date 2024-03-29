package com.example.southernarizonaapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.southernarizonaapp.R
import com.example.southernarizonaapp.ui.utils.SoAzNavigationType

@Composable
fun SoAzPlaceHolderScreen(
    navigationType: SoAzNavigationType,
    modifier: Modifier = Modifier
) {
    if (navigationType == SoAzNavigationType.BOTTOM_NAVIGATION) {
        Box (
            modifier = modifier,
//                .fillMaxSize(),
            contentAlignment = Alignment.Center

        ) {
            Image(
                painter = painterResource(id = R.drawable.tucson),
                modifier = Modifier.fillMaxSize().graphicsLayer(alpha = .3f),
                contentScale = ContentScale.Crop,
                contentDescription = null
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                //                    .background(Color.Blue)
            ) {
                Text(
                    text = stringResource(id = R.string.bottom_bar_text_placeholder),
                    style = MaterialTheme.typography.h1,
                    modifier = Modifier.padding(bottom = 35.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.down_arrow),
                    contentDescription = null
                )
            }

        }
    }
    else {
        Box (
            contentAlignment = Alignment.Center,
            modifier = modifier
        ) {
            Image(
                modifier = Modifier.fillMaxSize().graphicsLayer(alpha = .3f),
                painter = painterResource(id = R.drawable.tucson),
                contentScale = ContentScale.FillWidth,
                contentDescription = null
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = stringResource(id = R.string.side_bar_text_placeholder),
                    style = MaterialTheme.typography.h1,
                    modifier = Modifier.padding(bottom = 35.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.left_arrow),
                    contentDescription = null
                )
            }
        }
    }

}