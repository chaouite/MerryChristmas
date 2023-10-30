import greenfoot.*;  

/**
 * The dog
 * 
 *@AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Dog extends Actor
{

    public void act() 
    {      
        touchDog();
    } 

    /**
     * Collision between the dog and santa. If Santa touch the dog ---> Game Over
     */
    public void touchDog(){
        if (isTouching(Santa.class)){
            Greenfoot.playSound("Dog.wav");
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth()/2,getWorld().getHeight()/2 );
            Greenfoot.playSound("Game-over.wav"); 
            Greenfoot.stop();
        }
    }
}

