package com.tcs.coffeeapp.domain.usecases

import com.tcs.coffeeapp.data.model.Coffee
import com.tcs.coffeeapp.domain.repository.CoffeeRepository
import com.tcs.coffeeapp.utils.UIState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.lang.Exception
import javax.inject.Inject

class GetHotCoffeesUseCase @Inject constructor(
    private val coffeeRepository: CoffeeRepository,
) {
    operator fun invoke(): Flow<UIState<List<Coffee>>> = flow {

        try {
            emit(UIState.Loading<List<Coffee>>())
            val coffees = coffeeRepository.getHotCoffees()
            emit(UIState.Success<List<Coffee>>(coffees))
        } catch (e: Exception) {
            emit(UIState.Failure<List<Coffee>>(e.localizedMessage ?: "an error occurred, please try again later"))
        }

    }.flowOn(Dispatchers.IO)
}