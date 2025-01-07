package structural_patterns.bridge;

public abstract class Device implements IDevice {
    private boolean isOn = false;
    private int volume;
    @Override
    public void turnOn() {
        isOn = true;
    }
    @Override
    public void turnOff() {
        isOn = false;
    }
    @Override
    public void setVolume(int level) {
        this.volume = level;
    }

    public int getVolume() {
        return volume;
    }

}
