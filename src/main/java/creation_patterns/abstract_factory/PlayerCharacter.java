package creation_patterns.abstract_factory;

public class PlayerCharacter extends Character {
    private String name;

    public PlayerCharacter(String name, int health) {
        super(health);
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void drawCharacter(){
        System.out.println(name);
        super.drawCharacter();
    }
    
}
