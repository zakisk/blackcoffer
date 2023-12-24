package com.blackcoffer.ui.app_navigation.components

import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.blackcoffer.ui.app_navigation.Screen
import com.blackcoffer.ui.theme.Firefly

@Composable
fun BottomAppBar(navController: NavHostController) {

    val items = listOf(
        Screen.BottomScreen.RefineScreen,
        Screen.BottomScreen.ExploreScreen,
        Screen.BottomScreen.NetworkScreen,
        Screen.BottomScreen.ChatScreen,
        Screen.BottomScreen.Contacts
    )

    BottomAppBar(backgroundColor = MaterialTheme.colorScheme.background) {
        val currentDestination by navController.currentBackStackEntryAsState()
        val currentRoute = currentDestination?.destination

        items.forEach { screen ->
            BottomNavigationItem(
                label = {
                    Text(
                        text = stringResource(id = screen.strResId),
                        fontSize = 10.sp
                    )
                },
                icon = {
                    Icon(
                        painter = painterResource(id = screen.iconId),
                        contentDescription = null
                    )
                },
                selected = currentRoute?.hierarchy?.any { it.route == screen.bottomRoute } == true,
                selectedContentColor = Color.Firefly,
                unselectedContentColor = Color.Gray,
                onClick = {
                    if (screen.bottomRoute != currentRoute?.route) {
                        navController.navigate(screen.route) {
                            navController.popBackStack(
                                Screen.BottomScreen.ExploreScreen.route,
                                inclusive = false
                            )
                        }
                    }
                }
            )

        }

    }
}