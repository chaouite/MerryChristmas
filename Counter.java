import greenfoot.*;  

/**
 * Counters of the number of stars - bucket of water - gift 
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Counter extends Actor
{
    /**
     * Instances
     */
    private int totalCountStary=0;
    private int totalCountWater=0;
    private int totalCountGift=0;

    public void act() 
    {

    }    

    /**
     * Constructors
     */
    public Counter(Stary star){
        setImage(new GreenfootImage("Star "+0,21,Color.WHITE,Color.BLACK));

    }
    
    public Counter(Water water){
        setImage(new GreenfootImage("Water "+0,21,Color.WHITE,Color.BLACK));
    }

    public Counter(Gift gift){
        setImage(new GreenfootImage("Gift "+0,21,Color.WHITE,Color.BLACK));
    }

    /**
     * Add amount to the instance value
     */
    public void addCounterStary(int amount){
        totalCountStary+= amount;
        setImage(new GreenfootImage("Star "+totalCountStary,21,Color.WHITE,Color.BLACK)); 
    }

    public void addCounterWater(int amount){
        totalCountWater+= amount;
        setImage(new GreenfootImage("Water "+totalCountWater,21,Color.WHITE,Color.BLACK));
    }

    public void addCounterGift(int amount){
        totalCountGift+= amount;
        setImage(new GreenfootImage("Gift "+totalCountGift,21,Color.WHITE,Color.BLACK));
    }

    /**
     * Getters of the instances
     */
    public int getTotalCountStary()
    { 
        return this.totalCountStary;
    }

    public int getTotalCountWater()
    {
        return this.totalCountWater;
    }

    public int getTotalCountGift()
    {
        return this.totalCountGift;
    }

}
