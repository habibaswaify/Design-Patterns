package structural_patterns.facade;

public class SecuritySystem {
    private boolean isArmed = false;
    public void armSystem(){
        if(!isArmed){
            isArmed = true;
            System.out.println("Security system has been armed.");
        }
    }
    public void unArmSystem(){
        if(isArmed){
            isArmed = false;
            System.out.println("Security system has been unarmed.");
        }
    }
}
