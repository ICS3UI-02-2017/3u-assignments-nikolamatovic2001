package Game;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.Timer;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 *
 * @author maton0870
 */
public class RunnerGame extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "Basic Geometry Dash";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    //Colours I used in my game
    Color background = new Color(96, 7, 7);
    Color character = new Color(99, 85, 85);
    Color wall = new Color(25, 25, 25);
    Color backgroundStartScreen = new Color(209, 156, 96);
    Color startScreenText = new Color(170, 68, 68);
    //Character parameters
    int triangleOneY = 470;
    int triangleTwoAndThreeY = 500;
    int triangleOneX = 115;
    int triangleTwoX = 100;
    int triangleThreeX = 130;
    Rectangle player = new Rectangle(106, 470, 20, 30);
    //Floor and background parameters
    int backFloorX = 0;
    int floorY = 500;
    int floorHeight = 100;
    //Rng generator
    int walls = 0;
    int checkIfTheSame = 0;
    //Creates the wall obstacles
    Rectangle wallOne = new Rectangle(800, 450, 50, 50);
    Rectangle wallTwo = new Rectangle(800, 400, 50, 100);
    Rectangle wallThreeBottom = new Rectangle(800, 450, 50, 50);
    Rectangle wallThreeTop = new Rectangle(800, 300, 50, 50);
    Rectangle wallFourTop = new Rectangle(800, 350, 50, 50);
    Rectangle wallFourBottom = new Rectangle(800, 450, 50, 50);
    Rectangle wallFive = new Rectangle(800, 300, 50, 150);
    //Jump commands
    boolean moveUp = false;
    boolean moveDown = false;
    //When did we last do sommething
    long timerStart = 0;
    long timerStart2 = 0;
    //How long do we need to wait for each time
    int delay = 1500;
    //Gravtiy
    int changeY = 0;
    int gravity = 1;
    //Telling the Player to jump in the upper left corner
    int jumpPromptWidth = 50;
    int jumpPromptHeight = 70;
    //Tells the player how many blocks they have passed 
    int score = 0;
    boolean scoreStop = false;
    int finalScoreWidth = 240;
    int finalScoreHeight = 400;
    //Start screen
    Rectangle startScreen = new Rectangle(0, 0, WIDTH, HEIGHT);
    int welcomeWidth = 180;
    int welcomeHeight = 200;
    int titleWidth = 70;
    int titleHeight = 300;
    int titleEnterWidth = 230;
    int titleEnterHeight = 450;
    Font customFontMiddle = new Font("Comic Sans MS", Font.BOLD, 60);
    //Game over screen
    boolean drawGameOver = false;
    Rectangle gameOver = new Rectangle(0, 0, 0, 0);
    Font customFontBiggest = new Font("Comic Sans MS", Font.BOLD, 80);
    Font customFontSmallest = new Font("Comic Sans MS", Font.BOLD, 30);
    int gameOverFontWidth = -1000;
    int gameOverFontHeight = -1000;
    
    //Mario for the secret level
    BufferedImage marioGif = loadImage("mario.gif");
    int marioX = 1000; 
    int marioY = 457;
    
    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public RunnerGame() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);

        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }
    
    public BufferedImage loadImage(String name){
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File(name));
        }catch(Exception e){
            System.out.println("Error loading file");
            e.printStackTrace();
        }
        return img;
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE

        //Background Color
        g.setColor(background);
        g.fillRect(backFloorX, 0, WIDTH, HEIGHT);
        g.fillRect(backFloorX - WIDTH, 0, WIDTH, HEIGHT);

        //Floor
        g.setColor(Color.WHITE);
        g.fillRect(backFloorX, floorY, WIDTH, floorHeight);
        g.fillRect(backFloorX - WIDTH, floorY, WIDTH, floorHeight);

        //Create the block character
        g.setColor(character);
        int[] triangleX = {triangleOneX, triangleTwoX, triangleThreeX};
        int[] triangleY = {triangleOneY, triangleTwoAndThreeY, triangleTwoAndThreeY};
        g.fillPolygon(triangleX, triangleY, 3);

        //Creates the first wall
        g.setColor(wall);
        g.fillRect(wallOne.x, wallOne.y, wallOne.width, wallOne.height);

        //Creates the second wall
        g.fillRect(wallTwo.x, wallTwo.y, wallTwo.width, wallTwo.height);


        //Creates the third wall
        g.fillRect(wallThreeTop.x, wallThreeTop.y, wallThreeTop.width, wallThreeTop.height);
        g.fillRect(wallThreeBottom.x, wallThreeBottom.y, wallThreeBottom.width, wallThreeBottom.height);

        //Creates the fourth wall
        g.fillRect(wallFourTop.x, wallFourTop.y, wallFourTop.width, wallFourTop.height);
        g.fillRect(wallFourBottom.x, wallFourBottom.y, wallFourBottom.width, wallFourBottom.height);

        //Creates the fifth wall
        g.fillRect(wallFive.x, wallFive.y, wallFive.width, wallFive.height);


        //Tells player that space is to jump
        g.setColor(Color.YELLOW);
        g.setFont(customFontSmallest);
        g.drawString("Hold 'Space' to jump!", jumpPromptWidth, jumpPromptHeight);

        //Tells the players score
        g.setColor(Color.WHITE);
        g.drawString("Your Score: " + score, 520, 70);

        //Game over screen
        g.setColor(Color.BLACK);
        g.fillRect(gameOver.x, gameOver.y, gameOver.width, gameOver.height);
        g.setColor(Color.WHITE);
        g.setFont(customFontBiggest);
        g.drawString("Game Over", gameOverFontWidth, gameOverFontHeight);
        g.setFont(customFontSmallest);
        g.drawString("Press 'Enter' if you wish to try again", gameOverFontWidth - 50, gameOverFontHeight + 100);
        g.drawString("Your Final Score is: " + score, finalScoreWidth, finalScoreHeight);

        //Start screen  
        g.setColor(backgroundStartScreen);
        g.fillRect(startScreen.x, startScreen.y, startScreen.width, startScreen.height);
        g.setColor(startScreenText);
        g.setFont(customFontBiggest);
        g.drawString("Welcome to", welcomeWidth, welcomeHeight);
        g.setFont(customFontMiddle);
        g.drawString("'Basic Geometry Dash'!", titleWidth, titleHeight);
        g.setFont(customFontSmallest);
        g.drawString("Press 'Enter' to Start!", titleEnterWidth, titleEnterHeight);

        //Drawing mario for secret level
        g.drawImage(marioGif, marioX, marioY, null);
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    public void screenMovement() {
        //This creates the illusion that the character is not moving and the screen is
        backFloorX = backFloorX + 3;
        if (backFloorX > WIDTH) {
            backFloorX = 0;
        }
    }

    public void charMovement() {
        //Jump command, player moves up if space is pressed and down if it is released
        if (moveUp) {
            triangleOneY = triangleOneY - 20;
            triangleTwoAndThreeY = triangleTwoAndThreeY - 20;
            player.y = player.y - 20;
            marioY = marioY - 20;
        } else if (moveDown) {
            triangleOneY = triangleOneY + 20;
            triangleTwoAndThreeY = triangleTwoAndThreeY + 20;
            player.y = player.y + 20;
            marioY = marioY + 20;
        }
    }

    public void wallMovement() {
        //Moves the walls towards the left if their number is randomly generated
        //If it is off screen it goes back to the right hand side of the screen
        if (walls == 1) {
            wallOne.x = wallOne.x - 30;
            if (wallOne.x <= -50) {
                wallOne.x = 800;
                walls = 0;
            }
        }
        if (walls == 2) {
            wallTwo.x = wallTwo.x - 30;
            if (wallTwo.x <= -50) {
                wallTwo.x = 800;
                walls = 0;
            }
        }
        if (walls == 3) {
            wallThreeTop.x = wallThreeTop.x - 30;
            wallThreeBottom.x = wallThreeBottom.x - 30;
            if (wallThreeTop.x <= -50 || wallThreeBottom.x <= -50) {
                wallThreeTop.x = 800;
                wallThreeBottom.x = 800;
                walls = 0;
            }
        }
        if (walls == 4) {
            wallFourTop.x = wallFourTop.x - 30;
            wallFourBottom.x = wallFourBottom.x - 30;
            if (wallFourTop.x <= -50) {
                wallFourTop.x = 800;
                wallFourBottom.x = 800;
                walls = 0;
            }
        }
        if (walls == 5) {
            wallFive.x = wallFive.x - 30;
            if (wallFive.x <= -50) {
                wallFive.x = 800;
                walls = 0;
            }
        }
    }

    public void rng() {
        //Uses a timer of 1.5 seconds to randomly generate a number to move the walls
        if (System.currentTimeMillis() > timerStart + delay) {
            //Creates a rng generator, highest number 7, lowest is 1
            Random rng = new Random();
            walls = rng.nextInt(5) + 1;
            //'resets' the timer
            timerStart = System.currentTimeMillis();
        }
    }

    public void jumpWithGravity() {
        //Gravity
        changeY = changeY + gravity;
        player.y = player.y + changeY;
        triangleOneY = triangleOneY + changeY;
        triangleTwoAndThreeY = triangleTwoAndThreeY + changeY;
        marioY = marioY + changeY;
        //Detects if the player hits the floor and stops them
        if (player.y + player.height > 500) {
            player.y = 470;
            triangleOneY = 470;
            triangleTwoAndThreeY = 500;
            marioY = 457;
            changeY = 0;
        }
        //Stops the character from jumping higher
        if (player.y < 310) {
            triangleOneY = 310;
            triangleTwoAndThreeY = 340;
            player.y = 310;
            marioY = 300;
        }
    }

    public void collision(int x, int y, int height) {
        //Detects if the player hits a wall and brings up the final score and game over screen
        if (!(player.x + player.width < x || player.x > x + 50 || player.y + player.height < y || player.y > y + height)) {
            drawGameOver = true;
            if (drawGameOver == true) {
                gameOver.width = WIDTH;
                gameOver.height = HEIGHT;
                gameOverFontWidth = WIDTH / 4;
                gameOverFontHeight = HEIGHT / 2 - 100;
                finalScoreWidth = 250;
                finalScoreHeight = 400;
                marioX = 1000;
                scoreStop = true;
            }
        }
    }

    public void score() {
        //Tells the score to go up after a wall passes the player, stops when the palyer hits a wall
        if (scoreStop == false) {
            if (wallOne.x == 20) {
                score += 1;
            } else if (wallTwo.x == 20) {
                score += 1;
            } else if (wallThreeTop.x == 20) {
                score += 1;
            } else if (wallFourTop.x == 20) {
                score += 1;
            } else if (wallFive.x == 20) {
                score += 1;
            }
        }
    }
    // The main game loop
    // In here is where all the logic for my game will go

    public void gameLoop() {
        //All the methods are running, their names say what they do
        screenMovement();
        rng();
        charMovement();
        wallMovement();
        jumpWithGravity();
        score();
        collision(wallOne.x, wallOne.y, wallOne.height);
        collision(wallTwo.x, wallTwo.y, wallTwo.height);
        collision(wallThreeTop.x, wallThreeTop.y, wallThreeTop.height);
        collision(wallThreeBottom.x, wallThreeBottom.y, wallThreeBottom.height);
        collision(wallFourTop.x, wallFourTop.y, wallFourTop.height);
        collision(wallFourBottom.x, wallFourBottom.y, wallFourBottom.height);
        collision(wallFive.x, wallFive.y, wallFive.height);
    }
    // Used to implement any of the Mouse Actions

    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
            //Gets the letter/number/symobl of the key that was pressed
            int keyCode = e.getKeyCode();
            //if space was pressed, the player jumps
            if (keyCode == KeyEvent.VK_SPACE) {
                moveUp = true;
            }
            //if enter was pressed the game resets/starts
            if (keyCode == KeyEvent.VK_ENTER) {
                gameOver.width = -1000;
                gameOver.height = -1000;
                gameOverFontWidth = -1000;
                gameOverFontHeight = -1000;
                welcomeWidth = -1000;
                welcomeHeight = -1000;
                titleWidth = -1000;
                titleHeight = -1000;
                titleEnterWidth = -1000;
                titleEnterHeight = -1000;
                startScreen.width = -1000;
                startScreen.height = -1000;
                finalScoreWidth = -1000;
                finalScoreHeight = -1000;
                score = 0;
                wallOne.x = 800;
                wallTwo.x = 800;
                wallThreeTop.x = 800;
                wallThreeBottom.x = 800;
                wallFourTop.x = 800;
                wallFourBottom.x = 800;
                wallFive.x = 800;
                walls = 0;
                triangleOneX = 115;
                triangleTwoX = 100;
                triangleThreeX = 130;
                marioX = 1000;
                scoreStop = false;
            }
            if (keyCode == KeyEvent.VK_M) {
                gameOver.width = -1000;
                gameOver.height = -1000;
                gameOverFontWidth = -1000;
                gameOverFontHeight = -1000;
                welcomeWidth = -1000;
                welcomeHeight = -1000;
                titleWidth = -1000;
                titleHeight = -1000;
                titleEnterWidth = -1000;
                titleEnterHeight = -1000;
                startScreen.width = -1000;
                startScreen.height = -1000;
                finalScoreWidth = -1000;
                finalScoreHeight = -1000;
                score = 0;
                wallOne.x = 800;
                wallTwo.x = 800;
                wallThreeTop.x = 800;
                wallThreeBottom.x = 800;
                wallFourTop.x = 800;
                wallFourBottom.x = 800;
                wallFive.x = 800;
                walls = 0;
                triangleOneX = 1000;
                triangleTwoX = 1000;
                triangleThreeX = 1000;
                marioX = 90;
                scoreStop = false;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            //if space was released the player falls
            if (keyCode == KeyEvent.VK_SPACE) {
                moveUp = false;
                moveDown = true;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        RunnerGame game = new RunnerGame();
    }
}
