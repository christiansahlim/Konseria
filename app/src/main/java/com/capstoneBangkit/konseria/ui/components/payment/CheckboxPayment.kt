package com.capstoneBangkit.konseria.ui.components.payment

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme

@Composable
fun CheckboxPayment(isChecked: MutableState<Boolean>) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable { isChecked.value = !isChecked.value }
    ) {
        Checkbox(
            checked = isChecked.value,
            onCheckedChange = { isChecked.value = it },
            modifier = Modifier.padding(end = 8.dp)
        )
        Text(
            text = "I have read and agreed to the terms and conditions",
            style = MaterialTheme.typography.body1.copy(fontSize = 12.sp),
            color = if (isChecked.value) Color.Black else MaterialTheme.colors.onBackground
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun CheckboxPaymentPreview() {
    val isChecked = remember { mutableStateOf(false) }
    KonseriaTheme {
        CheckboxPayment(isChecked = isChecked)
    }
}

