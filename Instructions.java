import greenfoot.*; 

/**
 * The player can find in this world the tasks to accomplish the game and how can he play
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class Instructions extends World
{

    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        super(700,700,1);

        /**
         * Set the background
         */
        GreenfootImage bg1 = new GreenfootImage("instructions.jpg");
        bg1.scale(getWidth(), getHeight());
        setBackground(bg1);

        /**
         * Add the back button
         */
        addObject(new BackButton(), 68,652);

        /**
         * Show text
         */
        getBackground().drawImage(new GreenfootImage("First Level:\n"+"You have to help Santa \nto get the bucket of wather"+//
                " so that he can extinguish the fire of the chimney. \n"//
                +"Unfourtunetly Santa forgot the gift, you have to help him to pick the gift \n"+//
                "and score 3 stars. All of this in 40 seconds\n"+"Otherwise Santa will lose the game.\n"+"Use the keyboard buttons.\n(Left-> go left - Right -> go right - Up-> avoid falling)"+//
                "\n\nSecond Level:\n"+"You have to help Santa to put the gift next to the tree"+//
                " and get the cotton\nto stop the bell from klinging. \n"+//
                "Santa is hungry, he should eat the cookies in the kitchen."//
                +" All of this in 40 seconds\n"+"Otherwise Santa will lose the game.\n"+"Use the keyboard buttons.\n(Left-> go left - Right -> go right - Up-> go up - Down -> go down)", 20, null, null), 20, 320);
    }
}
