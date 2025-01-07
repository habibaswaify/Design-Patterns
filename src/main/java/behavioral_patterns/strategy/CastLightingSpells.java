package behavioral_patterns.strategy;

public class CastLightingSpells implements CharacterStrategy{
    @Override 
    public void attack() {
        System.out.println("Casting a lightning spell");
    }
    
}
