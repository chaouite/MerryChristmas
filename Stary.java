import greenfoot.*; 

/**
 * Stars to be collected
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Stary extends Actor
{
    /**
     * Instances
     */
    private FirstLevel flw;

    public void act() 
    {   
        moveWithCloud2();
        moveWithCloud4();
        moveWithCloud6();
        touchStary();

    }

    /**
     * Make the stars move with the cloud on where she is
     */
    public void moveWithCloud2(){
        int cloudy2X;
        int cloudy2Y;
        /**
         * Get the cloud from the first level
         */
        flw = (FirstLevel)getWorld();
        Cloud cloudy2;
        Stary stary1;
        stary1 = flw.getStary1();
        cloudy2 = flw.getCloud2();
        cloudy2X = cloudy2.getX();
        cloudy2Y = cloudy2.getY();
        stary1.setLocation(cloudy2X, cloudy2Y - (cloudy2.getImage().getHeight()));
    }

    public void moveWithCloud4(){    
        int cloudy4X;
        int cloudy4Y;
        /**
         * Get the cloud from the first level
         */
        flw = (FirstLevel)getWorld();
        Cloud cloudy4;
        cloudy4 = flw.getCloud4();
        Stary stary2;
        stary2 = flw.getStary2();
        cloudy4X = cloudy4.getX();
        cloudy4Y = cloudy4.getY();
        stary2.setLocation(cloudy4X, cloudy4Y - (cloudy4.getImage().getHeight()));

    }

    public void moveWithCloud6(){    
        int cloudy6X;
        int cloudy6Y;
        /**
         * Get the cloud from the first level
         */
        flw = (FirstLevel)getWorld();
        Cloud cloudy6;
        cloudy6 = flw.getCloud6();
        Stary stary3;
        stary3 = flw.getStary3();
        cloudy6X = cloudy6.getX();
        cloudy6Y = cloudy6.getY();
        stary3.setLocation(cloudy6X, cloudy6Y - (cloudy6.getImage().getHeight()));

    }
    
    /**
     * Collision between santa and the star.Collision = True --> change the counter && make a sound && remove the star. 
     */
    public void touchStary(){
        Actor star;
        star= getOneObjectAtOffset(0,0,Santa.class);
        if(star !=null)
        {
            FirstLevel flw1;
            flw1 = (FirstLevel)getWorld();
            Counter counter = flw1.getCounterStary();
            counter.addCounterStary(1);
            Greenfoot.playSound("hohoo.wav");
            getWorld().removeObject(this);
        }

        else {
            getImage().setTransparency(255);
        }

    }

}
