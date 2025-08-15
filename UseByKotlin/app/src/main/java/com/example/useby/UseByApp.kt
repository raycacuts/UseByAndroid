package com.example.useby

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.useby.nav.UseByNavHost

@Composable
fun UseByApp() {
    val nav = rememberNavController()
    Scaffold { padding ->
        UseByNavHost(nav, padding)
    }
}
