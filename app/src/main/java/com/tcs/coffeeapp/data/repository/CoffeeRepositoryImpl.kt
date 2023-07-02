package com.tcs.coffeeapp.data.repository

import com.tcs.coffeeapp.data.sources.CoffeeDataSource
import com.tcs.coffeeapp.domain.repository.CoffeeRepository
import javax.inject.Inject

class CoffeeRepositoryImpl @Inject constructor(
    private val coffeeDataSource: CoffeeDataSource,
) : CoffeeRepository {
    override suspend fun getHotCoffees() = coffeeDataSource.getHotCoffees()
}