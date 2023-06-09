package com.tcs.coffeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tcs.coffeeapp.databinding.ActivityCoffeemainBinding

class CoffeeMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCoffeemainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoffeemainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}