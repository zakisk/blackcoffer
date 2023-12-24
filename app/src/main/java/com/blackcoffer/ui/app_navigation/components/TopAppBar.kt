package com.blackcoffer.ui.app_navigation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.blackcoffer.R
import com.blackcoffer.ui.app_navigation.Screen
import com.blackcoffer.ui.theme.LocalSpacing
import com.blackcoffer.ui.theme.Tiber

@Composable
fun TopAppBar(currentRoute: String, onClick: () -> Unit) {
    val explore = Screen.BottomScreen.ExploreScreen.route
    TopAppBar(backgroundColor = Color.Tiber) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = Modifier.wrapContentSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .padding(start = LocalSpacing.current.medium)
                        .clickable(onClick = onClick),
                    painter = painterResource(id = if (currentRoute == explore) R.drawable.ic_menu else R.drawable.ic_back),
                    contentDescription = "menu and back button",
                    tint = Color.White
                )

                Column(modifier = Modifier.padding(start = LocalSpacing.current.medium)) {
                    Text(
                        text = currentRoute.replaceFirstChar { currentRoute[0].uppercase() },
                        style = (if (currentRoute == explore) MaterialTheme.typography.bodyLarge else MaterialTheme.typography.headlineSmall)
                            .copy(fontWeight = FontWeight.Bold),
                        color = Color.White
                    )

                    if (currentRoute == explore) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                modifier = Modifier.size(12.dp),
                                imageVector = Icons.Filled.LocationOn,
                                contentDescription = "address location",
                                tint = Color.White
                            )

                            Text(
                                text = " San Francisco, California",
                                fontSize = 11.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }

            Icon(
                modifier = Modifier.padding(end = LocalSpacing.current.small),
                imageVector = Icons.Outlined.Notifications,
                contentDescription = "address location",
                tint = Color.White
            )
        }
    }
}