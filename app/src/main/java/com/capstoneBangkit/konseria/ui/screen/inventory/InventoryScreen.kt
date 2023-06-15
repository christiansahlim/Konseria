package com.capstoneBangkit.konseria.ui.screen.inventory

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.capstoneBangkit.konseria.R
import com.capstoneBangkit.konseria.ui.components.inventory.CategoryInventoryButton
import com.capstoneBangkit.konseria.ui.components.inventory.CompletedCard
import com.capstoneBangkit.konseria.ui.components.inventory.InventorySection
import com.capstoneBangkit.konseria.ui.components.inventory.OngoingCard
import com.capstoneBangkit.konseria.ui.components.inventory.OnsaleCard
import com.capstoneBangkit.konseria.ui.components.inventory.PaidCard
import com.capstoneBangkit.konseria.ui.components.inventory.SellTicketPopUp

@Composable
fun InventoryScreen(navController: NavHostController, modifier: Modifier) {

    val isOngoingCardVisible = remember { mutableStateOf(true) }
    val isPaidCardVisible = remember { mutableStateOf(false) }
    val isOnsaleCardVisible = remember { mutableStateOf(false) }
    val isCompletedVisible = remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.bg_inventory),
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Column(modifier = Modifier.fillMaxSize()) {
            InventorySection(
                modifier = Modifier.padding(16.dp),
                content = {
                    Text(
                        text = "Your Tickets",
                        style = MaterialTheme.typography.h4.copy(
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.padding(bottom = 16.dp, top = 20.dp)
                    )
                    CategoryInventoryButton(
                        onOngoingButtonClicked = {
                            isOngoingCardVisible.value = true
                            isPaidCardVisible.value = false
                            isOnsaleCardVisible.value = false
                            isCompletedVisible.value = false
                        },
                        onPaidButtonClicked = {
                            isOngoingCardVisible.value = false
                            isPaidCardVisible.value = true
                            isOnsaleCardVisible.value = false
                            isCompletedVisible.value = false
                        },
                        onSaleButtonClicked = {
                            isOngoingCardVisible.value = false
                            isPaidCardVisible.value = false
                            isOnsaleCardVisible.value = true
                            isCompletedVisible.value = false
                        },
                        onCompletedButtonClicked = {
                            isOngoingCardVisible.value = false
                            isPaidCardVisible.value = false
                            isOnsaleCardVisible.value = false
                            isCompletedVisible.value = true
                        },
                    )
                }
            )

            Spacer(modifier = Modifier.height(8.dp))

            InventorySection(
                modifier = Modifier.padding(16.dp),
                content = {
                    if (isOngoingCardVisible.value) {
                        OngoingCard(Modifier)
                    } else if (isPaidCardVisible.value) {
                        PaidCard(modifier = Modifier, sellTicketButtonClicked = {
                            SellTicketPopUp({})
                        })
                    } else if (isOnsaleCardVisible.value) {
                        OnsaleCard(Modifier)
                    } else if (isCompletedVisible.value) {
                        CompletedCard(Modifier)
                    }
                }
            )
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewInventoryScreen() {
    val navController = rememberNavController()
    MaterialTheme {
        InventoryScreen(navController = navController, Modifier)
    }
}