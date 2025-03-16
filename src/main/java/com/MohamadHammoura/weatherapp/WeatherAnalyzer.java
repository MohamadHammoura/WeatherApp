package com.MohamadHammoura.weatherapp;

import java.util.List;
import java.util.stream.Collectors;

public class WeatherAnalyzer {

    // Method to filter hot days above a given threshold
    public List<DayForecast> filterHotDays(List<DayForecast> forecasts, double threshold) {
        return forecasts.stream()
                .filter(day -> day.getTemp() > threshold)
                .collect(Collectors.toList());
    }

    // Method to calculate the average temperature
    public double calculateAverageTemperature(List<DayForecast> forecasts) {
        return forecasts.stream()
                .mapToDouble(DayForecast::getTemp)
                .average()
                .orElse(0.0); // Return 0.0 if the list is empty
    }
}
