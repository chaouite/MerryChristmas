import greenfoot.*; 

/**
 * The parent
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Parent extends Actor
{
    public void act() 
    {
        touchParent();
    } 

    /**
     * When santa touch parents --> Game Over
     */
    public void touchParent(){
        if (isTouching(Santa.class)){
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth()/2,getWorld().getHeight()/2 );
            Greenfoot.playSound("Game-over.wav"); 
            Greenfoot.stop();
        }
    }      
}
