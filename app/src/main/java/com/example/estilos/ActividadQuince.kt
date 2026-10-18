package com.example.estilos

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class ActividadQuince : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_quince)

        val viewPager = findViewById<ViewPager2>(R.id.viewPagerVertical)

        // Definir una lista de colores diferentes para cada página
        val colors = listOf(
            Color.parseColor("#D32F2F"), // Rojo
            Color.parseColor("#388E3C"), // Verde
            Color.parseColor("#1976D2"), // Azul
            Color.parseColor("#F57C00")  // Naranja
        )

        val titles = listOf("Página 1", "Página 2", "Página 3", "Página 4")

        // Asignar el adaptador
        viewPager.adapter = ViewPagerAdapter(colors, titles)

        // Configurar la orientación del ViewPager2 en modo vertical[cite: 15]
        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
    }
}