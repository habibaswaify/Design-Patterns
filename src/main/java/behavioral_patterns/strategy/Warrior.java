package behavioral_patterns.strategy;

public class Warrior extends Character {

    public Warrior() {
        super.setCharacterStrategy(new UsingSword());
    }
    
    
}
