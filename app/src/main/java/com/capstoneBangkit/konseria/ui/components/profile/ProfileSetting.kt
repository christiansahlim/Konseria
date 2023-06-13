package com.capstoneBangkit.konseria.ui.components.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.R


@Composable
fun ProfileSetting() {
    Column(
        modifier = Modifier
            .background(
                color = Color.White,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp)
    ) {
        Text(
            text = stringResource(R.string.setting_title),
            style = MaterialTheme.typography.button,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        ButtonWithIcon(
            title = stringResource(R.string.manage_account_title),
            icon = Icons.Default.AccountBox
        ) {
            // Handle button click
        }
        Spacer(modifier = Modifier.height(8.dp))
        ButtonWithIcon(
            title = stringResource(R.string.privacy_safety_title),
            icon = Icons.Default.Security
        ) {
            // Handle button click
        }
        Spacer(modifier = Modifier.height(8.dp))
        ButtonWithIcon(
            title = stringResource(R.string.help_center_title),
            icon = Icons.Default.Help
        ) {
            // Handle button click
        }
        Spacer(modifier = Modifier.height(8.dp))
        ButtonWithIcon(
            title = stringResource(R.string.theme_title),
            icon = Icons.Default.LightMode
        ) {
            // Handle button click
        }
    }
}

@Composable
fun ButtonWithIcon(
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
fun PreviewProfileSetting() {
    MaterialTheme {
        ProfileSetting()
    }
}