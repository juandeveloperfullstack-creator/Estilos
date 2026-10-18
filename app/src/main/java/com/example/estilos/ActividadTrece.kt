package com.example.estilos

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class ActividadTrece : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_trece)

        // Referencia al ConstraintLayout principal
        val mainLayout = findViewById<ConstraintLayout>(R.id.mainLayout)

        // Referencias a los botones
        val btnRed = findViewById<Button>(R.id.btnRed)
        val btnGreen = findViewById<Button>(R.id.btnGreen)
        val btnBlue = findViewById<Button>(R.id.btnBlue)
        val btnRandom = findViewById<Button>(R.id.btnRandom)

        // Cambiar a color rojo
        btnRed.setOnClickListener {
            mainLayout.setBackgroundColor(Color.RED)
        }

        // Cambiar a color verde
        btnGreen.setOnClickListener {
            mainLayout.setBackgroundColor(Color.GREEN)
        }

        // Cambiar a color azul
        btnBlue.setOnClickListener {
            mainLayout.setBackgroundColor(Color.BLUE)
        }

        // Cambiar a un color aleatorio usando RGB
        btnRandom.setOnClickListener {
            val r = Random.nextInt(256)
            val g = Random.nextInt(256)
            val b = Random.nextInt(256)
            mainLayout.setBackgroundColor(Color.rgb(r, g, b))
        }
    }
}