package behavioral_patterns.strategy;

public class Mage extends Character {

    public Mage() {
        super.setCharacterStrategy(new CastFireBalls());
    }
    
    
}
