package com.adapnxt.WeatherSync.Controller;

import com.adapnxt.WeatherSync.Entity.Weather;
import com.adapnxt.WeatherSync.Service.WeatherFetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityWeatherController {

    @Autowired
    private WeatherFetchService weatherFetchService;

    @GetMapping("/fetchWeather")
    public Weather fetchWeatherData(@RequestParam String place) {
        return weatherFetchService.retrieveWeatherByCity(place);
    }
}
