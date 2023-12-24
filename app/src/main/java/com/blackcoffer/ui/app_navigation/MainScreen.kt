package com.blackcoffer.ui.app_navigation

import androidx.activity.compose.BackHandler
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.blackcoffer.ui.app_navigation.components.BottomAppBar
import com.blackcoffer.ui.app_navigation.components.TopAppBar
import kotlinx.coroutines.launch

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val currentDestination by navController.currentBackStackEntryAsState()
    val currentRoute = currentDestination?.destination?.route ?: " "
    BackHandler(enabled = scaffoldState.drawerState.isOpen) {
        scope.launch { scaffoldState.drawerState.close() }
    }
    val onMenuClicked: () -> Unit = {
        if (currentRoute == Screen.BottomScreen.ExploreScreen.route) {
            if (scaffoldState.drawerState.isClosed) {
                scope.launch { scaffoldState.drawerState.open() }
            }
        } else {
            navController.popBackStack()
        }
    }

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                currentRoute = currentRoute,
                onClick = onMenuClicked
            )
        },
        bottomBar = {
            if (currentRoute == Screen.BottomScreen.ExploreScreen.route)
                BottomAppBar(navController = navController)
        },
        drawerContent = {},
        drawerGesturesEnabled = currentRoute == Screen.BottomScreen.ExploreScreen.route
    ) { paddingValues ->
        MainNavHost(navController = navController, paddingValues = paddingValues)
    }
}