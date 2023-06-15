package com.capstoneBangkit.konseria.ui.components.payment

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme

@Composable
fun PaymentMethod(modifier: Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp)
            .border(
                width = 2.dp,
                color = Color.Black,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(vertical = 8.dp, horizontal = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Payment Method",
            style = MaterialTheme.typography.h6.copy(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.weight(1f)
        )
        Icon(
            imageVector = Icons.Default.ChevronRight,
            contentDescription = null,
            tint = Color.Black
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp)
            .padding(top = 4.dp)
            .border(
                width = 2.dp,
                color = Color.Black,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(vertical = 8.dp, horizontal = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Current Method",
            style = MaterialTheme.typography.body1.copy(fontSize = 16.sp),
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Start
        )
        Text(
            text = "Bank",
            style = MaterialTheme.typography.body1.copy(fontSize = 16.sp),
            modifier = Modifier.padding(start = 4.dp),
            textAlign = TextAlign.Start
        )
        Icon(
            imageVector = Icons.Default.AccountBalance,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier.padding(start = 4.dp)
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PaymentMethodPreview() {
    KonseriaTheme {
        PaymentMethod(Modifier)
    }
}
