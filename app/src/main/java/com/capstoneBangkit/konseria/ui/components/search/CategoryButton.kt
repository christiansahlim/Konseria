package com.capstoneBangkit.konseria.ui.components.search

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CategoryButton(
    onOfficialButtonClicked: () -> Unit,
    onTradingButtonClicked: () -> Unit
) {
    val isOfficialButtonClicked = remember { mutableStateOf(false) }
    val isTradingButtonClicked = remember { mutableStateOf(false) }

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(
            onClick = {
                isOfficialButtonClicked.value = true
                isTradingButtonClicked.value = false
                onOfficialButtonClicked()
            },
            modifier = Modifier
                .padding(start = 32.dp, end = 32.dp)
                .weight(1f),
            enabled = !isOfficialButtonClicked.value,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isOfficialButtonClicked.value) Color.Gray else Color.White
            ),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(
                topStart = if (isOfficialButtonClicked.value) 12.dp else 12.dp,
                bottomStart = if (isOfficialButtonClicked.value) 12.dp else 12.dp,
                topEnd = if (isTradingButtonClicked.value) 12.dp else 12.dp,
                bottomEnd = if (isTradingButtonClicked.value) 12.dp else 12.dp
            )
        ) {
            Text(
                text = "Official",
                color = Color.Black,
                fontSize = 16.sp
            )
        }

        Spacer(modifier = Modifier.width(16.dp))

        Button(
            onClick = {
                isOfficialButtonClicked.value = false
                isTradingButtonClicked.value = true
                onTradingButtonClicked()
            },
            modifier = Modifier
                .padding(start = 32.dp, end = 32.dp)
                .weight(1f),
            enabled = !isTradingButtonClicked.value,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isTradingButtonClicked.value) Color.Gray else Color.White
            ),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(
                topStart = if (isOfficialButtonClicked.value) 12.dp else 12.dp,
                bottomStart = if (isOfficialButtonClicked.value) 12.dp else 12.dp,
                topEnd = if (isTradingButtonClicked.value) 12.dp else 12.dp,
                bottomEnd = if (isTradingButtonClicked.value) 12.dp else 12.dp
            )
        ) {
            Text(
                text = "Trading",
                color = Color.Black,
                fontSize = 16.sp
            )
        }
    }
}

@Preview
@Composable
fun CategoryButtonPreview() {
    CategoryButton(
        onOfficialButtonClicked = {},
        onTradingButtonClicked = {}
    )
}

