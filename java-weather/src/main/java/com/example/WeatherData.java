package com.example;

public class WeatherData {
    
    private String date;
    private double temperature;
    private double humidity;

    public WeatherData (String date, double temperature, double humidity) {
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getDate() {
        return date;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public boolean isHotDay() {
        if (temperature > 30) {
            return true;
        } else return false;
    }

    public boolean isHumidDay() {
        if (humidity > 70) {
            return true;
        } else return false;
    }

}