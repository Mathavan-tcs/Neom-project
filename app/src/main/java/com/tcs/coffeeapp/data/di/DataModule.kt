package com.tcs.coffeeapp.data.di

import com.tcs.coffeeapp.data.api.CoffeeService
import com.tcs.coffeeapp.data.repository.CoffeeRepositoryImpl
import com.tcs.coffeeapp.data.sources.CoffeeDataSource
import com.tcs.coffeeapp.data.sources.CoffeeDataSourceImpl
import com.tcs.coffeeapp.domain.repository.CoffeeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DataModule {

    @Provides
    fun provideCoffeeDataSource(coffeeService: CoffeeService): CoffeeDataSource =
        CoffeeDataSourceImpl(coffeeService)

    @Provides
    fun provideCoffeeRepository(coffeeDataSource: CoffeeDataSource): CoffeeRepository =
        CoffeeRepositoryImpl(coffeeDataSource)
}