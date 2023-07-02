package com.tcs.coffeeapp.domain.usecases

import com.google.common.truth.Truth.assertThat
import com.tcs.coffeeapp.data.model.Coffee
import com.tcs.coffeeapp.domain.repository.CoffeeRepository
import com.tcs.coffeeapp.utils.UIState
import io.mockk.coEvery
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
@MockKExtension.CheckUnnecessaryStub
class GetHotCoffeesUseCaseTest {

    @MockK
    lateinit var coffeeRepository: CoffeeRepository

    @InjectMockKs
    lateinit var getHotCoffeesUseCase: GetHotCoffeesUseCase

    private val coffeeList = mockk<List<Coffee>>(relaxed = true)

    @Test
    fun `GIVEN coffee list, WHEN transform, THEN return success UIState of coffee list`() = runTest {
        //Given
        `given list of coffee result`()

        //When
        val result = getHotCoffeesUseCase.invoke().toList()

        //Then
        assertThat(result).isEqualTo(UIState.Success(data = coffeeList))
    }

    @Test
    fun `GIVEN coffee list empty, WHEN transform, THEN return failure UIState coffee`() = runTest {
        //Given
        `given empty list of coffee result`()

        //When
        val result = getHotCoffeesUseCase.invoke().toList()

        //Then
        assertThat(result.isEmpty()).isEqualTo(coffeeList)
    }

    //region convenience
    private fun `given list of coffee result`() {
        coEvery {
            coffeeRepository.getHotCoffees()
        } returns coffeeList
    }

    private fun `given empty list of coffee result`() {
        coEvery {
            coffeeRepository.getHotCoffees(
            )
        } returns emptyList()
    }
    // endregion
}