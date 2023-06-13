package com.capstoneBangkit.konseria.ui.screen.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.capstoneBangkit.konseria.R
import com.capstoneBangkit.konseria.ui.components.BottomNavBar
import com.capstoneBangkit.konseria.ui.components.profile.*

@Composable
fun ProfileScreen(navController: NavHostController, modifier: Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.bg_profile),
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp)
                .align(Alignment.TopStart)
        ) {
            Text(
                text = "User Profile",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 16.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            ProfileSection(
                content = {
                    ProfileCard()
                }
            )
            Column(
                modifier = Modifier
                    .background(
                        color = Color.LightGray,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .padding(16.dp)
            ) {
                ProfileSection(
                    content = {
                        ProfileSetting()
                    }
                )
                Spacer(modifier = Modifier.height(16.dp))
                ProfileSection(
                    content = {
                        ProfileAdvises()
                    }
                )
                Spacer(modifier = Modifier.height(16.dp))
                ProfileSection(
                    content = {
                        ProfileAbout()
                    }
                )
                Image(
                    painter = painterResource(id = R.drawable.logo_konseria),
                    contentDescription = "Konseria Logo",
                    modifier = Modifier
                        .size(120.dp)
                        .align(Alignment.CenterHorizontally)
                )
            }
        }
        BottomNavBar(
            navController = navController,
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewProfileScreen() {
    val navController = rememberNavController()
    MaterialTheme {
        ProfileScreen(navController = navController, Modifier)
    }
}

