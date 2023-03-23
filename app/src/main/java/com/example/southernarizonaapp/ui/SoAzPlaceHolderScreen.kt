package com.example.southernarizonaapp.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.southernarizonaapp.R
import com.example.southernarizonaapp.ui.utils.SoAzNavigationType

@Composable
fun SoAzPlaceHolderScreen(
    navigationType: SoAzNavigationType,
    modifier: Modifier = Modifier
) {
    if (navigationType == SoAzNavigationType.BOTTOM_NAVIGATION) {
        Text(text = stringResource(id = R.string.bottom_bar_text_placeholder))
    }
    else {
        Text(text = stringResource(id = R.string.side_bar_text_placeholder))
    }

}