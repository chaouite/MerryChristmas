import greenfoot.*;  

/**
 * The child
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Child extends Actor
{

    public void act() 
    {   
        touchChild();
    } 

    /**
     * When santa touch the child --> Game Over
     */
    public void touchChild(){
        if (isTouching(Santa.class)){
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth()/2,getWorld().getHeight()/2 );
            Greenfoot.playSound("Game-over.wav"); 
            Greenfoot.stop();
        }
    }   
}
