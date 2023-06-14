package com.tcs.coffeeapp.domain.repository

import com.tcs.coffeeapp.data.model.Coffee

interface CoffeeRepository {
    suspend fun getHotCoffees(): List<Coffee>
}