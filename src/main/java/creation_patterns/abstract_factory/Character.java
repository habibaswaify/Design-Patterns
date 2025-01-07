package creation_patterns.abstract_factory;

public abstract class Character implements CharacterGraphics{
    private int health;

    public Character(int health) {
        this.health = health;
    }
    
    @Override
    public void setCharacterHealth(int health) {
        this.health = health;
    }

    @Override
    public int getCharacterHealth() {
        return health;
    }

    @Override
    public void drawCharacter() {
        System.out.println("   O   ");
        System.out.println("  /|\\  ");
        System.out.println("  / \\  ");
        
    }
    
    
}
