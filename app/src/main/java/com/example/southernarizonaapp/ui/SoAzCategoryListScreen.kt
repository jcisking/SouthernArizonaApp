package com.example.southernarizonaapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.southernarizonaapp.data.Category

@Composable
fun CategoryListScreen(
    categories: List<Category>
) {
    Scaffold() {
        LazyColumn(modifier = Modifier.padding(it)) {
            items(categories) {
                CategoryListItem(it)

            }
        }
    }
}

@Composable
fun CategoryListItem(
    category: Category,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Row {
            Image(painter =, contentDescription =)
            Text(text = category.displayName)
        }

    }
}
