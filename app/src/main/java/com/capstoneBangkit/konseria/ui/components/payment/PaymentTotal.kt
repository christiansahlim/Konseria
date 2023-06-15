package com.capstoneBangkit.konseria.ui.components.payment

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme

@Composable
fun PaymentTotal(modifier: Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp)
            .border(
                width = 2.dp,
                color = Color.Black,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Total",
            style = MaterialTheme.typography.h6.copy(fontSize = 18.sp),
            modifier = Modifier.weight(1f)
        )
        Text(
            text = "Rp.705.000",
            style = MaterialTheme.typography.body1.copy(fontSize = 16.sp),
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PaymentTotalPreview() {
    KonseriaTheme {
        PaymentTotal(Modifier)
    }
}