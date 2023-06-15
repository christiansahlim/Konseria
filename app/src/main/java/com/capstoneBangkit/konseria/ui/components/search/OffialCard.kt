package com.capstoneBangkit.konseria.ui.components.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AirplaneTicket
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.R

@Composable
fun OfficialCard(modifier: Modifier) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = 4.dp
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.blues_poster),
                contentScale = ContentScale.Crop,
                contentDescription = "Card Image",
                modifier = Modifier
                    .size(80.dp)
            )
            Column {
                Column(verticalArrangement = Arrangement.Bottom, modifier = modifier.padding(horizontal = 15.dp, vertical = 10.dp)) {
                    Text(
                        text = "Blues Music Festival",
                        style = MaterialTheme.typography.h6,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = modifier.padding(bottom = 5.dp)
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
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
    }
}

@Preview
@Composable
fun PreviewOfficialCard() {
    OfficialCard(Modifier)
}
