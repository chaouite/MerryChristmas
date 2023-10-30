import greenfoot.*; 

/**
 * The final world when the player wins
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Dance extends World
{

    private GreenfootSound music = new GreenfootSound("Win.wav");
    public Dance()
    {    

        super(700,700,1);

        getBackground().drawImage(new GreenfootImage("Win.png"), 105,10);

        /**
         * Backgroung with some text
         */
        getBackground().drawImage(new GreenfootImage(" You win! Let's dance", 50, Color.WHITE, null), 120, 400);
        getBackground().drawImage(new GreenfootImage("SantaDance.png"), 250, 440);
        /**
         * Play the music
         */
        started();
    }
    /**
     * Start the music in a looped way 
     */
    public void started()    
    {    
        music.playLoop();    
    }    

    /**
     * Stop the music
     */
    public void stopped()    
    {    
        music.stop();    
    }  
}