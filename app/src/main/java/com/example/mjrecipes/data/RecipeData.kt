package com.example.mjrecipes.data

import androidx.compose.ui.platform.isDebugInspectorInfoEnabled

object RecipeData {
    val allRecipes = listOf(
        Recipe(
            id = 1,
            name = "Pannkakor",
            ingredients = listOf("3 ägg", "3dl mjöl", "6dl mjölk"),
            instructions = "Vispa ihop allt",
        ),
        Recipe(
            id = 2,
            name = "Kebab",
            ingredients = listOf("Kebab", "Ett glatt humör"),
            instructions = "ÄT"
        ),
        Recipe(
            id = 3,
            name = "Test3",
            ingredients = listOf("ingrediens1", "ingrediens2", "ingrediens3"),
            instructions = "Mix everything"
        )
    )
}