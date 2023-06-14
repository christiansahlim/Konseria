package com.capstoneBangkit.konseria.ui.components.detail.bottom_sheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun DetailsConcertLocation( latLng: LatLng) {
    Column {
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
}

@Preview
@Composable
fun DetailsConcertLocationPreview() {
    KonseriaTheme {
        DetailsConcertLocation(latLng = LatLng(1.35, 103.87))
    }
}