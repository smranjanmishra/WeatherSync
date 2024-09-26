package com.adapnxt.WeatherSync.Service;

import com.adapnxt.WeatherSync.Entity.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherFetchService {

    @Value("${weather.api.url}")
    private String externalWeatherApiUrl;

    @Value("${weather.api.key}")
    private String accessKey;

    public Weather retrieveWeatherByCity(String cityName) {

        String fullApiUrl = String.format(externalWeatherApiUrl, cityName, accessKey);
        RestTemplate restTemplate = new RestTemplate();

        Weather result = null;

        try {
            result = restTemplate.getForObject(fullApiUrl, Weather.class);
        }
        catch (HttpClientErrorException e) {
            System.out.println("Error fetching weather: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
        return result;
    }
}