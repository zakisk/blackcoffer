package com.blackcoffer.ui.explore_screen.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.blackcoffer.ui.theme.LocalSpacing
import com.blackcoffer.utils.fakeUsers

@Composable
fun IndividualTabContent() {
    LazyColumn(modifier = Modifier.padding(LocalSpacing.current.small)) {
        items(fakeUsers) { user ->
            UserItem(user = user)
        }
    }
}