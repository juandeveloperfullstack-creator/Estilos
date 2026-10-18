package com.example.estilos

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActividadDoce : AppCompatActivity() {

    private lateinit var textScreen: TextView
    private var currentInput = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_doce)

        textScreen = findViewById(R.id.textScreen)

        // Lista de botones numéricos y operadores
        val buttons = listOf(
            R.id.btn0 to "0", R.id.btn1 to "1", R.id.btn2 to "2",
            R.id.btn3 to "3", R.id.btn4 to "4", R.id.btn5 to "5",
            R.id.btn6 to "6", R.id.btn7 to "7", R.id.btn8 to "8",
            R.id.btn9 to "9", R.id.btnPlus to "+", R.id.btnMin to "-",
            R.id.btnMul to "*", R.id.btnDiv to "/"
        )

        // Asignar evento click a cada botón de número/operador
        for ((id, value) in buttons) {
            findViewById<Button>(id).setOnClickListener {
                if (currentInput == "0") currentInput = ""
                currentInput += value
                textScreen.text = currentInput
            }
        }

        // Botón Limpiar (C)
        findViewById<Button>(R.id.btnClear).setOnClickListener {
            currentInput = ""
            textScreen.text = "0"
        }

        // Botón Igual (=) para evaluar la operación
        findViewById<Button>(R.id.btnEqual).setOnClickListener {
            try {
                val result = evaluateExpression(currentInput)
                textScreen.text = result.toString()
                currentInput = result.toString()
            } catch (e: Exception) {
                textScreen.text = "Error"
                currentInput = ""
            }
        }
    }

    // Función sencilla para evaluar operaciones básicas de dos operandos o secuenciales
    private fun evaluateExpression(expression: String): Double {
        // Buscamos operadores básicos (+, -, *, /)
        val operators = listOf('+', '-', '*', '/')
        for (op in operators) {
            val index = expression.lastIndexOf(op)
            if (index > 0) {
                val num1 = expression.substring(0, index).toDouble()
                val num2 = expression.substring(index + 1).toDouble()
                return when (op) {
                    '+' -> num1 + num2
                    '-' -> num1 - num2
                    '*' -> num1 * num2
                    '/' -> if (num2 != 0.0) num1 / num2 else throw IllegalArgumentException()
                    else -> 0.0
                }
            }
        }
        return expression.toDouble()
    }
}