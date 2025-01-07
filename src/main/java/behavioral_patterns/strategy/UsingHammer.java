package behavioral_patterns.strategy;

public class UsingHammer implements CharacterStrategy{
    @Override 
    public void attack() {
        System.out.println("Using Hammer");
    }
    
}
