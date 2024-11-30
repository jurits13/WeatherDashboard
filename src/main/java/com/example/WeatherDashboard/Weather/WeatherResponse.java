package com.example.WeatherDashboard.Weather;

import java.util.List;

public class WeatherResponse {
    private List<WeatherCondition> weather;
    private MainWeather main;
    private Wind wind;
    private Clouds clouds;
    private Rain rain;
    private Snow snow;
    private Sys sys;
    private String name;

    public List<WeatherCondition> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherCondition> weather) {
        this.weather = weather;
    }

    public MainWeather getMain() {
        return main;
    }

    public void setMain(MainWeather main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class MainWeather {
        private double temp; // Temperature in Kelvin (You can convert it to Celsius)
        private double feels_like;
        private double temp_min;
        private double temp_max;
        private double pressure;
        private int humidity;

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getFeels_like() {
            return feels_like;
        }

        public void setFeels_like(double feels_like) {
            this.feels_like = feels_like;
        }

        public double getTemp_min() {
            return temp_min;
        }

        public void setTemp_min(double temp_min) {
            this.temp_min = temp_min;
        }

        public double getTemp_max() {
            return temp_max;
        }

        public void setTemp_max(double temp_max) {
            this.temp_max = temp_max;
        }

        public double getPressure() {
            return pressure;
        }

        public void setPressure(double pressure) {
            this.pressure = pressure;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }
    }

    // Inner class for weather condition description
    public static class WeatherCondition {
        private String main;
        private String description;  // Weather condition description, e.g., "clear sky"

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    // Inner class for the 'wind' object in the API response
    public static class Wind {
        private double speed;  // Wind speed in m/s

        // Getter and Setter for the fields
        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }
    }

    public static class Clouds {
        private double all;

        public double getAll() {
            return all;
        }

        public void setAll(double all) {
            this.all = all;
        }
    }

    public static class Rain {
        private double _1h;

        public double get_1h() {
            return _1h;
        }

        public void set_1h(double _1h) {
            this._1h = _1h;
        }
    }

    public static class Snow {
        private double _1h;

        public double get_1h() {
            return _1h;
        }

        public void set_1h(double _1h) {
            this._1h = _1h;
        }
    }

    public static class Sys {
        private String country;
        private String sunrise;
        private String sunset;

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
    }


}