package com.tcs.coffeeapp.feature.coffeelist

import androidx.lifecycle.viewModelScope
import com.tcs.coffeeapp.domain.usecases.GetHotCoffeesUseCase
import com.tcs.coffeeapp.feature.base.BaseViewModel
import com.tcs.coffeeapp.utils.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HotCoffeeListViewModel @Inject constructor(
    private val getHotCoffeesUseCase: GetHotCoffeesUseCase,
) : BaseViewModel<CoffeeListState>() {
    override fun createInitialState() = CoffeeListState(coffees = emptyList())

    init {
        getHotCoffees()
    }

    private fun getHotCoffees() {
        getHotCoffeesUseCase().onEach { result ->
            when (result) {
                is UIState.Loading -> {
                    setState(CoffeeListState(isLoading = true))
                }
                is UIState.Success -> {
                    setState(CoffeeListState(coffees = result.data ?: emptyList()))
                }
                is UIState.Failure -> {
                    setState(CoffeeListState(error = "An unexpected error occurred. Please try again later."))
                }
            }

        }.launchIn(viewModelScope)
    }
}