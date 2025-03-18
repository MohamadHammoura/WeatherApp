package com.MohamadHammoura.weatherapp;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class WeatherParser {

    public List<DayForecast> parseWeatherData(String jsonData) {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(jsonData, JsonObject.class);
        JsonArray daysArray = jsonObject.getAsJsonArray("days");

        List<DayForecast> forecasts = new ArrayList<>();

        for (int i = 0; i < daysArray.size(); i++) {
            JsonObject day = daysArray.get(i).getAsJsonObject();

            DayForecast forecast = new DayForecast();
            forecast.setDatetime(day.get("datetime").getAsString());
            forecast.setTemp(day.get("temp").getAsDouble());      // Avg temp
            forecast.setTempMax(day.get("tempmax").getAsDouble()); // High temp
            forecast.setTempMin(day.get("tempmin").getAsDouble()); // Low temp
            forecast.setHumidity(day.get("humidity").getAsDouble());

            forecasts.add(forecast);
        }

        return forecasts;
    }

}
