import greenfoot.*;  

/**
 * The secound Level, Santa should put the gift next to the tree, and take the cotton to stop the bell from klinging, then eat the cookies.
 * He shouldn't enter the room of the child or the parents, and he shouldn't wake up the dog.
 * After all that he have to go out from the door.
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 */
public class SecondLevel extends World
{
    private Cotton cotton = new Cotton();
    private Tree tree =new Tree();
    private Cookies cookies = new Cookies();

    public SecondLevel()
    {
        super(700, 700, 1); 

        /**
         * Add the walls
         */

        /**
         * Living room
         */
        addObject(new Wall (), 20,300);
        addObject(new Wall (), 60,300);
        addObject(new Wall (), 100,300);
        addObject(new Wall (), 140,300);
        addObject(new Wall (), 180,300);
        addObject(new Wall (), 220,300);
        addObject (new Wall (), 260,300);
        addObject (new Wall (), 300,300);

        addObject (new Wall (90), 300,20);
        addObject (new Wall (90), 300,60);
        addObject (new Wall (90), 300,220);
        addObject (new Wall (90), 300,260);

        /**
         * Child room
         */
        addObject (new Wall (), 460,300);
        addObject (new Wall (), 500,300);
        addObject (new Wall (), 540,300);
        addObject (new Wall (), 580,300);
        addObject (new Wall (), 620,300);
        addObject (new Wall (), 660,300);
        addObject (new Wall (), 700,300);

        addObject (new Wall (90), 460,20);
        addObject (new Wall (90), 460,60);
        addObject (new Wall (90), 460,220);
        addObject (new Wall (90), 460,260);

        /**
         * Kitchen
         */
        addObject (new Wall (), 400,450);
        addObject (new Wall (), 440,450);
        addObject (new Wall (), 480,450);
        addObject (new Wall (), 520,450);
        addObject (new Wall (), 560,450);
        addObject (new Wall (), 600,450);
        addObject (new Wall (), 640,450);
        addObject (new Wall (), 680,450);

        addObject (new Wall (90), 400,490);
        addObject (new Wall (90), 400,530);
        addObject (new Wall (90), 400,540);
        addObject (new Wall (90), 400,700);

        /**
         * Parents room
         */
        addObject (new Wall (), 260,430);
        addObject (new Wall (), 220,430);
        addObject (new Wall (), 180,430);
        addObject (new Wall (), 140,430);
        addObject (new Wall (), 100,430);
        addObject (new Wall (), 60,430);
        addObject (new Wall (), 20,430);

        addObject (new Wall (90), 260,470);
        addObject (new Wall (90), 260,600);
        addObject (new Wall (90), 260,640);
        addObject (new Wall (90), 260,680);

        /**
         * Add the tree
         */
        addObject (tree, 55,212);

        /**
         * Add the bell
         */
        addObject (new Bell (), 300,100);

        /**
         * Add the chimney
         */
        addObject (new Chimney2 (), 45,45);

        /**
         * Add the cotton
         */
        addObject (cotton, 240,240);

        /**
         * Add the dog
         */
        addObject(new Dog(), 200,44);

        /**
         * Add the child
         */
        addObject(new Child(), 600,150);

        /**
         * Add parents
         */
        addObject(new Parent(), 144,650);

        /**
         * Add the cookies
         */
        addObject(cookies, 600,530);

        /**
         * Add exit
         */
        addObject(new Exit(), 672,375);

        /**
         * Add the timer
         */
        addObject(new Timer(),656,20);

        /**
         * Add the Santa
         */
        addObject(new Santa(), 54,68);

    }

    /**
     * Get the cotton used in this level
     */
    public Cotton getCotton(){
        return cotton;
    }
    
    /**
     * Get the tree used in this level
     */
    public Tree getTree(){
        return tree;
    }
    
    /**
     * Get the cookies used in this level
     */
    public Cookies getCookies(){
        return cookies;
    }
}