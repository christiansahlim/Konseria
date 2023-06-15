package com.capstoneBangkit.konseria.ui.components.detail.bottom_sheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.model.dummyCategory

@Composable
fun DetailOtherConcertsRow() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(dummyCategory, key = { it.concertId }) { concert ->
            DetailOtherConcertsCard(modifier = Modifier, concert = concert)
        }
    }
}