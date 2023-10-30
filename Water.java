import greenfoot.*; 

/**
 * Bucket of water
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Water extends Actor
{

    public void act() 
    {
        moveWithCloud();
        touchWater();  
    }    

    /**
     * Make the bucket of water move with the cloud on where she is
     */
     public void moveWithCloud(){
        int cloudy3X;
        int cloudy3Y;
        /**
         * Get the cloud from the first level
         */
        FirstLevel flw;
        flw = (FirstLevel)getWorld();
        Cloud cloudy3;
        cloudy3 = flw.getCloud3();
        cloudy3X = cloudy3.getX();
        cloudy3Y = cloudy3.getY();
        setLocation(cloudy3X, cloudy3Y - (cloudy3.getImage().getHeight()));

    }
    
    /**
     * Collision between Santa and Water.If collision = True --> change the counter && make a sound && remove the star
     */
    public void touchWater(){
        Actor water;
        water= getOneObjectAtOffset(0,0,Santa.class);   
        if(water !=null)
        {
            FirstLevel flw1;
            flw1 = (FirstLevel)getWorld();
            Counter counterWater = flw1.getCounterWater();
            counterWater.addCounterWater(1);
            Greenfoot.playSound("hohoo.wav");
            getWorld().removeObject(this);
        }

        else {
            getImage().setTransparency(255);
        }

    }
}
