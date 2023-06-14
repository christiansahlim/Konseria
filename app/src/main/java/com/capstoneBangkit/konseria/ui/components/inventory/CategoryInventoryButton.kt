package com.capstoneBangkit.konseria.ui.components.inventory

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun CategoryInventoryButton(
    onOngoingButtonClicked: () -> Unit,
    onPaidButtonClicked: () -> Unit,
    onSaleButtonClicked: () -> Unit,
    onCompletedButtonClicked: () -> Unit
) {
    val isOngoingButtonClicked = remember { mutableStateOf(false) }
    val isPaidButtonClicked = remember { mutableStateOf(false) }
    val isSaleButtonClicked = remember { mutableStateOf(false) }
    val isCompletedButtonClicked = remember { mutableStateOf(false) }

    LazyRow(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth()
    ) {
        item {
            Button(
                onClick = {
                    isOngoingButtonClicked.value = true
                    isPaidButtonClicked.value = false
                    isSaleButtonClicked.value = false
                    isCompletedButtonClicked.value = false
                    onOngoingButtonClicked()
                },
                modifier = Modifier.padding(horizontal = 8.dp),
                enabled = !isOngoingButtonClicked.value,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (isOngoingButtonClicked.value) Color.Gray else Color.White
                ),
                shape = RoundedCornerShape(
                    topStart = if (isOngoingButtonClicked.value) 12.dp else 12.dp,
                    bottomStart = if (isOngoingButtonClicked.value) 12.dp else 12.dp,
                    topEnd = if (isPaidButtonClicked.value || isSaleButtonClicked.value || isCompletedButtonClicked.value) 12.dp else 12.dp,
                    bottomEnd = if (isPaidButtonClicked.value || isSaleButtonClicked.value || isCompletedButtonClicked.value) 12.dp else 12.dp
                )
            ) {
                Text(
                    text = "Ongoing",
                    color = Color.Black,
                    fontSize = 16.sp
                )
            }
        }

        item {
            Button(
                onClick = {
                    isOngoingButtonClicked.value = false
                    isPaidButtonClicked.value = true
                    isSaleButtonClicked.value = false
                    isCompletedButtonClicked.value = false
                    onPaidButtonClicked()
                },
                modifier = Modifier.padding(horizontal = 8.dp),
                enabled = !isPaidButtonClicked.value,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (isPaidButtonClicked.value) Color.Gray else Color.White
                ),
                shape = RoundedCornerShape(
                    topStart = if (isOngoingButtonClicked.value) 12.dp else 12.dp,
                    bottomStart = if (isOngoingButtonClicked.value) 12.dp else 12.dp,
                    topEnd = if (isPaidButtonClicked.value || isSaleButtonClicked.value || isCompletedButtonClicked.value) 12.dp else 12.dp,
                    bottomEnd = if (isPaidButtonClicked.value || isSaleButtonClicked.value || isCompletedButtonClicked.value) 12.dp else 12.dp
                )
            ) {
                Text(
                    text = "Paid",
                    color = Color.Black,
                    fontSize = 16.sp
                )
            }
        }

        item {
            Button(
                onClick = {
                    isOngoingButtonClicked.value = false
                    isPaidButtonClicked.value = false
                    isSaleButtonClicked.value = true
                    isCompletedButtonClicked.value = false
                    onSaleButtonClicked()
                },
                modifier = Modifier.padding(horizontal = 8.dp),
                enabled = !isSaleButtonClicked.value,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (isSaleButtonClicked.value) Color.Gray else Color.White
                ),
                shape = RoundedCornerShape(
                    topStart = if (isOngoingButtonClicked.value || isPaidButtonClicked.value) 12.dp else 12.dp,
                    bottomStart = if (isOngoingButtonClicked.value || isPaidButtonClicked.value) 12.dp else 12.dp,
                    topEnd = if (isSaleButtonClicked.value || isCompletedButtonClicked.value) 12.dp else 12.dp,
                    bottomEnd = if (isSaleButtonClicked.value || isCompletedButtonClicked.value) 12.dp else 12.dp
                )
            ) {
                Text(
                    text = "On Sale",
                    color = Color.Black,
                    fontSize = 16.sp
                )
            }
        }

        item {
            Button(
                onClick = {
                    isOngoingButtonClicked.value = false
                    isPaidButtonClicked.value = false
                    isSaleButtonClicked.value = false
                    isCompletedButtonClicked.value = true
                    onCompletedButtonClicked()
                },
                modifier = Modifier.padding(horizontal = 8.dp),
                enabled = !isCompletedButtonClicked.value,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (isCompletedButtonClicked.value) Color.Gray else Color.White
                ),
                shape = RoundedCornerShape(
                    topStart = if (isOngoingButtonClicked.value || isPaidButtonClicked.value || isSaleButtonClicked.value) 12.dp else 12.dp,
                    bottomStart = if (isOngoingButtonClicked.value || isPaidButtonClicked.value || isSaleButtonClicked.value) 12.dp else 12.dp,
                    topEnd = if (isCompletedButtonClicked.value) 12.dp else 12.dp,
                    bottomEnd = if (isCompletedButtonClicked.value) 12.dp else 12.dp
                )
            ) {
                Text(
                    text = "Completed",
                    color = Color.Black,
                    fontSize = 16.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun CategoryInventoryButtonPreview() {
    CategoryInventoryButton(
        onOngoingButtonClicked = { /* Aksi saat tombol Ongoing diklik */ },
        onPaidButtonClicked = { /* Aksi saat tombol Paid diklik */ },
        onSaleButtonClicked = { /* Aksi saat tombol On Sale diklik */ },
        onCompletedButtonClicked = { /* Aksi saat tombol Completed diklik */ }
    )

}

