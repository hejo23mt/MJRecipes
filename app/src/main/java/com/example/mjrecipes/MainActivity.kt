package com.example.mjrecipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mjrecipes.data.Recipe
import com.example.mjrecipes.ui.MainPage
import com.example.mjrecipes.ui.RecipePage
import com.example.mjrecipes.ui.theme.MJRecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MJRecipesTheme {
                val navController = rememberNavController()

                var activeRecipe by rememberSaveable { mutableStateOf<Recipe?>(null) }

                NavHost( navController = navController, startDestination = "RecipeOverviewPage"){
                    composable ( "RecipeOverviewPage" ) {
                        MainPage(onRecipeClicked = {recipeReturn ->
                            activeRecipe = recipeReturn
                            navController.navigate("RecipeView")
                        })
                    }
                    composable (route = "RecipeView"){
                        RecipePage(onBackButtonClicked = { navController.navigateUp() }, activeRecipe)
                    }
                }
            }
        }
    }
}