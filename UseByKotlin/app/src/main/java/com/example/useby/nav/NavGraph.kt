package com.example.useby.nav

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.useby.ui.screens.*

object Routes {
    const val HOME = "home"
    const val ADD = "add"
    const val ARCHIVE = "archive"
    const val SETTINGS = "settings"
}

@Composable
fun UseByNavHost(nav: NavHostController, padding: PaddingValues) {
    NavHost(navController = nav, startDestination = Routes.HOME) {
        composable(Routes.HOME) { HomeScreen(onAdd = { nav.navigate(Routes.ADD) }, onSettings = { nav.navigate(Routes.SETTINGS) }, onArchive = { nav.navigate(Routes.ARCHIVE) }) }
        composable(Routes.ADD) { AddItemScreen(onDone = { nav.popBackStack() }) }
        composable(Routes.ARCHIVE) { ArchiveScreen() }
        composable(Routes.SETTINGS) { SettingsScreen() }
    }
}
