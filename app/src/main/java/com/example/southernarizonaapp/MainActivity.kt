package com.example.southernarizonaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.southernarizonaapp.data.Recommendation
import com.example.southernarizonaapp.data.local.LocalRecommendationDataProvider
import com.example.southernarizonaapp.ui.SoAzApp
import com.example.southernarizonaapp.ui.SoAzDetailScreen
import com.example.southernarizonaapp.ui.SoAzRecommendationListScreen
import com.example.southernarizonaapp.ui.theme.SouthernArizonaAppTheme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val windowSizeClass = calculateWindowSizeClass(activity = this)
            SoAzApp(
                windowSize = windowSizeClass.widthSizeClass
            )
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SouthernArizonaAppTheme {
        Greeting("Android")
    }
}