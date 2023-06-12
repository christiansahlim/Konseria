package com.capstoneBangkit.konseria.ui.components.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//This can be made into additional columns, or possibly LazyColumns
@Composable
fun UpcomingColumn(modifier: Modifier) {
    UpcomingItem(modifier)
    UpcomingItem(modifier)
}