package com.example.WeatherDashboard.Weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping()
    public Weather getCurrentWeather() {
        return weatherService.getCurrentWeather(59.437, 24.754, "");
    }
}
