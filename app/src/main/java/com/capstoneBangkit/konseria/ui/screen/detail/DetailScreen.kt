package com.capstoneBangkit.konseria.ui.screen.detail

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.capstoneBangkit.konseria.ui.components.detail.DetailBanner
import com.capstoneBangkit.konseria.ui.components.detail.DetailBuyTickets
import com.capstoneBangkit.konseria.ui.components.detail.DetailDescription
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme

@Composable
fun DetailScreen( concertId: Int,navigateBack: () -> Unit) {
    DetailBanner()
    DetailDescription()
    DetailBuyTickets()
}

@Preview
@Composable
fun DetailScreenPreview() {
    KonseriaTheme {
    }
}