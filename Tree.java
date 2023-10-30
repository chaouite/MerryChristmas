import greenfoot.*; 

/**
 * The tree
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */

public class Tree extends Actor
{
    private Gift gift = new Gift();
    private boolean giftIsPuted = false;
    public void act() 
    {
        touchTree();
    } 

    /**
     * Check the collision between santa and the tree. If there is collision, puts gift. 
     */ 
    public void touchTree(){
        Actor tree;
        tree= getOneObjectAtOffset(0,0,Santa.class);
        if(tree !=null)
        {
            SecondLevel scn;
            scn = (SecondLevel)getWorld();
            giftIsPuted = true;
            scn.addObject(gift, 63,260);
        }
        else {
            getImage().setTransparency(255);
        }

    }
    
    /**
     * Get the gift that santa puts next to the tree
     */
    public boolean  isGiftPuted(){
        return giftIsPuted;
    }
}
