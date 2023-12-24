package com.blackcoffer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.blackcoffer.ui.app_navigation.MainScreen
import com.blackcoffer.ui.theme.App

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App {
                MainScreen()
            }
        }
    }
}