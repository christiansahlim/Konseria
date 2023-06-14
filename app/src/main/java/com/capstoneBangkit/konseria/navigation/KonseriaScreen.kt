package com.capstoneBangkit.konseria.navigation

sealed class KonseriaScreen(val route:String){
    object LoginScreen : KonseriaScreen("login_screen")
}