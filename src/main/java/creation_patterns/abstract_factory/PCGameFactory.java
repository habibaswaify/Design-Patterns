
package creation_patterns.abstract_factory;


public class PCGameFactory extends GameFactory{
    public PCGameFactory() {
        super();
    }   

    @Override
    public Game createGame() {
        Game game = super.createGame();
        game.getInputHandled().setKeyboardHandling();
        game.getSoundHandled().setMP3Handling();
        return game;
    }
    
}
