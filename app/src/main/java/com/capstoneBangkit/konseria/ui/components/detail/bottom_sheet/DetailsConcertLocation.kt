package com.capstoneBangkit.konseria.ui.components.detail.bottom_sheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun DetailsConcertLocation(modifier: Modifier, latLng: LatLng) {
    Column() {
        Card(
            modifier = modifier
                .width(400.dp)
                .height(100.dp)
        ) {
            val cameraPositionState = rememberCameraPositionState {
                position = CameraPosition.fromLatLngZoom(latLng, 10f)
            }
            GoogleMap(
                modifier = Modifier.fillMaxSize(),
                cameraPositionState = cameraPositionState
            ) {
                Marker(
                    state = MarkerState(position = latLng),
                    title = "Venue",
                    snippet = "Marker in Singapore"
                )
            }
        }
        Text(
            text = "Data Boi Concert Hall",
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(top = 15.dp, bottom = 5.dp)
        )
        Text(
            text = "5/7 Kolejowa, 01-217 Warsaw",
            modifier = Modifier.padding(bottom = 20.dp)
        )
    }
}

@Preview
@Composable
fun DetailsConcertLocationPreview() {
    KonseriaTheme {
        DetailsConcertLocation(Modifier, latLng = LatLng(1.35, 103.87))
    }
}