package behavioral_patterns.strategy;

public class Main {
    public static void main(String[] args) {
        // Create a warrior character
        Character warrior = new Warrior();
        System.out.println("Warrior Attacking:");
        // Perform default attack
        warrior.performAttack();

        // Dynamically change the warrior's strategy to throwing daggers
        warrior.setCharacterStrategy(new ThrowingDaggers());
        warrior.performAttack();
        System.out.println();
        // Create a mage character
        Character mage = new Mage();
        System.out.println("Mage Attacking:");
        // Perform default attack
        mage.performAttack();
        // Assign a hammer attack strategy to the mage
        mage.setCharacterStrategy(new UsingHammer());
        mage.performAttack();
    }
}
