import greenfoot.*;  

/**
 * InstructionsButton 
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class InstructionsButton extends Actor
{
    public void act() 
    {
        click();
    }    
    
    /**
     * When the players click on the button go to the Instructions world,
     * stop the music of the starting world.
     */
    public void click(){
        if(Greenfoot.mouseClicked(this)) {
            ((StartingWorld)getWorld()).stopped();
            Greenfoot.setWorld(new Instructions());
        }
    }    
}
