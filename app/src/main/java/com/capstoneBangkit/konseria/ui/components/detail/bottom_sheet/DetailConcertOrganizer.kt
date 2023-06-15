package com.capstoneBangkit.konseria.ui.components.detail.bottom_sheet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.R
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme

@Composable
fun DetailConcertOrganizer() {
    Row {
        Image(
            painter = painterResource(R.drawable.blue_concert),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
        )
        Column(Modifier.padding(start = 10.dp)) {
            Text(text = "Organizer's Name", style = MaterialTheme.typography.h6)
            Icon(
                imageVector = Icons.Default.MusicNote,
                contentDescription = null,
                Modifier.padding(top = 5.dp).size(17.dp)
            )
        }
    }
}

@Preview
@Composable
fun DetailConcertOrganizerPreview() {
    KonseriaTheme {
        DetailConcertOrganizer()
    }
}