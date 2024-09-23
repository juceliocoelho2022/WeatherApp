package com.juceliodev.weatherapp

import android.os.Bundle
import com.juceliodev.weatherapp.ui.screen.WeatherScreen
import com.juceliodev.weatherapp.ui.theme.WeatherAppTheme
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeatherAppTheme {
               WeatherScreen()
            }
        }
    }
}
