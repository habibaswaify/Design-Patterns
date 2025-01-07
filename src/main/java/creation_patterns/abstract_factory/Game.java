/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creation_patterns.abstract_factory;

import java.util.ArrayList;

public class Game {
    private final ArrayList<Obstacle> obstacles;
    private PlayerCharacter player;
    private final ArrayList<EnemyCharacter> enemies;
    private final InputHandled inputHandled;
    private final SoundHandled soundHandled;

    public Game() {
        this.inputHandled = new InputHandled();
        this.soundHandled = new SoundHandled();
        this.obstacles = new ArrayList<>();
        this.enemies = new ArrayList<>();
    }
    
    public void createPlayer(String name){
        player = new PlayerCharacter(name, 9);
    }
    public void createEnemy(){
        enemies.add(new EnemyCharacter(5));
    }
    public void createObstacle(){
        obstacles.add(new Obstacle());
    }

    public ArrayList<Obstacle> getObstacles() {
        return obstacles;
    }

    public PlayerCharacter getPlayer() {
        return player;
    }

    public ArrayList<EnemyCharacter> getEnemies() {
        return enemies;
    }

    public InputHandled getInputHandled() {
        return inputHandled;
    }

    public SoundHandled getSoundHandled() {
        return soundHandled;
    }
    
}
