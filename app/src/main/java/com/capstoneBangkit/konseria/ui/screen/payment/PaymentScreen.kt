package com.capstoneBangkit.konseria.ui.screen.payment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.ui.components.payment.*
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme

@Composable
fun PaymentScreen(navigateToInventory: (Int) -> Unit) {
    val isChecked = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(32.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        PaymentSection (
            content = {
                PaymentCard(Modifier)
            }
        )

        Spacer(modifier = Modifier.height(8.dp))

        PaymentSection (
            content = {
                PaymentTotal(Modifier)
            }
        )

        Spacer(modifier = Modifier.height(8.dp))

        PaymentSection (
            content = {
                DetailPayment(Modifier)
            }
        )

        Spacer(modifier = Modifier.height(8.dp))

        PaymentSection (
            content = {
                PaymentMethod(Modifier)
            }
        )

        Spacer(modifier = Modifier.height(150.dp))

        PaymentSection (
            content = {
                CheckboxPayment(isChecked = isChecked)
            }
        )

        Spacer(modifier = Modifier.height(8.dp))

        PaymentSection (
            content = {
                ButtonPayment(isChecked, navigateToInventory)
            }
        )

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PaymentScreenPreview() {
    KonseriaTheme {
        PaymentScreen(navigateToInventory = {})
    }
}

