
package creation_patterns.abstract_factory;

public class ConsoleGameFactory extends GameFactory{
    public ConsoleGameFactory(){
        super();
    }   

    @Override
    public Game createGame() {
        Game game = super.createGame();
        game.getInputHandled().setConsoleHandling();
        game.getSoundHandled().setOGGHandling();
        return game;
    }
}
