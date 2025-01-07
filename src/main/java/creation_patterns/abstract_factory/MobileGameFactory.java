
package creation_patterns.abstract_factory;

public class MobileGameFactory extends GameFactory{
    public MobileGameFactory() {
        super();
    }   

    @Override
    public Game createGame() {
        Game game = super.createGame();
        game.getInputHandled().setTouchHandling();
        game.getSoundHandled().setWAVHandling();
        return game;
    }
}
