package com.MohamadHammoura.weatherapp;

import java.util.List;
import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherService weatherService = new WeatherService();
        WeatherParser weatherParser = new WeatherParser();
        WeatherAnalyzer weatherAnalyzer = new WeatherAnalyzer();

        //  Get city from user
        System.out.print("Enter city name: ");
        String city = scanner.nextLine();

        //  Fetch weather data
        String jsonData = weatherService.getWeatherData(city);
        if (jsonData != null) {
            List<DayForecast> forecasts = weatherParser.parseWeatherData(jsonData);

            //  Display all forecasts
            System.out.println("\n--- Full Weather Forecast ---");
            forecasts.forEach(System.out::println);

            //  Ask user for temperature threshold
            System.out.print("\nEnter a temperature threshold to filter hot days (°F): ");
            double threshold = scanner.nextDouble();

            //  Filter and display hot days
            List<DayForecast> hotDays = weatherAnalyzer.filterHotDays(forecasts, threshold);
            System.out.println("\n--- Days hotter than " + threshold + "°F ---");
            if (hotDays.isEmpty()) {
                System.out.println("No days found above " + threshold + "°F.");
            } else {
                hotDays.forEach(System.out::println);
            }

            //  Calculate and display average temperature
          //  double avgTemp = weatherAnalyzer.calculateAverageTemperature(forecasts);
           // System.out.printf("\nAverage temperature over period: %.2f°F\n", avgTemp);

        } else {
            System.out.println("Failed to fetch weather data. Please check the city name or API key.");
        }
    }
}
