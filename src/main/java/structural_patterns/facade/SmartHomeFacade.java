package structural_patterns.facade;

public class SmartHomeFacade {
    private LightingSystem lightingSystem;
    private SecuritySystem securitySystem;
    private TemperatureSystem temperatureSystem;

    public SmartHomeFacade() {
        lightingSystem = new LightingSystem();
        temperatureSystem = new TemperatureSystem();
        securitySystem = new SecuritySystem();
    }
    public void prepareHome(float temperature, int brightness) {
        securitySystem.armSystem();
        lightingSystem.adjustBrightness(brightness);
        temperatureSystem.setTemperature(temperature);
    }
    public void reset(){
        securitySystem.unArmSystem();
        lightingSystem.adjustBrightness(0);
        temperatureSystem.setTemperature(25);

    }
}
