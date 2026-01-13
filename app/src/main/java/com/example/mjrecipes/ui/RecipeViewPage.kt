package com.example.mjrecipes.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mjrecipes.data.Recipe

@Composable
fun RecipePage(onBackButtonClicked: () -> Unit, recipe: Recipe){
    Scaffold(
        topBar = { TopBarGreetingWithBackButton(onBackButtonClicked = onBackButtonClicked, recipe.name) }
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 4.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                LazyColumn(
                ) {
                    items(recipe.ingredientsWhole) { items ->
                        Row() {
                            Text(
                                fontSize = 20.sp,
                                style = MaterialTheme.typography.bodyLarge,
                                text = "• "
                            )
                            Text(
                                fontSize = 20.sp,
                                text = items
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.padding(10.dp))
                HorizontalDivider()
                Spacer(modifier = Modifier.padding(10.dp))
                Text(
                    fontSize = 20.sp,
                    text = recipe.instructions
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarGreetingWithBackButton(onBackButtonClicked: () -> Unit, recipeName: String){
    CenterAlignedTopAppBar(
        navigationIcon = {
            IconButton(onClick = {onBackButtonClicked}) {
                Icon(Icons.Filled.ArrowBackIosNew, contentDescription = "Back")
            }
        },
        title = {
            Text(text = recipeName)
        }
    )
}



@Composable
@Preview(showSystemUi = true)
fun RecipePageView(){
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
    RecipePage({}, recipe)
}
