package com.capstoneBangkit.konseria.ui.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AirplaneTicket
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.capstoneBangkit.konseria.R
import com.capstoneBangkit.konseria.navigation.NavigationItem

@Composable
fun BottomNavBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = MaterialTheme.colors.onSecondary,
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(R.string.home_screen_title),
                icon = Icons.Default.Home
            ),
            NavigationItem(
                title = stringResource(R.string.search_screen_title),
                icon = Icons.Default.Search
            ),
            NavigationItem(
                title = stringResource(R.string.inventory_screen_title),
                icon = Icons.Default.AirplaneTicket
            ),
            NavigationItem(
                title = stringResource(R.string.profile_screen_title),
                icon = Icons.Default.Person
            )
        )

        BottomNavigation {
//            navigationItems.map {
//                BottomNavigationItem(icon = {
//                    Icon(
//                        imageVector = it.icon,
//                        contentDescription = it.title
//                    )
//                },
//                    label = {
//                        Text(it.title)
//                    },
//
//                    selected = currentRoute == it.screen.route,
//                    unselectedContentColor = Color.LightGray,
//                    onClick = { /*TODO*/ })
//            }
        }
    }
}