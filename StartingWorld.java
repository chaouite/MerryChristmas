import greenfoot.*;  

/**
 * This is the starting world of our game "Merry Christmas"
 * It inclouds two buttons : 
 *       1- start --> It takes the player to the first level 
 *       2 -instructions --> It takes the player to the instructions world
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class StartingWorld extends World
{
    /**
     * Instances
     */ 
    private GreenfootSound music = new GreenfootSound("Christmas-intro.wav");

    /**
     * Constructor for objects of class StartingWorld
     */
     public StartingWorld()
    {    
        /**
         * Size of the world
         */
        super(700,700,1);

        /**
         * Set the background
         */
        GreenfootImage bg = new GreenfootImage("Santaclaus.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);

        /**
         * Add the button start
         */
        addObject(new StartButton(), 339,534);
        
        /**
         * Add the button instructions
         */
        addObject(new InstructionsButton(), 338,594);
        
        /**
         * Start the music
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
