package com.example.southernarizonaapp.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.southernarizonaapp.R
import com.example.southernarizonaapp.data.Category

data class NavigationItemContent(
    @DrawableRes val icon: Int,
    @StringRes val text: Int,
    val category: Category
) {
    companion object {
        val navigationItemContentList: List<NavigationItemContent> = listOf(
            NavigationItemContent(
                icon = R.drawable.restaurant_fill0_wght400_grad0_opsz48,
                text = R.string.nav_item_restaurant_text,
                category = Category.RESTAURANTS
            ),
            NavigationItemContent(
                icon = R.drawable.attractions_fill0_wght400_grad0_opsz48,
                text = R.string.nav_item_tourist_attractions_text,
                category = Category.TOURIST_ATTRACTIONS
            ),
            NavigationItemContent(
                icon = R.drawable.shopping_cart_fill0_wght400_grad0_opsz48,
                text = R.string.nav_item_shopping_text,
                category = Category.SHOPPING
            ),
            NavigationItemContent(
                icon = R.drawable.nature_people_fill0_wght400_grad0_opsz48,
                text = R.string.nav_item_parks_text,
                category = Category.PARKS
            ),
            NavigationItemContent(
                icon = R.drawable.hotel_fill0_wght400_grad0_opsz48,
                text = R.string.nav_item_resorts_text,
                category = Category.RESORTS
            )
        )
    }
}



