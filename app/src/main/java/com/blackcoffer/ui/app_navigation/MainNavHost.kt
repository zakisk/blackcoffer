package com.blackcoffer.ui.app_navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.blackcoffer.ui.explore_screen.ExploreScreen
import com.blackcoffer.ui.refine_screen.RefineScreen

@Composable
fun MainNavHost(navController: NavHostController, paddingValues: PaddingValues) {
    NavHost(
        modifier = Modifier.padding(paddingValues),
        navController = navController,
        startDestination = Screen.BottomScreen.ExploreScreen.route
    ) {
        composable(route = Screen.BottomScreen.RefineScreen.route) {
            RefineScreen(onSave = { navController.popBackStack() })
        }

        composable(route = Screen.BottomScreen.ExploreScreen.route) {
            ExploreScreen()
        }

        composable(route = Screen.BottomScreen.NetworkScreen.route) {

        }

        composable(route = Screen.BottomScreen.ChatScreen.route) {

        }

        composable(route = Screen.BottomScreen.Contacts.route) {

        }
    }
}