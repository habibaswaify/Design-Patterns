package structural_patterns.bridge;

public class RemoteControl extends AbstractRemoteControl{
    public RemoteControl(IDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
    device.turnOff();
    }

    @Override
    public void setVolume(int level) {
        device.setVolume(level);

    }
}
