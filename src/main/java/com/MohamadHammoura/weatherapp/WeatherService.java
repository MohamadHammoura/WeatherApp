package com.MohamadHammoura.weatherapp;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class WeatherService {

    private final String apiKey = "8ELEKNJP76KWAQQS4JD7HY9GZ"; // Replace this with your real API key

    public String getWeatherData(String location) {
        // Encode the location to handle spaces and special characters
        String encodedLocation = URLEncoder.encode(location, StandardCharsets.UTF_8);
        String url = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/"
                + encodedLocation + "?unitGroup=us&key=" + apiKey + "&contentType=json";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return response.body(); // Successfully fetched data
            } else {
                System.out.println("API Error: " + response.statusCode());
                return null; // Error in API call
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Error in connection
        }
    }
}
