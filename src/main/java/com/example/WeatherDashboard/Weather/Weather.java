package com.example.WeatherDashboard.Weather;

public class Weather {
    private double temperature;
    private double feels_like;
    private double temperature_min;
    private double temperature_max;
    private double pressure;
    private double humidity;
    private double windSpeed;
    private double clouds;
    private double rain;
    private double snow;
    private String country;
    private String sunrise;
    private String sunset;
    private String cityName;
    private String condition;

    public Weather(String cityName, double temperature,
                   double feels_like, double temperature_min,
                   double temperature_max, double pressure,
                   double humidity, double windSpeed,
                   double rain, double snow,
                   double clouds, String country,
                   String sunrise, String sunset,
                   String condition) {
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public double getTemperature_min() {
        return temperature_min;
    }

    public void setTemperature_min(double temperature_min) {
        this.temperature_min = temperature_min;
    }

    public double getTemperature_max() {
        return temperature_max;
    }

    public void setTemperature_max(double temperature_max) {
        this.temperature_max = temperature_max;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public double getSnow() {
        return snow;
    }

    public void setSnow(double snow) {
        this.snow = snow;
    }

    public double getClouds() {
        return clouds;
    }

    public void setClouds(double clouds) {
        this.clouds = clouds;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}