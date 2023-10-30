import greenfoot.*;  

/**
 * Our main actor Santa
 * 
 * @AMAL Chaouite & SANIJA Vlasanova
 * @30.11.2019
 * 
 */
public class Santa extends Actor
{   
    /**
     * Instances
     */
    private int speed = 3;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int veSpeed = 2;
    private Star stary;
    private boolean facingRight;

    /**
     * Save the images to annimate Santa later
     */
    private GreenfootImage image1 = new GreenfootImage("SantaStandRight.png");
    private GreenfootImage image2 = new GreenfootImage("SantaRunRight.png");
    private GreenfootImage image3 = new GreenfootImage("SantaStandLeft.png");
    private GreenfootImage image4 = new GreenfootImage("SantaRunLeft.png");
    private GreenfootImage image5 = new GreenfootImage("SantaJumpRight.png");
    private GreenfootImage image6 = new GreenfootImage("SantaJumpLeft.png");
    private int frame = 1;

    public void act() 
    {

        /**
         * @if methods for the first level
         * @else methods for the second level
         */
        if(getWorld() instanceof FirstLevel)
        {
            facingRight = true;
            checkKey();
            checkFall();
            makeStars();
            onChimeny();
        }
        else if(getWorld() instanceof SecondLevel)
        {

            move(4);
            wantToExit();

        }

    }  

    /**
     * Use the keybord to move santa
     */
    public void checkKey(){

        if(Greenfoot.isKeyDown("left")){
            setImage(image3);
            facingRight = false;
            moveLeft();
        }

        if(Greenfoot.isKeyDown("right")){
            setImage(image1);
            moveRight();
        }

        if(Greenfoot.isKeyDown("up")){
            stopRunning();
            jump();
        }
    }

    /**
     * Move to the right 
     */
    public void moveRight()
    {
        setLocation(getX()+ speed , getY());
        animationMove(image1,image2);
    }

    /**
     * Move to the left
     */ 
    public void moveLeft()
    {
        setLocation(getX()- speed , getY());
        animationMove(image3,image4);
    }

    /**
     * Annimate Santa Image while moving 
     */ 
    public void animationMove(GreenfootImage img1,GreenfootImage img2){

        if (frame <= 5){ 
            setImage(img1);
            frame ++;
        }
        else{
            setImage(img2); 
            frame ++;
        }

        if(frame == 10) frame=0;
    }

    /**
     * When santa jumps --> no more annimation
     */
    public void stopRunning(){
        if(facingRight ){
            setImage(image5);
        }
        else {
            setImage(image6);
        }
    }

    /**
     * Santa jumps
     */
    public void jump()
    {
        vSpeed = -veSpeed;
        fall();
    }

    /**
     * Santa falls. When santa is going down, his speed is increasing.
     */
    public void fall(){ 
        setLocation(getX(), getY()+ vSpeed);
        vSpeed += acceleration;
    }

    /**
     * Check the collision between two actors.When there is a collision with the cloud, move to cloud.
     */
    public boolean isOnCloud(){
        Actor cloud = getOneObjectAtOffset(0,(getImage().getHeight())/2 , Cloud.class);
        if(cloud == null){
            return false;
        }
        else{
            moveToCloud(cloud);
            return true;
        }

    }

    /**
     * Santa moves to the top of the cloud
     */
    public void moveToCloud(Actor cloud){
        int cloudHeight = cloud.getImage().getHeight();
        int newY = cloud.getY() - (cloudHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }

    /**
     * When santa is on the cloud he wont fall otherwise he falls 
     */
    public void checkFall(){
        if(isOnCloud())
        {
            vSpeed = 0;
        }
        else{
            fall();
        }
    }

    /**
     * Check satna if he is on the chimney 
     */
    public void onChimeny(){
        /**
         * The collision between santa and the chimney
         */
        Actor chimney = getOneObjectAtOffset(0,getImage().getHeight()/2,Chimney.class);

        /**
         * Getting the values of each counter
         */  
        FirstLevel flw1;
        flw1 = (FirstLevel)getWorld();
        Counter counterStary = flw1.getCounterStary();
        Counter counterWater = flw1.getCounterWater();
        Counter counterGift = flw1.getCounterGift();

        /**
         * When santa collects all of the stuffs and he is on the chimney, he passes to the next level
         */
        if(chimney != null && counterStary.getTotalCountStary() == 3 && counterWater.getTotalCountWater() ==1 && counterGift.getTotalCountGift() ==1) 
        {   

            Greenfoot.setWorld(new SecondLevel());

        }
        /**
         * Otherwise he loses the game
         */
        else if(getY()>= (getWorld().getHeight()-1)){

            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth()/2,getWorld().getHeight()/2 );
            getWorld().removeObject(this);
            Greenfoot.playSound("Game-over.wav"); 
            Greenfoot.stop();

        }
        else { 
            getImage().setTransparency(255);}

    }

    /**
     * Santa is in the door
     */
    public void wantToExit(){
        /**
         * The collision between santa and the exit
         */
        Actor santa = getOneObjectAtOffset(getImage().getWidth()/2,0,Exit.class);

        /**
         * Check of santa got all the stuff
         */
        SecondLevel scn;
        scn = (SecondLevel)getWorld();
        Tree tree = scn.getTree();
        Cookies cookies = scn.getCookies();

        /**
         * When santa collects all of the stuffs and he is next the door, he wins
         */
        if(santa != null && tree.isGiftPuted() && cookies.ifCookiesToken()) 
        {   
            Greenfoot.setWorld(new Dance());
        }
        /**
         * Otherwise he loses the game
         */
        else { 
            getImage().setTransparency(255);
        }
    }

    /**
     * When Santa moves he will leave a shade after him
     */
    private void makeStars(){
        stary = new Star();
        getWorld().addObject(stary, getX() , getY());
    }

    /**
     * The movement in the second world + Collision with walls
     */
    public void move(int moveAmt)
    {
        /**
         * Determine direction by keypress checking
         */
        int dx = 0, dy = 0;
        if (Greenfoot.isKeyDown("right")) {
            moveRight();
        }
        if (Greenfoot.isKeyDown("left")) {
            moveLeft();
        }
        if (Greenfoot.isKeyDown("down")) {
            dy += 1;
        }
        if (Greenfoot.isKeyDown("up")) {
            dy -= 1;
        }
        /**
         * check for wall on each step of move in both vertical and horizontal directions
         */
        for (int i = 0; i < moveAmt; i++)
        {
            setLocation(getX() + dx, getY());
            if (getOneIntersectingObject(Wall.class) != null ) 
                setLocation(getX() - dx, getY());
                setLocation(getX(), getY() + dy);
            if (getOneIntersectingObject(Wall.class) != null ) 
                setLocation(getX(), getY() - dy);
            
        }
    }

}

