package com.adapnxt.WeatherSync.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {

    @JsonProperty("main")
    private MainConditions mainConditions;

    @JsonProperty("weather")
    private WeatherDetails[] weatherDetails;

    public MainConditions getMainConditions() {
        return mainConditions;
    }

    public WeatherDetails[] getWeatherDetails() {
        return weatherDetails;
    }

    public static class MainConditions {
        private double temp;
        private double pressure;
        private double humidity;

        public double getTemp() {
            return temp;
        }
        public void setTemp(double temp) {
            this.temp = temp;
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
    }

    public static class WeatherDetails {
        private String description;

        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
    }
}
