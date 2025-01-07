package structural_patterns.bridge;

public class Radio extends Device {
    private double frequency;
    public Radio(double frequency) {
        this.frequency = frequency;
    }
    public void tuneToFrequency(double frequency){
        this.frequency = frequency;
        System.out.println("Radio tuned to frequency: " + this.frequency + " MHz");
    }
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Radio is turned on.");
    }
    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Radio is turned off.");
    }
    @Override
    public void setVolume(int level) {
        super.setVolume(level);
        System.out.println("Radio volume set to: " + level);
    }
}
