package com.example.WeatherDashboard.Weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;

    @Value("${openweather.api.key}")
    private String apiKey;

    @Autowired
    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Weather getCurrentWeather(double lat, double lon, String exclude) {
        String url = UriComponentsBuilder.fromHttpUrl("https://api.openweathermap.org/data/2.5/weather")
                .queryParam("lat", lat)
                .queryParam("lon", lon)
                .queryParam("exclude", exclude)
                .queryParam("appid", apiKey)
                .queryParam("units", "metric")
                .toUriString();

        WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);


        if (response != null) {
            double rainAmount = response.getRain() != null ? response.getRain().get_1h() : 0.0;
            double snowAmount = response.getSnow() != null ? response.getSnow().get_1h() : 0.0;

            // Creating a Weather object using the parsed data from the response
            Weather weather = new Weather(response.getName(),
                    response.getMain().getTemp(),
                    response.getMain().getFeels_like(),
                    response.getMain().getTemp_min(),
                    response.getMain().getTemp_max(),
                    response.getMain().getPressure(),
                    response.getMain().getHumidity(),
                    response.getWind().getSpeed(),
                    response.getClouds().getAll(),
                    rainAmount,
                    snowAmount,
                    response.getSys().getCountry(),
                    response.getSys().getSunrise(),
                    response.getSys().getSunset(),
                    response.getWeather().get(0).getDescription());// Weather condition description

            // Optionally, you can set the city name and other attributes if needed
            weather.setTemperature(response.getMain().getTemp());
            weather.setFeels_like(response.getMain().getFeels_like());
            weather.setTemperature_min(response.getMain().getTemp_min());
            weather.setTemperature_max(response.getMain().getTemp_max());
            weather.setPressure(response.getMain().getPressure());
            weather.setHumidity(response.getMain().getHumidity());
            weather.setWindSpeed(response.getWind().getSpeed());
            weather.setClouds(response.getClouds().getAll());
            weather.setRain(rainAmount);
            weather.setSnow(snowAmount);
            weather.setCountry(response.getSys().getCountry());
            weather.setSunrise(response.getSys().getSunrise());
            weather.setSunset(response.getSys().getSunset());
            weather.setCityName(response.getName());
            weather.setCondition(response.getWeather().getFirst().getDescription());

            return weather;
        }
        return null;
    }
}
