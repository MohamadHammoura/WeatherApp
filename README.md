# WeatherApp - Java API Integration Project

## 📋 Description

**WeatherApp** is a Java console application that integrates the **Visual Crossing Weather API** to fetch and display real-time weather forecasts. The app allows users to input any city, view daily weather data, filter hot days based on a temperature threshold, and calculate the average temperature over a forecast period.

This project was created for a **Software Engineering API Assignment** to demonstrate real-world API integration, JSON processing, and data analysis using Java.

---

## 💡 Features

1. **Fetch Real-Time Weather Data:**
   - Retrieves daily weather forecasts including temperature and humidity for the next 15 days for any city.

2. **Hot Day Filter:**
   - Users can input a temperature threshold (in °F), and the app displays only the days where the temperature exceeds that threshold.

3. **Average Temperature Calculator:**
   - Computes and displays the average temperature over the forecast period.

---

## 🔑 API Used

- **Visual Crossing Weather API**: [https://www.visualcrossing.com/weather-api](https://www.visualcrossing.com/weather-api)
- **API Key Required** (Free signup).

---

## 🚀 Setup Instructions

1. **Clone the Repository**

```bash
git clone https://github.com/MohamadHammoura/WeatherApp.git
cd weatherapp
```

2. **Open the Project in IntelliJ IDEA**

- Launch IntelliJ IDEA or another Java IDE.
- Open the `weatherapp` project folder.

3. **Add Your Visual Crossing API Key**

- API key is already set in WeatherService.java for this project.

4. **Ensure Maven Dependencies are Downloaded**

- Make sure Maven has downloaded the necessary libraries, including Gson.
- In IntelliJ, you may need to click the **Maven** tab on the right side and click **Reload**.

5. **Run the Program**

---

## 🚀 How to Run the Program

1. **Run `WeatherApp.java`.**
2. Enter a city name when prompted.
3. Enter a temperature threshold (°F) to filter hot days.
4. The program will display:
   - Full weather forecast (date, temperature, humidity).
   - Days hotter than the specified threshold.
   - Average temperature over the forecast period.

---
