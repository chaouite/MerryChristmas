import greenfoot.*;  

/**
 * The shade when santa is moving
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Star extends Actor
{   
    /**
     * Instances
     */
    private GreenfootImage starImage;
    private int fade;

    /**
     * Constructor.Make the shade random.
     */
    public Star(){
        starImage = getImage(); 
        fade = Greenfoot.getRandomNumber(4);
        if(fade == 4) fade = 2;
    }

    public void act() 
    {
        shrink();
    }

    /**
     * The size of the shade (the star in our case) decreases untill it desapears
     */
    private void shrink()
    {
        GreenfootImage shrinkedImage = new GreenfootImage(starImage);
        shrinkedImage.scale(getImage().getWidth()-7,getImage().getHeight()-7);
        setImage(shrinkedImage);
        if(getImage().getWidth() < 10 || getImage().getHeight() < 10 ){
            getWorld().removeObject(this);
        }
    }

   
}
