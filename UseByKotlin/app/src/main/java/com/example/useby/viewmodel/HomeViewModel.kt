package com.example.useby.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.useby.data.ItemsRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class HomeViewModel(repo: ItemsRepository): ViewModel() {
    val itemsJson: StateFlow<Set<String>> = repo.itemsJson
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptySet())
}
