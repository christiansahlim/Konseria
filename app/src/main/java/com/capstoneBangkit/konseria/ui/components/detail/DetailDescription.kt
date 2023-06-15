package com.capstoneBangkit.konseria.ui.components.detail

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AirplaneTicket
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.model.TicketsType
import com.capstoneBangkit.konseria.ui.theme.DarkerBlue
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme
import com.capstoneBangkit.konseria.ui.theme.PinkishRed

@Composable
fun DetailDescription(modifier: Modifier, ticketType: Enum<TicketsType>) {
    DetailDescriptionType(modifier = modifier, ticketType = ticketType)
}

@Composable
fun DetailDescriptionType(modifier: Modifier, ticketType: Enum<TicketsType>) {
    Card(
        modifier = modifier
            .height(LocalConfiguration.current.screenHeightDp.dp /2)
            .fillMaxWidth(),
        backgroundColor = (DarkerBlue),
        shape = RoundedCornerShape(bottomEnd = 32.dp, bottomStart = 32.dp),
        border = BorderStroke(color = Color.Transparent, width = 1.dp)
    ) {
        Column {
            Column(Modifier.padding(start = 15.dp, top = 40.dp)) {
                Text(
                    text = "BrightLight Concert",
                    style = MaterialTheme.typography.h4,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(bottom = 20.dp),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    color = Color.White
                )
                Row(Modifier.padding(bottom = 15.dp), verticalAlignment = CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.CalendarToday,
                        contentDescription = null,
                        tint = Color.White
                    )
                    Text(
                        text = "Friday, 24 Aug 2023",
                        Modifier.padding(start = 15.dp, end = 10.dp),
                        color = Color.White
                    )
                    Icon(
                        imageVector = Icons.Default.Circle,
                        contentDescription = null,
                        modifier = Modifier.size(5.dp),
                        tint = Color.White
                    )
                    Text(
                        text = "6:30PM - Done ",
                        modifier = Modifier.padding(start = 5.dp),
                        color = Color.White
                    )
                }
                Row(Modifier.padding(bottom = 15.dp)) {
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = null,
                        tint = Color.White
                    )
                    Column {
                        Text(
                            text = "Venue name",
                            Modifier.padding(start = 10.dp),
                            color = Color.White
                        )
                        Text(
                            text = "Address",
                            Modifier.padding(start = 10.dp),
                            style = MaterialTheme.typography.overline,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.Gray
                        )
                    }
                }
                Row(Modifier.padding(bottom = 10.dp)) {
                    Icon(
                        imageVector = Icons.Default.MusicNote,
                        contentDescription = null,
                        tint = Color.White
                    )
                    Text(
                        text = "Genre",
                        modifier = Modifier.padding(start = 10.dp),
                        color = Color.White
                    )
                }
                if (ticketType == TicketsType.TRADING) {
                    Row(Modifier.padding(bottom = 10.dp), verticalAlignment = Alignment.Bottom) {
                        Icon(
                            imageVector = Icons.Default.AirplaneTicket,
                            contentDescription = null,
                            tint = Color.White
                        )
                        Text(
                            text = "Rp. 400.000",
                            modifier = Modifier
                                .padding(start = 10.dp)
                                .alpha(0.8f),
                            fontWeight = FontWeight.Bold,
                            color = PinkishRed
                        )
                        Text(
                            text = "x4",
                            modifier = Modifier.padding(start = 5.dp),
                            style = MaterialTheme.typography.caption,
                            color = Color.White
                        )
                    }
                    Row(Modifier.padding(bottom = 10.dp)) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null,
                            tint = Color.White
                        )
                        Text(
                            text = "Steve",
                            modifier = Modifier.padding(start = 10.dp),
                            color = Color.White
                        )
                    }
                }
            }
//            Divider(Modifier.background(color = BlueGray), thickness = 3.dp)
        }
    }
}

@Preview
@Composable
fun DetailDescriptionPreview() {
    KonseriaTheme {
        DetailDescription(Modifier, TicketsType.TRADING)
    }
}