package structural_patterns.bridge;

public class TV extends Device{
    private final int screenSize;

    public TV(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("TV is turned on.");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("TV is turned off.");
    }

    @Override
    public void setVolume(int level) {
        super.setVolume(level);
        System.out.println("TV volume set to: " + level);
    }

    public int getScreenSize() {
        return screenSize;
    }

}
