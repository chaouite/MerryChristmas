import greenfoot.*;  

/**
 * The cookies that santa should eat
 * 
 *@AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Cookies extends Actor
{
    private boolean  cookiesIsToken = false;

    public void act() 
    {
        touchCookies();
    } 
    
    /**
     * Collision between cookies and santa, remove cookies
     */
    public void touchCookies(){
        if (isTouching(Santa.class)){
            Greenfoot.playSound("Eating.wav"); 
            cookiesIsToken = true;
            getWorld().removeObject(this);

        }
    } 

    /**
     * Check if he took the cookies
     */
    public boolean ifCookiesToken(){
        return cookiesIsToken;
    }
}
