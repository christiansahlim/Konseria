package com.capstoneBangkit.konseria.ui.components.home

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DiscoverRow(modifier: Modifier) {
    Row(
        modifier.horizontalScroll(rememberScrollState())
    ) {
        DiscoverItem(modifier = modifier.padding(end = 10.dp), Icons.Default.LocationOn, "YOUR AREA", Color.Red)
        DiscoverItem(modifier = modifier.padding(end = 10.dp), Icons.Default.MusicNote, "MUSIC", Color.Blue)
        DiscoverItem(modifier = modifier, Icons.Default.Star, "FAVORITES", Color.Yellow)
    }
}

@Composable
fun DiscoverItem(modifier: Modifier, icons: ImageVector, inputText: String, color: Color) {
    Box(
        modifier = modifier
            .height(50.dp)
            .width(150.dp)
    )
    {
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawRoundRect(
                color = Color.White,
                size = Size(height = 50.dp.toPx(), width = 150.dp.toPx()),
                cornerRadius = CornerRadius(x = 32.dp.toPx(), 32.dp.toPx())
            )
        }
        Box {
            Canvas(
                modifier = Modifier
                    .size(45.dp)
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp, top = 5.dp)
            ) {
                drawCircle(color = color, alpha = 0.1f)
            }
            Icon(
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(start = 10.dp, top = 5.dp),
                imageVector = icons,
                tint = color,
                contentDescription = null
            )
        }

        Text(
            text = inputText,
            style = MaterialTheme.typography.caption,
            fontWeight = FontWeight.Bold,
            color = color,
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .padding(start = 30.dp)
                .alpha(0.7f)
        )
    }
}

@Preview
@Composable
fun DiscoverItemPreview() {
    MaterialTheme {
        DiscoverRow(Modifier)
    }
}