package com.example.estilos

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActividadCatorce : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_catorce)

        val radioGroupSurvey = findViewById<RadioGroup>(R.id.radioGroupSurvey)
        val btnSubmitSurvey = findViewById<Button>(R.id.btnSubmitSurvey)

        btnSubmitSurvey.setOnClickListener {
            // Obtener el ID del RadioButton seleccionado
            val selectedId = radioGroupSurvey.checkedRadioButtonId

            if (selectedId == -1) {
                // Si no se seleccionó ninguno, mostrar mensaje de advertencia
                Toast.makeText(this, "Por favor, seleccione una opción", Toast.LENGTH_SHORT).show()
            } else {
                // Buscar el botón seleccionado y mostrar su texto en un Toast[cite: 15]
                val radioButton = findViewById<RadioButton>(selectedId)
                val selectedText = radioButton.text.toString()
                Toast.makeText(this, "Seleccionado: $selectedText", Toast.LENGTH_LONG).show()
            }
        }
    }
}