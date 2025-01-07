package behavioral_patterns.strategy;

public class ThrowingDaggers implements CharacterStrategy{

    @Override
    public void attack() {
        System.out.println("Throwing daggers");
    }
    
}
