import greenfoot.*;  

/**
 * It is a Button that ables the player to go to the starting world
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class BackButton extends Actor

{

    public void act() 
    {
        click();
    }    
    
    /**
     * When the players click on the button go to the starting world
     */
    public void click(){
        if(Greenfoot.mouseClicked(this)) {

            Greenfoot.setWorld(new StartingWorld());}
    }    
}
