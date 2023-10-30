import greenfoot.*;  

/**
 * Gift
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Gift extends Actor
{
    /**
     * To make sure that the methods is called when santa is in the first level
     */
    public void act() 
    {

        if(getWorld() instanceof FirstLevel)
        {   moveWithCloud();
            touchGift();
        }

    }    

    /**
     *Mmove the gift with the cloud
     */
    public void moveWithCloud(){
        int cloudy5X;
        int cloudy5Y;
        //get the cloud used in the world
        FirstLevel flw;
        flw = (FirstLevel)getWorld();
        Cloud cloudy5;
        cloudy5 = flw.getCloud5();
        cloudy5X = cloudy5.getX();
        cloudy5Y = cloudy5.getY();
        setLocation(cloudy5X, cloudy5Y - (cloudy5.getImage().getHeight()));

    }

    /**
     * If santa touch the gift he plays a sound and the gift disappears
     */
    public void touchGift(){
        /**
         * The collision between santa and the gift
         */
        Actor gift;
        gift= getOneObjectAtOffset(0,0,Santa.class);

        /**
         * Test if there is a collision
         */
        if(gift !=null)
        {

            FirstLevel flw1;
            flw1 = (FirstLevel)getWorld();
            Counter counterGift = flw1.getCounterGift();
            counterGift.addCounterGift(1);
            Greenfoot.playSound("hohoo.wav");
            getWorld().removeObject(this);

        }

        else {getImage().setTransparency(255);}

    }
}
