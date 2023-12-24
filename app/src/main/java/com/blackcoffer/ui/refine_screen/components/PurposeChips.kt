package com.blackcoffer.ui.refine_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import com.blackcoffer.ui.theme.LocalSpacing
import com.blackcoffer.ui.theme.Tiber


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun PurposeChips() {
    val list = listOf(
        "Coffee",
        "Business",
        "Hobbies",
        "Friendship",
        "Movies",
        "Dinning",
        "Dating",
        "Matrimony"
    )


    FlowRow(horizontalArrangement = Arrangement.spacedBy(LocalSpacing.current.small)) {
        list.forEach { label ->
            PurposeChip(text = label)
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PurposeChip(text: String) {
    var enabled by remember { mutableStateOf(false) }

    Chip(
        onClick = { enabled = !enabled },
        colors = ChipDefaults.chipColors(
            backgroundColor = if (enabled) Color.Tiber else Color.Gray.copy(alpha = .1F),
            contentColor = if (enabled) Color.White else Color.Tiber,
        )
    ) {
        Text(text = text, style = MaterialTheme.typography.labelMedium)
    }
}