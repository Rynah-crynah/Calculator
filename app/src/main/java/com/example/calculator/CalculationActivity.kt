package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculationActivity : AppCompatActivity() {
    lateinit var etFirstNum: EditText
    lateinit var etSecondNum: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var tvResults: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculation)

        etFirstNum = findViewById(R.id.etFirstNum)
        etSecondNum = findViewById(R.id.etSecondNum)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnmultiply)
        btnModulus = findViewById(R.id.btnModulus)
        tvResults = findViewById(R.id.tvResult)


        etFirstNum.setOnClickListener {
            tvResults.text = ""
            val fisrNumber = etFirstNum.text.toString()
            if (fisrNumber.isBlank()) {
                etFirstNum.setError("First Number is required")
                return@setOnClickListener
            }
        }
        etSecondNum.setOnClickListener {
            tvResults.text = ""
            val secondNumber = etSecondNum.text.toString()
            if (secondNumber.isBlank()) {
                etFirstNum.setError("First Number is required")
                return@setOnClickListener
            }

        }
        btnAdd.setOnClickListener {
            tvResults.text = ""
            val numberOne = etFirstNum.text.toString()
            val numberTwo = etSecondNum.text.toString()
            if (numberOne.isBlank()) {
                etFirstNum.setError("First Number is required")
                return@setOnClickListener
            }
            if (numberTwo.isBlank()) {
                etSecondNum.setError("Second number is required")
                return@setOnClickListener
            }
            addition(numberOne.toInt(), numberTwo.toInt())
        }
        btnSubtract.setOnClickListener {
            tvResults.text = ""
            val numberOne = etFirstNum.text.toString()
            val numberTwo = etSecondNum.text.toString()
            if (numberOne.isBlank()) {
                etFirstNum.setError("First Number is required")
                return@setOnClickListener
            }
            if (numberTwo.isBlank()) {
                etSecondNum.setError("Second number is required")
                return@setOnClickListener
            }
            subtraction(numberOne.toInt(), numberTwo.toInt())
        }

        btnMultiply.setOnClickListener {
            tvResults.text = ""
            val numberOne = etFirstNum.text.toString()
            val numberTwo = etSecondNum.text.toString()
            if (numberOne.isBlank()) {
                etFirstNum.setError("First Number is required")
                return@setOnClickListener
            }
            if (numberTwo.isBlank()) {
                etSecondNum.setError("Second number is required")
                return@setOnClickListener
            }
            multiplication(numberOne.toInt(), numberTwo.toInt())

        }
        btnModulus.setOnClickListener {
            tvResults.text = ""
            val numberOne = etFirstNum.text.toString()
            val numberTwo = etSecondNum.text.toString()
            if (numberOne.isBlank()) {
                etFirstNum.setError("First Number is required")
                return@setOnClickListener
            }
            if (numberTwo.isBlank()) {
                etSecondNum.setError("Second number is required")
                return@setOnClickListener
            }
            modulus(numberOne.toInt(), numberTwo.toInt())

        }
    }

    fun addition(firstNumber: Int, secondNumber: Int) {
        var add = firstNumber + secondNumber
        tvResults.text = add.toString()
    }

    fun subtraction(firstNumber: Int, secondNumber: Int) {
        var subtract = firstNumber - secondNumber
        tvResults.text = subtract.toString()
    }

    fun multiplication(firstNumber: Int, secondNumber: Int) {
        var multiply = firstNumber * secondNumber
        tvResults.text = multiply.toString()
    }

    fun modulus(firstNumber: Int, secondNumber: Int) {
        var mod = firstNumber % secondNumber
        tvResults.text = mod.toString()
    }
}
