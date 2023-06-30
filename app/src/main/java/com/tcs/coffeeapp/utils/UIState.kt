package com.tcs.coffeeapp.utils

sealed class UIState<T> {
    class Loading<T> : UIState<T>()
    data class Failure<T>(val message: String) : UIState<T>()
    data class Success<T>(val data: T) : UIState<T>()
}
