package com.capstoneBangkit.konseria.ui.components.inventory

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AirplaneTicket
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.R

@Composable
fun PaidCard(modifier: Modifier, sellTicketButtonClicked: () -> Unit) {
    Card(
        modifier = modifier
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
                contentDescription = "Card Image",
                modifier = Modifier
                    .size(80.dp)
                    .padding(end = 16.dp)
            )
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Blues Music Festival",
                    style = MaterialTheme.typography.h6,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
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
                            .padding(0.dp, 4.dp, 5.dp, 0.dp)
                            .alpha(0.7f),
                        style = MaterialTheme.typography.caption,
                        fontWeight = FontWeight.Bold,
                        color = Color.LightGray
                    )
                    Icon(
                        modifier = Modifier
                            .size(30.dp)
                            .padding(5.dp, 0.dp, 5.dp, 5.dp)
                            .alpha(0.7f),
                        imageVector = Icons.Default.AirplaneTicket,
                        tint = Color.LightGray,
                        contentDescription = null
                    )
                    Text(
                        text = "$40-$90",
                        modifier = Modifier
                            .padding(0.dp, 4.dp, 5.dp, 0.dp)
                            .alpha(0.7f),
                        style = MaterialTheme.typography.caption,
                        fontWeight = FontWeight.Bold,
                        color = Color.LightGray
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = sellTicketButtonClicked,
                        modifier = Modifier
                            .height(36.dp)
                            .width(120.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                        shape = RoundedCornerShape(4.dp)
                    ) {
                        Text(
                            text = "Sell Ticket",
                            color = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    Box(
                        modifier = Modifier
                            .background(color = Color(0xFFB2EBF2), shape = RoundedCornerShape(4.dp))
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = "Paid",
                            style = MaterialTheme.typography.caption,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))

                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewPaidCard() {
    PaidCard(Modifier, sellTicketButtonClicked = {})
}