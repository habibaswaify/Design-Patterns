package structural_patterns.facade;

public class LightingSystem {
    private boolean isOn = false;
    public void adjustBrightness(int level){
        if(level > 0){
            System.out.println("Adjusted brightness to: "+level);
            isOn = true;
        }
        else {
            System.out.println("The light has been turned off. ");
            isOn = false;
        }
    }

    public boolean isOn() {
        return isOn;
    }

}
