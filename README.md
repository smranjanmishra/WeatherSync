# WeatherSync

## 🌦️ Real-time Weather Fetching Application with Spring Boot

WeatherSync is a RESTful Spring Boot application designed to fetch and display real-time weather information based on city input. This project seamlessly integrates external APIs to retrieve accurate weather data from OpenWeatherMap, providing users with essential details like temperature, pressure, humidity, and weather conditions.

The project is developed to demonstrate backend API integration, clean code principles, and a robust error-handling mechanism, making it a perfect fit for learning, development, and enhancement.

## ✨ Features

- **Fetch Real-time Weather**: Input any city name and get real-time weather details, including temperature, pressure, humidity, and weather conditions.
- **Spring Boot REST API**: Developed with Spring Boot to create lightweight and robust RESTful APIs.
- **External API Integration**: Utilizes OpenWeatherMap API to fetch live weather data.
- **Error Handling**: Comprehensive error-handling to catch API failures or invalid city inputs.
- **Extensibility**: Easily extendable for adding features like multi-city support, weather forecasts, or historical data tracking.

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot**
- **Spring Framework**: For creating RESTful services.
- **OpenWeatherMap API**: External weather data provider.
- **RestTemplate**: To make HTTP requests to external APIs.
- **Maven**: For project build and dependencies.

## 🚀 Getting Started

### 1. Clone the Repository

## bash
git clone https://github.com/your-username/WeatherSync.git
cd WeatherSync

## OpenWeatherMap API Key
Head over to OpenWeatherMap and sign up.
</br>
Generate your API key.
</br>
In the src/main/resources/application.properties file, replace YOUR_API_KEY_HERE with your actual API key: 8622f6402cca2869e2d19ec58b18603a
</br>
weather.api.key=8622f6402cca2869e2d19ec58b18603a

3. Build and Run the Application
Use Maven to build the project and run it locally.

## bash
mvn clean install
mvn spring-boot:run
</br>
I have used IDE IntelliJ IDEA to run the WeatherSyncApplication.java class.

## Testing the Application

You can test the API using Postman or directly from the browser. Here’s how to use it:
</br>
Endpoint: GET /fetchWeather?place={CITY_NAME}
</br>
Example Request: http://localhost:8080/fetchWeather?place=India
</br>
Sample Postman request:
bash
GET http://localhost:8080/fetchWeather?place=India

Developed with ❤️ by Soumya Ranjan Mishra
