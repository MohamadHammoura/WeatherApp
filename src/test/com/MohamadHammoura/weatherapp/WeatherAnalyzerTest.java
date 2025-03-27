package com.MohamadHammoura.weatherapp;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WeatherAnalyzerTest {

    @Test
    public void testFilterHotDays() {
        WeatherAnalyzer analyzer = new WeatherAnalyzer();

        DayForecast day1 = new DayForecast();
        day1.setTempMax(70.0);

        DayForecast day2 = new DayForecast();
        day2.setTempMax(85.0);

        DayForecast day3 = new DayForecast();
        day3.setTempMax(90.0);

        List<DayForecast> input = List.of(day1, day2, day3);

        List<DayForecast> result = analyzer.filterHotDays(input, 80.0);

        assertEquals(2, result.size());
        assertTrue(result.contains(day2));
        assertTrue(result.contains(day3));
        assertFalse(result.contains(day1));
    }

    @Test
    public void testCalculateAverageTemperature() {
        WeatherAnalyzer analyzer = new WeatherAnalyzer();

        DayForecast day1 = new DayForecast();
        day1.setTempMax(60.0);

        DayForecast day2 = new DayForecast();
        day2.setTempMax(80.0);

        DayForecast day3 = new DayForecast();
        day3.setTempMax(100.0);

        List<DayForecast> input = List.of(day1, day2, day3);

        double avg = analyzer.calculateAverageTemperature(input);

        assertEquals(80.0, avg, 0.001);  // expected average: (60+80+100)/3
    }

    @Test
    public void testCalculateAverageTemperature_EmptyList() {
        WeatherAnalyzer analyzer = new WeatherAnalyzer();

        List<DayForecast> input = List.of();

        double avg = analyzer.calculateAverageTemperature(input);

        assertEquals(0.0, avg);
    }
}
