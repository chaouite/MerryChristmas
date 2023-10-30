import greenfoot.*; 
/**
 * The bell
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Bell extends Actor
{

    public void act() 
    {
        kling();
    } 

    /**
     * If santa touch without having the cotton--> the bell klings, Game Over
     */
    public void kling(){

        SecondLevel scnd;
        scnd = (SecondLevel)getWorld();
        Cotton cotton = scnd.getCotton();
        if (isTouching(Santa.class) && cotton.ifCottenToken() == false){
            Greenfoot.playSound("Bell.wav");
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth()/2,getWorld().getHeight()/2 );
            Greenfoot.playSound("Game-over.wav"); 
            Greenfoot.stop();

        }
    }

}
