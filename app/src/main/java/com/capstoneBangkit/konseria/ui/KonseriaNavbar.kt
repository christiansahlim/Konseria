package com.capstoneBangkit.konseria.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.capstoneBangkit.konseria.navigation.KonseriaNavigation
import com.capstoneBangkit.konseria.ui.components.BottomNavBar
import com.capstoneBangkit.konseria.ui.screen.detail.DetailScreen
import com.capstoneBangkit.konseria.ui.screen.home.HomeScreen
import com.capstoneBangkit.konseria.ui.screen.inventory.InventoryScreen
import com.capstoneBangkit.konseria.ui.screen.profile.ProfileScreen
import com.capstoneBangkit.konseria.ui.screen.search.SearchScreen

@Composable
fun KonseriaNavbar(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute != KonseriaNavigation.HomeDetailScreen.route || currentRoute != KonseriaNavigation.SearchDetailScreen.route) {
                BottomNavBar(navController)
            }
        },
        modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = KonseriaNavigation.HomeScreen.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(KonseriaNavigation.HomeScreen.route) {
                HomeScreen(
                    navigateToDetail = { concertId ->
                        navController.navigate(
                            KonseriaNavigation.HomeDetailScreen.createRoute(
                                concertId
                            )
                        )
                    }
                )
            }
            composable(KonseriaNavigation.SearchScreen.route) {
                SearchScreen(
                    navigateToDetail = { concertId ->
                        navController.navigate(
                            KonseriaNavigation.SearchDetailScreen.createRoute(
                                concertId
                            )
                        )
                    })
            }
            composable(KonseriaNavigation.InventoryScreen.route) {
                InventoryScreen()
            }
            composable(KonseriaNavigation.ProfileScreen.route) {
                ProfileScreen(navController = navController, modifier = Modifier)
            }
            composable(
                route = KonseriaNavigation.HomeDetailScreen.route,
                arguments = listOf(navArgument("concertId") { type = NavType.IntType }),
            ) {
                val id = it.arguments?.getInt("concertId") ?: -1
                DetailScreen(
                    concertId = id,
                    navigateBack = {
                        navController.navigateUp()
                    }
                )
            }
            composable(
                route = KonseriaNavigation.SearchDetailScreen.route,
                arguments = listOf(navArgument("concertId") { type = NavType.IntType }),
            ) {
                val id = it.arguments?.getInt("concertId") ?: -1
                DetailScreen(
                    concertId = id,
                    navigateBack = {
                        navController.navigateUp()
                    }
                )
            }
        }
    }
}