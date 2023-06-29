package com.tcs.coffeeapp.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tcs.coffeeapp.feature.coffeelist.CoffeeListScreen
import com.tcs.coffeeapp.feature.coffeelist.HotCoffeeListViewModel

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.HotCoffees.route
    ) {
        composable(route = Screen.HotCoffees.route) {
            val viewModel: HotCoffeeListViewModel = hiltViewModel()
            CoffeeListScreen(viewModel)
        }
    }
}