package com.tcs.coffeeapp.feature

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.tcs.coffeeapp.feature.theme.CoffeeGuideTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CoffeeMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CoffeeGuideTheme {
                HomeScreen()
            }
        }
    }
}