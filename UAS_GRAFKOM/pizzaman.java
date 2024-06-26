import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pizzaman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pizzaman extends Actor
{
    /**
     * Act - do whatever the pizzaman wants to do. This method is called whenever
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
        pizza a = (pizza)getOneIntersectingObject(pizza.class);
        if (a!=null){
            getWorld().removeObject(a);
            play.score.add(10);
            Greenfoot.playSound("xp.mp3");
        }
        tire b = (tire)getOneIntersectingObject(tire.class);
        if (b!=null){
            getWorld().removeObject(b);
            play.health.add(-1);
            Greenfoot.playSound("fart_reverb.mp3");
        }
        brick c = (brick)getOneIntersectingObject(brick.class);
        if (c!=null){
            getWorld().removeObject(c);
            playmp2.health.add(-1);
            Greenfoot.playSound("fart_reverb.mp3");
        }
        apple d = (apple)getOneIntersectingObject(apple.class);
        if (d!=null){
            getWorld().removeObject(a);
            play.score.add(10);
            Greenfoot.playSound("xp.mp3");
        }
    }
}

