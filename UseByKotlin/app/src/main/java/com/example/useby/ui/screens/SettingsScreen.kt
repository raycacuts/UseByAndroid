package com.example.useby.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen() {
    var premium by remember { mutableStateOf(false) }
    var scans by remember { mutableStateOf(0) }

    Scaffold(topBar = { TopAppBar(title = { Text("Settings") }) }) { padding ->
        Column(Modifier.padding(padding).padding(16.dp)) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text("Premium")
                Switch(checked = premium, onCheckedChange = { premium = it })
            }
            Spacer(Modifier.height(12.dp))
            Text("This is a placeholder settings screen.")
        }
    }
}
