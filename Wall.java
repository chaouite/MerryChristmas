import greenfoot.*;  

/**
 * Walls between rooms
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Wall extends Actor
{
    public Wall()
    {
        getImage().scale(40,40);
    }
    
    /**
     * Rotation of the image of wall
     */
    public Wall(int n)
    {
        getImage().scale(40,40);
        setRotation(n);
    }

    public void act() 
    {
        
    }    
}