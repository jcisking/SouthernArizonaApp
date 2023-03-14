package com.example.southernarizonaapp.data

import androidx.annotation.DrawableRes
import com.example.southernarizonaapp.R

enum class Category(val displayName: String, @DrawableRes val image: Int) {
    RESTAURANTS("Restaurants", R.drawable.alejandros_restaurant),
    RESORTS("Resorts", R.drawable.jwmarriotstarpass),
    TOURIST_ATTRACTIONS("Tourist Attractions", R.drawable.oldtucson),
    PARKS("Parks", R.drawable.reidpark),
    SHOPPING("Shopping", R.drawable.la_encantada_mall)
}