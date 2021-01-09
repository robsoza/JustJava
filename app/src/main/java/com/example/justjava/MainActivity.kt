package com.example.justjava

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.justjava.databinding.ActivityMainBinding
import java.text.NumberFormat


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.orderButton.setOnClickListener { submitOrder() }

    }

    private fun submitOrder() {
        val numberOfCoffee = 2;
        display(numberOfCoffee)
        displayPrice(numberOfCoffee * 5)
    }

    private fun display(number: Int) {
        binding.quantityTextView.setText("" + number);
    }

    private fun displayPrice(number: Int){
        binding.priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}