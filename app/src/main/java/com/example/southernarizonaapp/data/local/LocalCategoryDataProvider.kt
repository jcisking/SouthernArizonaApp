package com.example.southernarizonaapp.data.local

import com.example.southernarizonaapp.R
import com.example.southernarizonaapp.data.Category

object LocalCategoryDataProvider {

    val categories: List<Category> = listOf(
        Category(
            name = "Shopping",
            image = R.drawable.la_encantada_mall
        ),
        Category(
            name = "Resorts",
            image = R.drawable.jwmarriotstarpass
        ),
        Category(
            name = "Restaurants",
            image = R.drawable.alejandros_restaurant
        ),
        Category(
            name = "Parks",
            image = R.drawable.reidpark
        ),
        Category(
            name = "Tourist Attractions",
            image = R.drawable.oldtucson
        )

    )
}