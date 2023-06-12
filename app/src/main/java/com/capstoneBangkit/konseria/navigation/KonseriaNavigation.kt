package com.capstoneBangkit.konseria.navigation

sealed class KonseriaNavigation(val route: String) {
    object HomeScreen : KonseriaNavigation("home_screen")
    object HomeDetailScreen : KonseriaNavigation("home_screen/{concertId}") {
        fun createRoute(concertId: Int) = "home_screen/$concertId"
    }

    object SearchScreen : KonseriaNavigation("search_screen")
    object SearchDetailScreen : KonseriaNavigation("search_screen/{concertId}") {
        fun createRoute(concertId: Int) = "search_screen/$concertId"
    }

    object InventoryScreen : KonseriaNavigation("inventory_screen")
    object ProfileScreen : KonseriaNavigation("profile_screen")
}
