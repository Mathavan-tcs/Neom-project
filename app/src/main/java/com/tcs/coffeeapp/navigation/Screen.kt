package com.tcs.coffeeapp.navigation

import com.tcs.coffeeapp.R

sealed class Screen(
    val route: String,
) {
    object HotCoffees : Screen(
        route = "hotcoffees",
    )
}
