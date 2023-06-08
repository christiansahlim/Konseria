package com.capstoneBangkit.konseria.ui.components.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.capstoneBangkit.konseria.R

@Composable
fun ForYouRow() {
    Column {
        Text(
            text = stringResource(R.string.for_you_title),
            style = MaterialTheme.typography.h2,
            modifier = Modifier
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ForYouPreview() {
    MaterialTheme {
        ForYouRow()
    }
}