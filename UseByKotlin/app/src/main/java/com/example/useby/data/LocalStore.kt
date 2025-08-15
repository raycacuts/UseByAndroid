package com.example.useby.data

import android.content.Context
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringSetPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

val Context.dataStore by preferencesDataStore("useby_prefs")

class LocalStore(private val context: Context) {
    private object Keys {
        val ITEMS = stringSetPreferencesKey("items_json")
        val MONTHLY_SCANS = intPreferencesKey("monthly_scans")
    }

    suspend fun saveItems(jsonSet: Set<String>) {
        context.dataStore.edit { it[Keys.ITEMS] = jsonSet }
    }

    fun items(): Flow<Set<String>> = context.dataStore.data.map { it[Keys.ITEMS] ?: emptySet() }

    suspend fun setMonthlyScans(v: Int) { context.dataStore.edit { it[Keys.MONTHLY_SCANS] = v } }
    fun monthlyScans(): Flow<Int> = context.dataStore.data.map { it[Keys.MONTHLY_SCANS] ?: 0 }
}
