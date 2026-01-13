package com.example.mjrecipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

                val recipe = Recipe(
                    id = 1,
                    name = "Baconsås",
                    showUpOnRandom = true,
                    halfAvailable = false,
                    ingredientsWhole = listOf(
                        "140 g Bacon",
                        "0,5 Gul lök",
                        "4-5 dl Grädde",
                        "2 msk Vetemjöl (till redning)",
                        "3-4 msk Chilisås",
                        "Salt",
                        "Peppar"
                    ),
                    ingredientsHalf = listOf(),
                    instructions = "Bryn hackad lök och strimlad bacon.\n" +
                            "Gör redning med mjölet och lite av grädden, häll på baconet och löken.\n" +
                            "Häll på resten av grädden och chilisåsen. Smaka av med salt och peppar.\n" +
                            "Servera med pasta.\n",
                )

                NavHost( navController = navController, startDestination = "Mainpage"){
                    composable ( "Mainpage" ) {
                        MainPage()
                    }
                    composable (route = "RecipeView"){
                        RecipePage(onBackButtonClicked = { navController.navigateUp() }, recipe )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MJRecipesTheme {
        Greeting("Android")
    }
}