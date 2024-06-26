import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bucket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bucket extends Actor
{
    /**
     * Act - do whatever the bucket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
        setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("right")){
        setLocation(getX()+5, getY());
        }
        apple a = (apple)getOneIntersectingObject(apple.class);
        if (a!=null){
            getWorld().removeObject(a);
            play.score.add(10);
            Greenfoot.playSound("xp.mp3");
        }
        brick b = (brick)getOneIntersectingObject(brick.class);
        if (b!=null){
            getWorld().removeObject(b);
            playmp2.health.add(-1);
            Greenfoot.playSound("fart_reverb.mp3");
        }
        
    }
}

