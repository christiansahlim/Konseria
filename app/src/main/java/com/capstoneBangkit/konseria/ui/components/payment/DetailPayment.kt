package com.capstoneBangkit.konseria.ui.components.payment

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme

@Composable
fun DetailPayment(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp)
            .border(
                width = 2.dp,
                color = Color.Black,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(4.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Vip Tickets",
                style = MaterialTheme.typography.body1.copy(fontSize = 18.sp),
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "x1 Rp.700.000",
                style = MaterialTheme.typography.body1.copy(fontSize = 16.sp),
                modifier = Modifier.padding(start = 8.dp)
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Bank Admin Fee",
                style = MaterialTheme.typography.body1.copy(fontSize = 16.sp),
                textAlign = TextAlign.Start
            )
            Text(
                text = "Rp.5.000",
                style = MaterialTheme.typography.body1.copy(fontSize = 16.sp),
                textAlign = TextAlign.End,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DetailPaymentPreview() {
    KonseriaTheme {
        DetailPayment(Modifier)
    }
}

