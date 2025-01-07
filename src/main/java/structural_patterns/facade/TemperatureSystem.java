package structural_patterns.facade;

public class TemperatureSystem {
    private float currentTemperature = 25;

    public void setTemperature(float temperature) {
        this.currentTemperature = temperature;
        System.out.println("Temperature has been set to: "+temperature);
    }

    public float getCurrentTemperature() {
        return currentTemperature;
    }
}
