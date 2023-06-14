package com.capstoneBangkit.konseria.ui.components.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AirplaneTicket
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.model.TicketsType
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme
import com.capstoneBangkit.konseria.ui.theme.PinkishRed

@Composable
fun DetailBuyTickets(modifier: Modifier , ticketType: Enum<TicketsType>) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
    ) {
        Row(modifier.align(Center)) {
            if (ticketType == TicketsType.OFFICIAL) {
                Row(
                    Modifier
                        .align(CenterVertically)
                        .padding(end = 20.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.AirplaneTicket,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.padding(end = 10.dp)
                    )
                    Text(
                        text = "Rp. 700k - 1.5m",
                        Modifier.align(CenterVertically),
                        color = Color.White
                    )
                }
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(width = 170.dp, height = 40.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
            ) {
                Text(
                    text = "Buy tickets",
                    style = MaterialTheme.typography.subtitle1,
                    fontWeight = FontWeight.Bold,
                    color = PinkishRed
                )
            }
        }
    }
}

@Preview
@Composable
fun DetailBuyTicketsPreview() {
    KonseriaTheme {
        DetailBuyTickets(Modifier, ticketType = TicketsType.TRADING)
    }
}