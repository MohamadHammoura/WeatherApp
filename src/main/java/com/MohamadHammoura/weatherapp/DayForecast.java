package com.MohamadHammoura.weatherapp;

public class DayForecast {
    private String datetime;
    private double temp;
    private double humidity;

    // Getters
    public String getDatetime() { return datetime; }
    public double getTemp() { return temp; }
    public double getHumidity() { return humidity; }

    // Setters
    public void setDatetime(String datetime) { this.datetime = datetime; }
    public void setTemp(double temp) { this.temp = temp; }
    public void setHumidity(double humidity) { this.humidity = humidity; }

    @Override
    public String toString() {
        return "Date: " + datetime + ", Temp: " + temp + "°F, Humidity: " + humidity + "%";
    }
}
