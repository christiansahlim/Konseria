package com.capstoneBangkit.konseria.ui.components.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.model.dummyCategory

@Composable
fun ForYouRow(modifier: Modifier) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(dummyCategory, key = { it.genre }) { category ->
            ForYouItem(category, modifier)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ForYouPreview() {
    MaterialTheme {
        ForYouRow(Modifier)
    }
}