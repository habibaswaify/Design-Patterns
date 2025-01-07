package creation_patterns.abstract_factory;

public class Main {
    public static void main(String[] args) {
        // Create a factory for creating PC games
        PCGameFactory pcGameFactory = new PCGameFactory();

        // Use the factory to create a PC game
        Game pcGame = pcGameFactory.createGame();

        // Display how input is handled in the PC game
        System.out.println(pcGame.getInputHandled().getInputHandling());

        // Display how sound is handled in the PC game
        System.out.println(pcGame.getSoundHandled().getSoundHandling());

        // Create a factory for creating Mobile games
        MobileGameFactory mobileGameFactory = new MobileGameFactory();

        // Use the factory to create a mobile game
        Game mobileGame = mobileGameFactory.createGame();

        // Display how input is handled in the mobile game
        System.out.println(mobileGame.getInputHandled().getInputHandling());

        // Display how sound is handled in the mobile game
        System.out.println(mobileGame.getSoundHandled().getSoundHandling());

        // Create a player for the mobile game with the name "Player1"
        mobileGame.createPlayer("Player1");

        // Draw the character for the created player
        mobileGame.getPlayer().drawCharacter();
    }
}
