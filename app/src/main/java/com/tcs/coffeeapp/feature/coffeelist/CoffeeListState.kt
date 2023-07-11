package com.tcs.coffeeapp.feature.coffeelist

import com.tcs.coffeeapp.data.model.Coffee
import com.tcs.coffeeapp.feature.base.IViewState

/**
 *  @param isLoading - showing progress bar and making it as default status as false.
 *  @param coffees - populating list of coffees.
 *  @param error - maintaining error message.
 */
data class CoffeeListState(
    val isLoading: Boolean = false,
    val coffees: List<Coffee>? = emptyList(),
    val error: String = ""
): IViewState
