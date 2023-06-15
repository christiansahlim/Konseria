package com.capstoneBangkit.konseria.navigation

sealed class KonseriaNavigation(val route: String) {
    object HomeScreen : KonseriaNavigation("home_screen")
    object HomeDetailScreen : KonseriaNavigation("home_screen/{concertId}") {
        fun createRoute(concertId: Int) = "home_screen/$concertId"
    }

    object SearchScreen : KonseriaNavigation("search_screen")

    object PaymentScreen : KonseriaNavigation("payment_screen")

    object PaymentInventoryScreen : KonseriaNavigation("payment_screen/{concertId}") {
        fun createRoute(concertId: Int) = "payment_screen/$concertId"
    }
    object SearchDetailScreen : KonseriaNavigation("search_screen/{concertId}") //{
//        fun createRoute(concertId: Int) = "search_screen/$concertId"
//    }

    object InventoryScreen : KonseriaNavigation("inventory_screen")
    object ProfileScreen : KonseriaNavigation("profile_screen")

    object DetailScreen : KonseriaNavigation("detail_screen")

//    object DetailPaymentScreen : KonseriaNavigation("detail_payment_screen/{concertId}") {
//        fun createRoute(concertId: Int): String {
//            return "detail_payment_screen/$concertId"
//        }
//    }

}
