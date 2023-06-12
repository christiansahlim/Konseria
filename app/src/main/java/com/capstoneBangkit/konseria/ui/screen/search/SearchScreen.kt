package com.capstoneBangkit.konseria.ui.screen.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.ui.components.search.CategoryButton
import com.capstoneBangkit.konseria.ui.components.search.SearchBar
import com.capstoneBangkit.konseria.ui.components.search.SearchSection

@Composable
fun SearchScreen(modifier: Modifier) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp)
    ) {
        SearchSection(
            content = {
                SearchBar(onSearch = { /* Handle search query */ })
            }
        )
        SearchSection(
            content = {
                CategoryButton()
            }
        )
//        SearchSection(
//            content = {
//                BottomNavBar()
//            }
//        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewSearchScreen() {
    MaterialTheme {
        SearchScreen(Modifier)
    }
}
