package com.example.mjrecipes.data

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State

/**

ViewModel for the recipe.

 **/

class RecipeViewModel : ViewModel() {

    private val _selectedRecipe = mutableStateOf<Recipe?>(null)
    val selectedRecipe: State<Recipe?> = _selectedRecipe

    fun setSelectedRecipe(recipe: Recipe){
        _selectedRecipe.value = recipe
    }
}