package behavioral_patterns.observer;

public interface WeatherSubject {
    void registerObserver(DisplayDevice device);
    void removeObserver(DisplayDevice device);
    void notifyObservers();

}
