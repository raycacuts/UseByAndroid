package com.example.useby

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.useby.ui.theme.UseByTheme
import com.example.useby.UseByApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UseByTheme { UseByApp() }
        }
    }
}
