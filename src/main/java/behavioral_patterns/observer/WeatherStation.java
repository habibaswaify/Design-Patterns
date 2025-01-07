package behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.List;
// Concrete Subject
public class WeatherStation implements WeatherSubject{
    private List<DisplayDevice> devices = new ArrayList<>();
    private float humidity;
    private float temperature;

    @Override
    public void registerObserver(DisplayDevice device) {
        devices.add(device);
    }

    @Override
    public void removeObserver(DisplayDevice device) {
        devices.remove(device);
    }

    @Override
    public void notifyObservers() {
        for(DisplayDevice device: devices){
            device.update(temperature,humidity);
        }

    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }
    public void setWeatherData(float humidity, float temperature){
        this.humidity = humidity;
        this.temperature = temperature;
        notifyObservers();
    }
}
