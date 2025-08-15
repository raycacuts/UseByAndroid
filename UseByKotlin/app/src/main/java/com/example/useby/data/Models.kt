package com.example.useby.data

import kotlinx.datetime.LocalDate

data class FoodItem(
    val id: String,
    val name: String,
    val category: String?,
    val addedDate: LocalDate,
    val expiryDate: LocalDate?,
    val archived: Boolean = false
)
