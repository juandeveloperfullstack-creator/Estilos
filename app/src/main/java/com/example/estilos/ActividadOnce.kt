package com.example.estilos

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class ActividadOnce : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_once)

        // Referencias a las vistas
        val checkBoxDemo = findViewById<CheckBox>(R.id.checkBoxDemo)
        val buttonToggle = findViewById<Button>(R.id.buttonToggle)

        // Evento de clic en el botón
        buttonToggle.setOnClickListener {
            // Invertir el estado actual (si está marcado pasa a desmarcado y viceversa)
            checkBoxDemo.isChecked = !checkBoxDemo.isChecked
        }
    }
}