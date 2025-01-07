package behavioral_patterns.strategy;

public class UsingSword implements CharacterStrategy{
    @Override
    public void attack(){
        System.out.println("Using sword");
    }
    
}
