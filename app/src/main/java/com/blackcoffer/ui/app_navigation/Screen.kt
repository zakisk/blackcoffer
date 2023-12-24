package com.blackcoffer.ui.app_navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.blackcoffer.R


sealed class Screen(val route: String) {

    sealed class BottomScreen(
        val bottomRoute: String,
        @StringRes val strResId: Int,
        @DrawableRes val iconId: Int
    ) : Screen(bottomRoute) {

        data object RefineScreen : BottomScreen("refine", R.string.refine, R.drawable.ic_refine)

        data object ExploreScreen : BottomScreen("explore", R.string.explore, R.drawable.ic_explore)

        data object NetworkScreen : BottomScreen("network", R.string.network, R.drawable.ic_network)

        data object ChatScreen : BottomScreen("chat", R.string.chat, R.drawable.ic_chat)

        data object Contacts : BottomScreen("contacts", R.string.contacts, R.drawable.ic_contacts)

    }

}
