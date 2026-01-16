package com.example.mjrecipes.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mjrecipes.data.Recipe
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable

@Composable
fun RecipePage(onBackButtonClicked: () -> Unit, recipe: Recipe?){
    Scaffold(
        topBar = { TopBarGreetingWithBackButton(onBackButtonClicked = onBackButtonClicked,
            recipe?.name ?: "Null"
        ) }
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 4.dp)
            ) {
                if (recipe != null){
                    var showHalf by rememberSaveable { mutableStateOf(false) }
                    if(recipe.halfAvailable) {
                        WholeOrHalfButtons(
                            { showHalf = false},
                            { showHalf = true},
                            recipe.ingredientsHalf[0])
                        Spacer(modifier = Modifier.padding(8.dp))
                    }

                    if(showHalf) {
                        recipe.ingredientsHalf.forEach { items ->
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
                    } else {
                        recipe.ingredientsWhole.forEach { items ->
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
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .verticalScroll(rememberScrollState())
                    ) {
                        Text(
                            fontSize = 20.sp,
                            text = recipe.instructions
                        )
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarGreetingWithBackButton(onBackButtonClicked: () -> Unit, recipeName: String){
    CenterAlignedTopAppBar(
        navigationIcon = {
            IconButton(onClick = onBackButtonClicked) {
                Icon(Icons.Filled.ArrowBackIosNew, contentDescription = "Back")
            }
        },
        title = {
            Text(
                fontSize = 26.sp,
                fontWeight = FontWeight.SemiBold,
                text = recipeName
            )
        }
    )
}

@Composable
fun WholeOrHalfButtons(onWholeClicked: () -> Unit, onHalfClicked: () -> Unit, halfName: String){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center
        ) {
            OutlinedButton(
                modifier = Modifier.width(150.dp),
                onClick = onWholeClicked
            )
            { Text(text ="Hel sats") }
            Spacer(modifier = Modifier.padding(horizontal = 18.dp))
            OutlinedButton(
                modifier = Modifier.width(150.dp),
                onClick = onHalfClicked
            )
            { Text(text = halfName) }
        }
    }
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
            "Hel sats",
            "140 g Bacon",
            "0,5 Gul lök",
            "4-5 dl Grädde",
            "2 msk Vetemjöl (till redning)",
            "3-4 msk Chilisås",
            "Salt",
            "Peppar"
        ),
        ingredientsHalf = listOf(
            "Tredjedels sats",
            "140 g Bacon",
            "0,5 Gul lök",
            "4-5 dl Grädde",
            "2 msk Vetemjöl (till redning)",
            "3-4 msk Chilisås",
            "Salt",
            "Peppar"),
        instructions = "Bryn hackad lök och strimlad bacon.\n" +
                "Gör redning med mjölet och lite av grädden, häll på baconet och löken.\n" +
                "Häll på resten av grädden och chilisåsen. Smaka av med salt och peppar.\n" +
                "Servera med pasta.\n",
    )
    RecipePage({}, recipe)
}
