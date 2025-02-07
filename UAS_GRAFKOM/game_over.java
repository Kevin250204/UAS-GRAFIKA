import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game_over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game_over extends World
{
    /**
     * Constructor for objects of class game_over.
     * 
     */
    public game_over()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        play_again play_again = new play_again();
        addObject(play_again,200,243);
        
        showText("Your Score: "+play.score.getValue(),200,300);
        Greenfoot.playSound("game_over.mp3");
    }

}
