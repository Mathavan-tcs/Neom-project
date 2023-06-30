package com.tcs.coffeeapp.feature

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.tcs.coffeeapp.navigation.NavGraph

@Composable
fun HomeScreen() {
    val navController = rememberNavController()

    Column(
        modifier = Modifier.padding(10.dp)
    ) {
        NavGraph(navController = navController)
    }

}