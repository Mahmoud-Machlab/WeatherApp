package de.softdeveloper.weatherapp

data class WeatherData(
    val city: String,
    val description: String,
    val icon: String,
    val temp: Double
)