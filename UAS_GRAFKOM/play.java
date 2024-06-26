import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends World
{
    static Counter score = new Counter("score");
    static Counter health = new Counter("health");
    GreenfootSound music = new GreenfootSound("bg_sound_epep.mp3");
    /**
     * Constructor for objects of class play.
     * 
     */
    public play()
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
        pizzaman pizzaman = new pizzaman();
        addObject(pizzaman,146,570);

        addObject(score, 48, 30);
        score.setValue(0);

        addObject(health, 350, 30);
        health.setValue(5);
        start_button start_button = new start_button();
        addObject(start_button,166,247);
        start_button.setLocation(187,281);
        removeObject(start_button);
    }

    public void act(){
        if(Greenfoot.getRandomNumber(600)<1){
            addObject(new pizza(),Greenfoot.getRandomNumber(1100),1);
        }
        if(Greenfoot.getRandomNumber(1200)<1){
            addObject(new tire(),Greenfoot.getRandomNumber(1700),1);
        }
        music.play();
        if(play.health.getValue()==0){
            Greenfoot.setWorld(new game_over()); 
            music.stop();}
            
    }
}

