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
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.runtime.Composable
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
import com.capstoneBangkit.konseria.model.Concerts
import com.capstoneBangkit.konseria.model.dummyCategory

@Composable
fun CollectionsItem(concerts: Concerts, modifier: Modifier) {
    Card(
        modifier = modifier
            .width(325.dp)
            .height(175.dp),
        shape = RoundedCornerShape(16.dp)
    )
    {
        Image(
            painter = painterResource(R.drawable.blues_poster),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = modifier
                .alpha(0.65f)
                .background(Color.Black)
        )


        Column(
            verticalArrangement = Arrangement.Top,
            modifier = modifier.padding(vertical = 20.dp, horizontal = 15.dp)
        ) {
            Text(
                text = "Blues Music Festival",
                style = MaterialTheme.typography.h5,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Row {
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
            }
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = modifier.padding(vertical = 10.dp, horizontal = 15.dp)
        ) {
            Row {
                Text(
                    text = "Learn more",
                    style = MaterialTheme.typography.subtitle2,
                    color = Color.White
                )
                Icon(
                    imageVector = Icons.Default.ChevronRight,
                    modifier = Modifier.size(20.dp),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }
    }
}

@Preview
@Composable
fun CollectionsItemPreview() {
    MaterialTheme {
        CollectionsItem(dummyCategory[0], Modifier)
    }
}