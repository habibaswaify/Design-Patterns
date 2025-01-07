package creation_patterns.abstract_factory;
public class EnemyCharacter extends Character {

    public EnemyCharacter(int health) {
        super(health);
    }
    
    @Override
    public void drawCharacter(){
        System.out.println("Enemy");
        super.drawCharacter();
    }
    
    
}
