package com.capstoneBangkit.konseria.ui.components.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.R
import com.capstoneBangkit.konseria.ui.components.detail.bottom_sheet.DetailConcertOrganizer
import com.capstoneBangkit.konseria.ui.components.detail.bottom_sheet.DetailOtherConcertsRow
import com.capstoneBangkit.konseria.ui.components.detail.bottom_sheet.DetailsConcertLocation
import com.capstoneBangkit.konseria.ui.components.home.HomeSection
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme
import com.google.android.gms.maps.model.LatLng

@Composable
fun DetailBottomSheetContent(modifier: Modifier) {
    Column(
        Modifier
            .padding(start = 20.dp)
            .verticalScroll(rememberScrollState())) {
        HomeSection(title = stringResource(R.string.details_title),
            content = {
                DescText(
                    "Free directories: directories are perfect for customers that are searching for a particular topic." +
                            " What’s great about them is that you only have to post once and they are good for long periods of time. " +
                            "It saves a lot of your time when you don’t have to resubmit your information every week…"
                )
            }
        )
        HomeSection(title = stringResource(R.string.details_location),
            content = {
                DetailsConcertLocation(Modifier.padding(end = 20.dp), LatLng(1.35, 103.87))
            }
        )
        HomeSection(title = stringResource(R.string.details_organizers),
            content = {
                DetailConcertOrganizer()
            }
        )
        HomeSection(title = stringResource(R.string.details_also_venue),
            content = {
                DetailOtherConcertsRow()
            }
        )
        HomeSection(title = stringResource(R.string.details_more_this),
            content = {
                DetailOtherConcertsRow()
            }
        )
    }
}

@Composable
fun DescText(description: String) {
    Text(text = description, modifier = Modifier.padding(bottom = 30.dp))
}

@Preview
@Composable
fun DetailBottomSheetContentPreview() {
    KonseriaTheme {
        DetailBottomSheetContent(Modifier)
    }
}