package com.example.southernarizonaapp.data

import androidx.annotation.DrawableRes

data class Recommendation(
    @DrawableRes val image: Int,
    val name: String,
    val location: String,
    val description: String,
    val category: Category
)
