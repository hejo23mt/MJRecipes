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
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mjrecipes.data.Recipe
import com.example.mjrecipes.data.RecipeViewModel
import com.example.mjrecipes.ui.MainPage
import com.example.mjrecipes.ui.RecipeExamples
import com.example.mjrecipes.ui.RecipePage
import com.example.mjrecipes.ui.RecipePageShow
import com.example.mjrecipes.ui.theme.MJRecipesTheme

/**

MainActivity that handles the NavController.

 **/

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MJRecipesTheme {
                val navController = rememberNavController()
                val viewModel: RecipeViewModel = viewModel()

                NavHost( navController = navController, startDestination = "RecipeOverviewPage"){
                    composable ( "RecipeOverviewPage" ) {
                        MainPage(onRecipeClicked = { recipe ->
                            viewModel.setSelectedRecipe(recipe)
                            navController.navigate("RecipeView")
                        }, onRecipeExampleClicked = {
                            navController.navigate("RecipeExample")
                        }
                        )
                    }
                    composable (route = "RecipeView"){
                        RecipePageShow(onBackButtonClicked = { navController.navigateUp() },
                            recipe = viewModel.selectedRecipe.value
                            )
                    }
                    composable (route = "RecipeExample"){
                        RecipeExamples(onBackButtonClicked = { navController.navigate("RecipeOverviewPage") })
                    }
                }
            }
        }
    }
}