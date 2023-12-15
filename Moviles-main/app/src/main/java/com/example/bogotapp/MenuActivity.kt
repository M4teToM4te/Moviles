package com.example.bogotapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.bogotapp.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.adapter = SitiosAdapter(
            listOf(
                Sitio("Jardin botanico", "jardinb", "El Jardín Botánico José Celestino Mutis en honor al astrónomo y botánico José Celestino Mutis, es un centro de investigación, conservación y divulgación de la diversidad de las especies vegetales en Bogotá, capital de Colombia."),
                Sitio("museo nacional", "museo_nal", "El Museo Nacional de Colombia opera como Unidad Administrativa Especial del Ministerio de Cultura Colombiano y la gestión de su colección permanente es realizada en conjunto con el Instituto Colombiano de Antropología e Historia (ICAHN). "),
                Sitio("Museo del oro", "museo_oro", "El Museo del Oro del Banco de la República de Colombia es una institución pública la cual su fin es la adquisición, conservación y exposición de piezas de orfebrería y alfarería de culturas indígenas del periodo precolombino de la actual Colombia."),
                Sitio("Plaza de bolivar", "plazabolivar", "La plaza de Bolívar es la plaza principal de la ciudad de Bogotá y de Colombia. Está ubicada en el centro histórico de la ciudad, entre las carreras Séptima y Octava con calles Décima y Once.")
            )
        )

    }
}
