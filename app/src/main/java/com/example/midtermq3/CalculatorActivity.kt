package com.example.midtermq3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.midtermq3.R

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val message = intent.getStringExtra("EXTRA_MESSAGE")
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        val firstNumber = findViewById<EditText>(R.id.firstNumber)
        val secondNumber = findViewById<EditText>(R.id.secondNumber)
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val resultText = findViewById<TextView>(R.id.resultText)

        buttonAdd.setOnClickListener {
            val num1 = firstNumber.text.toString().toDoubleOrNull()
            val num2 = secondNumber.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                val result = num1 + num2
                resultText.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
