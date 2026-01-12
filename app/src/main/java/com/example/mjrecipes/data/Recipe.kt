package com.example.mjrecipes.data

data class Recipe(
    val id: Int,
    val name: String,
    val ingredients: List<String>,
    val instructions: String
    )