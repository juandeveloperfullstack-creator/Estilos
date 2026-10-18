package com.example.estilos

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActividadDiez : AppCompatActivity() {

    // Variable para llevar la cuenta de los clics
    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_actividad_diez)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // --- REFERENCIAS Y LÓGICA DEL CONTADOR ---
        val textViewCounter = findViewById<TextView>(R.id.textViewCounter)
        val buttonClick = findViewById<Button>(R.id.buttonClick)

        buttonClick.setOnClickListener {
            clickCount++ // Incrementa el contador en 1
            textViewCounter.text = clickCount.toString() // Actualiza el texto en pantalla
        }
    }
}