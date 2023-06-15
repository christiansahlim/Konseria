package com.capstoneBangkit.konseria.ui.screen.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.capstoneBangkit.konseria.model.TicketsType
import com.capstoneBangkit.konseria.ui.components.detail.DetailBanner
import com.capstoneBangkit.konseria.ui.components.detail.DetailBottomSheetContent
import com.capstoneBangkit.konseria.ui.components.detail.DetailBuyTickets
import com.capstoneBangkit.konseria.ui.components.detail.DetailDescription
import com.capstoneBangkit.konseria.ui.theme.BlueGray
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DetailScreen(concertId: Int, ticketType: Enum<TicketsType>, navigateBack: () -> Unit) {
    val contextForToast = LocalContext.current.applicationContext
    val coroutineScope = rememberCoroutineScope()
    val scaffoldState = rememberBottomSheetScaffoldState()

    BottomSheetScaffold(
        scaffoldState = scaffoldState,
        sheetPeekHeight = 70.dp,
        sheetGesturesEnabled = true,
        sheetShape = RoundedCornerShape(topStart = 42.dp, topEnd = 42.dp),
        sheetContent = {
            Box(Modifier.background(color = BlueGray)) {
                Box(
                    Modifier
                        .size(height = 12.dp, width = 80.dp)
                        .align(alignment = TopCenter)
                        .padding(top = 8.dp)
                ) {
                    Divider(Modifier.background(color = Color.Gray), thickness = 3.dp)
                }
                DetailBuyTickets(
                    Modifier
                        .align(alignment = TopCenter)
                        .padding(top = 10.dp), ticketType
                )
            }
            DetailBottomSheetContent(Modifier)
        }
    ) {
        Box {
            DetailBanner(ticketType)
            DetailDescription(Modifier.padding(top = setLayoutPadding(ticketType)), ticketType)
        }
    }
}

fun setLayoutPadding(ticketType: Enum<TicketsType>): Dp {
    return if (ticketType == TicketsType.TRADING) {
        352.dp
    } else {
        420.dp
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DetailScreenPreview() {
    KonseriaTheme {
        DetailScreen(concertId = 0, ticketType = TicketsType.OFFICIAL, navigateBack = {})
    }
}