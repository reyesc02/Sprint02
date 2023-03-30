package Project02;
import Project02.World;

/**
 * The PlayGame Class. This class is responsible for running the game
 * through the PlayGame function.
 */
public class PlayGame
{
    //private Random generator;

    /**
     * The PlayGame function.
     * This creates a new world for the game and calls the war function
     * to start the game.
     */
    public PlayGame()
    {
        World earth = new World();
        earth.war();
    }


}
