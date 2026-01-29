package com.example.mjrecipes.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mjrecipes.data.RecipeExampleData
import kotlinx.coroutines.launch

/**

Page with the recipe example and random button.

 **/

/** Composable for the paige **/
@Composable
fun RecipeExamples(
    onBackButtonClicked: () -> Unit
){
    val examples = RecipeExampleData.ExampleList
    var highlightedIndex by remember { mutableStateOf<Int?>(null) }
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        topBar = {TopBarExamplesWithBackButton ( onBackButtonClicked = onBackButtonClicked )},
        bottomBar = {
            BottomBarExamples(onRandomClick = {
                if (examples.isNotEmpty()) {
                    val randomRecipe = examples.indices.random()

                    if (randomRecipe != -1) {
                        highlightedIndex = randomRecipe
                        coroutineScope.launch {
                            listState.animateScrollToItem(randomRecipe)
                        }
                    }
                }
            }
            )
        }
    ) {innerPadding ->
        Surface(
            modifier = Modifier.padding(innerPadding)
        ) {
            LazyColumn(
                state = listState,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 8.dp)
            ) {
                items(examples.size) { index ->
                    val example = examples[index]
                    val isHighlighted = index == highlightedIndex
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp)
                            .background(
                            color = if (isHighlighted) {
                                MaterialTheme.colorScheme.primaryContainer
                            } else {
                                MaterialTheme.colorScheme.surface
                            }
                        ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            fontSize = 20.sp,
                            text = example
                        )
                    }
                }
            }
        }
    }
}

/** Composable for the topbar **/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarExamplesWithBackButton(onBackButtonClicked: () -> Unit){
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
                text = "Förslagslista"
            )
        }
    )
}

/** Composable for the bottombar (displays random button) **/
@Composable
fun BottomBarExamples(onRandomClick: () -> Unit){
    BottomAppBar(
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.surface
    ){
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            RandomRecipeButtonExamples (onRandomClick = onRandomClick)
        }
    }
}

/** Composable for the random button **/
@Composable
fun RandomRecipeButtonExamples(onRandomClick: () -> Unit){
    OutlinedButton(
        onClick = onRandomClick
    )
    { Text(text ="Random exempel") }
}

/** Composable to preview the page **/
@Composable
@Preview(showSystemUi = true)
fun RecipeExamplesView(){
    RecipeExamples { {} }
}