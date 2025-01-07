package structural_patterns.bridge;

public class Main {
    public static void main(String[] args) {
        // Create instance of TV
        Device tv = new TV(42);
        // Create instance of remote and control the TV
        RemoteControl remoteControl = new RemoteControl(tv);
        remoteControl.turnOn();
        remoteControl.setVolume(15);

        System.out.println();
        // Create instance of Radio
        Device radio = new Radio(101.1);
        // Create instance of remote and control the radio
        remoteControl = new RemoteControl(radio);
        remoteControl.turnOn();
        remoteControl.setVolume(8);
        ((Radio) radio).tuneToFrequency(91.91);
    }
}
