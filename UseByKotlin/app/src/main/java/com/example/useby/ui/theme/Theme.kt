package com.example.useby.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val AppColors = darkColorScheme()

@Composable
fun UseByTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = AppColors, content = content)
}
