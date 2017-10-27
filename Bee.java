import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(10);
        if (isCloseToRightEdge())
        {
            turn(180);
        }
        if (isAtEdge())
        {
            turn(Greenfoot.getRandomNumber(100) - 50);
        }
    }    
    public boolean isCloseToRightEdge()
    {
        return getX() > 300;
    }
}
