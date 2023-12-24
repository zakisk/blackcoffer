package com.blackcoffer.ui.refine_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import com.blackcoffer.ui.theme.Firefly
import com.blackcoffer.ui.theme.LocalSpacing
import com.blackcoffer.ui.theme.Tiber

@Composable
fun AvailabilityDropDown(modifier: Modifier) {
    var expanded by remember { mutableStateOf(false) }
    val items = listOf(
        "Available | Hey Let Us Connect",
        "Away | Stay Discrete And Watch",
        "Busy | Do Not Disturb I Will Catch You Up Later",
        "SOS | Emergency! Need Assistance! HELP!!"
    )
    var selected by remember { mutableStateOf(items[0]) }
    var size by remember { mutableStateOf(Size.Zero) }
    val width: @Composable () -> Dp = { with(LocalDensity.current) { size.width.toDp() } }

    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .border(
                    width = .5.dp,
                    color = Color.Tiber,
                    shape = RoundedCornerShape(8.dp)
                )
                .clickable(
                    indication = null,
                    interactionSource = MutableInteractionSource()
                ) { expanded = true }
                .onGloballyPositioned {
                    size = it.size.toSize()
                },
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = selected,
                color = Color.Tiber,
                modifier = Modifier.padding(LocalSpacing.current.medium),
                style = MaterialTheme.typography.labelMedium
            )

            Icon(
                modifier = Modifier.padding(end = LocalSpacing.current.small),
                imageVector = Icons.Filled.ArrowDropDown,
                contentDescription = "arrow down"
            )
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = {
                expanded = false
            },
            modifier = Modifier
                .width(width())
                .background(color = Color.White),
        ) {
            items.forEach { item ->
                DropdownMenuItem(
                    onClick = {
                        selected = item
                        expanded = false
                    },
                    text = {
                        Text(
                            text = item,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(LocalSpacing.current.medium),
                            color = if (selected == item) Color.Firefly else Color.Gray,
                            style = MaterialTheme.typography.labelMedium
                        )
                    }
                )
            }
        }
    }
}