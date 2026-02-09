package com.example.mjrecipes.data

/**

Dataclass for recipes.

 **/

data class Recipe(
    val name: String,
    val showUpOnRandom: Boolean,
    val halfAvailable: Boolean,
    val ingredientsWhole: List<String>,
    val ingredientsHalf : List<String>,
    val instructions: String
    )