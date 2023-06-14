package com.tcs.coffeeapp.data.api

import com.tcs.coffeeapp.data.model.Coffee
import com.tcs.coffeeapp.utils.Constants.HOT_COFFEES_ENDPOINT
import com.tcs.coffeeapp.utils.Constants.ICED_COFFEES_ENDPOINT
import retrofit2.http.GET

interface CoffeeService {

    @GET(HOT_COFFEES_ENDPOINT)
    suspend fun getHotCoffees(): List<Coffee>

    @GET(ICED_COFFEES_ENDPOINT)
    suspend fun getIcedCoffees(): List<Coffee>

}