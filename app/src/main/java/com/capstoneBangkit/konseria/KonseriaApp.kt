package com.capstoneBangkit.konseria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.capstoneBangkit.konseria.navigation.NavigationBuilder
import com.capstoneBangkit.konseria.ui.theme.KonseriaTheme

class KonseriaApp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KonseriaTheme {
                NavigationBuilder()
            }
        }
    }
}