package com.MohamadHammoura.weatherapp;

public class DayForecast {
    private String datetime;
    private double temp;      // Average temp (existing)
    private double tempMax;   // High temp (new)
    private double tempMin;   // Low temp (new)
    private double humidity;

    // Getters
    public String getDatetime() { return datetime; }
    public double getTemp() { return temp; }
    public double getTempMax() { return tempMax; }
    public double getTempMin() { return tempMin; }
    public double getHumidity() { return humidity; }

    // Setters
    public void setDatetime(String datetime) { this.datetime = datetime; }
    public void setTemp(double temp) { this.temp = temp; }
    public void setTempMax(double tempMax) { this.tempMax = tempMax; }
    public void setTempMin(double tempMin) { this.tempMin = tempMin; }
    public void setHumidity(double humidity) { this.humidity = humidity; }

    @Override
    public String toString() {
        return "Date: " + datetime + ", Avg Temp: " + temp + "°F, High: " + tempMax + "°F, Low: " + tempMin + "°F, Humidity: " + humidity + "%";
    }
}

