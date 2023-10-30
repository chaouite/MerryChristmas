import greenfoot.*;  

/**
 * Timer
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Timer extends Actor
{
    /**
     * Instances
     */
    private int time=4000; 

    public void act() 
    {

        if(time>0)
        {
            time--;
            setImage(new GreenfootImage("Time "+time/100,23,Color.WHITE,Color.BLACK));//30 seconds
        }
        /**
         * Time = 0 --> game over
         */
        else if (time == 0){
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth()/2,getWorld().getHeight()/2 );
            Greenfoot.playSound("Game-over.wav"); 
            Greenfoot.stop();
        }

    }   
    /**
     * Constructor
     */
    public Timer(){
        setImage(new GreenfootImage("Time "+time/100,23,Color.WHITE,Color.BLACK));
    }

}
