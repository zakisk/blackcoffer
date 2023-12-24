package com.blackcoffer.ui.refine_screen.components

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.blackcoffer.ui.theme.LocalSpacing
import com.blackcoffer.ui.theme.Tiber

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun StatusTextField() {
    var text by remember { mutableStateOf("Hi community! I am open to new connections \"\uD83D\uDE00\"") }
    var hasFocus by remember { mutableStateOf(false) }
    val keyboardController = LocalSoftwareKeyboardController.current
    BackHandler(enabled = hasFocus) { keyboardController?.hide() }

    OutlinedTextField(
        modifier = Modifier
            .padding(top = LocalSpacing.current.small)
            .fillMaxWidth()
            .height(120.dp)
            .onFocusChanged { hasFocus = it.hasFocus },
        value = text,
        onValueChange = { if (it.length <= 250) text = it },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = Color.Tiber,
            focusedBorderColor = Color.Tiber,
            unfocusedBorderColor = Color.Tiber
        ),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            capitalization = KeyboardCapitalization.Sentences,
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(onDone = { keyboardController?.hide() }),
        shape = RoundedCornerShape(8.dp),
        textStyle = MaterialTheme.typography.labelMedium
    )
}

@Preview
@Composable
fun TextFieldPreview() {
    StatusTextField()
}