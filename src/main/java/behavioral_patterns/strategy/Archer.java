package behavioral_patterns.strategy;

public class Archer extends Character{

    public Archer() {
        super.setCharacterStrategy(new UsingSword());
    }
    
    
}
