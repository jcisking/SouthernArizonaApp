package com.example.southernarizonaapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.southernarizonaapp.R


val Barlow = FontFamily(
    Font(R.font.barlow_extra_light, FontWeight.ExtraLight),
    Font(R.font.barlow_medium, FontWeight.Medium)
)

val BreeSerif = FontFamily(
    Font(R.font.bree_serif_regular, FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = BreeSerif,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    h2 = TextStyle(
        fontFamily = BreeSerif,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp
    ),
    body1 = TextStyle(
        fontFamily = Barlow,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    ),
    button = TextStyle(
        fontFamily = Barlow,
        fontWeight = FontWeight.ExtraLight,
        fontSize = 10.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)