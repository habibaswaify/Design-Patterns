package behavioral_patterns.observer;

public class PhoneDisplay implements DisplayDevice{
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Phone Display updated: Temperature: " + temperature + "°C, Humidity: " + humidity + "%");
    }
}
