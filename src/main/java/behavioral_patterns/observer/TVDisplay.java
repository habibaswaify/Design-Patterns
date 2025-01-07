package behavioral_patterns.observer;

public class TVDisplay implements DisplayDevice{
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("TV Display updated: Temperature: " + temperature + "°C, Humidity: " + humidity + "%");
    }
}
