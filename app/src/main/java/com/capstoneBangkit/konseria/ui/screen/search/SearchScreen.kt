package com.capstoneBangkit.konseria.ui.screen.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.ui.components.search.OfficialCard
import com.capstoneBangkit.konseria.ui.components.search.TradingCard
import com.capstoneBangkit.konseria.ui.components.search.*


@Composable
fun SearchScreen(modifier: Modifier) {
    val isOfficialCardVisible = remember { mutableStateOf(true) }
    val isTradingCardVisible = remember { mutableStateOf(false) }

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
                CategoryButton(
                    onOfficialButtonClicked = {
                        isOfficialCardVisible.value = true
                        isTradingCardVisible.value = false
                    },
                    onTradingButtonClicked = {
                        isOfficialCardVisible.value = false
                        isTradingCardVisible.value = true
                    }
                )
            }
        )
        SearchSection(
            content = {
                if (isOfficialCardVisible.value) {
                    OfficialCard(Modifier)
                } else if (isTradingCardVisible.value) {
                    TradingCard(Modifier)
                }
            }
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewSearchScreen() {
    MaterialTheme {
        SearchScreen(Modifier)
    }
}