package com.capstoneBangkit.konseria.ui.components.home

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun UpcomingItem(modifier: Modifier) {
    Row(modifier = modifier.height(300.dp)) {
        Column(horizontalAlignment = CenterHorizontally, modifier = modifier.padding(end = 10.dp)) {
            Box(modifier = modifier.padding(bottom = 10.dp)) {
                Canvas(
                    modifier = Modifier
                        .size(height = 60.dp, width = 40.dp)
                ) {
                    drawRoundRect(
                        color = Color.White,
                        size = Size(height = 60.dp.toPx(), width = 40.dp.toPx()),
                        cornerRadius = CornerRadius(x = 12.dp.toPx(), 12.dp.toPx())
                    )
                }
                Text(
                    text = "12",
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .padding(top = 8.dp),
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    text = "THU",
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 9.dp),
                    style = MaterialTheme.typography.caption,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.DarkGray
                )
            }
            Divider(
                color = Color.Gray,
                modifier = Modifier
                    .fillMaxHeight()  //fill the max height
                    .width(3.dp)
            )
        }
        Column {
            UpcomingCard(modifier = modifier)
            UpcomingMoreEvents(modifier = modifier.padding(top = 20.dp))
        }
    }
}

@Preview
@Composable
fun UpcomingItemPreview() {
    MaterialTheme {
        UpcomingItem(Modifier)
    }
}