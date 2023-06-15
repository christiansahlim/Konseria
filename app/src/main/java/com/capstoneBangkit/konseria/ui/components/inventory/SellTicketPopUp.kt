package com.capstoneBangkit.konseria.ui.components.inventory

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.R
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme

@Composable
fun SellTicketPopUp(onSearch: (String) -> Unit) {
    var searchText by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .alpha(alpha = 0.8f)
            .background(color = Color.Black)
            .fillMaxSize()
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Card(modifier = Modifier.size(325.dp, height = 350.dp), shape = RoundedCornerShape(32.dp)) {
            Box() {
                FloatingActionButton(modifier = Modifier
                    .padding(start = 20.dp, top = 20.dp)
                    .size(20.dp),
                    backgroundColor = Color.Black,
                    content = {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(10.dp)
                        )
                    },
                    onClick = { /*TODO*/ })

                Column() {
                    Text(
                        text = "Re-Sell Ticket",
                        style = MaterialTheme.typography.h5,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier
                            .align(CenterHorizontally)
                            .padding(vertical = 20.dp)
                    )
                    Column(Modifier.padding(start = 10.dp)) {
                        Row {
                            Image(
                                painter = painterResource(R.drawable.blue_concert),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(72.dp)
                                    .clip(CircleShape)
                            )
                            Column(Modifier.padding(start = 10.dp)) {
                                Text(
                                    text = "Organizer's Name",
                                    style = MaterialTheme.typography.subtitle1,
                                    fontWeight = FontWeight.Bold
                                )
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.padding(top = 5.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.MusicNote,
                                        contentDescription = null,
                                        Modifier
                                            .size(15.dp)
                                    )
                                    Text(
                                        text = "Indie Rock",
                                        modifier = Modifier.padding(start = 3.dp),
                                        style = MaterialTheme.typography.subtitle2
                                    )
                                }
                                Text(
                                    text = "Next event Friday Aug 25, 10PM",
                                    modifier = Modifier.padding(start = 5.dp, top = 5.dp),
                                    style = MaterialTheme.typography.subtitle2
                                )
                            }
                        }
                        Text(
                            text = "Bought Price           Rp.100.000",
                            style = MaterialTheme.typography.body2,
                            modifier = Modifier.padding(start = 10.dp, bottom = 5.dp, top = 10.dp)
                        )
                        Text(
                            text = "Market Price           Rp.200.000",
                            style = MaterialTheme.typography.body2,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(
                            text = "Set Selling Price",
                            style = MaterialTheme.typography.subtitle2,
                            modifier = Modifier.padding(10.dp)
                        )
                        OutlinedTextField(
                            modifier = Modifier
                                .size(height = 50.dp, width = 300.dp)
                                .padding(start = 10.dp, bottom = 10.dp),
                            value = searchText,
                            shape = RoundedCornerShape(32.dp),
                            onValueChange = { text ->
                                searchText = text
                                onSearch(text)
                            },
                        )
                    }
                    Button(
                        modifier = Modifier
                            .align(CenterHorizontally)
                            .size(width = 125.dp, height = 35.dp),
                        shape = RoundedCornerShape(10.dp),
                        content = {
                            Text(
                                text = "Post Ticket", style = MaterialTheme.typography.subtitle2
                            )
                        },
                        onClick = { /*TODO*/ })
                }
            }
        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SellTicketPopUpPreview() {
    KonseriaTheme {
        SellTicketPopUp {}
    }
}
