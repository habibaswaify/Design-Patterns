package behavioral_patterns.strategy;


public abstract class Character {
    private CharacterStrategy characterStrategy;
    
    public void setCharacterStrategy(CharacterStrategy characterStrategy){
        this.characterStrategy = characterStrategy;
    }
    public void performAttack() {
        if (characterStrategy!= null) {
            characterStrategy.attack();
        } else {
            System.out.println("No attack strategy assigned yet!");
        }
    }
    
}
