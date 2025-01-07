package structural_patterns.bridge;

public abstract class AbstractRemoteControl {
    protected IDevice device;

    public AbstractRemoteControl(IDevice device) {
        this.device = device;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setVolume(int level);
}
