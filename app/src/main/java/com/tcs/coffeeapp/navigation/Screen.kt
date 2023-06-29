package com.tcs.coffeeapp.navigation

import com.tcs.coffeeapp.R

sealed class Screen(
    val route: String,
    val title: String,
    val icon: Int
) {
    object HotCoffees : Screen(
        route = "hotcoffees",
        title = "Hot Coffees",
        icon = R.drawable.ic_baseline_coffee_24
    )
}
