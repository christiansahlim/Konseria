package com.capstoneBangkit.konseria.ui.components.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.ConfirmationNumber
import androidx.compose.material.icons.filled.Help
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileAdvises() {
    Column(
        modifier = Modifier
            .background(
                color = Color.White,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp)
    ) {
        Text(
            text = "Advises",
            style = MaterialTheme.typography.button,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        ButtonWithIconAdvises(
            title = "My Ticket",
            icon = Icons.Default.ConfirmationNumber
        ) {
            // Handle button click
        }
        Spacer(modifier = Modifier.height(8.dp))
        ButtonWithIconAdvises(
            title = "Support",
            icon = Icons.Default.Help
        ) {
            // Handle button click
        }
    }
}

@Composable
fun ButtonWithIconAdvises(
    title: String,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(vertical = 8.dp, horizontal = 16.dp)
                .fillMaxWidth()
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = title,
                style = MaterialTheme.typography.button,
                modifier = Modifier.weight(1f)
            )
            Icon(
                imageVector = Icons.Default.ChevronRight,
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewProfileAdvises() {
    MaterialTheme {
        ProfileAdvises()
    }
}