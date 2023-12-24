package com.blackcoffer.ui.refine_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.blackcoffer.R
import com.blackcoffer.ui.refine_screen.components.AvailabilityDropDown
import com.blackcoffer.ui.refine_screen.components.DistanceSlider
import com.blackcoffer.ui.refine_screen.components.PurposeChips
import com.blackcoffer.ui.refine_screen.components.StatusTextField
import com.blackcoffer.ui.theme.LocalSpacing
import com.blackcoffer.ui.theme.Tiber


@Composable
fun RefineScreen(onSave: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.medium),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeadingText(strId = R.string.select_availability)
        AvailabilityDropDown(modifier = Modifier.padding(top = LocalSpacing.current.small))
        Spacer(modifier = Modifier.height(LocalSpacing.current.medium))
        HeadingText(strId = R.string.add_your_status)
        StatusTextField()
        HeadingText(strId = R.string.select_distance)
        DistanceSlider()
        HeadingText(strId = R.string.select_purpose)
        PurposeChips()
        Button(
            modifier = Modifier
                .fillMaxWidth(.55f)
                .padding(top = LocalSpacing.current.small),
            onClick = onSave,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Tiber,
                contentColor = Color.White
            )
        ) {
            Text(
                text = stringResource(id = R.string.save_and_explore),
                style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold)
            )
        }
    }
}

@Composable
fun HeadingText(strId: Int) {
    Text(
        text = stringResource(strId),
        color = Color.Tiber,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = LocalSpacing.current.small),
        style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold)
    )
}