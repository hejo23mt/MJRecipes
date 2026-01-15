package com.example.mjrecipes.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RecipeExamples(
    onBackButtonClicked: () -> Unit
){
    val examples = listOf(
        "Test",
        "test"
    )

    Scaffold(
        topBar = {TopBarExamplesWithBackButton ( onBackButtonClicked = onBackButtonClicked )}
    ) {innerPadding ->
        Surface(
            modifier = Modifier.padding(innerPadding)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 8.dp)
            ) {
                examples.forEach { item ->
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            fontSize = 20.sp,
                            text = item
                        )
                    }
                }
            }
        }
    }
}

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

@Composable
@Preview(showSystemUi = true)
fun RecipeExamplesView(){
    RecipeExamples { {} }
}