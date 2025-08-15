package com.example.useby.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.useby.ui.components.AddFab
import com.example.useby.ui.components.AdBar
import com.example.useby.ui.components.FoodItemCard

@Composable
fun HomeScreen(onAdd: () -> Unit, onSettings: () -> Unit, onArchive: () -> Unit) {
    Scaffold(topBar = { TopAppBar(title = { Text("UseBy") }) }, floatingActionButton = { AddFab(onAdd) }) { padding ->
        Column(Modifier.padding(padding)) {
            AdBar()
            Spacer(Modifier.height(8.dp))
            LazyColumn(Modifier.fillMaxSize().padding(16.dp)) {
                items((1..10).map { "Item $it" }) { n ->
                    FoodItemCard(name = n, expiry = "2025-12-31")
                    Spacer(Modifier.height(8.dp))
                }
            }
        }
    }
}
