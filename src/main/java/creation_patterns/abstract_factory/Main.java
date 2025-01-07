
package creation_patterns.abstract_factory;

public class Main {
    public static void main(String[] args) {
        PCGameFactory pcGameFactory = new PCGameFactory();
        Game pcGame = pcGameFactory.createGame();
        System.out.println(pcGame.getInputHandled().getInputHandling());
        System.out.println(pcGame.getSoundHandled().getSoundHandling());
        MobileGameFactory mobileGameFactory = new MobileGameFactory();
        Game mobileGame = mobileGameFactory.createGame();
        System.out.println(mobileGame.getInputHandled().getInputHandling());
        System.out.println(mobileGame.getSoundHandled().getSoundHandling());
        mobileGame.createPlayer("Player1");
        mobileGame.getPlayer().drawCharacter();
    }
}
