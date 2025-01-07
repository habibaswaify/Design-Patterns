package behavioral_patterns.strategy;

public class CastFireBalls implements CharacterStrategy{
    @Override 
    public void attack() {
        System.out.println("Casting fireballs");
    }
    
}
