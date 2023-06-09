package com.capstoneBangkit.konseria.ui.components.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AirplaneTicket
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.R
import com.capstoneBangkit.konseria.model.Concerts
import com.capstoneBangkit.konseria.model.dummyCategory
import com.capstoneBangkit.konseria.ui.theme.DarkBlue

@Composable
fun ForYouItem(concerts: Concerts, modifier: Modifier) {
    Card(
        modifier = modifier
            .width(300.dp)
            .height(250.dp),
        shape = RoundedCornerShape(16.dp)
    )
    {
        Image(
            painter = painterResource(R.drawable.blues_poster),
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )
        val colorStops = arrayOf(
            0.3f to Color.Transparent,
            1f to DarkBlue
        )
        Box(modifier = modifier.background(Brush.verticalGradient(colorStops = colorStops)))
        Box(modifier = modifier.background(Brush.verticalGradient(colorStops = colorStops)))

        Column(verticalArrangement = Arrangement.Bottom, modifier = modifier.padding(10.dp)) {
            Text(
                text = "FRIDAY AUG 24, 9PM",
                style = MaterialTheme.typography.caption,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = "Blues Music Festival",
                style = MaterialTheme.typography.h5,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Row(
                modifier = Modifier.padding(0.dp, 4.dp, 0.dp, 0.dp),
            ) {
                Icon(
                    modifier = Modifier
                        .size(25.dp)
                        .padding(0.dp, 0.dp, 5.dp, 0.dp)
                        .alpha(0.7f),
                    imageVector = Icons.Default.MusicNote,
                    tint = Color.LightGray,
                    contentDescription = null
                )
                Text(
                    text = "Indie Rock",
                    modifier = Modifier
                        .padding(0.dp, 4.dp, 0.dp, 0.dp)
                        .alpha(0.7f),
                    style = MaterialTheme.typography.caption,
                    fontWeight = FontWeight.Bold,
                    color = Color.LightGray
                )
                Icon(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(7.dp, 0.dp, 5.dp, 5.dp)
                        .alpha(0.7f),
                    imageVector = Icons.Default.AirplaneTicket,
                    tint = Color.LightGray,
                    contentDescription = null
                )
                Text(
                    text = "$40-$90",
                    modifier = Modifier
                        .padding(0.dp, 4.dp, 0.dp, 0.dp)
                        .alpha(0.7f),
                    style = MaterialTheme.typography.caption,
                    fontWeight = FontWeight.Bold,
                    color = Color.LightGray
                )
            }
        }
    }
}

@Preview
@Composable
fun ForYouItemPreview() {
    MaterialTheme {
        ForYouItem(dummyCategory[0], Modifier)
    }
}