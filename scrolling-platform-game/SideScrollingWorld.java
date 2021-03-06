import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Template for a side-scrolling platform game.
 * 
 * @author R. Gordon
 * @version May 8, 2019
 * 
 */
public class SideScrollingWorld extends World
{
    /**
     * Instance variables
     * 
     * These are available for use in any method below.
     */    
    // Tile size in pixels for world elements (blocks, clouds, etc)
    // TO STUDENTS: Modify if your game's tiles have different dimensions
    private static final int TILE_SIZE = 32;
    private static final int HALF_TILE_SIZE = TILE_SIZE / 2;

    // World size constants
    // TO STUDENTS: Modify only if you're sure
    //              Should be a resolution that's a multiple of TILE_SIZE
    private static final int VISIBLE_WIDTH = 640;
    private static final int VISIBLE_HEIGHT = 480;

    // Additional useful constants based on world size
    public static final int HALF_VISIBLE_WIDTH = VISIBLE_WIDTH / 2;
    private static final int HALF_VISIBLE_HEIGHT = VISIBLE_HEIGHT / 2;

    // Defining the boundaries of the scrollable world
    // TO STUDENTS: Modify SCROLLABLE_WIDTH if you wish to have a longer level
    public static final int SCROLLABLE_WIDTH = VISIBLE_WIDTH * 3;
    private static final int SCROLLABLE_HEIGHT = VISIBLE_HEIGHT;

    // Hero
    Hero theHero;

    // Track whether game is on
    private boolean isGameOver;

    /**
     * Constructor for objects of class SideScrollingWorld.
     */
    public SideScrollingWorld()
    {    
        // Create a new world with 640x480 cells with a cell size of 1x1 pixels.
        // Final argument of 'false' means that actors in the world are not restricted to the world boundary.
        // See: https://www.greenfoot.org/files/javadoc/greenfoot/World.html#World-int-int-int-boolean-
        super(VISIBLE_WIDTH, VISIBLE_HEIGHT, 1, false);

        // Set up the starting scene
        setup();

        // Game on
        isGameOver = false;
    }

    /**
     * Set up the entire world.
     */
    private void setup()
    {
        int selection = Greenfoot.getRandomNumber(2);
        if (selection == 0)
        {
            matthewLevel();
        }
        else
        {
            zachLevel();
        }
        addHero();
    }

    /**
     * Zach's level
     */
    private void zachLevel()
    {
        addGround();
        addFences();
        addClouds();
        addStaircase();
        addSecondStaircase();
    }

    /**
     * Matthew's level.
     */
    private void matthewLevel()
    {

        // Block group 1
        addRightGround();
        addClouds();
        addLeftGround();
        // Block group 2

        // How many tiles will cover the bottom of the initial visible area of screen?
        final int tilesToCreate = getWidth() / TILE_SIZE;

        int x = 700;
        int y = 400;

        MetalPlate newMetalPlate = new MetalPlate (x,y);
        addObject( newMetalPlate, x, y);

        x= 800;
        y= 400;
        MetalPlate newMetalPlate2 = new MetalPlate (x,y);
        addObject( newMetalPlate2, x, y);

        x= 850;
        y= 350;
        MetalPlate newMetalPlate3 = new MetalPlate (x,y);
        addObject( newMetalPlate3, x, y);

        x= 925;
        y= 450;
        MetalPlate newMetalPlate4 = new MetalPlate (x,y);
        addObject( newMetalPlate4, x, y);

        x= 1000;
        y= 350;
        MetalPlate newMetalPlate5 = new MetalPlate (x,y);
        addObject( newMetalPlate5, x, y);

        x= 1050;
        y= 300;
        MetalPlate newMetalPlate6 = new MetalPlate (x,y);
        addObject( newMetalPlate6, x, y); 

        x= 1125;
        y= 275;
        MetalPlate newMetalPlate7 = new MetalPlate (x,y);
        addObject( newMetalPlate7, x, y);       

    }

    
    /**
     * Add a pyramid.
     */
    private void addPyramid()
    {
        // Section 1
        for ( int i = 0; i <= 4; i += 1){
            // for section 1
            int x = 9 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 13 * TILE_SIZE + HALF_TILE_SIZE;

            Ground someGround = new Ground(x, y);
            addObject( someGround, x, y);

        }
        //Section 2
        for (int i = 0; i <= 2; i += 1){
            //for section 2
            int x = 10 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 12 * TILE_SIZE + HALF_TILE_SIZE;

            Ground niceGround = new Ground (x, y);
            addObject(niceGround, x, y);

        }
        //Section 3
        int x = 11 * TILE_SIZE + HALF_TILE_SIZE + 0 * TILE_SIZE;
        int y = 11 * TILE_SIZE + HALF_TILE_SIZE;

        Ground coolGround = new Ground (x, y);
        addObject(coolGround, x, y);

    }

    private void addStaircase()
    {
        for ( int i = 0; i <= 6; i += 1){
            // for section 1
            int x = 25 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 13 * TILE_SIZE + HALF_TILE_SIZE;

            Ground hypeGround = new Ground(x, y);
            addObject( hypeGround, x, y);

        } 
        for ( int i = 0; i <= 4; i += 1){
            // for section 1
            int x = 27 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 12 * TILE_SIZE + HALF_TILE_SIZE;

            Ground hypeGround = new Ground(x, y);
            addObject( hypeGround, x, y);

        }
        for ( int i = 0; i <= 2; i += 1){
            // for section 1
            int x = 29 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 11 * TILE_SIZE + HALF_TILE_SIZE;

            Ground hypeGround = new Ground(x, y);
            addObject( hypeGround, x, y);

        }
        for ( int i = 0; i <= 1; i += 1){
            // for section 1
            int x = 30 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 10 * TILE_SIZE + HALF_TILE_SIZE;

            Ground hypeGround = new Ground(x, y);
            addObject( hypeGround, x, y);

        }

        int x = 31 * TILE_SIZE + HALF_TILE_SIZE + 0 * TILE_SIZE;
        int y = 9 * TILE_SIZE + HALF_TILE_SIZE;

        Ground hypeGround = new Ground(x, y);
        addObject( hypeGround, x, y);

        
    }

    private void addSecondStaircase()
    {

        // for section 5
        int x = 34 * TILE_SIZE + HALF_TILE_SIZE + 0 * TILE_SIZE;
        int y = 9 * TILE_SIZE + HALF_TILE_SIZE;

        Ground shmeekGround = new Ground(x, y);
        addObject( shmeekGround, x, y);

        for ( int i = 0; i <= 1; i += 1){
            // for section 1
            int a = 34 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int b = 10 * TILE_SIZE + HALF_TILE_SIZE;

            Ground hypeGround = new Ground(a, b);
            addObject( hypeGround, a, b);

        }
        for ( int i = 0; i <= 2; i += 1){
            // for section 1
            int a = 34 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int b = 11 * TILE_SIZE + HALF_TILE_SIZE;

            Ground hypeGround = new Ground(a, b);
            addObject( hypeGround, a, b);

        }
        for ( int i = 0; i <= 4; i += 1){
            // for section 1
            int a = 34 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int b = 12 * TILE_SIZE + HALF_TILE_SIZE;

            Ground hypeGround = new Ground(a, b);
            addObject( hypeGround, a, b);

        }
        for ( int i = 0; i <= 6; i += 1){
            // for section 1
            int a = 34 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int b = 13 * TILE_SIZE + HALF_TILE_SIZE;

            Ground hypeGround = new Ground(a, b);
            addObject( hypeGround, a, b);

        }


    }

    


    /**
     * Add blocks to create the ground all across the bottom.
     */
    private void addGround()
    {
        // How many tiles will cover the bottom of the initial visible area of screen?
        final int tilesToCreate = 32;
        final int COUNT_OF_GROUND = 26;
        final int greatSpace = 44;

        // DEBUG
        //System.out.println("tiles being created " + tilesToCreate);

        // Loop to create and add the tile objects
        for (int i = 16; i < tilesToCreate; i += 1)
        {
            // Add ground objects at bottom of screen

            //This is for the final section

            int x = i * TILE_SIZE + HALF_TILE_SIZE;
            int y = getHeight() - HALF_TILE_SIZE;

            // Create a ground tile
            Ground groundTile = new Ground(x, y);

            // Add the objects
            addObject(groundTile, x, y);
        }

        for (int i = 0; i < COUNT_OF_GROUND; i += 1)
        {
            // Position in wider scrollable world
            int x = SCROLLABLE_WIDTH - HALF_TILE_SIZE - i * TILE_SIZE;
            int y = getHeight() - HALF_TILE_SIZE;

            // Create object and add it
            Ground ground = new Ground(x, y);
            addObject(ground, x, y);
        }

        for (int i = 0; i < greatSpace; i += 1)
        {
            // Position in wider scrollable world
            // This is for the first gap
            int x = 450 - HALF_TILE_SIZE - i * TILE_SIZE;
            int y = getHeight() - HALF_TILE_SIZE;

            // Create object and add it
            Ground ground = new Ground(x, y);
            addObject(ground, x, y);
        }

    }

    /**
     * Add some fences at left and right side.
     */
    private void addFences()
    {
        // Three fences on left side of world
        int x = HALF_TILE_SIZE + TILE_SIZE * 5;
        int y = VISIBLE_HEIGHT - HALF_TILE_SIZE - TILE_SIZE;
        Fence fence1 = new Fence(x, y);
        addObject(fence1, x, y);

        x = HALF_TILE_SIZE + TILE_SIZE * 6;
        y = VISIBLE_HEIGHT - HALF_TILE_SIZE - TILE_SIZE;        
        Fence fence2 = new Fence(x, y);
        addObject(fence2, x, y);

        x = HALF_TILE_SIZE + TILE_SIZE * 7;
        y = VISIBLE_HEIGHT - HALF_TILE_SIZE - TILE_SIZE;
        Fence fence3 = new Fence(x, y);
        addObject(fence3, x, y);

        //Two fences on right side of world
        x = SCROLLABLE_WIDTH - HALF_TILE_SIZE - TILE_SIZE * 3;
        y = VISIBLE_HEIGHT - HALF_TILE_SIZE - TILE_SIZE;
        Fence fence4 = new Fence(x, y);
        addObject(fence4, x, y);

        x = SCROLLABLE_WIDTH - HALF_TILE_SIZE - TILE_SIZE * 4;
        y = VISIBLE_HEIGHT - HALF_TILE_SIZE - TILE_SIZE;
        Fence fence5 = new Fence(x, y);
        addObject(fence5, x, y);

    }
    /**
     * Add steps made out of metal plates leading to end of world.
     */
    private void addMetalPlateSteps()
    {
        // How many plates total?
        final int COUNT_OF_METAL_PLATES = 20;
        final int PLATES_PER_GROUP = 4;

        // Add groups of plates
        for (int i = 0; i < COUNT_OF_METAL_PLATES / PLATES_PER_GROUP; i += 1)
        {
            // Group of four metal plates all at same y position
            int y = VISIBLE_HEIGHT - HALF_TILE_SIZE * 3 - i * TILE_SIZE;

            // Add the individual plates in a given group
            for (int j = 0; j < PLATES_PER_GROUP; j += 1)
            {
                int x = VISIBLE_WIDTH + TILE_SIZE * 2 + TILE_SIZE * (i + j) + TILE_SIZE * 5 * i;
                MetalPlate plate = new MetalPlate(x, y);
                addObject(plate, x, y);
            }
        }
    }

    /**
     * Add a few clouds for the opening scene.
     */
    private void addClouds()
    {
        Cloud cloud1 = new Cloud(170, 125);
        addObject(cloud1, 170, 125);
        Cloud cloud2 = new Cloud(450, 175);
        addObject(cloud2, 450, 175);
        Cloud cloud3 = new Cloud(775, 50);
        addObject(cloud3, 775, 50);
    }

    /**
     * Act
     * 
     * This method is called approximately 60 times per second.
     */
    public void act()
    {
    }

    /**
     * Add the hero to the world.
     */
    private void addHero()
    {
        // Initial horizontal position
        int initialX = TILE_SIZE * 3;

        // Instantiate the hero object
        theHero = new Hero(initialX);

        // Add hero in bottom left corner of screen
        addObject(theHero, initialX, getHeight() / 4 * 3);
    }

    /**
     * Add blocks to create the ground to walk on at bottom-left of scrollable world.
     */
    private void addLeftGround()
    {
        // How many tiles will cover the bottom of the initial visible area of screen?
        final int tilesToCreate = getWidth() / TILE_SIZE;

        // Loop to create and add the tile objects
        for (int i = 0; i < tilesToCreate; i += 1)
        {
            // Add ground objects at bottom of screen
            // NOTE: Actors are added based on their centrepoint, so the math is a bit trickier.
            int x = i * TILE_SIZE + HALF_TILE_SIZE;
            int y = getHeight() - HALF_TILE_SIZE;

            // Create a ground tile
            Ground groundTile = new Ground(x, y);

            // Add the objects
            addObject(groundTile, x, y);
        }

    }
    /**
     * Add blocks to create the ground to walk on at top-right of scrollable world.
     */
    private void addRightGround()
    {
        // Constants to control dimensions of the ground at end of world
        final int COUNT_OF_GROUND = 8;
        final int GROUND_BELOW_COLUMNS = COUNT_OF_GROUND;
        final int GROUND_BELOW_ROWS = 6;
        final int COUNT_OF_GROUND_BELOW = GROUND_BELOW_COLUMNS * GROUND_BELOW_ROWS;

        // 1. Make ground at end of level (top layer)
        for (int i = 0; i < COUNT_OF_GROUND; i += 1)
        {
            // Position in wider scrollable world
            int x = SCROLLABLE_WIDTH - HALF_TILE_SIZE - i * TILE_SIZE;
            int y = HALF_VISIBLE_HEIGHT + TILE_SIZE;

            // Create object and add it
            Ground ground = new Ground(x, y);
            addObject(ground, x, y);
        }

        // 2. Make sub-ground at end of level (below top layer)
        for (int i = 0; i < GROUND_BELOW_COLUMNS; i += 1)
        {
            for (int j = 0; j < GROUND_BELOW_ROWS; j += 1)
            {
                // Position in wider scrollable world
                int x = SCROLLABLE_WIDTH - HALF_TILE_SIZE - i * TILE_SIZE;
                int y = HALF_VISIBLE_HEIGHT + TILE_SIZE + TILE_SIZE * (j + 1);

                // Create object and add it
                GroundBelow groundBelow = new GroundBelow(x, y);
                addObject(groundBelow, x, y);
            }
        }
    }

    /**
     * Return an object reference to the hero.
     */
    public Hero getHero()
    {
        return theHero;
    }

    /**
     * Set game over
     */
    public void setGameOver()
    {
        isGameOver = true;
    }
}

