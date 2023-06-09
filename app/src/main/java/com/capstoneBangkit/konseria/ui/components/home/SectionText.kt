package com.capstoneBangkit.konseria.ui.components.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SectionText(title : String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        style = MaterialTheme.typography.h4,
        modifier = modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
    )
}