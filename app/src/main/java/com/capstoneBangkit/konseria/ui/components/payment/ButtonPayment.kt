package com.capstoneBangkit.konseria.ui.components.payment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme

@Composable
fun ButtonPayment(isChecked: MutableState<Boolean>, navigateToDetail: (Int) -> Unit) {
    Button(
        onClick = {
            navigateToDetail},
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(color = if (isChecked.value) Color.Green else Color.LightGray),
        shape = RoundedCornerShape(8.dp),
        enabled = isChecked.value,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (isChecked.value) Color.Green else Color.LightGray
        ),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            text = "Buy now",
            color = Color.White,
            style = MaterialTheme.typography.button
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ButtonPaymentPreview() {
    val isChecked = remember { mutableStateOf(false) }
    KonseriaTheme {
        ButtonPayment(isChecked = isChecked, navigateToDetail = {})
    }
}


