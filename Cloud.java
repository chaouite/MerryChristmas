import greenfoot.*;  

/**
 * Clouds help Santa to move all over the world and collect the stars and tha gift and also the bucket of water
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Cloud extends Actor
{
    /**
     * Instances
     */
    private int mal= 0;
    private int direction = 1-2*Greenfoot.getRandomNumber(2); // random direction of the clouds
    /**
     * Act - do whatever the Cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cloud(){

    }
    
    public void act() 
    {

        movement();

    }    
    
    /**
     * Move the clouds + managing the speed of the mouvement
     */
    public void movement(){

        if(mal<120){
            setLocation((getX()+direction), getY());

        }
        else if (mal<240){
            setLocation((getX()-direction), getY());
        }

        else {
            mal=0;
        }
        mal++;
    }

}
