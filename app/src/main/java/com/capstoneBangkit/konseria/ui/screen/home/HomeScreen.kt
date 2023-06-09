package com.capstoneBangkit.konseria.ui.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.capstoneBangkit.konseria.R
import com.capstoneBangkit.konseria.ui.components.home.CollectionsRow
import com.capstoneBangkit.konseria.ui.components.home.DiscoverRow
import com.capstoneBangkit.konseria.ui.components.home.ForYouRow
import com.capstoneBangkit.konseria.ui.components.home.HomeSection
import com.capstoneBangkit.konseria.ui.components.home.UpcomingColumn

@Composable
fun HomeScreen(modifier: Modifier) {
    Column {
        HomeSection(
            title = stringResource(R.string.for_you_title),
            content = {
                ForYouRow(modifier)
            }
        )
        HomeSection(
            title = stringResource(R.string.collections_title),
            content = {
                CollectionsRow()
            }
        )
        HomeSection(
            title = stringResource(R.string.discover_title),
            content = {
                DiscoverRow()
            }
        )
        HomeSection(
            title = stringResource(R.string.upcoming_title),
            content = {
                UpcomingColumn()
            }
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewHomeScreen() {
    MaterialTheme {
        HomeScreen(Modifier)
    }
}