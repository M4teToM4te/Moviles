package com.example.bogotapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.bogotapp.databinding.ActivityMenuBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val ScreenSplash = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ScreenSplash.setKeepOnScreenCondition { false }


        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
        finish()
    }
}

