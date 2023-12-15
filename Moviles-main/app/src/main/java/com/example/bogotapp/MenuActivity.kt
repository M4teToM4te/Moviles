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
                Sitio("Jardin botanico", "jardinb", "El Jardín Botánico de Bogotá, nombrado oficialmente Jardín Botánico José Celestino Mutis en honor al astrónomo y botánico José Celestino Mutis, es un centro de investigación, conservación y divulgación de la diversidad de las especies vegetales en Bogotá, capital de Colombia. Fundado en 1955 por el sacerdote Enrique Pérez Arbeláez."),
                Sitio("museo nacional", "museo_nal", "El Museo Nacional de Colombia opera como Unidad Administrativa Especial del Ministerio de Cultura Colombiano y la gestión de su colección permanente es realizada en conjunto con el Instituto Colombiano de Antropología e Historia (ICAHN). La colección está bajo tutela de cuatro curadurías: Arte, arqueología, etnografía e historia, que en conjunto exponen un aproximado de 2500 piezas repartidas en diecisiete salas permanentes, de las cuales quince están en funcionamiento y dos se encuentran en proceso de adecuación con fecha esperada de inauguración en el tramo final del año 2023"),
                Sitio("Museo del oro", "museo_oro", "El Museo del Oro del Banco de la República de Colombia es una institución pública la cual su fin es la adquisición, conservación y exposición de piezas de orfebrería y alfarería de culturas indígenas del periodo precolombino de la actual Colombia, cuenta con más de 30 000 piezas hechas en oro, 20 000 de objetos líticos, cerámicos, piedras y textiles pertenecientes a las culturas Quimbaya, Calima, Tairona, Zenú, Muisca, Tolima, Tumaco entre otros."),
                Sitio("Plaza de bolivar", "plazabolivar", "La plaza de Bolívar es la plaza principal de la ciudad de Bogotá y de Colombia. Está ubicada en el centro histórico de la ciudad, entre las carreras Séptima y Octava con calles Décima y Once. A su alrededor se encuentran algunos de los principales edificios de la ciudad: al norte el Palacio de Justicia, al sur el Capitolio Nacional, al oriente la Catedral Basílica Metropolitana de Bogotá y Primada de Colombia, la Casa del Cabildo Eclesiástico, la Capilla del Sagrario de Catedral Basílica Metropolitana y el Palacio Arzobispal y al occidente el Palacio Liévano, sede de la Alcaldía Mayor de Bogotá, y al suroriente el Colegio Mayor de San Bartolomé (Bogotá) de los jesuitas. Fue propuesta como Monumento Nacional de Colombia por la resolución 51 del 26 de octubre de 1994 y declarada como tal por el decreto 1802 del 19 de octubre de 1995.1\u200B")
            )
        )

    }
}