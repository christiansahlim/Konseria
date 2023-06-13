package com.capstoneBangkit.konseria.ui.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.R
import com.capstoneBangkit.konseria.ui.components.home.CollectionsRow
import com.capstoneBangkit.konseria.ui.components.home.DiscoverRow
import com.capstoneBangkit.konseria.ui.components.home.ForYouRow
import com.capstoneBangkit.konseria.ui.components.home.HomeSection
import com.capstoneBangkit.konseria.ui.components.home.UpcomingColumn

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navigateToDetail: (Int) -> Unit
) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp)
    ) {
        HomeSection(
            title = stringResource(R.string.for_you_title),
            content = {
                ForYouRow(modifier)
            }
        )
        HomeSection(
            title = stringResource(R.string.collections_title),
            content = {
                CollectionsRow(modifier)
            }
        )
        HomeSection(
            title = stringResource(R.string.discover_title),
            content = {
                DiscoverRow(modifier)
            }
        )
        HomeSection(
            title = stringResource(R.string.upcoming_title),
            content = {
                UpcomingColumn(modifier)
            }
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewHomeScreen() {
    MaterialTheme {
//        HomeScreen(Modifier)
    }
}