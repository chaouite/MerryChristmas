import greenfoot.*;  

/**
 *This is our first lever where the player should collect the start and tha gift and the bucket of water.
 *Otherwise he will lose the game.
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class FirstLevel extends World
{

    /** 
     * Inisialisation of the actors
     */

    private Cloud cloud2 = new Cloud();
    private Cloud cloud3 = new Cloud();
    private Cloud cloud4 = new Cloud();
    private Cloud cloud5 = new Cloud();
    private Cloud cloud6 = new Cloud();

    private Stary stary1 = new Stary();
    private Stary stary2 = new Stary();
    private Stary stary3 = new Stary();

    private Stary star = new Stary();
    private Water water = new Water();
    private Gift gift = new Gift();
    private Counter counterStary =new Counter(star);
    private Counter counterWater =new Counter(water);
    private Counter counterGift =new Counter(gift);

    public FirstLevel()
    {      
        /**
         *Set the world size 
         */
        super(700,700,1);

        /**
         *Set the background
         */
        GreenfootImage bg = new GreenfootImage("sky.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);

        /**
         * Add the actors
         */
        addObject(new Santa(), 200,-10);

        /**
         *1.cloud
         */
        addObject(new Cloud(), 200,131);

        /**
         * 2.cloud with star
         */
        addObject(cloud2, 480,200);
        addObject(stary1 , 480,170);

        /**
         * 3.cloud with bucket of water 
         */
        addObject(cloud3, 200,298);
        addObject(new Water() , 200,270);

        /**
         * 4.cloud with star
         */
        addObject(cloud4, 512,398);
        addObject(stary2 , 512,368);

        /**
         * 5.cloud with gift
         */
        addObject(cloud5, 328,503);
        addObject(new Gift(), 328,475);

        /**
         * 6.cloud with star
         */
        addObject(cloud6, 200,613);
        addObject(stary3, 200,583);

        addObject(new Chimney(),660,669);

        /**
         * Add the counters to win the first level
         */
        addObject(counterStary,660,20);
        addObject(counterWater,560,20);
        addObject(counterGift,460,20);

        /**
         * Add the timer
         */
        addObject(new Timer(),50,20);

        /**
         * Make santa over the stars he made while he is moving
         */
        setPaintOrder(Santa.class , Star.class);

    }

    /**
     * Get the clouds created in the world
     */
    public Cloud getCloud2(){
        return cloud2;
    }

    public Cloud getCloud3(){
        return cloud3;
    }

    public Cloud getCloud4(){
        return cloud4;
    }

    public Cloud getCloud5(){
        return cloud5;
    }

    public Cloud getCloud6(){
        return cloud6;
    }

    /**
     * Get the starts created in the world
     */
    public Stary getStary1(){
        return stary1;
    }

    public Stary getStary2(){
        return stary2;
    }

    public Stary getStary3(){
        return stary3;
    }

    /**
     * Get the counters
     */
    public Counter getCounterStary(){
        return counterStary;
    }

    public Counter getCounterWater(){
        return counterWater;
    }

    public Counter getCounterGift(){
        return counterGift;
    }

}
