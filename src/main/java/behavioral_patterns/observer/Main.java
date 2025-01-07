package behavioral_patterns.observer;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Random random = new Random();

        // Create 5 random instances and register observers
        for (int i = 0; i < 5; i++) {
            int randomObserverType = random.nextInt(2) + 1; // Generates 1 or 2

            if (randomObserverType == 1) {
                PhoneDisplay phoneDisplay = new PhoneDisplay();
                weatherStation.registerObserver(phoneDisplay);
                System.out.println("Registered Phone Display.");
            } else if (randomObserverType == 2) {
                TVDisplay tvDisplay = new TVDisplay();
                weatherStation.registerObserver(tvDisplay);
                System.out.println("Registered TV Display.");
            }
        }
        System.out.println();
        // Simulating weather data change and updating observers
        weatherStation.setWeatherData(25, 65);
        System.out.println();
        weatherStation.setWeatherData(30, 55);

    }

}
