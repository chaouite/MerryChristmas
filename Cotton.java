import greenfoot.*; 

/**
 * Cotton to stop the bell from klinging
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Cotton extends Actor
{
    private boolean cottonToken = false;
    public void act() 
    {
        touchCotton();
    } 

    /**
     * Collision between cotton and santa, remove cotton
     */
    public void touchCotton(){
        if (isTouching(Santa.class)){
            cottonToken = true;
            getWorld().removeObject(this);

        }
    } 

    /**
     * Check if he took the cotton
     */
    public boolean ifCottenToken(){
        return cottonToken;
    }
}
