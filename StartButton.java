import greenfoot.*;  

/**
 * StartButton
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class StartButton extends Actor
{
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
    }    

    /**
     * when the players click on the button go to the FirstLevel world. Stop the music of StartingWorld.
     */
    public void click(){
        if(Greenfoot.mouseClicked(this)) {
            ((StartingWorld)getWorld()).stopped();
            Greenfoot.setWorld(new FirstLevel());
        }
    }  
}
