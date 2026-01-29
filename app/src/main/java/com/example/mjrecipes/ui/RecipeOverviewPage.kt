package com.example.mjrecipes.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DismissibleDrawerSheet
import androidx.compose.material3.DismissibleNavigationDrawer
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mjrecipes.data.Recipe
import com.example.mjrecipes.data.RecipeData
import kotlinx.coroutines.launch

/**

Main screen that lists the recipes.

 **/


/** Main composable with all recipes and random button **/
@Composable
fun MainPage(onRecipeClicked: (Recipe) -> Unit, onRecipeExampleClicked: () -> Unit){
    val allRecipes = RecipeData.allRecipes
    val allRandomRecipes = allRecipes.filter { it.showUpOnRandom }
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    var highlightedIndex by remember { mutableStateOf<Int?>(null) }
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()


    DismissibleNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            DismissibleDrawerSheet(drawerState) {
                NavigationDrawerItem(
                    icon = { Icon(Icons.AutoMirrored.Filled.ArrowForwardIos, contentDescription = null)},
                    label = { Text(text = "")},
                    selected = false,
                    onClick = {
                        scope.launch { drawerState.close() }
                    }
                )
                Column (
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    CardInDrawer("Förslagslista", onRecipeExampleClicked )
                    CardInDrawer("Mer snart...", {})
                }
            }
        },
        content = {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                topBar = { TopBarGreeting() },
                bottomBar = {
                    BottomBar (onRandomClick = {
                        if (allRandomRecipes.isNotEmpty()) {
                            val randomRecipe = allRandomRecipes.random()
                            val indexInAllRecipes = allRecipes.indexOfFirst { it.id == randomRecipe.id }

                            if (indexInAllRecipes != -1) {
                                highlightedIndex = indexInAllRecipes
                                coroutineScope.launch {
                                    listState.animateScrollToItem(indexInAllRecipes)
                                }
                            }
                        }
                    }
                    )
                }
            ) { innerPadding ->
                LazyColumn(
                    state = listState,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 2.dp),
                    contentPadding = innerPadding
                ) {
                    items(allRecipes.size) { index ->
                        val recipe = allRecipes[index]
                        val isHighlighted = index == highlightedIndex

                        Card(
                            onClick = {
                                highlightedIndex = null
                                onRecipeClicked(recipe)
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(60.dp)
                                .padding(2.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = if (isHighlighted) {
                                    MaterialTheme.colorScheme.primaryContainer
                                } else {
                                    MaterialTheme.colorScheme.surface
                                }
                            )
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
    )
}

/** Composable for the topbar **/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarGreeting(){
    CenterAlignedTopAppBar(
        title = {
            Text(
                modifier = Modifier.fillMaxWidth(),
                fontSize = 26.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                text = "Malin & Jonatans Recept"
            )
        }
    )
}

/** Composable with bottombar (displays random button) **/
@Composable
fun BottomBar(onRandomClick: () -> Unit){
    BottomAppBar(
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.surface
    ){
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            RandomRecipeButton(onRandomClick = onRandomClick)
        }
    }
}

/** Composable with random button **/
@Composable
fun RandomRecipeButton(onRandomClick: () -> Unit){
    OutlinedButton(
        onClick = onRandomClick
    )
    { Text(text ="Random recept") }
}

/** Composable of a clickable card with recipe title **/
@Composable
fun CardInDrawer(cardText: String, onClick: () -> Unit){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        onClick = onClick,
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                fontSize = 20.sp,
                text = cardText
            )
        }
    }
}

/** Composable that preview the page **/
@Composable
@Preview( showSystemUi = true)
fun MainPageView(){
    MainPage({}, {})
}