package com.example.midtermq3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCalculator = findViewById<Button>(R.id.buttonCalculator)
        val buttonWeather = findViewById<Button>(R.id.buttonWeather)

        buttonCalculator.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Opening Calculator")
            startActivity(intent)
        }

        buttonWeather.setOnClickListener {
            val intent = Intent(this, WeatherActivity::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Opening Weather App")
            startActivity(intent)
        }
    }
}
