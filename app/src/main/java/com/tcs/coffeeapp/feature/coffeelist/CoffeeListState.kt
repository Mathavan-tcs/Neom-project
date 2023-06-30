package com.tcs.coffeeapp.feature.coffeelist

import com.tcs.coffeeapp.data.model.Coffee
import com.tcs.coffeeapp.feature.base.IViewState

data class CoffeeListState(
    val isLoading: Boolean = false,
    val coffees: List<Coffee>? = emptyList(),
    val error: String = ""
): IViewState
