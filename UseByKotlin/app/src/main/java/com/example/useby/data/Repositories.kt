package com.example.useby.data

import kotlinx.coroutines.flow.Flow

interface ItemsRepository {
    val itemsJson: Flow<Set<String>>
    suspend fun upsertJson(json: String)
}

class ItemsRepositoryImpl(private val store: LocalStore): ItemsRepository {
    override val itemsJson: Flow<Set<String>> = store.items()
    override suspend fun upsertJson(json: String) {
        val current = itemsJson
        // For brevity: decode/encode real JSON later. Here just store set union.
        // TODO: Replace with Room or kotlinx.serialization.
        store.saveItems(setOf(json))
    }
}
