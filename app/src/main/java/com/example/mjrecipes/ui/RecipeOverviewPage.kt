package com.example.mjrecipes.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mjrecipes.data.RecipeData

@Composable
fun MainPage(){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBarGreeting() },
        bottomBar = { BottomBar() }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 2.dp),
            contentPadding = innerPadding
        ) {
            items(RecipeData.allRecipes.size) { index ->
                val recipe = RecipeData.allRecipes[index]
                Card(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(2.dp)
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            text = recipe.name
                        )
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarGreeting(){
    TopAppBar(
        title = {
            Text(
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                text = "Malin & Jonatans Recept"
            )
        }
    )
}

@Composable
fun BottomBar(){
    BottomAppBar(
        modifier = Modifier.fillMaxWidth()
    ){
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            RandomRecipeButton()
        }
    }
}

@Composable
fun RandomRecipeButton(){
    OutlinedButton(
        onClick = {}
    )
    { Text(text ="Random recipe") }
}

@Composable
@Preview( showSystemUi = true)
fun MainPageView(){
    MainPage()
}