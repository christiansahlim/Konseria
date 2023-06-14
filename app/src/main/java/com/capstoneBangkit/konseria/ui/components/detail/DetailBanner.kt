package com.capstoneBangkit.konseria.ui.components.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.R
import com.capstoneBangkit.konseria.model.TicketsType
import com.capstoneBangkit.konseria.ui.theme.DarkerBlue
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme

@Composable
fun DetailBanner(ticketType: Enum<TicketsType>) {
    DetailBannerType(ticketType = ticketType)
}

@Composable
fun DetailBannerType(ticketType: Enum<TicketsType>) {
    Card(
        modifier = Modifier
            .height(height = setHeightBanner(ticketType))
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(R.drawable.blues_poster),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        val colorStops = arrayOf(
            0.6f to Color.Transparent,
            1f to DarkerBlue
        )
        Box(
            modifier = Modifier
                .background(Brush.verticalGradient(colorStops = colorStops))
        )
    }
}

@Composable
fun setHeightBanner(ticketType: Enum<TicketsType>): Dp {
    val configuration = LocalConfiguration.current.screenHeightDp.dp
    return if (ticketType == TicketsType.TRADING) {
        configuration * 1 / 2.4f
    } else {
        configuration * 1 / 2
    }
}

@Preview(showSystemUi = true)
@Composable
fun DetailBannerPreview() {
    KonseriaTheme {
        DetailBanner(TicketsType.OFFICIAL)
    }
}
