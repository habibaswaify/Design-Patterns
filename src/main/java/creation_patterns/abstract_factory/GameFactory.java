
package creation_patterns.abstract_factory;


public abstract class GameFactory {

    public Game createGame(){
        return new Game();
    }
   
}
